package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import java.util.Comparator;
import java.util.Set;

/* renamed from: aaeh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aaeh implements Comparator {
    private final aadz a;
    private final int b;
    private final aadt c;
    private final aaba d;
    private final qyj e = new qyj(aaef.a);
    private final qyj f = new qyj(aaeg.a);
    private int g;
    private Set h = anfv.a;
    private long i;

    public aaeh(aadz aadz, int i2, aadt aadt, aaba aaba) {
        this.a = aadz;
        this.b = i2;
        this.c = aadt;
        this.d = aaba;
    }

    private final synchronized void a(ConnectivityManager connectivityManager) {
        NetworkCapabilities networkCapabilities;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (!(activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null)) {
            this.g |= 1;
            if (networkCapabilities.hasCapability(11)) {
                this.g |= 2;
            }
        }
    }

    private final boolean a(int i2) {
        return (this.g & i2) == i2;
    }

    private final synchronized void b(ConnectivityManager connectivityManager) {
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            this.g |= 1;
            if (!ml.a(connectivityManager)) {
                this.g |= 2;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00e6, code lost:
        if (defpackage.axbn.a.a().F() == false) goto L_0x0108;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0101, code lost:
        if (r0 == 2) goto L_0x0103;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean c(defpackage.aabq r9) {
        /*
            r8 = this;
            nwq r0 = r9.m
            int r1 = r0.e
            int r1 = defpackage.nwp.a(r1)
            r2 = 1
            if (r1 == 0) goto L_0x000c
            goto L_0x000d
        L_0x000c:
            r1 = 1
        L_0x000d:
            int r3 = r0.c
            int r3 = defpackage.nwp.a(r3)
            if (r3 == 0) goto L_0x0016
            goto L_0x0017
        L_0x0016:
            r3 = 1
        L_0x0017:
            if (r1 != r3) goto L_0x0024
            int r0 = r0.c
            int r0 = defpackage.nwp.a(r0)
            if (r0 == 0) goto L_0x0022
            goto L_0x003d
        L_0x0022:
            r0 = 1
            goto L_0x003d
        L_0x0024:
            boolean r1 = r8.d(r9)
            if (r1 != 0) goto L_0x0034
            int r0 = r0.c
            int r0 = defpackage.nwp.a(r0)
            if (r0 != 0) goto L_0x003d
            r0 = 1
            goto L_0x003d
        L_0x0034:
            int r0 = r0.e
            int r0 = defpackage.nwp.a(r0)
            if (r0 != 0) goto L_0x003d
            r0 = 1
        L_0x003d:
            r1 = 4
            r3 = 2
            r4 = 3
            r5 = 0
            if (r0 != r4) goto L_0x004d
            boolean r0 = r8.a((int) r2)
            if (r0 == 0) goto L_0x004a
            goto L_0x0059
        L_0x004a:
            r9.l = r4
            return r5
        L_0x004d:
            if (r0 != r1) goto L_0x0059
            boolean r0 = r8.a((int) r3)
            if (r0 != 0) goto L_0x0059
            r0 = 7
            r9.l = r0
            return r5
        L_0x0059:
            nwq r0 = r9.m
            int r6 = r0.f
            int r6 = defpackage.nwl.a(r6)
            if (r6 == 0) goto L_0x0064
            goto L_0x0065
        L_0x0064:
            r6 = 1
        L_0x0065:
            int r7 = r0.d
            int r7 = defpackage.nwl.a(r7)
            if (r7 == 0) goto L_0x006e
            goto L_0x006f
        L_0x006e:
            r7 = 1
        L_0x006f:
            if (r6 != r7) goto L_0x007a
            int r0 = r0.d
            int r0 = defpackage.nwl.a(r0)
            if (r0 != 0) goto L_0x0092
            goto L_0x009f
        L_0x007a:
            boolean r6 = r8.d(r9)
            if (r6 != 0) goto L_0x0089
            int r0 = r0.d
            int r0 = defpackage.nwl.a(r0)
            if (r0 != 0) goto L_0x0092
            goto L_0x009f
        L_0x0089:
            int r0 = r0.f
            int r0 = defpackage.nwl.a(r0)
            if (r0 != 0) goto L_0x0092
            goto L_0x009f
        L_0x0092:
            if (r0 != r4) goto L_0x009f
            boolean r0 = r8.a((int) r1)
            if (r0 != 0) goto L_0x009f
            r0 = 8
            r9.l = r0
            return r5
        L_0x009f:
            boolean r0 = r9.o()
            if (r0 == 0) goto L_0x0108
            boolean r0 = defpackage.axbn.f()
            if (r0 == 0) goto L_0x0108
            r0 = 64
            boolean r0 = r8.a((int) r0)
            if (r0 != 0) goto L_0x0108
            nwq r0 = r9.m
            int r1 = r0.h
            int r1 = defpackage.nwn.a(r1)
            if (r1 == 0) goto L_0x00be
            goto L_0x00bf
        L_0x00be:
            r1 = 1
        L_0x00bf:
            int r4 = r0.g
            int r4 = defpackage.nwn.a(r4)
            if (r4 == 0) goto L_0x00c8
            goto L_0x00c9
        L_0x00c8:
            r4 = 1
        L_0x00c9:
            if (r1 != r4) goto L_0x00e9
            int r0 = r0.g
            int r0 = defpackage.nwn.a(r0)
            if (r0 != 0) goto L_0x00d4
            goto L_0x0108
        L_0x00d4:
            if (r0 != r3) goto L_0x0108
            boolean r0 = r8.d(r9)
            if (r0 != 0) goto L_0x0103
            axbn r0 = defpackage.axbn.a
            axbx r0 = r0.a()
            boolean r0 = r0.F()
            if (r0 == 0) goto L_0x0108
            goto L_0x0103
        L_0x00e9:
            boolean r1 = r8.d(r9)
            if (r1 != 0) goto L_0x00f8
            int r0 = r0.g
            int r0 = defpackage.nwn.a(r0)
            if (r0 == 0) goto L_0x0108
            goto L_0x0101
        L_0x00f8:
            int r0 = r0.h
            int r0 = defpackage.nwn.a(r0)
            if (r0 != 0) goto L_0x0101
            goto L_0x0108
        L_0x0101:
            if (r0 != r3) goto L_0x0108
        L_0x0103:
            r0 = 16
            r9.l = r0
            return r5
        L_0x0108:
            boolean r0 = defpackage.axlx.b()
            if (r0 == 0) goto L_0x0125
            qxx r0 = r9.n
            java.util.Set r0 = r0.k
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x0125
            java.util.Set r1 = r8.h
            boolean r0 = java.util.Collections.disjoint(r0, r1)
            if (r0 != 0) goto L_0x0125
            r0 = 15
            r9.l = r0
            return r5
        L_0x0125:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aaeh.c(aabq):boolean");
    }

    private final boolean d(aabq aabq) {
        if (axcc.b() && !this.e.a(aabq.r())) {
            return false;
        }
        if ((!axcc.a.a().c() || this.f.a(aabq.r())) && !aabq.c && this.i <= aabq.h() + ((axbn.a.a().J() * (aabq.i() - aabq.h())) / 100)) {
            return true;
        }
        return false;
    }

    private final boolean e(aabq aabq) {
        return aabq.d <= this.i;
    }

    private final boolean f(aabq aabq) {
        long j;
        if (aabq.q()) {
            return !aabq.b().isEmpty();
        }
        if (aabq.c) {
            return true;
        }
        if (this.b == 1) {
            j = aabq.h();
        } else {
            j = aabq.i();
        }
        return j <= this.i;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        aabq aabq = (aabq) obj;
        aabq aabq2 = (aabq) obj2;
        if (this.b == 1) {
            return aook.a(aabq.h(), aabq2.h());
        }
        return aook.a(aabq.i(), aabq2.i());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized boolean b(defpackage.aabq r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r2 = r2.o()     // Catch:{ all -> 0x002a }
            if (r2 == 0) goto L_0x001e
            r2 = 4
            boolean r2 = r1.a((int) r2)     // Catch:{ all -> 0x002a }
            r0 = 0
            if (r2 != 0) goto L_0x001c
            axbz r2 = defpackage.axbz.a     // Catch:{ all -> 0x002a }
            axca r2 = r2.a()     // Catch:{ all -> 0x002a }
            boolean r2 = r2.a()     // Catch:{ all -> 0x002a }
            if (r2 != 0) goto L_0x001c
            goto L_0x001e
        L_0x001c:
            monitor-exit(r1)
            return r0
        L_0x001e:
            axmd r2 = defpackage.axmd.a     // Catch:{ all -> 0x002a }
            axme r2 = r2.a()     // Catch:{ all -> 0x002a }
            boolean r2 = r2.c()     // Catch:{ all -> 0x002a }
            monitor-exit(r1)
            return r2
        L_0x002a:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aaeh.b(aabq):boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x01f0 A[Catch:{ all -> 0x01f6, all -> 0x01fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x006f A[Catch:{ all -> 0x01f6, all -> 0x01fb }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:25:0x0062=Splitter:B:25:0x0062, B:7:0x0033=Splitter:B:7:0x0033} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int a(defpackage.aabq r14) {
        /*
            r13 = this;
            monitor-enter(r13)
            qye r0 = new qye     // Catch:{ all -> 0x0200 }
            java.lang.String r1 = "nts:standalone:checkTaskEligibility"
            r0.<init>(r1)     // Catch:{ all -> 0x0200 }
            boolean r1 = defpackage.aaaz.b((defpackage.aabq) r14)     // Catch:{ all -> 0x01f6 }
            r2 = 2
            if (r1 != 0) goto L_0x0038
            java.lang.String r1 = "ExecutionCriteria"
            java.lang.String r14 = java.lang.String.valueOf(r14)     // Catch:{ all -> 0x01f6 }
            java.lang.String r3 = java.lang.String.valueOf(r14)     // Catch:{ all -> 0x01f6 }
            int r3 = r3.length()     // Catch:{ all -> 0x01f6 }
            int r3 = r3 + 42
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x01f6 }
            r4.<init>(r3)     // Catch:{ all -> 0x01f6 }
            java.lang.String r3 = "Running in whitelist mode. Ignoring task: "
            r4.append(r3)     // Catch:{ all -> 0x01f6 }
            r4.append(r14)     // Catch:{ all -> 0x01f6 }
            java.lang.String r14 = r4.toString()     // Catch:{ all -> 0x01f6 }
            android.util.Log.w(r1, r14)     // Catch:{ all -> 0x01f6 }
        L_0x0033:
            r0.close()     // Catch:{ all -> 0x0200 }
            monitor-exit(r13)
            return r2
        L_0x0038:
            r1 = 8
            boolean r1 = r13.a((int) r1)     // Catch:{ all -> 0x01f6 }
            r3 = 0
            if (r1 != 0) goto L_0x0042
            goto L_0x0067
        L_0x0042:
            boolean r1 = r13.b((defpackage.aabq) r14)     // Catch:{ all -> 0x01f6 }
            if (r1 == 0) goto L_0x0067
            aaba r1 = r13.d     // Catch:{ all -> 0x01f6 }
            nxc r4 = r14.a     // Catch:{ all -> 0x01f6 }
            java.lang.String r4 = r4.b     // Catch:{ all -> 0x01f6 }
            boolean r5 = defpackage.jkr.b()     // Catch:{ all -> 0x01f6 }
            if (r5 == 0) goto L_0x005e
            android.os.PowerManager r1 = r1.a     // Catch:{ all -> 0x01f6 }
            if (r1 == 0) goto L_0x005e
            boolean r1 = r1.isIgnoringBatteryOptimizations(r4)     // Catch:{ all -> 0x01f6 }
            if (r1 != 0) goto L_0x0067
        L_0x005e:
            r1 = 9
            r14.l = r1     // Catch:{ all -> 0x01f6 }
        L_0x0062:
            r0.close()     // Catch:{ all -> 0x0200 }
            monitor-exit(r13)
            return r3
        L_0x0067:
            r1 = 16
            boolean r1 = r13.a((int) r1)     // Catch:{ all -> 0x01f6 }
            if (r1 != 0) goto L_0x01f0
            r1 = 32
            boolean r1 = r13.a((int) r1)     // Catch:{ all -> 0x01f6 }
            if (r1 == 0) goto L_0x007c
            r1 = 13
            r14.l = r1     // Catch:{ all -> 0x01f6 }
            goto L_0x0062
        L_0x007c:
            boolean r1 = r14.q()     // Catch:{ all -> 0x01f6 }
            if (r1 == 0) goto L_0x0083
        L_0x0082:
            goto L_0x008a
        L_0x0083:
            boolean r1 = r14.p()     // Catch:{ all -> 0x01f6 }
            if (r1 != 0) goto L_0x0082
            goto L_0x0033
        L_0x008a:
            axbn r1 = defpackage.axbn.a     // Catch:{ all -> 0x01f6 }
            axbx r1 = r1.a()     // Catch:{ all -> 0x01f6 }
            boolean r1 = r1.g()     // Catch:{ all -> 0x01f6 }
            if (r1 == 0) goto L_0x00a8
            boolean r4 = r13.e(r14)     // Catch:{ all -> 0x01f6 }
            if (r4 == 0) goto L_0x0062
            boolean r4 = r13.f(r14)     // Catch:{ all -> 0x01f6 }
            if (r4 == 0) goto L_0x0062
            boolean r4 = r13.c(r14)     // Catch:{ all -> 0x01f6 }
            if (r4 == 0) goto L_0x0062
        L_0x00a8:
            aadz r4 = r13.a     // Catch:{ all -> 0x01f6 }
            nxc r5 = r14.a     // Catch:{ all -> 0x01f6 }
            java.lang.String r6 = r5.b     // Catch:{ all -> 0x01f6 }
            long r7 = r5.e     // Catch:{ all -> 0x01f6 }
            int r5 = (int) r7     // Catch:{ all -> 0x01f6 }
            ou r7 = r4.c     // Catch:{ all -> 0x01f6 }
            java.lang.Object r7 = r7.get(r6)     // Catch:{ all -> 0x01f6 }
            android.util.SparseIntArray r7 = (android.util.SparseIntArray) r7     // Catch:{ all -> 0x01f6 }
            r8 = 1
            if (r7 != 0) goto L_0x00c6
            android.util.SparseIntArray r7 = new android.util.SparseIntArray     // Catch:{ all -> 0x01f6 }
            r7.<init>(r8)     // Catch:{ all -> 0x01f6 }
            ou r9 = r4.c     // Catch:{ all -> 0x01f6 }
            r9.put(r6, r7)     // Catch:{ all -> 0x01f6 }
        L_0x00c6:
            int r6 = r7.get(r5, r3)     // Catch:{ all -> 0x01f6 }
            r9 = 5
            if (r6 != 0) goto L_0x015d
            nxc r6 = r14.a     // Catch:{ all -> 0x01f6 }
            long r10 = r6.e     // Catch:{ all -> 0x01f6 }
            int r6 = (int) r10     // Catch:{ all -> 0x01f6 }
            android.util.SparseIntArray r10 = r4.b     // Catch:{ all -> 0x01f6 }
            int r10 = r10.get(r6, r3)     // Catch:{ all -> 0x01f6 }
            r11 = 3
            if (r10 != 0) goto L_0x0107
            boolean r10 = defpackage.nqw.d(r6)     // Catch:{ all -> 0x01f6 }
            if (r10 != 0) goto L_0x00fa
            boolean r10 = defpackage.nqw.a()     // Catch:{ all -> 0x01f6 }
            if (r10 == 0) goto L_0x00f4
            boolean r10 = defpackage.nqw.a     // Catch:{ all -> 0x01f6 }
            if (r10 == 0) goto L_0x00f4
            int r10 = defpackage.nqw.a((int) r6)     // Catch:{ all -> 0x01f6 }
            if (r10 < 0) goto L_0x00f8
            r10 = 2
            goto L_0x00fb
        L_0x00f4:
            if (r6 != 0) goto L_0x00f8
            r10 = 2
            goto L_0x00fb
        L_0x00f8:
            r10 = 3
            goto L_0x00fb
        L_0x00fa:
            r10 = 1
        L_0x00fb:
            android.util.SparseIntArray r12 = r4.b     // Catch:{ all -> 0x01f6 }
            r12.put(r6, r10)     // Catch:{ all -> 0x01f6 }
            if (r10 == r8) goto L_0x0107
            ntv r12 = r4.a     // Catch:{ all -> 0x01f6 }
            r12.a(r6)     // Catch:{ all -> 0x01f6 }
        L_0x0107:
            r6 = 6
            if (r10 == r2) goto L_0x0158
            if (r10 == r11) goto L_0x0156
            ntv r4 = r4.a     // Catch:{ NameNotFoundException -> 0x0152 }
            nxc r10 = r14.a     // Catch:{ NameNotFoundException -> 0x0152 }
            long r10 = r10.e     // Catch:{ NameNotFoundException -> 0x0152 }
            int r11 = (int) r10     // Catch:{ NameNotFoundException -> 0x0152 }
            android.content.Context r4 = r4.b(r11)     // Catch:{ NameNotFoundException -> 0x0152 }
            if (r4 == 0) goto L_0x0151
            android.content.pm.PackageManager r10 = r4.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0152 }
            if (r10 == 0) goto L_0x0151
            nxc r6 = r14.a     // Catch:{ NameNotFoundException -> 0x0152 }
            java.lang.String r6 = r6.b     // Catch:{ NameNotFoundException -> 0x0152 }
            android.content.pm.ApplicationInfo r6 = r10.getApplicationInfo(r6, r3)     // Catch:{ NameNotFoundException -> 0x0152 }
            int r6 = r6.flags     // Catch:{ NameNotFoundException -> 0x0152 }
            r10 = 2097152(0x200000, float:2.938736E-39)
            r6 = r6 & r10
            if (r6 == r10) goto L_0x014f
            boolean r6 = defpackage.jkr.b()     // Catch:{ NameNotFoundException -> 0x0152 }
            if (r6 == 0) goto L_0x014d
            java.lang.Class<android.app.usage.UsageStatsManager> r6 = android.app.usage.UsageStatsManager.class
            java.lang.Object r4 = r4.getSystemService(r6)     // Catch:{ NameNotFoundException -> 0x0152 }
            android.app.usage.UsageStatsManager r4 = (android.app.usage.UsageStatsManager) r4     // Catch:{ NameNotFoundException -> 0x0152 }
            if (r4 == 0) goto L_0x014d
            nxc r6 = r14.a     // Catch:{ NameNotFoundException -> 0x0152 }
            java.lang.String r6 = r6.b     // Catch:{ NameNotFoundException -> 0x0152 }
            boolean r4 = r4.isAppInactive(r6)     // Catch:{ NameNotFoundException -> 0x0152 }
            if (r4 != 0) goto L_0x014a
            r6 = 1
            goto L_0x0159
        L_0x014a:
            r4 = 7
            r6 = 7
            goto L_0x0159
        L_0x014d:
            r6 = 1
            goto L_0x0159
        L_0x014f:
            r6 = 5
            goto L_0x0159
        L_0x0151:
            goto L_0x0159
        L_0x0152:
            r4 = move-exception
            r4 = 4
            r6 = 4
            goto L_0x0159
        L_0x0156:
            r6 = 3
            goto L_0x0159
        L_0x0158:
            r6 = 2
        L_0x0159:
            r7.put(r5, r6)     // Catch:{ all -> 0x01f6 }
            goto L_0x015e
        L_0x015d:
        L_0x015e:
            switch(r6) {
                case 1: goto L_0x01ba;
                case 2: goto L_0x01b6;
                case 3: goto L_0x0033;
                case 4: goto L_0x0190;
                case 5: goto L_0x018a;
                case 6: goto L_0x016b;
                case 7: goto L_0x0165;
                default: goto L_0x0161;
            }     // Catch:{ all -> 0x01f6 }
        L_0x0161:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x01f6 }
            goto L_0x01d8
        L_0x0165:
            r1 = 12
            r14.l = r1     // Catch:{ all -> 0x01f6 }
            goto L_0x0062
        L_0x016b:
            java.lang.String r1 = "ExecutionCriteria"
            nxc r14 = r14.a     // Catch:{ all -> 0x01f6 }
            long r4 = r14.e     // Catch:{ all -> 0x01f6 }
            int r14 = (int) r4     // Catch:{ all -> 0x01f6 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01f6 }
            r4 = 48
            r2.<init>(r4)     // Catch:{ all -> 0x01f6 }
            java.lang.String r4 = "PackageManager unavailable for user #"
            r2.append(r4)     // Catch:{ all -> 0x01f6 }
            r2.append(r14)     // Catch:{ all -> 0x01f6 }
            java.lang.String r14 = r2.toString()     // Catch:{ all -> 0x01f6 }
            android.util.Log.e(r1, r14)     // Catch:{ all -> 0x01f6 }
            goto L_0x0062
        L_0x018a:
            r1 = 10
            r14.l = r1     // Catch:{ all -> 0x01f6 }
            goto L_0x0062
        L_0x0190:
            java.lang.String r1 = "ExecutionCriteria"
            java.lang.String r14 = java.lang.String.valueOf(r14)     // Catch:{ all -> 0x01f6 }
            java.lang.String r2 = java.lang.String.valueOf(r14)     // Catch:{ all -> 0x01f6 }
            int r2 = r2.length()     // Catch:{ all -> 0x01f6 }
            int r2 = r2 + 30
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x01f6 }
            r4.<init>(r2)     // Catch:{ all -> 0x01f6 }
            java.lang.String r2 = "Package unavailable for task: "
            r4.append(r2)     // Catch:{ all -> 0x01f6 }
            r4.append(r14)     // Catch:{ all -> 0x01f6 }
            java.lang.String r14 = r4.toString()     // Catch:{ all -> 0x01f6 }
            android.util.Log.e(r1, r14)     // Catch:{ all -> 0x01f6 }
            goto L_0x0062
        L_0x01b6:
            r14.l = r9     // Catch:{ all -> 0x01f6 }
            goto L_0x0062
        L_0x01ba:
            if (r1 != 0) goto L_0x01d3
            boolean r1 = r13.e(r14)     // Catch:{ all -> 0x01f6 }
            if (r1 == 0) goto L_0x01d1
            boolean r1 = r13.f(r14)     // Catch:{ all -> 0x01f6 }
            if (r1 == 0) goto L_0x01d1
            boolean r14 = r13.c(r14)     // Catch:{ all -> 0x01f6 }
            if (r14 == 0) goto L_0x01d1
            r3 = 1
            goto L_0x0062
        L_0x01d1:
            goto L_0x0062
        L_0x01d3:
            r0.close()     // Catch:{ all -> 0x0200 }
            monitor-exit(r13)
            return r8
        L_0x01d8:
            r1 = 36
            r14.<init>(r1)     // Catch:{ all -> 0x01f6 }
            java.lang.String r1 = "Unexpected state result: "
            r14.append(r1)     // Catch:{ all -> 0x01f6 }
            r14.append(r6)     // Catch:{ all -> 0x01f6 }
            java.lang.String r1 = "ExecutionCriteria"
            java.lang.String r14 = r14.toString()     // Catch:{ all -> 0x01f6 }
            android.util.Log.w(r1, r14)     // Catch:{ all -> 0x01f6 }
            goto L_0x0033
        L_0x01f0:
            r1 = 11
            r14.l = r1     // Catch:{ all -> 0x01f6 }
            goto L_0x0062
        L_0x01f6:
            r14 = move-exception
            r0.close()     // Catch:{ all -> 0x01fb }
            goto L_0x01ff
        L_0x01fb:
            r0 = move-exception
            defpackage.apev.a((java.lang.Throwable) r14, (java.lang.Throwable) r0)     // Catch:{ all -> 0x0200 }
        L_0x01ff:
            throw r14     // Catch:{ all -> 0x0200 }
        L_0x0200:
            r14 = move-exception
            monitor-exit(r13)
            goto L_0x0204
        L_0x0203:
            throw r14
        L_0x0204:
            goto L_0x0203
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aaeh.a(aabq):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0063, code lost:
        if (defpackage.axlu.a.a().n() == false) goto L_0x006b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int a(android.content.Context r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            qye r0 = new qye     // Catch:{ all -> 0x00e1 }
            java.lang.String r1 = "nts:standalone:refreshDeviceState"
            r0.<init>(r1)     // Catch:{ all -> 0x00e1 }
            long r1 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x00d7 }
            r5.i = r1     // Catch:{ all -> 0x00d7 }
            r1 = 0
            r5.g = r1     // Catch:{ all -> 0x00d7 }
            java.lang.String r2 = "connectivity"
            java.lang.Object r2 = r6.getSystemService(r2)     // Catch:{ all -> 0x00d7 }
            android.net.ConnectivityManager r2 = (android.net.ConnectivityManager) r2     // Catch:{ all -> 0x00d7 }
            if (r2 != 0) goto L_0x001c
            goto L_0x0035
        L_0x001c:
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00d7 }
            r4 = 23
            if (r3 < r4) goto L_0x0032
            axbn r3 = defpackage.axbn.a     // Catch:{ all -> 0x00d7 }
            axbx r3 = r3.a()     // Catch:{ all -> 0x00d7 }
            boolean r3 = r3.q()     // Catch:{ all -> 0x00d7 }
            if (r3 == 0) goto L_0x0032
            r5.a((android.net.ConnectivityManager) r2)     // Catch:{ all -> 0x00d7 }
            goto L_0x0035
        L_0x0032:
            r5.b((android.net.ConnectivityManager) r2)     // Catch:{ all -> 0x00d7 }
        L_0x0035:
            android.content.IntentFilter r2 = new android.content.IntentFilter     // Catch:{ all -> 0x00d7 }
            java.lang.String r3 = "android.intent.action.BATTERY_CHANGED"
            r2.<init>(r3)     // Catch:{ all -> 0x00d7 }
            r3 = 0
            android.content.Intent r6 = r6.registerReceiver(r3, r2)     // Catch:{ all -> 0x00d7 }
            if (r6 == 0) goto L_0x006b
            java.lang.String r2 = "status"
            r3 = -1
            int r2 = r6.getIntExtra(r2, r3)     // Catch:{ all -> 0x00d7 }
            java.lang.String r3 = "plugged"
            int r6 = r6.getIntExtra(r3, r1)     // Catch:{ all -> 0x00d7 }
            r1 = 2
            if (r2 != r1) goto L_0x0054
            goto L_0x0065
        L_0x0054:
            r1 = 5
            if (r2 == r1) goto L_0x0065
            if (r6 == 0) goto L_0x006b
            axlu r6 = defpackage.axlu.a     // Catch:{ all -> 0x00d7 }
            axlv r6 = r6.a()     // Catch:{ all -> 0x00d7 }
            boolean r6 = r6.n()     // Catch:{ all -> 0x00d7 }
            if (r6 == 0) goto L_0x006b
        L_0x0065:
            int r6 = r5.g     // Catch:{ all -> 0x00d7 }
            r6 = r6 | 4
            r5.g = r6     // Catch:{ all -> 0x00d7 }
        L_0x006b:
            boolean r6 = defpackage.axlx.b()     // Catch:{ all -> 0x00d7 }
            if (r6 == 0) goto L_0x0079
            aadt r6 = r5.c     // Catch:{ all -> 0x00d7 }
            anax r6 = r6.a()     // Catch:{ all -> 0x00d7 }
            r5.h = r6     // Catch:{ all -> 0x00d7 }
        L_0x0079:
            aaba r6 = r5.d     // Catch:{ all -> 0x00d7 }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00d7 }
            android.os.PowerManager r6 = r6.a     // Catch:{ all -> 0x00d7 }
            if (r6 != 0) goto L_0x0082
            goto L_0x008e
        L_0x0082:
            boolean r6 = r6.isPowerSaveMode()     // Catch:{ all -> 0x00d7 }
            if (r6 == 0) goto L_0x008e
            int r6 = r5.g     // Catch:{ all -> 0x00d7 }
            r6 = r6 | 8
            r5.g = r6     // Catch:{ all -> 0x00d7 }
        L_0x008e:
            aaba r6 = r5.d     // Catch:{ all -> 0x00d7 }
            boolean r6 = r6.a()     // Catch:{ all -> 0x00d7 }
            if (r6 == 0) goto L_0x009c
            int r6 = r5.g     // Catch:{ all -> 0x00d7 }
            r6 = r6 | 16
            r5.g = r6     // Catch:{ all -> 0x00d7 }
        L_0x009c:
            boolean r6 = defpackage.axbn.f()     // Catch:{ all -> 0x00d7 }
            if (r6 == 0) goto L_0x00b8
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00d7 }
            aabg r6 = defpackage.aabg.a()     // Catch:{ all -> 0x00d7 }
            com.google.android.gms.scheduler.DeviceStateReceiver r6 = r6.e     // Catch:{ all -> 0x00d7 }
            aaan r6 = r6.a     // Catch:{ all -> 0x00d7 }
            boolean r6 = r6.a()     // Catch:{ all -> 0x00d7 }
            if (r6 == 0) goto L_0x00b8
            int r6 = r5.g     // Catch:{ all -> 0x00d7 }
            r6 = r6 | 64
            r5.g = r6     // Catch:{ all -> 0x00d7 }
        L_0x00b8:
            boolean r6 = defpackage.nqw.e()     // Catch:{ all -> 0x00d7 }
            if (r6 == 0) goto L_0x00c4
            int r6 = r5.g     // Catch:{ all -> 0x00d7 }
            r6 = r6 | 32
            r5.g = r6     // Catch:{ all -> 0x00d7 }
        L_0x00c4:
            aadz r6 = r5.a     // Catch:{ all -> 0x00d7 }
            ou r1 = r6.c     // Catch:{ all -> 0x00d7 }
            r1.clear()     // Catch:{ all -> 0x00d7 }
            android.util.SparseIntArray r6 = r6.b     // Catch:{ all -> 0x00d7 }
            r6.clear()     // Catch:{ all -> 0x00d7 }
            r0.close()     // Catch:{ all -> 0x00e1 }
            int r6 = r5.g     // Catch:{ all -> 0x00e1 }
            monitor-exit(r5)
            return r6
        L_0x00d7:
            r6 = move-exception
            r0.close()     // Catch:{ all -> 0x00dc }
            goto L_0x00e0
        L_0x00dc:
            r0 = move-exception
            defpackage.apev.a((java.lang.Throwable) r6, (java.lang.Throwable) r0)     // Catch:{ all -> 0x00e1 }
        L_0x00e0:
            throw r6     // Catch:{ all -> 0x00e1 }
        L_0x00e1:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aaeh.a(android.content.Context):int");
    }
}
