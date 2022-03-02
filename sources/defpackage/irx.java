package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.ConnectionInfo;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: irx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class irx {
    private static final Feature[] D = new Feature[0];
    public static final String[] r = {"service_esmobile", "service_googleme"};
    private irt A;
    private final int B;
    private final String C;
    iti b;
    public final Context c;
    public final Looper d;
    final Handler e;
    public final Object f;
    public final Object g;
    public ity h;
    protected irr i;
    public final ArrayList j;
    public int k;
    public final irn l;
    public final iro m;
    public ConnectionResult n;
    public boolean o;
    public volatile ConnectionInfo p;
    protected AtomicInteger q;
    private int s;
    private long t;
    private long u;
    private int v;
    private long w;
    private final itc x;
    private final hxk y;
    private IInterface z;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected irx(android.content.Context r10, android.os.Looper r11, int r12, defpackage.irn r13, defpackage.iro r14) {
        /*
            r9 = this;
            itc r3 = defpackage.itc.a(r10)
            hxk r4 = defpackage.hxk.d
            defpackage.iva.a((java.lang.Object) r13)
            defpackage.iva.a((java.lang.Object) r14)
            r8 = 0
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.irx.<init>(android.content.Context, android.os.Looper, int, irn, iro):void");
    }

    /* access modifiers changed from: private */
    public final void a(int i2, IInterface iInterface) {
        boolean z2;
        boolean z3;
        boolean z4 = false;
        if (i2 != 4) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (iInterface == null) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (z2 == z3) {
            z4 = true;
        }
        iva.b(z4);
        synchronized (this.f) {
            this.k = i2;
            this.z = iInterface;
            z();
            if (i2 == 1) {
                irt irt = this.A;
                if (irt != null) {
                    itc itc = this.x;
                    iti iti = this.b;
                    String str = iti.a;
                    String str2 = iti.b;
                    int i3 = iti.c;
                    s();
                    itc.a(str, str2, irt, this.b.d);
                    this.A = null;
                }
            } else if (i2 == 2 || i2 == 3) {
                if (this.A != null) {
                    iti iti2 = this.b;
                    if (iti2 != null) {
                        String str3 = iti2.a;
                        String str4 = iti2.b;
                        StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 70 + String.valueOf(str4).length());
                        sb.append("Calling connect() while still connected, missing disconnect() for ");
                        sb.append(str3);
                        sb.append(" on ");
                        sb.append(str4);
                        Log.e("GmsClient", sb.toString());
                        itc itc2 = this.x;
                        iti iti3 = this.b;
                        String str5 = iti3.a;
                        String str6 = iti3.b;
                        int i4 = iti3.c;
                        irt irt2 = this.A;
                        s();
                        itc2.a(str5, str6, irt2, this.b.d);
                        this.q.incrementAndGet();
                    }
                }
                this.A = new irt(this, this.q.get());
                iti iti4 = new iti(r(), b(), F());
                this.b = iti4;
                if (iti4.d) {
                    if (d() < 17895000) {
                        String valueOf = String.valueOf(this.b.a);
                        throw new IllegalStateException(valueOf.length() == 0 ? new String("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ") : "Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(valueOf));
                    }
                }
                itc itc3 = this.x;
                iti iti5 = this.b;
                String str7 = iti5.a;
                String str8 = iti5.b;
                int i5 = iti5.c;
                if (!itc3.a(new itb(str7, str8, this.b.d), (ServiceConnection) this.A, s())) {
                    iti iti6 = this.b;
                    String str9 = iti6.a;
                    String str10 = iti6.b;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str9).length() + 34 + String.valueOf(str10).length());
                    sb2.append("unable to connect to service: ");
                    sb2.append(str9);
                    sb2.append(" on ");
                    sb2.append(str10);
                    Log.e("GmsClient", sb2.toString());
                    a(16, this.q.get());
                }
            } else if (i2 == 4) {
                a(iInterface);
            }
        }
    }

    public Bundle C() {
        return null;
    }

    public Feature[] D() {
        return D;
    }

    public boolean E() {
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean F() {
        return false;
    }

    /* access modifiers changed from: protected */
    public abstract IInterface a(IBinder iBinder);

    /* access modifiers changed from: protected */
    public abstract String b();

    /* access modifiers changed from: protected */
    public abstract String c();

    public int d() {
        return hxk.c;
    }

    /* access modifiers changed from: protected */
    public Bundle f() {
        return new Bundle();
    }

    public boolean g() {
        return false;
    }

    public boolean h() {
        return false;
    }

    public Intent i() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    public void j() {
        this.q.incrementAndGet();
        synchronized (this.j) {
            int size = this.j.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((irq) this.j.get(i2)).d();
            }
            this.j.clear();
        }
        synchronized (this.g) {
            this.h = null;
        }
        a(1, (IInterface) null);
    }

    public final boolean l() {
        boolean z2;
        synchronized (this.f) {
            z2 = this.k == 4;
        }
        return z2;
    }

    public final boolean m() {
        boolean z2;
        synchronized (this.f) {
            int i2 = this.k;
            z2 = true;
            if (!(i2 == 2 || i2 == 3)) {
                z2 = false;
            }
        }
        return z2;
    }

    public boolean n() {
        return true;
    }

    public final String o() {
        iti iti;
        if (l() && (iti = this.b) != null) {
            return iti.b;
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    public final Feature[] p() {
        ConnectionInfo connectionInfo = this.p;
        if (connectionInfo != null) {
            return connectionInfo.b;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public String r() {
        return "com.google.android.gms";
    }

    /* access modifiers changed from: protected */
    public final String s() {
        String str = this.C;
        return str == null ? this.c.getClass().getName() : str;
    }

    public void t() {
        hxk hxk = this.y;
        Context context = this.c;
        d();
        int b2 = hxk.b(context);
        if (b2 != 0) {
            a(1, (IInterface) null);
            a((irr) new iru(this), b2, (PendingIntent) null);
            return;
        }
        a((irr) new iru(this));
    }

    public Account u() {
        return null;
    }

    public Feature[] v() {
        return D;
    }

    public final void w() {
        if (!l()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public final IInterface x() {
        IInterface iInterface;
        synchronized (this.f) {
            if (this.k != 5) {
                w();
                iva.a(this.z != null, (Object) "Client is connected but service is null");
                iInterface = this.z;
            } else {
                throw new DeadObjectException();
            }
        }
        return iInterface;
    }

    /* access modifiers changed from: protected */
    public Set y() {
        return Collections.emptySet();
    }

    public void z() {
    }

    protected irx(Context context, Looper looper, itc itc, hxk hxk, int i2, irn irn, iro iro, String str) {
        this.f = new Object();
        this.g = new Object();
        this.j = new ArrayList();
        this.k = 1;
        this.n = null;
        this.o = false;
        this.p = null;
        this.q = new AtomicInteger(0);
        iva.a((Object) context, (Object) "Context must not be null");
        this.c = context;
        iva.a((Object) looper, (Object) "Looper must not be null");
        this.d = looper;
        iva.a((Object) itc, (Object) "Supervisor must not be null");
        this.x = itc;
        iva.a((Object) hxk, (Object) "API availability must not be null");
        this.y = hxk;
        this.e = new irp(this, looper);
        this.B = i2;
        this.l = irn;
        this.m = iro;
        this.C = str;
    }

    /* access modifiers changed from: protected */
    public void a(int i2) {
        this.s = i2;
        this.t = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    public final void a(int i2, int i3) {
        Handler handler = this.e;
        handler.sendMessage(handler.obtainMessage(7, i3, -1, new irw(this, i2)));
    }

    /* access modifiers changed from: protected */
    public void a(int i2, IBinder iBinder, Bundle bundle, int i3) {
        Handler handler = this.e;
        handler.sendMessage(handler.obtainMessage(1, i3, -1, new irv(this, i2, iBinder, bundle)));
    }

    /* access modifiers changed from: protected */
    public void a(IInterface iInterface) {
        this.u = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    public void a(ConnectionResult connectionResult) {
        this.v = connectionResult.c;
        this.w = System.currentTimeMillis();
    }

    public void a(ifi ifi) {
        ifi.a();
    }

    @Deprecated
    public final void a(irq irq) {
        synchronized (this.j) {
            this.j.add(irq);
        }
        Handler handler = this.e;
        handler.sendMessage(handler.obtainMessage(2, this.q.get(), -1, irq));
    }

    public void a(irr irr) {
        iva.a((Object) irr, (Object) "Connection progress callbacks cannot be null.");
        this.i = irr;
        a(2, (IInterface) null);
    }

    /* access modifiers changed from: protected */
    public final void a(irr irr, int i2, PendingIntent pendingIntent) {
        iva.a((Object) irr, (Object) "Connection progress callbacks cannot be null.");
        this.i = irr;
        Handler handler = this.e;
        handler.sendMessage(handler.obtainMessage(3, this.q.get(), i2, pendingIntent));
    }

    public final void a(itm itm, Set set) {
        Bundle f2 = f();
        GetServiceRequest getServiceRequest = new GetServiceRequest(this.B);
        getServiceRequest.d = this.c.getPackageName();
        getServiceRequest.g = f2;
        if (set != null) {
            getServiceRequest.a((Collection) set);
        }
        if (g()) {
            getServiceRequest.h = u() == null ? new Account("<<default account>>", "com.google") : u();
            if (itm != null) {
                getServiceRequest.e = itm.asBinder();
            }
        } else if (E()) {
            getServiceRequest.h = u();
        }
        getServiceRequest.i = v();
        getServiceRequest.j = D();
        try {
            synchronized (this.g) {
                ity ity = this.h;
                if (ity != null) {
                    irs irs = new irs(this, this.q.get());
                    if (itf.a != null) {
                        boolean h2 = axda.a.a().h();
                        getServiceRequest.l = 1;
                        nju nju = new nju(irs);
                        if (h2) {
                            nju.a = jff.a();
                        }
                        ity.a(nju, getServiceRequest);
                    } else {
                        ity.a(irs, getServiceRequest);
                    }
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e2) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e2);
            Handler handler = this.e;
            handler.sendMessage(handler.obtainMessage(6, this.q.get(), 1));
        } catch (SecurityException e3) {
            throw e3;
        } catch (RemoteException | RuntimeException e4) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e4);
            a(8, (IBinder) null, (Bundle) null, this.q.get());
        }
    }

    public final void a(String str, PrintWriter printWriter) {
        int i2;
        IInterface iInterface;
        ity ity;
        synchronized (this.f) {
            i2 = this.k;
            iInterface = this.z;
        }
        synchronized (this.g) {
            ity = this.h;
        }
        printWriter.append(str).append("mConnectState=");
        if (i2 == 1) {
            printWriter.print("DISCONNECTED");
        } else if (i2 == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (i2 == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (i2 == 4) {
            printWriter.print("CONNECTED");
        } else if (i2 != 5) {
            printWriter.print("UNKNOWN");
        } else {
            printWriter.print("DISCONNECTING");
        }
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append(c()).append("@").append(Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (ity == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(ity.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.u > 0) {
            PrintWriter append = printWriter.append(str).append("lastConnectedTime=");
            long j2 = this.u;
            String format = simpleDateFormat.format(new Date(j2));
            StringBuilder sb = new StringBuilder(String.valueOf(format).length() + 21);
            sb.append(j2);
            sb.append(" ");
            sb.append(format);
            append.println(sb.toString());
        }
        if (this.t > 0) {
            printWriter.append(str).append("lastSuspendedCause=");
            int i3 = this.s;
            if (i3 == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i3 != 2) {
                printWriter.append(String.valueOf(i3));
            } else {
                printWriter.append("CAUSE_NETWORK_LOST");
            }
            PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j3 = this.t;
            String format2 = simpleDateFormat.format(new Date(j3));
            StringBuilder sb2 = new StringBuilder(String.valueOf(format2).length() + 21);
            sb2.append(j3);
            sb2.append(" ");
            sb2.append(format2);
            append2.println(sb2.toString());
        }
        if (this.w > 0) {
            printWriter.append(str).append("lastFailedStatus=").append(ibt.a(this.v));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j4 = this.w;
            String format3 = simpleDateFormat.format(new Date(j4));
            StringBuilder sb3 = new StringBuilder(String.valueOf(format3).length() + 21);
            sb3.append(j4);
            sb3.append(" ");
            sb3.append(format3);
            append3.println(sb3.toString());
        }
    }

    public final boolean a(int i2, int i3, IInterface iInterface) {
        synchronized (this.f) {
            if (this.k != i2) {
                return false;
            }
            a(i3, iInterface);
            return true;
        }
    }
}
