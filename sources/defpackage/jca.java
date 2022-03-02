package defpackage;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Debug;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.stats.ConnectionEvent;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: jca  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jca {
    public static final /* synthetic */ int b = 0;
    private static final Object c = new Object();
    private static volatile jca d;
    private static Integer j;
    private static final amsv l = amta.a(jbz.a);
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    private final List e;
    private final List f;
    private final List g;
    private final List h;
    private jco i;
    private jco k;

    private jca() {
        if (!d()) {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ct_icp", jda.a((String) jcc.b.c()));
            bundle.putStringArrayList("ct_ics", jda.a((String) jcc.c.c()));
            bundle.putStringArrayList("ct_itp", jda.a((String) jcc.d.c()));
            bundle.putStringArrayList("ct_its", jda.a((String) jcc.e.c()));
            bundle.putLong("ct_st", ((Long) jcc.f.c()).longValue());
            List stringArrayList = bundle.getStringArrayList("ct_icp");
            List stringArrayList2 = bundle.getStringArrayList("ct_ics");
            List stringArrayList3 = bundle.getStringArrayList("ct_itp");
            List stringArrayList4 = bundle.getStringArrayList("ct_its");
            this.e = stringArrayList == null ? Collections.emptyList() : stringArrayList;
            this.f = stringArrayList2 == null ? Collections.emptyList() : stringArrayList2;
            this.g = stringArrayList3 == null ? Collections.emptyList() : stringArrayList3;
            this.h = stringArrayList4 == null ? Collections.emptyList() : stringArrayList4;
            long j2 = bundle.getLong("ct_st");
            this.i = new jco(j2);
            this.k = new jco(j2);
            return;
        }
        this.e = Collections.emptyList();
        this.f = Collections.emptyList();
        this.g = Collections.emptyList();
        this.h = Collections.emptyList();
    }

    private static String a(int i2) {
        String str;
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        StringBuilder sb = new StringBuilder();
        int i3 = i2 + 3;
        for (int i4 = 3; i4 < i3; i4++) {
            int i5 = i4 + 4;
            if (i5 < stackTrace.length) {
                StackTraceElement stackTraceElement = stackTrace[i5];
                String className = stackTraceElement.getClassName();
                String methodName = stackTraceElement.getMethodName();
                int lineNumber = stackTraceElement.getLineNumber();
                StringBuilder sb2 = new StringBuilder(String.valueOf(className).length() + 13 + String.valueOf(methodName).length());
                sb2.append(className);
                sb2.append(".");
                sb2.append(methodName);
                sb2.append(":");
                sb2.append(lineNumber);
                str = sb2.toString();
            } else {
                str = "<bottom of call stack>";
            }
            sb.append(str);
            sb.append(" ");
        }
        return sb.toString();
    }

    public static boolean b() {
        return itf.a != null && axda.a.a().w();
    }

    private static int c() {
        if (j == null) {
            jdb jdb = jdc.a;
            if (jdb == null) {
                ComponentName componentName = jcl.a;
                j = 0;
            } else {
                j = Integer.valueOf(jdb.a(2));
            }
        }
        return j.intValue();
    }

    private static final boolean d() {
        int c2 = c();
        ComponentName componentName = jcl.a;
        return c2 == 0;
    }

    public final void b(Service service, int i2) {
        a(service, i2, 14);
    }

    public final void b(Context context, ServiceConnection serviceConnection) {
        try {
            a(context, serviceConnection);
        } catch (IllegalArgumentException e2) {
            Log.w("ConnectionTracker", "Exception thrown while unbinding", e2);
        }
    }

    public static jca a() {
        if (d == null) {
            synchronized (c) {
                if (d == null) {
                    d = new jca();
                }
            }
        }
        return d;
    }

    private final void a(Service service, int i2, int i3) {
        int i4;
        if (!d() && this.k != null) {
            String name = service.getClass().getName();
            if (!"com.google.android.gms.common.stats.GmsCoreStatsService".equals(name)) {
                String concat = String.valueOf(name).concat("#");
                StringBuilder sb = new StringBuilder(String.valueOf(concat).length() + 11);
                sb.append(concat);
                sb.append(i2);
                String sb2 = sb.toString();
                if (i3 != 14) {
                    jco jco = this.k;
                    synchronized (jco) {
                        Long l2 = (Long) jco.a.get(sb2);
                    }
                    this.k.b(sb2);
                    i4 = 13;
                } else if (i2 == -1) {
                    jco jco2 = this.k;
                    synchronized (jco2) {
                        int i5 = 0;
                        while (true) {
                            ou ouVar = jco2.a;
                            if (i5 < ouVar.h) {
                                String str = (String) ouVar.b(i5);
                                if (str != null) {
                                    if (str.startsWith(concat)) {
                                        jco2.a.remove(str);
                                    }
                                }
                                i5++;
                            }
                        }
                    }
                    sb2 = concat;
                    i4 = 15;
                    break;
                } else if (this.k.a(sb2)) {
                    i4 = i3;
                } else {
                    return;
                }
                a(sb2, i4, (String) null, (String) null, jkt.a(), name);
            }
        }
    }

    private static final void a(String str, int i2, String str2, String str3, String str4, String str5) {
        String str6;
        long j2;
        ConnectionEvent connectionEvent;
        int i3 = i2;
        long currentTimeMillis = System.currentTimeMillis();
        if ((c() & jcl.e) == 0 || i3 == 13) {
            str6 = null;
        } else {
            str6 = a(5);
        }
        if ((c() & jcl.g) != 0) {
            j2 = Debug.getNativeHeapAllocatedSize();
        } else {
            j2 = 0;
        }
        if (i3 == 1 || i3 == 4 || i3 == 14) {
            connectionEvent = new ConnectionEvent(currentTimeMillis, i2, (String) null, (String) null, (String) null, (String) null, str6, str, SystemClock.elapsedRealtime(), j2);
        } else {
            connectionEvent = new ConnectionEvent(currentTimeMillis, i2, str2, str3, str4, str5, str6, str, SystemClock.elapsedRealtime(), j2);
        }
        jdb jdb = jdc.a;
        if (jdb != null) {
            jdb.a(connectionEvent);
        }
    }

    public final String a(ServiceConnection serviceConnection) {
        return String.valueOf((((long) Process.myPid()) << 32) | ((long) System.identityHashCode(serviceConnection)));
    }

    public final void a(Service service, int i2) {
        a(service, i2, 13);
    }

    public final void a(Context context, ServiceConnection serviceConnection) {
        if (!((Boolean) l.a()).booleanValue() || !this.a.containsKey(serviceConnection)) {
            context.unbindService(serviceConnection);
        } else {
            try {
                context.unbindService((ServiceConnection) this.a.get(serviceConnection));
            } finally {
                this.a.remove(serviceConnection);
            }
        }
        a(context, a(serviceConnection), (String) null, (Intent) null, 1);
    }

    public final void a(Context context, String str, String str2, Intent intent, int i2) {
        jco jco;
        String str3;
        String str4;
        String str5;
        if (!d() && (jco = this.i) != null) {
            ServiceInfo serviceInfo = null;
            if (i2 != 4 && i2 != 1) {
                List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 128);
                if (queryIntentServices == null || queryIntentServices.size() == 0) {
                    Log.w("ConnectionTracker", String.format("There are no handler of this intent: %s\n Stack trace: %s", new Object[]{intent.toUri(0), a(20)}));
                } else if (queryIntentServices.size() > 1) {
                    Log.w("ConnectionTracker", String.format("Multiple handlers found for this intent: %s\n Stack trace: %s", new Object[]{intent.toUri(0), a(20)}));
                    for (ResolveInfo resolveInfo : queryIntentServices) {
                        Log.w("ConnectionTracker", resolveInfo.serviceInfo.name);
                    }
                } else {
                    serviceInfo = queryIntentServices.get(0).serviceInfo;
                }
                if (serviceInfo != null) {
                    String str6 = serviceInfo.processName;
                    String str7 = serviceInfo.name;
                    String a2 = jkt.a();
                    int c2 = c();
                    if (!this.e.contains(a2) && !this.f.contains(str2) && !this.g.contains(str6) && !this.h.contains(str7)) {
                        if (!str6.equals(a2) || (c2 & jcl.f) == 0) {
                            this.i.b(str);
                            str4 = str6;
                            str5 = a2;
                            str3 = str7;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    Log.w("ConnectionTracker", String.format("Client %s made an invalid request %s", new Object[]{str2, intent.toUri(0)}));
                    return;
                }
            } else if (jco.a(str)) {
                str5 = null;
                str4 = null;
                str3 = null;
            } else {
                return;
            }
            a(str, i2, str5, str2, str4, str3);
        }
    }

    public final boolean a(Context context, Intent intent, ServiceConnection serviceConnection, int i2) {
        return a(context, context.getClass().getName(), intent, serviceConnection, i2);
    }

    public final boolean a(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i2) {
        ComponentName component = intent.getComponent();
        boolean z = false;
        if (component == null || !jim.b(context, component.getPackageName())) {
            if (((Boolean) l.a()).booleanValue()) {
                ServiceConnection a2 = itf.a(serviceConnection);
                ServiceConnection serviceConnection2 = (ServiceConnection) this.a.putIfAbsent(serviceConnection, a2);
                if (!(serviceConnection2 == null || a2 == serviceConnection2)) {
                    String format = String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", new Object[]{serviceConnection, str, intent.getAction()});
                    Log.w("ConnectionTracker", format);
                    if (itf.a != null && axda.a.a().u()) {
                        throw new IllegalStateException(format);
                    }
                }
                try {
                    boolean bindService = context.bindService(intent, a2, i2);
                    if (!bindService) {
                    }
                    z = bindService;
                } finally {
                    this.a.remove(serviceConnection, a2);
                }
            } else {
                z = context.bindService(intent, serviceConnection, i2);
            }
            if (z) {
                a(context, a(serviceConnection), str, intent, 2);
                return true;
            }
        } else {
            Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
        }
        return z;
    }
}
