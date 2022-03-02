package defpackage;

/* renamed from: tcy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class tcy {
    final /* synthetic */ tcz a;
    private tgm b;
    private tcx c;
    private boolean d = false;

    public tcy(tcz tcz) {
        this.a = tcz;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00c6, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a() {
        /*
            r9 = this;
            monitor-enter(r9)
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00c7 }
            java.lang.String r0 = "tcy"
            java.lang.String r1 = "a"
            java.lang.String r2 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            boolean r3 = r9.d     // Catch:{ all -> 0x00c7 }
            if (r3 == 0) goto L_0x0024
            anil r3 = defpackage.tcz.a     // Catch:{ all -> 0x00c7 }
            anie r3 = r3.c()     // Catch:{ all -> 0x00c7 }
            anih r3 = (defpackage.anih) r3     // Catch:{ all -> 0x00c7 }
            r4 = 154(0x9a, float:2.16E-43)
            anie r0 = r3.a((java.lang.String) r0, (java.lang.String) r1, (int) r4, (java.lang.String) r2)     // Catch:{ all -> 0x00c7 }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x00c7 }
            java.lang.String r1 = "BluetoothTargetDevice: already BLE advertising. skip"
            r0.a((java.lang.String) r1)     // Catch:{ all -> 0x00c7 }
            monitor-exit(r9)
            return
        L_0x0024:
            tgm r3 = defpackage.tgm.a()     // Catch:{ all -> 0x00c7 }
            r9.b = r3     // Catch:{ all -> 0x00c7 }
            if (r3 != 0) goto L_0x0043
            anil r3 = defpackage.tcz.a     // Catch:{ all -> 0x00c7 }
            anie r3 = r3.c()     // Catch:{ all -> 0x00c7 }
            anih r3 = (defpackage.anih) r3     // Catch:{ all -> 0x00c7 }
            r4 = 160(0xa0, float:2.24E-43)
            anie r0 = r3.a((java.lang.String) r0, (java.lang.String) r1, (int) r4, (java.lang.String) r2)     // Catch:{ all -> 0x00c7 }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x00c7 }
            java.lang.String r1 = "BluetoothTargetDevice: Device failed to get advertiser"
            r0.a((java.lang.String) r1)     // Catch:{ all -> 0x00c7 }
            monitor-exit(r9)
            return
        L_0x0043:
            android.bluetooth.le.AdvertiseSettings$Builder r0 = new android.bluetooth.le.AdvertiseSettings$Builder     // Catch:{ all -> 0x00c7 }
            r0.<init>()     // Catch:{ all -> 0x00c7 }
            r1 = 2
            android.bluetooth.le.AdvertiseSettings$Builder r0 = r0.setAdvertiseMode(r1)     // Catch:{ all -> 0x00c7 }
            android.bluetooth.le.AdvertiseSettings$Builder r0 = r0.setTxPowerLevel(r1)     // Catch:{ all -> 0x00c7 }
            r2 = 0
            android.bluetooth.le.AdvertiseSettings$Builder r0 = r0.setConnectable(r2)     // Catch:{ all -> 0x00c7 }
            android.bluetooth.le.AdvertiseSettings r0 = r0.build()     // Catch:{ all -> 0x00c7 }
            android.bluetooth.le.AdvertiseData$Builder r3 = new android.bluetooth.le.AdvertiseData$Builder     // Catch:{ all -> 0x00c7 }
            r3.<init>()     // Catch:{ all -> 0x00c7 }
            tcz r4 = r9.a     // Catch:{ all -> 0x00c7 }
            java.lang.String r5 = r4.l     // Catch:{ all -> 0x00c7 }
            java.lang.String r6 = r4.m     // Catch:{ all -> 0x00c7 }
            byte r4 = r4.n     // Catch:{ all -> 0x00c7 }
            byte[] r4 = defpackage.tcq.a(r5, r6, r4)     // Catch:{ all -> 0x00c7 }
            int r5 = r4.length     // Catch:{ all -> 0x00c7 }
            int r6 = r5 + 2
            byte[] r6 = new byte[r6]     // Catch:{ all -> 0x00c7 }
            int r7 = r5 + 1
            byte r7 = (byte) r7     // Catch:{ all -> 0x00c7 }
            r6[r2] = r7     // Catch:{ all -> 0x00c7 }
            r7 = 16
            r8 = 1
            r6[r8] = r7     // Catch:{ all -> 0x00c7 }
            java.lang.System.arraycopy(r4, r2, r6, r1, r5)     // Catch:{ all -> 0x00c7 }
            r1 = 224(0xe0, float:3.14E-43)
            android.bluetooth.le.AdvertiseData$Builder r1 = r3.addManufacturerData(r1, r6)     // Catch:{ all -> 0x00c7 }
            android.bluetooth.le.AdvertiseData r1 = r1.build()     // Catch:{ all -> 0x00c7 }
            tcx r3 = new tcx     // Catch:{ all -> 0x00c7 }
            r3.<init>()     // Catch:{ all -> 0x00c7 }
            r9.c = r3     // Catch:{ all -> 0x00c7 }
            tgm r4 = r9.b     // Catch:{ all -> 0x00c7 }
            boolean r0 = r4.a(r0, r1, r3)     // Catch:{ all -> 0x00c7 }
            if (r0 == 0) goto L_0x00c5
            tcx r0 = r9.c     // Catch:{ all -> 0x00c7 }
            java.util.concurrent.CountDownLatch r1 = r0.a     // Catch:{ InterruptedException -> 0x00a7 }
            r3 = 3000(0xbb8, double:1.482E-320)
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException -> 0x00a7 }
            boolean r1 = r1.await(r3, r5)     // Catch:{ InterruptedException -> 0x00a7 }
            if (r1 == 0) goto L_0x00c3
            boolean r2 = r0.b     // Catch:{ InterruptedException -> 0x00a7 }
            goto L_0x00c3
        L_0x00a7:
            r0 = move-exception
            anil r0 = defpackage.tcz.a     // Catch:{ all -> 0x00c7 }
            anie r0 = r0.c()     // Catch:{ all -> 0x00c7 }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x00c7 }
            java.lang.String r1 = "tcx"
            java.lang.String r3 = "a"
            r4 = 223(0xdf, float:3.12E-43)
            java.lang.String r5 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            anie r0 = r0.a((java.lang.String) r1, (java.lang.String) r3, (int) r4, (java.lang.String) r5)     // Catch:{ all -> 0x00c7 }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x00c7 }
            java.lang.String r1 = "BluetoothTargetDevice: Timed out waiting for BLE advertising to start"
            r0.a((java.lang.String) r1)     // Catch:{ all -> 0x00c7 }
        L_0x00c3:
            r9.d = r2     // Catch:{ all -> 0x00c7 }
        L_0x00c5:
            monitor-exit(r9)
            return
        L_0x00c7:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tcy.a():void");
    }

    /* access modifiers changed from: protected */
    public final synchronized void b() {
        tgm tgm = this.b;
        if (tgm != null && this.d) {
            tgm.a(this.c);
        }
    }
}
