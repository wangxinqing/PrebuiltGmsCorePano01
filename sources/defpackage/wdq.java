package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.os.ParcelUuid;
import com.google.android.gms.nearby.connection.DiscoveryOptions;
import com.google.android.gms.nearby.connection.Strategy;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: wdq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wdq {
    private static final Strategy f = Strategy.c;
    private static final ParcelUuid g = tho.a("FEF3");
    final Map a = new nz();
    final Map b = new nz();
    final tim c = new wdd(this);
    final tiz d = new wdh(this);
    final tjd e = new wdk(this);
    private final tiq h;
    private final ConnectivityManager i;
    private final ExecutorService j = tid.b();
    private final ScheduledExecutorService k = tid.a();
    private final Set l = new ob();
    private wdl m;
    private wdm n;
    private final Map o = new nz();
    private final Map p = new nz();
    private final Map q = new nz();
    private final Map r = new nz();

    public wdq(Context context) {
        tir tir = new tir();
        tir.a = "nearby.sharing";
        this.h = tcn.a(context, tir.a());
        this.i = (ConnectivityManager) context.getSystemService("connectivity");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void a(java.lang.String r3, defpackage.til r4, defpackage.tip r5) {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.common.api.Status r5 = r5.a     // Catch:{ all -> 0x0023 }
            boolean r5 = r5.c()     // Catch:{ all -> 0x0023 }
            if (r5 == 0) goto L_0x0021
            wdm r5 = r2.n     // Catch:{ all -> 0x0023 }
            if (r5 == 0) goto L_0x001e
            wcx r0 = new wcx     // Catch:{ all -> 0x0023 }
            r0.<init>(r2, r3)     // Catch:{ all -> 0x0023 }
            java.util.Map r1 = r2.b     // Catch:{ all -> 0x0023 }
            r1.put(r3, r0)     // Catch:{ all -> 0x0023 }
            byte[] r4 = r4.f     // Catch:{ all -> 0x0023 }
            r5.a(r3, r4, r0)     // Catch:{ all -> 0x0023 }
            monitor-exit(r2)
            return
        L_0x001e:
            r2.b((java.lang.String) r3)     // Catch:{ all -> 0x0023 }
        L_0x0021:
            monitor-exit(r2)
            return
        L_0x0023:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wdq.a(java.lang.String, til, tip):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void b(java.lang.String r3, defpackage.tip r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.util.Map r0 = r2.a     // Catch:{ all -> 0x003b }
            boolean r0 = r0.containsKey(r3)     // Catch:{ all -> 0x003b }
            if (r0 != 0) goto L_0x000e
            r2.b((java.lang.String) r3)     // Catch:{ all -> 0x003b }
            monitor-exit(r2)
            return
        L_0x000e:
            java.util.Map r0 = r2.a     // Catch:{ all -> 0x003b }
            java.lang.Object r0 = r0.remove(r3)     // Catch:{ all -> 0x003b }
            aosh r0 = (defpackage.aosh) r0     // Catch:{ all -> 0x003b }
            if (r0 == 0) goto L_0x0039
            com.google.android.gms.common.api.Status r4 = r4.a     // Catch:{ all -> 0x003b }
            boolean r4 = r4.c()     // Catch:{ all -> 0x003b }
            if (r4 != 0) goto L_0x002c
            java.lang.Exception r3 = new java.lang.Exception     // Catch:{ all -> 0x003b }
            java.lang.String r4 = "Failed to connect."
            r3.<init>(r4)     // Catch:{ all -> 0x003b }
            r0.a((java.lang.Throwable) r3)     // Catch:{ all -> 0x003b }
            monitor-exit(r2)
            return
        L_0x002c:
            wcx r4 = new wcx     // Catch:{ all -> 0x003b }
            r4.<init>(r2, r3)     // Catch:{ all -> 0x003b }
            java.util.Map r1 = r2.b     // Catch:{ all -> 0x003b }
            r1.put(r3, r4)     // Catch:{ all -> 0x003b }
            r0.b((java.lang.Object) r4)     // Catch:{ all -> 0x003b }
        L_0x0039:
            monitor-exit(r2)
            return
        L_0x003b:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wdq.b(java.lang.String, tip):void");
    }

    public final synchronized void c() {
        this.h.p();
        this.l.clear();
        this.m = null;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void d() {
        for (tjc tjc : this.p.values()) {
            if (tjc != null) {
                tjc.b();
            }
        }
        this.p.clear();
    }

    public final synchronized void e() {
        this.h.q();
        this.l.clear();
        this.a.clear();
        this.o.clear();
        d();
        this.b.clear();
        this.q.clear();
        for (wdp a2 : this.r.values()) {
            a2.a();
        }
        this.r.clear();
        this.m = null;
        this.n = null;
        ((anih) ((anih) vvj.a.d()).a("wdq", "e", 796, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("NearbyConnectionsManager has been reset");
    }

    public final synchronized void f(String str) {
        thr.b("initiateBandwidthUpgrade", ((ufu) this.h).a((ufq) new uew(str)), ayni.h());
    }

    public final synchronized void c(String str) {
        this.q.remove(str);
        wdp wdp = (wdp) this.r.remove(str);
        if (wdp != null) {
            wdp.a();
        }
        aosh aosh = (aosh) this.a.remove(str);
        if (aosh != null) {
            aosh.a((Throwable) new Exception("Endpoint disconnected."));
        }
        wcx wcx = (wcx) this.b.remove(str);
        if (wcx != null) {
            wcx.b();
        }
    }

    private final boolean a(boolean z, int i2, wbw wbw) {
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        if (i2 == 1 || wbw == wbw.LOW_POWER || (activeNetwork = this.i.getActiveNetwork()) == null || (networkCapabilities = this.i.getNetworkCapabilities(activeNetwork)) == null) {
            return false;
        }
        boolean z2 = !networkCapabilities.hasCapability(13);
        if (jkr.g() ? !(!z2 || networkCapabilities.hasCapability(19)) : z2) {
            return false;
        }
        if (!networkCapabilities.hasCapability(12) || !networkCapabilities.hasCapability(16)) {
            return false;
        }
        if (jkr.g() && !networkCapabilities.hasCapability(20)) {
            return false;
        }
        if (z && Build.VERSION.SDK_INT <= 23) {
            return false;
        }
        if (i2 == 3) {
            return networkCapabilities.hasCapability(11);
        }
        return true;
    }

    public final synchronized byte[] d(String str) {
        til til;
        til = (til) this.q.get(str);
        return til != null ? til.c : null;
    }

    public final synchronized boolean e(String str) {
        til til;
        til = (til) this.q.get(str);
        return til != null ? til.e : false;
    }

    public final synchronized void b() {
        this.h.a();
        this.n = null;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void b(long j2) {
        wdn wdn = (wdn) this.o.get(Long.valueOf(j2));
        if (wdn != null) {
            wdn.a(j2, 0, 4);
        }
        this.h.a(j2);
        ((anih) ((anih) vvj.a.d()).a("wdq", "b", 732, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Cancelling payload %s", j2);
    }

    /* access modifiers changed from: package-private */
    public final void b(String str) {
        this.h.g(str);
        c(str);
        ((anih) ((anih) vvj.a.d()).a("wdq", "b", 721, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Disconnected from %s", (Object) str);
    }

    public final synchronized void b(String str, tjc tjc, wdn wdn) {
        a(tjc.a, wdn);
        this.h.a(str, tjc);
    }

    public final synchronized int a(wdl wdl) {
        tiq tiq;
        tiz tiz;
        DiscoveryOptions discoveryOptions;
        this.m = wdl;
        tiq = this.h;
        tiz = this.d;
        tiw tiw = new tiw();
        tiw.a(f);
        ParcelUuid parcelUuid = g;
        discoveryOptions = tiw.a;
        discoveryOptions.f = parcelUuid;
        return thr.b("startDiscovery", tiq.a("NearbySharing", tiz, discoveryOptions), ayni.h());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0067, code lost:
        if (r13 == defpackage.wbw.MEDIUM_POWER) goto L_0x0069;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int a(byte[] r12, defpackage.wdm r13, defpackage.wbq r14) {
        /*
            r11 = this;
            monitor-enter(r11)
            r11.n = r13     // Catch:{ all -> 0x00c7 }
            wbw r13 = r14.a     // Catch:{ all -> 0x00c7 }
            int r14 = r14.b     // Catch:{ all -> 0x00c7 }
            tif r0 = new tif     // Catch:{ all -> 0x00c7 }
            r0.<init>()     // Catch:{ all -> 0x00c7 }
            com.google.android.gms.nearby.connection.Strategy r1 = f     // Catch:{ all -> 0x00c7 }
            r0.a((com.google.android.gms.nearby.connection.Strategy) r1)     // Catch:{ all -> 0x00c7 }
            wbw r1 = defpackage.wbw.HIGH_POWER     // Catch:{ all -> 0x00c7 }
            r2 = 0
            r3 = 1
            if (r13 != r1) goto L_0x0019
            r1 = 1
            goto L_0x001a
        L_0x0019:
            r1 = 0
        L_0x001a:
            com.google.android.gms.nearby.connection.AdvertisingOptions r4 = r0.a     // Catch:{ all -> 0x00c7 }
            r4.j = r1     // Catch:{ all -> 0x00c7 }
            wbw r1 = defpackage.wbw.HIGH_POWER     // Catch:{ all -> 0x00c7 }
            if (r13 != r1) goto L_0x0024
            r1 = 1
            goto L_0x0025
        L_0x0024:
            r1 = 0
        L_0x0025:
            com.google.android.gms.nearby.connection.AdvertisingOptions r4 = r0.a     // Catch:{ all -> 0x00c7 }
            r4.i = r1     // Catch:{ all -> 0x00c7 }
            wbw r1 = defpackage.wbw.HIGH_POWER     // Catch:{ all -> 0x00c7 }
            if (r13 != r1) goto L_0x002f
            r1 = 1
            goto L_0x0030
        L_0x002f:
            r1 = 0
        L_0x0030:
            com.google.android.gms.nearby.connection.AdvertisingOptions r4 = r0.a     // Catch:{ all -> 0x00c7 }
            r4.k = r1     // Catch:{ all -> 0x00c7 }
            wbw r1 = defpackage.wbw.HIGH_POWER     // Catch:{ all -> 0x00c7 }
            if (r13 != r1) goto L_0x003a
            r1 = 1
            goto L_0x003b
        L_0x003a:
            r1 = 0
        L_0x003b:
            com.google.android.gms.nearby.connection.AdvertisingOptions r4 = r0.a     // Catch:{ all -> 0x00c7 }
            r4.d = r1     // Catch:{ all -> 0x00c7 }
            r4.e = r3     // Catch:{ all -> 0x00c7 }
            r4.l = r3     // Catch:{ all -> 0x00c7 }
            wbw r1 = defpackage.wbw.LOW_POWER     // Catch:{ all -> 0x00c7 }
            if (r13 != r1) goto L_0x0049
            r1 = 1
            goto L_0x004a
        L_0x0049:
            r1 = 0
        L_0x004a:
            com.google.android.gms.nearby.connection.AdvertisingOptions r4 = r0.a     // Catch:{ all -> 0x00c7 }
            r4.g = r1     // Catch:{ all -> 0x00c7 }
            wbw r1 = defpackage.wbw.HIGH_POWER     // Catch:{ all -> 0x00c7 }
            if (r13 != r1) goto L_0x0054
            r1 = 1
            goto L_0x0055
        L_0x0054:
            r1 = 0
        L_0x0055:
            r0.a((boolean) r1)     // Catch:{ all -> 0x00c7 }
            boolean r14 = r11.a((boolean) r3, (int) r14, (defpackage.wbw) r13)     // Catch:{ all -> 0x00c7 }
            com.google.android.gms.nearby.connection.AdvertisingOptions r1 = r0.a     // Catch:{ all -> 0x00c7 }
            r1.m = r14     // Catch:{ all -> 0x00c7 }
            wbw r14 = defpackage.wbw.LOW_POWER     // Catch:{ all -> 0x00c7 }
            if (r13 != r14) goto L_0x0065
            goto L_0x0069
        L_0x0065:
            wbw r14 = defpackage.wbw.MEDIUM_POWER     // Catch:{ all -> 0x00c7 }
            if (r13 != r14) goto L_0x006f
        L_0x0069:
            android.os.ParcelUuid r13 = g     // Catch:{ all -> 0x00c7 }
            com.google.android.gms.nearby.connection.AdvertisingOptions r14 = r0.a     // Catch:{ all -> 0x00c7 }
            r14.h = r13     // Catch:{ all -> 0x00c7 }
        L_0x006f:
            tiq r13 = r11.h     // Catch:{ all -> 0x00c7 }
            tim r14 = r11.c     // Catch:{ all -> 0x00c7 }
            com.google.android.gms.nearby.connection.AdvertisingOptions r10 = r0.a     // Catch:{ all -> 0x00c7 }
            ufr r0 = new ufr     // Catch:{ all -> 0x00c7 }
            r1 = r13
            ufu r1 = (defpackage.ufu) r1     // Catch:{ all -> 0x00c7 }
            r0.<init>(r1, r14)     // Catch:{ all -> 0x00c7 }
            java.lang.Class<tim> r14 = defpackage.tim.class
            java.lang.String r14 = r14.getName()     // Catch:{ all -> 0x00c7 }
            ige r9 = r13.a((java.lang.Object) r0, (java.lang.String) r14)     // Catch:{ all -> 0x00c7 }
            r14 = r13
            ufu r14 = (defpackage.ufu) r14     // Catch:{ all -> 0x00c7 }
            udo r14 = r14.a     // Catch:{ all -> 0x00c7 }
            java.lang.Object r0 = new java.lang.Object     // Catch:{ all -> 0x00c7 }
            r0.<init>()     // Catch:{ all -> 0x00c7 }
            java.lang.String r1 = "advertising"
            ige r5 = r14.a((defpackage.iby) r13, (java.lang.Object) r0, (java.lang.String) r1)     // Catch:{ all -> 0x00c7 }
            igc r14 = r5.b     // Catch:{ all -> 0x00c7 }
            java.lang.String r0 = "Key must not be null"
            defpackage.iva.a((java.lang.Object) r14, (java.lang.Object) r0)     // Catch:{ all -> 0x00c7 }
            r0 = r13
            ufu r0 = (defpackage.ufu) r0     // Catch:{ all -> 0x00c7 }
            udo r0 = r0.a     // Catch:{ all -> 0x00c7 }
            ufl r1 = new ufl     // Catch:{ all -> 0x00c7 }
            com.google.android.gms.common.Feature[] r6 = new com.google.android.gms.common.Feature[r3]     // Catch:{ all -> 0x00c7 }
            com.google.android.gms.common.Feature r3 = defpackage.tcm.b     // Catch:{ all -> 0x00c7 }
            r6[r2] = r3     // Catch:{ all -> 0x00c7 }
            java.lang.String r8 = "NearbySharing"
            r4 = r1
            r7 = r12
            r4.<init>(r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x00c7 }
            ufm r12 = new ufm     // Catch:{ all -> 0x00c7 }
            r12.<init>(r14)     // Catch:{ all -> 0x00c7 }
            java.lang.String r14 = "startAdvertising"
            acwa r12 = r0.a((defpackage.iby) r13, (defpackage.igi) r1, (defpackage.ihg) r12)     // Catch:{ all -> 0x00c7 }
            long r0 = defpackage.ayni.h()     // Catch:{ all -> 0x00c7 }
            int r12 = defpackage.thr.b((java.lang.String) r14, (defpackage.acwa) r12, (long) r0)     // Catch:{ all -> 0x00c7 }
            monitor-exit(r11)
            return r12
        L_0x00c7:
            r12 = move-exception
            monitor-exit(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wdq.a(byte[], wdm, wbq):int");
    }

    /* access modifiers changed from: package-private */
    public final synchronized tjc a(long j2) {
        return (tjc) this.p.get(Long.valueOf(j2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00ac, code lost:
        return (defpackage.wcx) defpackage.thr.c("connect", r10, defpackage.ayni.h());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.wcx a(byte[] r10, java.lang.String r11, byte[] r12, int r13, boolean r14) {
        /*
            r9 = this;
            java.lang.String r0 = "wdq"
            java.lang.String r1 = "a"
            java.lang.String r2 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            r3 = 0
            if (r12 != 0) goto L_0x000a
            goto L_0x0023
        L_0x000a:
            int r4 = r12.length
            r5 = 6
            if (r4 != r5) goto L_0x0023
            tin r4 = new tin
            r4.<init>()
            com.google.android.gms.nearby.connection.ConnectionOptions r5 = r4.a
            r5.i = r12
            wbw r12 = defpackage.wbw.HIGH_POWER
            boolean r12 = r9.a((boolean) r3, (int) r13, (defpackage.wbw) r12)
            r4.a(r12)
            com.google.android.gms.nearby.connection.ConnectionOptions r12 = r4.a
            goto L_0x0033
        L_0x0023:
            tin r12 = new tin
            r12.<init>()
            wbw r4 = defpackage.wbw.HIGH_POWER
            boolean r13 = r9.a((boolean) r3, (int) r13, (defpackage.wbw) r4)
            r12.a(r13)
            com.google.android.gms.nearby.connection.ConnectionOptions r12 = r12.a
        L_0x0033:
            monitor-enter(r9)
            java.lang.String r13 = "requestConnection"
            tiq r4 = r9.h     // Catch:{ all -> 0x00ce }
            tim r5 = r9.c     // Catch:{ all -> 0x00ce }
            ufr r6 = new ufr     // Catch:{ all -> 0x00ce }
            r7 = r4
            ufu r7 = (defpackage.ufu) r7     // Catch:{ all -> 0x00ce }
            r6.<init>(r7, r5)     // Catch:{ all -> 0x00ce }
            java.lang.Class<tim> r5 = defpackage.tim.class
            java.lang.String r5 = r5.getName()     // Catch:{ all -> 0x00ce }
            ige r5 = r4.a((java.lang.Object) r6, (java.lang.String) r5)     // Catch:{ all -> 0x00ce }
            r6 = r4
            ufu r6 = (defpackage.ufu) r6     // Catch:{ all -> 0x00ce }
            r6.h(r11)     // Catch:{ all -> 0x00ce }
            iha r6 = defpackage.ihb.b()     // Catch:{ all -> 0x00ce }
            r7 = 1
            com.google.android.gms.common.Feature[] r7 = new com.google.android.gms.common.Feature[r7]     // Catch:{ all -> 0x00ce }
            com.google.android.gms.common.Feature r8 = defpackage.tcm.b     // Catch:{ all -> 0x00ce }
            r7[r3] = r8     // Catch:{ all -> 0x00ce }
            r6.b = r7     // Catch:{ all -> 0x00ce }
            uev r3 = new uev     // Catch:{ all -> 0x00ce }
            r3.<init>(r10, r11, r5, r12)     // Catch:{ all -> 0x00ce }
            r6.a = r3     // Catch:{ all -> 0x00ce }
            ihb r10 = r6.a()     // Catch:{ all -> 0x00ce }
            acwa r10 = r4.b((defpackage.ihb) r10)     // Catch:{ all -> 0x00ce }
            ufk r12 = new ufk     // Catch:{ all -> 0x00ce }
            ufu r4 = (defpackage.ufu) r4     // Catch:{ all -> 0x00ce }
            r12.<init>(r4, r11)     // Catch:{ all -> 0x00ce }
            r10.a((defpackage.acvs) r12)     // Catch:{ all -> 0x00ce }
            ayni r12 = defpackage.ayni.a     // Catch:{ all -> 0x00ce }
            aynj r12 = r12.a()     // Catch:{ all -> 0x00ce }
            long r3 = r12.w()     // Catch:{ all -> 0x00ce }
            int r10 = defpackage.thr.b((java.lang.String) r13, (defpackage.acwa) r10, (long) r3)     // Catch:{ all -> 0x00ce }
            if (r10 != 0) goto L_0x00ad
            aosh r10 = defpackage.aosh.f()     // Catch:{ all -> 0x00ce }
            java.util.Map r12 = r9.a     // Catch:{ all -> 0x00ce }
            r12.put(r11, r10)     // Catch:{ all -> 0x00ce }
            if (r14 == 0) goto L_0x009f
            jjg r12 = defpackage.vvj.a     // Catch:{ all -> 0x00ce }
            java.util.Map r12 = r9.r     // Catch:{ all -> 0x00ce }
            wdp r13 = new wdp     // Catch:{ all -> 0x00ce }
            r13.<init>(r11)     // Catch:{ all -> 0x00ce }
            r12.put(r11, r13)     // Catch:{ all -> 0x00ce }
        L_0x009f:
            monitor-exit(r9)     // Catch:{ all -> 0x00ce }
            long r11 = defpackage.ayni.h()
            java.lang.String r13 = "connect"
            java.lang.Object r10 = defpackage.thr.c(r13, r10, r11)
            wcx r10 = (defpackage.wcx) r10
            return r10
        L_0x00ad:
            jjg r12 = defpackage.vvj.a     // Catch:{ all -> 0x00ce }
            anie r12 = r12.b()     // Catch:{ all -> 0x00ce }
            anih r12 = (defpackage.anih) r12     // Catch:{ all -> 0x00ce }
            r13 = 471(0x1d7, float:6.6E-43)
            anie r12 = r12.a((java.lang.String) r0, (java.lang.String) r1, (int) r13, (java.lang.String) r2)     // Catch:{ all -> 0x00ce }
            anih r12 = (defpackage.anih) r12     // Catch:{ all -> 0x00ce }
            java.lang.String r13 = "Failed to connect to the remote shareTarget: %s"
            java.lang.String r10 = defpackage.tit.g(r10)     // Catch:{ all -> 0x00ce }
            r12.a((java.lang.String) r13, (java.lang.Object) r10)     // Catch:{ all -> 0x00ce }
            tiq r10 = r9.h     // Catch:{ all -> 0x00ce }
            r10.g(r11)     // Catch:{ all -> 0x00ce }
            monitor-exit(r9)     // Catch:{ all -> 0x00ce }
            r10 = 0
            return r10
        L_0x00ce:
            r10 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x00ce }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wdq.a(byte[], java.lang.String, byte[], int, boolean):wcx");
    }

    public final synchronized void a() {
        this.h.q();
        tid.a(this.k, "NearbyConnnectionsManagerAlarmExecutor");
        tid.a(this.j, "NearbyConnectionsManagerExecutor");
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(long j2, wdn wdn) {
        this.o.put(Long.valueOf(j2), wdn);
    }

    /* access modifiers changed from: package-private */
    public final void a(Runnable runnable) {
        this.j.execute(runnable);
    }

    public final synchronized void a(String str) {
        if (!this.l.remove(str)) {
            ((anih) ((anih) vvj.a.d()).a("wdq", "a", 348, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Ignoring lost endpoint %s because we haven't reported this endpoint", (Object) str);
            return;
        }
        wdl wdl = this.m;
        if (wdl != null) {
            wdl.a(str);
            ((anih) ((anih) vvj.a.d()).a("wdq", "a", 360, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Endpoint %s lost over Nearby Connections", (Object) str);
            return;
        }
        ((anih) ((anih) vvj.a.d()).a("wdq", "a", 354, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Ignoring lost endpoint %s because we're no longer in discovery mode", (Object) str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00be, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(java.lang.String r10, com.google.android.gms.nearby.connection.PayloadTransferUpdate r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            long r1 = r11.a     // Catch:{ all -> 0x00f3 }
            java.util.Map r0 = r9.o     // Catch:{ all -> 0x00f3 }
            java.lang.Long r3 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x00f3 }
            boolean r0 = r0.containsKey(r3)     // Catch:{ all -> 0x00f3 }
            r4 = 1
            if (r0 != 0) goto L_0x00bf
            java.util.Map r0 = r9.p     // Catch:{ all -> 0x00f3 }
            boolean r0 = r0.containsKey(r3)     // Catch:{ all -> 0x00f3 }
            if (r0 == 0) goto L_0x00bd
            java.util.Map r0 = r9.p     // Catch:{ all -> 0x00f3 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x00f3 }
            tjc r0 = (defpackage.tjc) r0     // Catch:{ all -> 0x00f3 }
            if (r0 == 0) goto L_0x00bd
            byte[] r3 = r0.c     // Catch:{ all -> 0x00f3 }
            java.lang.String r5 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            java.lang.String r6 = "a"
            java.lang.String r7 = "wdq"
            int r8 = r0.b     // Catch:{ all -> 0x00f3 }
            if (r8 != r4) goto L_0x00a1
            int r11 = r11.b     // Catch:{ all -> 0x00f3 }
            if (r11 != r4) goto L_0x00bd
            if (r3 == 0) goto L_0x00bd
            jjg r11 = defpackage.vvj.a     // Catch:{ all -> 0x00f3 }
            anie r11 = r11.d()     // Catch:{ all -> 0x00f3 }
            anih r11 = (defpackage.anih) r11     // Catch:{ all -> 0x00f3 }
            r0 = 697(0x2b9, float:9.77E-43)
            anie r11 = r11.a((java.lang.String) r7, (java.lang.String) r6, (int) r0, (java.lang.String) r5)     // Catch:{ all -> 0x00f3 }
            anih r11 = (defpackage.anih) r11     // Catch:{ all -> 0x00f3 }
            java.lang.String r0 = "Writing incoming byte message to NearbyConnection."
            r11.a((java.lang.String) r0)     // Catch:{ all -> 0x00f3 }
            java.util.Map r11 = r9.b     // Catch:{ all -> 0x00f3 }
            java.lang.Object r10 = r11.get(r10)     // Catch:{ all -> 0x00f3 }
            wcx r10 = (defpackage.wcx) r10     // Catch:{ all -> 0x00f3 }
            if (r10 == 0) goto L_0x009c
            wdq r11 = r10.b     // Catch:{ all -> 0x00f3 }
            monitor-enter(r11)     // Catch:{ all -> 0x00f3 }
            boolean r0 = r10.e     // Catch:{ all -> 0x009e }
            java.lang.String r1 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            java.lang.String r2 = "b"
            java.lang.String r4 = "wcx"
            if (r0 == 0) goto L_0x007a
            jjg r0 = defpackage.vvj.a     // Catch:{ all -> 0x009e }
            anie r0 = r0.d()     // Catch:{ all -> 0x009e }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x009e }
            r3 = 82
            anie r0 = r0.a((java.lang.String) r4, (java.lang.String) r2, (int) r3, (java.lang.String) r1)     // Catch:{ all -> 0x009e }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x009e }
            java.lang.String r1 = "Dropping NearbyConnection message for %s because we're closed"
            java.lang.String r10 = r10.c     // Catch:{ all -> 0x009e }
            r0.a((java.lang.String) r1, (java.lang.Object) r10)     // Catch:{ all -> 0x009e }
            monitor-exit(r11)     // Catch:{ all -> 0x009e }
            monitor-exit(r9)
            return
        L_0x007a:
            jjg r0 = defpackage.vvj.a     // Catch:{ all -> 0x009e }
            anie r0 = r0.d()     // Catch:{ all -> 0x009e }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x009e }
            r5 = 87
            anie r0 = r0.a((java.lang.String) r4, (java.lang.String) r2, (int) r5, (java.lang.String) r1)     // Catch:{ all -> 0x009e }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x009e }
            java.lang.String r1 = "Wrote NearbyConnection message to queue for %s"
            java.lang.String r2 = r10.c     // Catch:{ all -> 0x009e }
            r0.a((java.lang.String) r1, (java.lang.Object) r2)     // Catch:{ all -> 0x009e }
            java.util.concurrent.ConcurrentLinkedQueue r0 = r10.d     // Catch:{ all -> 0x009e }
            r0.add(r3)     // Catch:{ all -> 0x009e }
            wdq r10 = r10.b     // Catch:{ all -> 0x009e }
            r10.notify()     // Catch:{ all -> 0x009e }
            monitor-exit(r11)     // Catch:{ all -> 0x009e }
        L_0x009c:
            monitor-exit(r9)
            return
        L_0x009e:
            r10 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x009e }
            throw r10     // Catch:{ all -> 0x00f3 }
        L_0x00a1:
            jjg r10 = defpackage.vvj.a     // Catch:{ all -> 0x00f3 }
            anie r10 = r10.c()     // Catch:{ all -> 0x00f3 }
            anih r10 = (defpackage.anih) r10     // Catch:{ all -> 0x00f3 }
            r11 = 692(0x2b4, float:9.7E-43)
            anie r10 = r10.a((java.lang.String) r7, (java.lang.String) r6, (int) r11, (java.lang.String) r5)     // Catch:{ all -> 0x00f3 }
            anih r10 = (defpackage.anih) r10     // Catch:{ all -> 0x00f3 }
            java.lang.String r11 = "Received unknown payload of type %d. Cancelling."
            int r0 = r0.b     // Catch:{ all -> 0x00f3 }
            r10.a((java.lang.String) r11, (int) r0)     // Catch:{ all -> 0x00f3 }
            tiq r10 = r9.h     // Catch:{ all -> 0x00f3 }
            r10.a((long) r1)     // Catch:{ all -> 0x00f3 }
        L_0x00bd:
            monitor-exit(r9)
            return
        L_0x00bf:
            java.util.Map r10 = r9.o     // Catch:{ all -> 0x00f3 }
            java.lang.Object r10 = r10.get(r3)     // Catch:{ all -> 0x00f3 }
            r0 = r10
            wdn r0 = (defpackage.wdn) r0     // Catch:{ all -> 0x00f3 }
            if (r0 == 0) goto L_0x00f1
            int r10 = r11.b     // Catch:{ all -> 0x00f3 }
            r5 = 4
            r6 = 3
            if (r10 == r4) goto L_0x00e3
            if (r10 == r6) goto L_0x00e1
            if (r10 == r5) goto L_0x00db
            java.util.Map r10 = r9.o     // Catch:{ all -> 0x00f3 }
            r10.remove(r3)     // Catch:{ all -> 0x00f3 }
            r5 = 3
            goto L_0x00ea
        L_0x00db:
            java.util.Map r10 = r9.o     // Catch:{ all -> 0x00f3 }
            r10.remove(r3)     // Catch:{ all -> 0x00f3 }
            goto L_0x00ea
        L_0x00e1:
            r5 = 1
            goto L_0x00ea
        L_0x00e3:
            java.util.Map r10 = r9.o     // Catch:{ all -> 0x00f3 }
            r10.remove(r3)     // Catch:{ all -> 0x00f3 }
            r10 = 2
            r5 = 2
        L_0x00ea:
            long r3 = r11.d     // Catch:{ all -> 0x00f3 }
            r0.a(r1, r3, r5)     // Catch:{ all -> 0x00f3 }
            monitor-exit(r9)
            return
        L_0x00f1:
            monitor-exit(r9)
            return
        L_0x00f3:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wdq.a(java.lang.String, com.google.android.gms.nearby.connection.PayloadTransferUpdate):void");
    }

    public final synchronized void a(String str, tij tij) {
        wdp wdp = (wdp) this.r.get(str);
        if (wdp != null) {
            wdp.a(tij.a);
        }
    }

    public final synchronized void a(String str, til til) {
        this.q.put(str, til);
        this.h.a(str, this.e);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(java.lang.String r3, defpackage.tip r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.util.Map r0 = r2.q     // Catch:{ all -> 0x003b }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x003b }
            til r0 = (defpackage.til) r0     // Catch:{ all -> 0x003b }
            if (r0 == 0) goto L_0x0039
            boolean r1 = r0.d     // Catch:{ all -> 0x003b }
            if (r1 == 0) goto L_0x0013
            r2.a((java.lang.String) r3, (defpackage.til) r0, (defpackage.tip) r4)     // Catch:{ all -> 0x003b }
            goto L_0x0016
        L_0x0013:
            r2.b(r3, r4)     // Catch:{ all -> 0x003b }
        L_0x0016:
            com.google.android.gms.common.api.Status r4 = r4.a     // Catch:{ all -> 0x003b }
            boolean r4 = r4.c()     // Catch:{ all -> 0x003b }
            if (r4 != 0) goto L_0x0028
            java.util.Map r4 = r2.q     // Catch:{ all -> 0x003b }
            r4.remove(r3)     // Catch:{ all -> 0x003b }
            java.util.Map r4 = r2.r     // Catch:{ all -> 0x003b }
            r4.remove(r3)     // Catch:{ all -> 0x003b }
        L_0x0028:
            java.util.Map r4 = r2.r     // Catch:{ all -> 0x003b }
            java.lang.Object r3 = r4.get(r3)     // Catch:{ all -> 0x003b }
            wdp r3 = (defpackage.wdp) r3     // Catch:{ all -> 0x003b }
            if (r3 == 0) goto L_0x0037
            java.util.concurrent.ScheduledExecutorService r4 = r2.k     // Catch:{ all -> 0x003b }
            r3.a((java.util.concurrent.ScheduledExecutorService) r4)     // Catch:{ all -> 0x003b }
        L_0x0037:
            monitor-exit(r2)
            return
        L_0x0039:
            monitor-exit(r2)
            return
        L_0x003b:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wdq.a(java.lang.String, tip):void");
    }

    public final synchronized void a(String str, tiv tiv) {
        if (this.m == null) {
            ((anih) ((anih) vvj.a.d()).a("wdq", "a", 324, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Ignoring discovered endpoint %s because we're no longer in discovery mode", (Object) whu.b(tiv.b));
        } else if (!this.l.contains(str)) {
            this.m.a(str, tiv.b);
            this.l.add(str);
            ((anih) ((anih) vvj.a.d()).a("wdq", "a", 340, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Discovered %s over Nearby Connections", (Object) whu.b(tiv.b));
        } else {
            ((anih) ((anih) vvj.a.d()).a("wdq", "a", 332, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Ignoring discovered endpoint %s because we've already reported this endpoint", (Object) whu.b(tiv.b));
        }
    }

    public final synchronized void a(String str, tiy tiy) {
        if (this.m == null) {
            ((anih) ((anih) vvj.a.d()).a("wdq", "a", 367, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Ignoring endpoint distance changed %s because we're no longer in discovery mode", (Object) str);
        } else if (this.l.contains(str)) {
            this.m.a(str, tiy.a);
            anih anih = (anih) ((anih) vvj.a.d()).a("wdq", "a", 381, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)");
            int i2 = tiy.a;
            anih.a("Endpoint %s distance changed to %s over Nearby Connections", (Object) str, (Object) i2 != 2 ? i2 != 3 ? i2 != 4 ? "UNKNOWN" : "FAR" : "CLOSE" : "VERY_CLOSE");
        } else {
            ((anih) ((anih) vvj.a.d()).a("wdq", "a", 374, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Ignoring endpoint distance changed %s because we haven't reported this endpoint", (Object) str);
        }
    }

    public final synchronized void a(String str, tjc tjc, wdn wdn) {
        wdp wdp = (wdp) this.r.get(str);
        if (wdp != null) {
            wdp.a((Runnable) new wcy(this, str, tjc, wdn));
        } else {
            b(str, tjc, wdn);
        }
    }

    public final synchronized void a(tjc tjc) {
        this.p.put(Long.valueOf(tjc.a), tjc);
    }
}
