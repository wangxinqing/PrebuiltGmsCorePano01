package defpackage;

import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.chimera.Service;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.net.UrlRequest;

/* renamed from: ifn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ifn implements Handler.Callback {
    public static final Status a = new Status(4, "Sign-out occurred while this API call was in progress.");
    public static final Status b = new Status(4, "The user must be signed in to make this API call.");
    public static final Object f = new Object();
    public static ifn g;
    public final long c = 5000;
    public final long d = 120000;
    public long e = 10000;
    public final Context h;
    public final hxj i;
    public final itj j;
    public final AtomicInteger k = new AtomicInteger(0);
    public final Map l = new ConcurrentHashMap(5, 0.75f, 1);
    public iee m = null;
    public final Set n = new ob();
    public final Handler o;
    public volatile boolean p = true;
    private final AtomicInteger q = new AtomicInteger(1);
    private final Set r = new ob();

    private ifn(Context context, Looper looper, hxj hxj) {
        this.h = context;
        this.o = new qvr(looper, this);
        this.i = hxj;
        this.j = new itj(hxj);
        jix.g(context);
        Handler handler = this.o;
        handler.sendMessage(handler.obtainMessage(6));
    }

    public static ifn a(Context context) {
        ifn ifn;
        synchronized (f) {
            if (g == null) {
                HandlerThread handlerThread = new HandlerThread("GoogleApiHandler", 9);
                handlerThread.start();
                g = new ifn(context.getApplicationContext(), handlerThread.getLooper(), hxj.a);
            }
            ifn = g;
        }
        return ifn;
    }

    private final void b(iby iby) {
        ida ida = iby.g;
        ifj ifj = (ifj) this.l.get(ida);
        if (ifj == null) {
            ifj = new ifj(this, iby);
            this.l.put(ida, ifj);
        }
        if (ifj.i()) {
            this.r.add(ida);
        }
        ifj.h();
    }

    public final boolean handleMessage(Message message) {
        Status status;
        Feature[] a2;
        long j2 = 300000;
        ifj ifj = null;
        switch (message.what) {
            case 1:
                if (((Boolean) message.obj).booleanValue()) {
                    j2 = 10000;
                }
                this.e = j2;
                this.o.removeMessages(12);
                for (ida obtainMessage : this.l.keySet()) {
                    Handler handler = this.o;
                    handler.sendMessageDelayed(handler.obtainMessage(12, obtainMessage), this.e);
                }
                break;
            case 2:
                idd idd = (idd) message.obj;
                Iterator it = idd.a.keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else {
                        ida ida = (ida) it.next();
                        ifj ifj2 = (ifj) this.l.get(ida);
                        if (ifj2 == null) {
                            idd.a(ida, new ConnectionResult(13), (String) null);
                            break;
                        } else if (ifj2.b.l()) {
                            idd.a(ida, ConnectionResult.a, ifj2.b.o());
                        } else if (ifj2.f() != null) {
                            idd.a(ida, ifj2.f(), (String) null);
                        } else {
                            iva.a(ifj2.h.o);
                            ifj2.c.add(idd);
                            ifj2.h();
                        }
                    }
                }
            case 3:
                for (ifj ifj3 : this.l.values()) {
                    ifj3.e();
                    ifj3.h();
                }
                break;
            case 4:
            case 8:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                igh igh = (igh) message.obj;
                ifj ifj4 = (ifj) this.l.get(igh.c.g);
                if (ifj4 == null) {
                    b(igh.c);
                    ifj4 = (ifj) this.l.get(igh.c.g);
                }
                if (ifj4.i() && this.k.get() != igh.b) {
                    igh.a.a(a);
                    ifj4.d();
                    break;
                } else {
                    ifj4.a(igh.a);
                    break;
                }
            case 5:
                int i2 = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                Iterator it2 = this.l.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        ifj ifj5 = (ifj) it2.next();
                        if (ifj5.e == i2) {
                            ifj = ifj5;
                        }
                    }
                }
                if (ifj == null) {
                    StringBuilder sb = new StringBuilder(76);
                    sb.append("Could not find API instance ");
                    sb.append(i2);
                    sb.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb.toString(), new Exception());
                    break;
                } else {
                    String a3 = hxz.a(connectionResult.c);
                    String str = connectionResult.e;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(a3).length() + 69 + String.valueOf(str).length());
                    sb2.append("Error resolution was canceled by the user, original error message: ");
                    sb2.append(a3);
                    sb2.append(": ");
                    sb2.append(str);
                    ifj.a(new Status(17, sb2.toString()));
                    break;
                }
            case 6:
                if (this.h.getApplicationContext() instanceof Application) {
                    Application application = (Application) this.h.getApplicationContext();
                    synchronized (ide.a) {
                        if (!ide.a.e) {
                            application.registerActivityLifecycleCallbacks(ide.a);
                            application.registerComponentCallbacks(ide.a);
                            ide.a.e = true;
                        }
                    }
                    ide ide = ide.a;
                    ife ife = new ife(this);
                    synchronized (ide.a) {
                        ide.d.add(ife);
                    }
                    ide ide2 = ide.a;
                    if (!ide2.c.get()) {
                        int i3 = Build.VERSION.SDK_INT;
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        if (!ide2.c.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                            ide2.b.set(true);
                        }
                    }
                    if (!ide2.b.get()) {
                        this.e = 300000;
                        break;
                    }
                }
                break;
            case 7:
                b((iby) message.obj);
                break;
            case 9:
                if (this.l.containsKey(message.obj)) {
                    ifj ifj6 = (ifj) this.l.get(message.obj);
                    iva.a(ifj6.h.o);
                    if (ifj6.f) {
                        ifj6.h();
                        break;
                    }
                }
                break;
            case 10:
                for (ida remove : this.r) {
                    ((ifj) this.l.remove(remove)).d();
                }
                this.r.clear();
                break;
            case 11:
                if (this.l.containsKey(message.obj)) {
                    ifj ifj7 = (ifj) this.l.get(message.obj);
                    iva.a(ifj7.h.o);
                    if (ifj7.f) {
                        ifj7.g();
                        ifn ifn = ifj7.h;
                        if (ifn.i.b(ifn.h) == 18) {
                            status = new Status(8, "Connection timed out while waiting for Google Play services update to complete.");
                        } else {
                            status = new Status(8, "API failed to connect while resuming due to an unknown error.");
                        }
                        ifj7.a(status);
                        ifj7.b.j();
                        break;
                    }
                }
                break;
            case 12:
                if (this.l.containsKey(message.obj)) {
                    ((ifj) this.l.get(message.obj)).a(true);
                    break;
                }
                break;
            case UrlRequest.Status.READING_RESPONSE /*14*/:
                ief ief = (ief) message.obj;
                ida ida2 = ief.a;
                if (this.l.containsKey(ida2)) {
                    ief.b.a((Object) Boolean.valueOf(((ifj) this.l.get(ida2)).a(false)));
                    break;
                } else {
                    ief.b.a((Object) false);
                    break;
                }
            case Service.START_CONTINUATION_MASK:
                ifk ifk = (ifk) message.obj;
                Map map = this.l;
                ida ida3 = ifk.a;
                if (map.containsKey((Object) null)) {
                    Map map2 = this.l;
                    ida ida4 = ifk.a;
                    ifj ifj8 = (ifj) map2.get((Object) null);
                    if (ifj8.g.contains(ifk) && !ifj8.f) {
                        if (ifj8.b.l()) {
                            ifj8.c();
                            break;
                        } else {
                            ifj8.h();
                            break;
                        }
                    }
                }
                break;
            case 16:
                ifk ifk2 = (ifk) message.obj;
                Map map3 = this.l;
                ida ida5 = ifk2.a;
                if (map3.containsKey((Object) null)) {
                    Map map4 = this.l;
                    ida ida6 = ifk2.a;
                    ifj ifj9 = (ifj) map4.get((Object) null);
                    if (ifj9.g.remove(ifk2)) {
                        ifj9.h.o.removeMessages(15, ifk2);
                        ifj9.h.o.removeMessages(16, ifk2);
                        Feature feature = ifk2.b;
                        ArrayList arrayList = new ArrayList(ifj9.a.size());
                        for (icy icy : ifj9.a) {
                            if ((icy instanceof ics) && (a2 = ((ics) icy).a(ifj9)) != null && jhx.a((Object[]) a2, (Object) null)) {
                                arrayList.add(icy);
                            }
                        }
                        int size = arrayList.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            icy icy2 = (icy) arrayList.get(i4);
                            ifj9.a.remove(icy2);
                            icy2.a((Exception) new icr((Feature) null));
                        }
                        break;
                    }
                }
                break;
            default:
                int i5 = message.what;
                StringBuilder sb3 = new StringBuilder(31);
                sb3.append("Unknown message id: ");
                sb3.append(i5);
                Log.w("GoogleApiManager", sb3.toString());
                return false;
        }
        return true;
    }

    public final int a() {
        return this.q.getAndIncrement();
    }

    public final void b() {
        Handler handler = this.o;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final acwa a(iby iby, igi igi, ihg ihg, Runnable runnable) {
        acwd acwd = new acwd();
        icv icv = new icv(new igj(igi, ihg, runnable), acwd);
        Handler handler = this.o;
        handler.sendMessage(handler.obtainMessage(8, new igh(icv, this.k.get(), iby)));
        return acwd.a;
    }

    public final void b(ConnectionResult connectionResult, int i2) {
        if (!a(connectionResult, i2)) {
            Handler handler = this.o;
            handler.sendMessage(handler.obtainMessage(5, i2, 0, connectionResult));
        }
    }

    public final void a(iby iby) {
        Handler handler = this.o;
        handler.sendMessage(handler.obtainMessage(7, iby));
    }

    public final void a(iee iee) {
        synchronized (f) {
            if (this.m != iee) {
                this.m = iee;
                this.n.clear();
            }
            this.n.addAll(iee.a);
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a(ConnectionResult connectionResult, int i2) {
        PendingIntent pendingIntent;
        hxj hxj = this.i;
        Context context = this.h;
        if (!connectionResult.a()) {
            pendingIntent = hxj.c(context, connectionResult.c, (String) null);
        } else {
            pendingIntent = connectionResult.d;
        }
        if (pendingIntent == null) {
            return false;
        }
        hxj.a(context, connectionResult.c, (String) null, PendingIntent.getActivity(context, 0, GoogleApiActivity.a(context, pendingIntent, i2, true), 134217728));
        return true;
    }
}
