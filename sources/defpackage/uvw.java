package defpackage;

/* renamed from: uvw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uvw extends urq {
    public uvz a;
    private final uvp b;
    private final uui c;
    private final uvy d;
    private final String e;
    private final tfw f;

    public uvw(uvp uvp, uui uui, uvy uvy, String str, tfw tfw) {
        super(53, tfw);
        this.b = uvp;
        this.c = uui;
        this.d = uvy;
        this.e = str;
        this.f = tfw;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00b4 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int b() {
        /*
            r16 = this;
            r1 = r16
            uvp r0 = r1.b
            uvy r2 = r1.d
            uvi r5 = r0.a((defpackage.uvy) r2)
            uui r2 = r1.c
            java.lang.String r7 = r1.e
            tfw r6 = r1.f
            uvy r0 = r5.a
            byte[] r0 = r0.d
            short r10 = defpackage.aoom.a((byte[]) r0)
            uvy r0 = r5.a
            android.net.wifi.aware.DiscoverySession r11 = r0.c
            java.lang.String r12 = "uui"
            java.lang.String r13 = "a"
            java.lang.String r14 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            uuh r0 = r2.f
            boolean r0 = r0.b(r10)
            if (r0 == 0) goto L_0x0038
            jjg r0 = defpackage.ulh.a
            uvf r0 = r2.a
            byte[] r0 = r0.d()
            defpackage.ulu.a((byte[]) r0)
            r15 = 0
            goto L_0x00a9
        L_0x0038:
            uuh r0 = r2.f
            r0.a((short) r10, (defpackage.uvi) r5)
            aosh r0 = defpackage.aosh.f()
            utv r9 = new utv
            r3 = r9
            r4 = r2
            r8 = r10
            r15 = r9
            r9 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            java.util.concurrent.ExecutorService r3 = r2.c
            r3.execute(r15)
            uts r3 = r2.b     // Catch:{ InterruptedException -> 0x0083, ExecutionException -> 0x0064 }
            r3.a((android.net.wifi.aware.DiscoverySession) r11)     // Catch:{ InterruptedException -> 0x0083, ExecutionException -> 0x0064 }
            java.lang.Object r0 = r0.get()     // Catch:{ InterruptedException -> 0x0083, ExecutionException -> 0x0064 }
            uvz r0 = (defpackage.uvz) r0     // Catch:{ InterruptedException -> 0x0083, ExecutionException -> 0x0064 }
            uts r2 = r2.b
            r2.b((android.net.wifi.aware.DiscoverySession) r11)
            r15 = r0
            goto L_0x00a9
        L_0x0062:
            r0 = move-exception
            goto L_0x00b6
        L_0x0064:
            r0 = move-exception
            jjg r3 = defpackage.ulh.a     // Catch:{ all -> 0x0062 }
            anie r3 = r3.b()     // Catch:{ all -> 0x0062 }
            anih r3 = (defpackage.anih) r3     // Catch:{ all -> 0x0062 }
            r3.a((java.lang.Throwable) r0)     // Catch:{ all -> 0x0062 }
            r0 = 434(0x1b2, float:6.08E-43)
            anie r0 = r3.a((java.lang.String) r12, (java.lang.String) r13, (int) r0, (java.lang.String) r14)     // Catch:{ all -> 0x0062 }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x0062 }
            java.lang.String r3 = "Failed to connect to WiFi Aware network"
            r0.a((java.lang.String) r3)     // Catch:{ all -> 0x0062 }
            uts r0 = r2.b
        L_0x007f:
            r0.b((android.net.wifi.aware.DiscoverySession) r11)
            goto L_0x00a3
        L_0x0083:
            r0 = move-exception
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0062 }
            r0.interrupt()     // Catch:{ all -> 0x0062 }
            jjg r0 = defpackage.ulh.a     // Catch:{ all -> 0x0062 }
            anie r0 = r0.b()     // Catch:{ all -> 0x0062 }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x0062 }
            r3 = 432(0x1b0, float:6.05E-43)
            anie r0 = r0.a((java.lang.String) r12, (java.lang.String) r13, (int) r3, (java.lang.String) r14)     // Catch:{ all -> 0x0062 }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x0062 }
            java.lang.String r3 = "Interrupted while waiting to connect to WiFi Aware network"
            r0.a((java.lang.String) r3)     // Catch:{ all -> 0x0062 }
            uts r0 = r2.b
            goto L_0x007f
        L_0x00a3:
            uuh r0 = r2.f
            r0.d(r10)
            r15 = 0
        L_0x00a9:
            r1.a = r15
            if (r15 == 0) goto L_0x00b4
            r0 = 54
            int r0 = r1.a((int) r0)
            return r0
        L_0x00b4:
            r0 = 3
            return r0
        L_0x00b6:
            uts r2 = r2.b
            r2.b((android.net.wifi.aware.DiscoverySession) r11)
            goto L_0x00bd
        L_0x00bc:
            throw r0
        L_0x00bd:
            goto L_0x00bc
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uvw.b():int");
    }
}
