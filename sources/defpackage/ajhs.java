package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.IntentFilter;
import android.os.SystemClock;
import com.google.android.gms.location.places.NearbyAlertFilter;
import com.google.android.gms.location.places.NearbyAlertRequest;
import com.google.android.location.reporting.collectors.ble.BleLocationAwareScanReporter$AlarmBroadcastReceiver;
import com.google.android.location.reporting.collectors.ble.BleNearbyAlertsHelper$NearbyAlertReceiver;
import com.google.android.ulr.ApiBleRate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: ajhs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajhs implements ajhw {
    public static Set a;
    public static boolean b;
    public final Object c = new Object();
    public final ArrayList d = new ArrayList();
    public final Set e = new HashSet();
    public final jiq f;
    public final ajhv g;
    public final ajmn h;
    BleLocationAwareScanReporter$AlarmBroadcastReceiver i;
    public long j = Long.MIN_VALUE;
    final ajhv k = new ajhr(this);
    final ajhq l = new ajhq(this);
    private final ajic m;
    private final ajhu n;
    private final jbs o;
    private final PendingIntent p;
    private final Context q;
    private final ajmo r;
    private boolean s;
    private boolean t;
    private boolean u;
    private String v = "locationAwareDefault";

    public ajhs(Context context, ajic ajic, ajhu ajhu, ajhv ajhv, jbs jbs, jiq jiq, ajmn ajmn, ajmo ajmo) {
        this.q = context;
        this.n = ajhu;
        this.o = jbs;
        this.f = jiq;
        this.g = ajhv;
        this.m = ajic;
        this.p = ajnw.b(context, "com.google.android.location.reporting.collectors.ble.ULR_BLE_STOP_NEARBY_ALARM");
        this.h = ajmn;
        this.r = ajmo;
        e();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0083  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void h() {
        /*
            r8 = this;
            monitor-enter(r8)
            boolean r0 = r8.s     // Catch:{ all -> 0x0090 }
            if (r0 == 0) goto L_0x008e
            boolean r0 = defpackage.azsa.b()     // Catch:{ all -> 0x0090 }
            if (r0 == 0) goto L_0x001c
            boolean r0 = r8.i()     // Catch:{ all -> 0x0090 }
            if (r0 == 0) goto L_0x001a
            ajhv r0 = r8.k     // Catch:{ all -> 0x0090 }
            com.google.android.ulr.ApiBleRate r1 = r8.c()     // Catch:{ all -> 0x0090 }
            r0.a((com.google.android.ulr.ApiBleRate) r1)     // Catch:{ all -> 0x0090 }
        L_0x001a:
            monitor-exit(r8)
            return
        L_0x001c:
            ajmo r0 = r8.r     // Catch:{ all -> 0x0090 }
            boolean r1 = defpackage.azsa.b()     // Catch:{ all -> 0x0090 }
            r2 = 61
            if (r1 == 0) goto L_0x002e
            java.lang.String r0 = "GCoreUlr"
            java.lang.String r1 = "Oversampling state read from LocationReportingPreferences!"
            defpackage.ajix.c(r0, r2, r1)     // Catch:{ all -> 0x0090 }
            goto L_0x007d
        L_0x002e:
            android.content.SharedPreferences r0 = r0.c     // Catch:{ all -> 0x0090 }
            java.lang.String r1 = "isOversampling"
            r3 = 0
            boolean r0 = r0.getBoolean(r1, r3)     // Catch:{ all -> 0x0090 }
            if (r0 == 0) goto L_0x007d
            aztb r0 = defpackage.aztb.a     // Catch:{ all -> 0x0090 }
            aztc r0 = r0.a()     // Catch:{ all -> 0x0090 }
            boolean r0 = r0.J()     // Catch:{ all -> 0x0090 }
            if (r0 == 0) goto L_0x007d
            boolean r0 = defpackage.azsa.b()     // Catch:{ all -> 0x0090 }
            if (r0 == 0) goto L_0x0054
            java.lang.String r0 = "GCoreUlr"
            java.lang.String r1 = "setOversamplingRates!"
            defpackage.ajix.c(r0, r2, r1)     // Catch:{ all -> 0x0090 }
            monitor-exit(r8)
            return
        L_0x0054:
            java.lang.String r0 = "locationAwareDefault"
            r8.v = r0     // Catch:{ all -> 0x0090 }
            ajic r1 = r8.m     // Catch:{ all -> 0x0090 }
            aztb r0 = defpackage.aztb.a     // Catch:{ all -> 0x0090 }
            aztc r0 = r0.a()     // Catch:{ all -> 0x0090 }
            long r2 = r0.H()     // Catch:{ all -> 0x0090 }
            aztb r0 = defpackage.aztb.a     // Catch:{ all -> 0x0090 }
            aztc r0 = r0.a()     // Catch:{ all -> 0x0090 }
            long r4 = r0.I()     // Catch:{ all -> 0x0090 }
            aztb r0 = defpackage.aztb.a     // Catch:{ all -> 0x0090 }
            aztc r0 = r0.a()     // Catch:{ all -> 0x0090 }
            long r6 = r0.K()     // Catch:{ all -> 0x0090 }
            boolean r0 = r1.a(r2, r4, r6)     // Catch:{ all -> 0x0090 }
            goto L_0x0081
        L_0x007d:
            boolean r0 = r8.i()     // Catch:{ all -> 0x0090 }
        L_0x0081:
            if (r0 == 0) goto L_0x001a
            ajhv r0 = r8.k     // Catch:{ all -> 0x0090 }
            com.google.android.ulr.ApiBleRate r1 = r8.c()     // Catch:{ all -> 0x0090 }
            r0.a((com.google.android.ulr.ApiBleRate) r1)     // Catch:{ all -> 0x0090 }
            monitor-exit(r8)
            return
        L_0x008e:
            monitor-exit(r8)
            return
        L_0x0090:
            r0 = move-exception
            monitor-exit(r8)
            goto L_0x0094
        L_0x0093:
            throw r0
        L_0x0094:
            goto L_0x0093
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajhs.h():void");
    }

    private final boolean i() {
        ajmn ajmn = this.h;
        boolean z = ajmn.i;
        boolean z2 = ajmn.j;
        if ((z && aztb.a.a().v()) || (z2 && aztb.a.a().w())) {
            this.v = "locationAwareLowPower";
            return this.m.a(aztb.a.a().s(), aztb.a.a().t(), aztb.a.a().u());
        } else if ((z && aztb.e()) || (z2 && aztb.f())) {
            this.v = "opportunisticOnly";
            return this.m.a();
        } else if (!k()) {
            this.v = "locationAwareDefault";
            return this.m.a(aztb.d(), aztb.h(), aztb.i());
        } else {
            if (!this.t) {
                this.v = "importantBeaconNearby";
            } else {
                this.v = "locationAwareNearby";
            }
            return this.m.a(aztb.a.a().A(), aztb.a.a().B(), aztb.a.a().C());
        }
    }

    private final synchronized void j() {
        int i2;
        if (!k()) {
            this.j = SystemClock.elapsedRealtime();
            l();
            long elapsedRealtime = SystemClock.elapsedRealtime() + aztb.a.a().z();
            if (!aztb.P()) {
                i2 = 2;
            } else {
                i2 = 3;
            }
            this.o.a("BleLocationAwareScanReporter", i2, elapsedRealtime, this.p, "com.google.android.gms");
            ajix.a("GCoreUlr", "Starting BLE nearby high freq scanning");
            h();
        }
    }

    private final synchronized boolean k() {
        return this.j != Long.MIN_VALUE;
    }

    private final void l() {
        this.o.a(this.p);
    }

    public final synchronized void a() {
        if (!this.s) {
            ajic ajic = this.m;
            ajhv ajhv = this.k;
            synchronized (ajic) {
                if (!ajic.m) {
                    ajic.r = ajhv;
                    if (ajic.g) {
                        ajic.a(ajic.b);
                    }
                    if (ajic.h) {
                        IntentFilter intentFilter = new IntentFilter();
                        intentFilter.addAction("com.google.android.location.reporting.collectors.ble.ULR_BLE_SCAN_ALARM");
                        ajic.i.registerReceiver(ajic.s, intentFilter);
                        ajic.q = true;
                        ajic.c();
                    }
                    ajic.m = true;
                }
            }
            ajhu ajhu = this.n;
            ajhq ajhq = this.l;
            if (ajhq != null) {
                ajix.a("GCoreUlr", "Registering for Beacon Nearby alerts.");
                ajhu.d = ajhq;
                if (ajhu.c == null) {
                    ajhu.c = new BleNearbyAlertsHelper$NearbyAlertReceiver(ajhu);
                    ajhu.b.registerReceiver(ajhu.c, new IntentFilter("com.google.android.location.reporting.util.NEARBY_ALERT_AVAILABLE"));
                }
                ajhu.a.a(ajnw.b(ajhu.b, "com.google.android.location.reporting.util.NEARBY_ALERT_AVAILABLE"), NearbyAlertRequest.a(new NearbyAlertFilter((List) null, (List) null, (String) null, true), ajjl.a((int) aztb.a.a().y()), ajjl.b((int) aztb.a.a().x())));
            } else {
                ajix.c("GCoreUlr", "Null callback given. Not registering for Nearby Beacon alerts");
            }
            if (this.i == null) {
                this.i = new BleLocationAwareScanReporter$AlarmBroadcastReceiver(this);
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("com.google.android.location.reporting.collectors.ble.ULR_BLE_STOP_NEARBY_ALARM");
                this.q.registerReceiver(this.i, intentFilter2);
            }
            this.k.a(c());
            this.s = true;
            h();
        }
    }

    public final synchronized void b() {
        ajic ajic = this.m;
        synchronized (ajic) {
            ajic.m = false;
            ajic.o = -1;
            ajic.b();
            ajic.d();
        }
        ajhu ajhu = this.n;
        ajix.a("GCoreUlr", "Unregistering for Beacon Nearby alerts.");
        BleNearbyAlertsHelper$NearbyAlertReceiver bleNearbyAlertsHelper$NearbyAlertReceiver = ajhu.c;
        if (bleNearbyAlertsHelper$NearbyAlertReceiver != null) {
            ajhu.b.unregisterReceiver(bleNearbyAlertsHelper$NearbyAlertReceiver);
            ajhu.c = null;
        }
        ajhu.a.a(ajnw.b(ajhu.b, "com.google.android.location.reporting.util.NEARBY_ALERT_AVAILABLE"));
        this.j = Long.MIN_VALUE;
        l();
        ajhv ajhv = this.g;
        ArrayList arrayList = new ArrayList();
        a(arrayList);
        ajhv.a((List) arrayList);
        BleLocationAwareScanReporter$AlarmBroadcastReceiver bleLocationAwareScanReporter$AlarmBroadcastReceiver = this.i;
        if (bleLocationAwareScanReporter$AlarmBroadcastReceiver != null) {
            this.q.unregisterReceiver(bleLocationAwareScanReporter$AlarmBroadcastReceiver);
            this.i = null;
        }
        this.s = false;
    }

    public final synchronized ApiBleRate c() {
        return new ApiBleRate(Long.valueOf(this.m.j), Boolean.valueOf(ajif.a()), Long.valueOf(this.m.k), Long.valueOf(this.m.l), this.v);
    }

    public final void d() {
    }

    public final void e() {
        a = new HashSet(Arrays.asList(aztb.a.a().bp().split(",")));
        b = aztb.a.a().ap();
        h();
    }

    public final void f() {
        h();
    }

    public final synchronized void g() {
        if (k()) {
            ajix.a("GCoreUlr", "Stopping BLE nearby high freq scanning");
            this.j = Long.MIN_VALUE;
            l();
            h();
        }
    }

    public final synchronized void b(boolean z) {
        if (!this.t || z) {
            g();
            this.u = false;
            this.t = false;
        }
    }

    public final void a(ArrayList arrayList) {
        synchronized (this.c) {
            arrayList.addAll(this.d);
            int size = this.d.size();
            StringBuilder sb = new StringBuilder(45);
            sb.append("Merged ");
            sb.append(size);
            sb.append(" opportunistic BLE results.");
            sb.toString();
            this.d.clear();
        }
    }

    public final synchronized void a(boolean z) {
        if (z) {
            this.t = true;
        }
        if (!this.u) {
            j();
        }
        this.u = true;
    }
}
