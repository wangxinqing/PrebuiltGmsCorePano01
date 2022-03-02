package defpackage;

import java.util.concurrent.Callable;

/* renamed from: unq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class unq implements Callable {
    private final unt a;
    private final int b;
    private final String c;

    public unq(unt unt, int i, String str) {
        this.a = unt;
        this.b = i;
        this.c = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x008a A[SYNTHETIC, Splitter:B:18:0x008a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r14 = this;
            java.lang.String r0 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            java.lang.String r1 = "a"
            unt r2 = r14.a
            int r3 = r14.b
            java.lang.String r4 = r14.c
            java.lang.String r5 = "unt"
            r6 = 0
            r7 = 1
            defpackage.ulu.a()     // Catch:{ IOException -> 0x0081 }
            java.net.Socket r8 = defpackage.unw.a()     // Catch:{ IOException -> 0x0081 }
            int r9 = android.os.Build.VERSION.SDK_INT     // Catch:{ IOException -> 0x0081 }
            android.net.Network[] r9 = r2.c()     // Catch:{ IOException -> 0x0081 }
            int r10 = r9.length     // Catch:{ IOException -> 0x0081 }
            r11 = 0
        L_0x001d:
            if (r11 >= r10) goto L_0x0033
            r12 = r9[r11]     // Catch:{ IOException -> 0x0081 }
            android.net.ConnectivityManager r13 = r2.b     // Catch:{ IOException -> 0x0081 }
            android.net.NetworkInfo r13 = r13.getNetworkInfo(r12)     // Catch:{ IOException -> 0x0081 }
            int r13 = r13.getType()     // Catch:{ IOException -> 0x0081 }
            if (r13 == r7) goto L_0x0030
            int r11 = r11 + 1
            goto L_0x001d
        L_0x0030:
            r12.bindSocket(r8)     // Catch:{ IOException -> 0x0081 }
        L_0x0033:
            jjg r9 = defpackage.ulh.a     // Catch:{ IOException -> 0x007d }
            android.net.wifi.WifiManager r9 = r2.a     // Catch:{ IOException -> 0x007d }
            android.net.DhcpInfo r9 = r9.getDhcpInfo()     // Catch:{ IOException -> 0x007d }
            int r9 = r9.gateway     // Catch:{ IOException -> 0x007d }
            defpackage.ulu.c(r9)     // Catch:{ IOException -> 0x007d }
            java.net.InetSocketAddress r9 = new java.net.InetSocketAddress     // Catch:{ IOException -> 0x007d }
            android.net.wifi.WifiManager r2 = r2.a     // Catch:{ IOException -> 0x007d }
            android.net.DhcpInfo r2 = r2.getDhcpInfo()     // Catch:{ IOException -> 0x007d }
            int r2 = r2.gateway     // Catch:{ IOException -> 0x007d }
            java.net.InetAddress r2 = defpackage.ulu.c(r2)     // Catch:{ IOException -> 0x007d }
            r9.<init>(r2, r3)     // Catch:{ IOException -> 0x007d }
            aymi r2 = defpackage.aymi.a     // Catch:{ IOException -> 0x007d }
            aymj r2 = r2.a()     // Catch:{ IOException -> 0x007d }
            long r2 = r2.bz()     // Catch:{ IOException -> 0x007d }
            int r3 = (int) r2     // Catch:{ IOException -> 0x007d }
            r8.connect(r9, r3)     // Catch:{ IOException -> 0x007d }
            jjg r2 = defpackage.ulh.a     // Catch:{ IOException -> 0x007d }
            anie r2 = r2.d()     // Catch:{ IOException -> 0x007d }
            anih r2 = (defpackage.anih) r2     // Catch:{ IOException -> 0x007d }
            r3 = 2113(0x841, float:2.961E-42)
            anie r2 = r2.a((java.lang.String) r5, (java.lang.String) r1, (int) r3, (java.lang.String) r0)     // Catch:{ IOException -> 0x007d }
            anih r2 = (defpackage.anih) r2     // Catch:{ IOException -> 0x007d }
            java.lang.String r3 = "Successfully connected via a Wifi socket to %s."
            r2.a((java.lang.String) r3, (java.lang.Object) r4)     // Catch:{ IOException -> 0x007d }
            uwf r2 = new uwf     // Catch:{ IOException -> 0x007d }
            r2.<init>(r8)     // Catch:{ IOException -> 0x007d }
            defpackage.ulu.b()
            return r2
        L_0x007d:
            r2 = move-exception
            goto L_0x0083
        L_0x007f:
            r0 = move-exception
            goto L_0x00b9
        L_0x0081:
            r2 = move-exception
            r8 = 0
        L_0x0083:
            java.lang.String r3 = "WifiHotspot"
            java.lang.String r5 = "ulu"
            if (r8 != 0) goto L_0x008a
            goto L_0x00a9
        L_0x008a:
            r8.close()     // Catch:{ IOException -> 0x0090 }
            jjg r0 = defpackage.ulh.a     // Catch:{ all -> 0x007f }
            goto L_0x00a9
        L_0x0090:
            r8 = move-exception
            jjg r9 = defpackage.ulh.a     // Catch:{ all -> 0x007f }
            anie r9 = r9.c()     // Catch:{ all -> 0x007f }
            anih r9 = (defpackage.anih) r9     // Catch:{ all -> 0x007f }
            r9.a((java.lang.Throwable) r8)     // Catch:{ all -> 0x007f }
            r8 = 82
            anie r0 = r9.a((java.lang.String) r5, (java.lang.String) r1, (int) r8, (java.lang.String) r0)     // Catch:{ all -> 0x007f }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x007f }
            java.lang.String r1 = "Failed to close %sSocket %s"
            r0.a((java.lang.String) r1, (java.lang.Object) r3, (java.lang.Object) r4)     // Catch:{ all -> 0x007f }
        L_0x00a9:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x007f }
            java.lang.Object[] r1 = new java.lang.Object[r7]     // Catch:{ all -> 0x007f }
            r1[r6] = r4     // Catch:{ all -> 0x007f }
            java.lang.String r3 = "Failed to connect via a Wifi socket to %s."
            java.lang.String r1 = java.lang.String.format(r3, r1)     // Catch:{ all -> 0x007f }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x007f }
            throw r0     // Catch:{ all -> 0x007f }
        L_0x00b9:
            defpackage.ulu.b()
            goto L_0x00be
        L_0x00bd:
            throw r0
        L_0x00be:
            goto L_0x00bd
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.unq.call():java.lang.Object");
    }
}
