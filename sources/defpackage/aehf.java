package defpackage;

import android.content.Context;

/* renamed from: aehf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aehf {
    public aeiy a;
    private final Context b;
    private final aeia c;
    private final aegn d;
    private final aejv e;
    private final aeik f;
    private final String g;
    private final aeij h;
    private final aejb i;

    public aehf(Context context, aeia aeia, aegn aegn, aejv aejv, aeik aeik, String str, aeij aeij, aejb aejb) {
        this.b = context;
        this.c = aeia;
        this.d = aegn;
        this.e = aejv;
        this.f = aeik;
        this.g = str;
        this.h = aeij;
        this.i = aejb;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ce, code lost:
        if (r7 != false) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00d7, code lost:
        if (r8 >= r14.c.q()) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00dd, code lost:
        if ((r6 instanceof com.google.android.libraries.bluetooth.util.BluetoothOperationExecutor$BluetoothOperationTimeoutException) != false) goto L_0x00f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00e1, code lost:
        if ((r6 instanceof com.google.android.libraries.bluetooth.BluetoothTimeoutException) != false) goto L_0x00f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e5, code lost:
        if ((r6 instanceof com.google.android.libraries.bluetooth.BluetoothGattException) == false) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ee, code lost:
        if (((com.google.android.libraries.bluetooth.BluetoothGattException) r6).a != 133) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f0, code lost:
        r7 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f2, code lost:
        r7 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final defpackage.aeiy b(java.lang.String r15) {
        /*
            r14 = this;
            long r0 = android.os.SystemClock.elapsedRealtime()
            aegn r2 = r14.d
            aspb r3 = defpackage.aspb.GATT_CONNECT
            r2.a((defpackage.aspb) r3)
            java.lang.String r2 = "aehf"
            java.lang.String r3 = "b"
            java.lang.String r4 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            r5 = 1
            r6 = 0
            r7 = 1
            r8 = 1
        L_0x0015:
            if (r7 == 0) goto L_0x012c
            aeih r6 = new aeih     // Catch:{ BluetoothException -> 0x0098 }
            aeij r7 = r14.h     // Catch:{ BluetoothException -> 0x0098 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ BluetoothException -> 0x0098 }
            r10 = 25
            r9.<init>(r10)     // Catch:{ BluetoothException -> 0x0098 }
            java.lang.String r10 = "Connect GATT #"
            r9.append(r10)     // Catch:{ BluetoothException -> 0x0098 }
            r9.append(r8)     // Catch:{ BluetoothException -> 0x0098 }
            java.lang.String r9 = r9.toString()     // Catch:{ BluetoothException -> 0x0098 }
            r6.<init>(r7, r9)     // Catch:{ BluetoothException -> 0x0098 }
            anil r7 = defpackage.aehd.a     // Catch:{ all -> 0x008e }
            anie r7 = r7.d()     // Catch:{ all -> 0x008e }
            anih r7 = (defpackage.anih) r7     // Catch:{ all -> 0x008e }
            r9 = 92
            anie r7 = r7.a((java.lang.String) r2, (java.lang.String) r3, (int) r9, (java.lang.String) r4)     // Catch:{ all -> 0x008e }
            anih r7 = (defpackage.anih) r7     // Catch:{ all -> 0x008e }
            java.lang.String r9 = "Connecting to GATT server at %s"
            r7.a((java.lang.String) r9, (java.lang.Object) r15)     // Catch:{ all -> 0x008e }
            aejf r7 = new aejf     // Catch:{ all -> 0x008e }
            android.content.Context r9 = r14.b     // Catch:{ all -> 0x008e }
            aejv r10 = r14.e     // Catch:{ all -> 0x008e }
            r7.<init>(r9, r10)     // Catch:{ all -> 0x008e }
            aejv r9 = r14.e     // Catch:{ all -> 0x008e }
            aejw r9 = r9.a((java.lang.String) r15)     // Catch:{ all -> 0x008e }
            aejb r10 = r14.i     // Catch:{ all -> 0x008e }
            aeiy r7 = r7.a(r9, r10)     // Catch:{ all -> 0x008e }
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x008e }
            aeia r10 = r14.c     // Catch:{ all -> 0x008e }
            int r10 = r10.a()     // Catch:{ all -> 0x008e }
            long r10 = (long) r10     // Catch:{ all -> 0x008e }
            long r9 = r9.toMillis(r10)     // Catch:{ all -> 0x008e }
            r7.a(r9)     // Catch:{ all -> 0x008e }
            aeia r9 = r14.c     // Catch:{ all -> 0x008e }
            boolean r9 = r9.O()     // Catch:{ all -> 0x008e }
            if (r9 == 0) goto L_0x0085
            aehe r9 = new aehe     // Catch:{ all -> 0x008e }
            r9.<init>(r14, r15)     // Catch:{ all -> 0x008e }
            java.util.List r10 = r7.j     // Catch:{ all -> 0x008e }
            r10.add(r9)     // Catch:{ all -> 0x008e }
            boolean r10 = r7.h     // Catch:{ all -> 0x008e }
            if (r10 == 0) goto L_0x0082
            goto L_0x0085
        L_0x0082:
            r9.a()     // Catch:{ all -> 0x008e }
        L_0x0085:
            aegn r9 = r14.d     // Catch:{ all -> 0x008e }
            r9.b()     // Catch:{ all -> 0x008e }
            r6.close()     // Catch:{ BluetoothException -> 0x0098 }
            return r7
        L_0x008e:
            r7 = move-exception
            r6.close()     // Catch:{ all -> 0x0093 }
            goto L_0x0097
        L_0x0093:
            r6 = move-exception
            defpackage.apev.a((java.lang.Throwable) r7, (java.lang.Throwable) r6)     // Catch:{ BluetoothException -> 0x0098 }
        L_0x0097:
            throw r7     // Catch:{ BluetoothException -> 0x0098 }
        L_0x0098:
            r6 = move-exception
            aeia r7 = r14.c
            int r7 = r7.af()
            r9 = 0
            if (r7 <= 0) goto L_0x00d1
            long r10 = android.os.SystemClock.elapsedRealtime()
            long r10 = r10 - r0
            aeia r7 = r14.c
            int r7 = r7.af()
            long r12 = (long) r7
            int r7 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r7 >= 0) goto L_0x00b4
            r7 = 1
            goto L_0x00b5
        L_0x00b4:
            r7 = 0
        L_0x00b5:
            anil r10 = defpackage.aehd.a
            anie r10 = r10.d()
            anih r10 = (defpackage.anih) r10
            r11 = 115(0x73, float:1.61E-43)
            anie r10 = r10.a((java.lang.String) r2, (java.lang.String) r3, (int) r11, (java.lang.String) r4)
            anih r10 = (defpackage.anih) r10
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r7)
            java.lang.String r12 = "Retry connecting GATT by timeout:%b"
            r10.a((java.lang.String) r12, (java.lang.Object) r11)
            if (r7 == 0) goto L_0x00d9
            goto L_0x00db
        L_0x00d1:
            aeia r7 = r14.c
            int r7 = r7.q()
            if (r8 < r7) goto L_0x00db
        L_0x00d9:
            r7 = 0
            goto L_0x00f3
        L_0x00db:
            boolean r7 = r6 instanceof com.google.android.libraries.bluetooth.util.BluetoothOperationExecutor$BluetoothOperationTimeoutException
            if (r7 != 0) goto L_0x00f2
            boolean r7 = r6 instanceof com.google.android.libraries.bluetooth.BluetoothTimeoutException
            if (r7 != 0) goto L_0x00f2
            boolean r7 = r6 instanceof com.google.android.libraries.bluetooth.BluetoothGattException
            if (r7 == 0) goto L_0x00d9
            r7 = r6
            com.google.android.libraries.bluetooth.BluetoothGattException r7 = (com.google.android.libraries.bluetooth.BluetoothGattException) r7
            int r7 = r7.a
            r10 = 133(0x85, float:1.86E-43)
            if (r7 != r10) goto L_0x00d9
            r7 = 1
            goto L_0x00f3
        L_0x00f2:
            r7 = 1
        L_0x00f3:
            anil r9 = defpackage.aehd.a
            anie r9 = r9.c()
            anih r9 = (defpackage.anih) r9
            r9.a((java.lang.Throwable) r6)
            r10 = 131(0x83, float:1.84E-43)
            anie r9 = r9.a((java.lang.String) r2, (java.lang.String) r3, (int) r10, (java.lang.String) r4)
            anih r9 = (defpackage.anih) r9
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)
            aeia r11 = r14.c
            int r11 = r11.q()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            if (r7 != 0) goto L_0x0119
            java.lang.String r12 = "permanently"
            goto L_0x011b
        L_0x0119:
            java.lang.String r12 = "recovering"
        L_0x011b:
            java.lang.String r13 = "GATT connect attempt %s of %s failed, %s"
            r9.a((java.lang.String) r13, (java.lang.Object) r10, (java.lang.Object) r11, (java.lang.Object) r12)
            if (r7 == 0) goto L_0x012a
            aeik r9 = r14.f
            r9.a()
            int r8 = r8 + 1
        L_0x012a:
            goto L_0x0015
        L_0x012c:
            defpackage.amrl.a((java.lang.Object) r6)
            goto L_0x0131
        L_0x0130:
            throw r6
        L_0x0131:
            goto L_0x0130
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aehf.b(java.lang.String):aeiy");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00d7, code lost:
        if (r8 != false) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00e0, code lost:
        if (r9 >= r15.c.q()) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00e6, code lost:
        if ((r6 instanceof com.google.android.libraries.bluetooth.util.BluetoothOperationExecutor$BluetoothOperationTimeoutException) != false) goto L_0x00fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ea, code lost:
        if ((r6 instanceof com.google.android.libraries.bluetooth.BluetoothTimeoutException) != false) goto L_0x00fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ee, code lost:
        if ((r6 instanceof com.google.android.libraries.bluetooth.BluetoothGattException) == false) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f7, code lost:
        if (((com.google.android.libraries.bluetooth.BluetoothGattException) r6).a != 133) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00f9, code lost:
        r8 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00fb, code lost:
        r8 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.aeiy a() {
        /*
            r15 = this;
            aeiy r0 = r15.a
            if (r0 != 0) goto L_0x0139
            java.lang.String r0 = r15.g
            long r1 = android.os.SystemClock.elapsedRealtime()
            aegn r3 = r15.d
            aspb r4 = defpackage.aspb.GATT_CONNECT
            r3.a((defpackage.aspb) r4)
            java.lang.String r3 = "aehf"
            java.lang.String r4 = "b"
            java.lang.String r5 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            r6 = 0
            r7 = 1
            r8 = 1
            r9 = 1
        L_0x001b:
            if (r8 == 0) goto L_0x0135
            aeih r6 = new aeih     // Catch:{ BluetoothException -> 0x00a1 }
            aeij r8 = r15.h     // Catch:{ BluetoothException -> 0x00a1 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ BluetoothException -> 0x00a1 }
            r11 = 25
            r10.<init>(r11)     // Catch:{ BluetoothException -> 0x00a1 }
            java.lang.String r11 = "Connect GATT #"
            r10.append(r11)     // Catch:{ BluetoothException -> 0x00a1 }
            r10.append(r9)     // Catch:{ BluetoothException -> 0x00a1 }
            java.lang.String r10 = r10.toString()     // Catch:{ BluetoothException -> 0x00a1 }
            r6.<init>(r8, r10)     // Catch:{ BluetoothException -> 0x00a1 }
            anil r8 = defpackage.aehd.a     // Catch:{ all -> 0x0097 }
            anie r8 = r8.d()     // Catch:{ all -> 0x0097 }
            anih r8 = (defpackage.anih) r8     // Catch:{ all -> 0x0097 }
            r10 = 92
            anie r8 = r8.a((java.lang.String) r3, (java.lang.String) r4, (int) r10, (java.lang.String) r5)     // Catch:{ all -> 0x0097 }
            anih r8 = (defpackage.anih) r8     // Catch:{ all -> 0x0097 }
            java.lang.String r10 = "Connecting to GATT server at %s"
            r8.a((java.lang.String) r10, (java.lang.Object) r0)     // Catch:{ all -> 0x0097 }
            aejf r8 = new aejf     // Catch:{ all -> 0x0097 }
            android.content.Context r10 = r15.b     // Catch:{ all -> 0x0097 }
            aejv r11 = r15.e     // Catch:{ all -> 0x0097 }
            r8.<init>(r10, r11)     // Catch:{ all -> 0x0097 }
            aejv r10 = r15.e     // Catch:{ all -> 0x0097 }
            aejw r10 = r10.a((java.lang.String) r0)     // Catch:{ all -> 0x0097 }
            aejb r11 = r15.i     // Catch:{ all -> 0x0097 }
            aeiy r8 = r8.a(r10, r11)     // Catch:{ all -> 0x0097 }
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x0097 }
            aeia r11 = r15.c     // Catch:{ all -> 0x0097 }
            int r11 = r11.a()     // Catch:{ all -> 0x0097 }
            long r11 = (long) r11     // Catch:{ all -> 0x0097 }
            long r10 = r10.toMillis(r11)     // Catch:{ all -> 0x0097 }
            r8.a(r10)     // Catch:{ all -> 0x0097 }
            aeia r10 = r15.c     // Catch:{ all -> 0x0097 }
            boolean r10 = r10.O()     // Catch:{ all -> 0x0097 }
            if (r10 == 0) goto L_0x008b
            aehe r10 = new aehe     // Catch:{ all -> 0x0097 }
            r10.<init>(r15, r0)     // Catch:{ all -> 0x0097 }
            java.util.List r11 = r8.j     // Catch:{ all -> 0x0097 }
            r11.add(r10)     // Catch:{ all -> 0x0097 }
            boolean r11 = r8.h     // Catch:{ all -> 0x0097 }
            if (r11 == 0) goto L_0x0088
            goto L_0x008b
        L_0x0088:
            r10.a()     // Catch:{ all -> 0x0097 }
        L_0x008b:
            aegn r10 = r15.d     // Catch:{ all -> 0x0097 }
            r10.b()     // Catch:{ all -> 0x0097 }
            r6.close()     // Catch:{ BluetoothException -> 0x00a1 }
            r15.a = r8
            goto L_0x0139
        L_0x0097:
            r8 = move-exception
            r6.close()     // Catch:{ all -> 0x009c }
            goto L_0x00a0
        L_0x009c:
            r6 = move-exception
            defpackage.apev.a((java.lang.Throwable) r8, (java.lang.Throwable) r6)     // Catch:{ BluetoothException -> 0x00a1 }
        L_0x00a0:
            throw r8     // Catch:{ BluetoothException -> 0x00a1 }
        L_0x00a1:
            r6 = move-exception
            aeia r8 = r15.c
            int r8 = r8.af()
            r10 = 0
            if (r8 <= 0) goto L_0x00da
            long r11 = android.os.SystemClock.elapsedRealtime()
            long r11 = r11 - r1
            aeia r8 = r15.c
            int r8 = r8.af()
            long r13 = (long) r8
            int r8 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r8 >= 0) goto L_0x00bd
            r8 = 1
            goto L_0x00be
        L_0x00bd:
            r8 = 0
        L_0x00be:
            anil r11 = defpackage.aehd.a
            anie r11 = r11.d()
            anih r11 = (defpackage.anih) r11
            r12 = 115(0x73, float:1.61E-43)
            anie r11 = r11.a((java.lang.String) r3, (java.lang.String) r4, (int) r12, (java.lang.String) r5)
            anih r11 = (defpackage.anih) r11
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r8)
            java.lang.String r13 = "Retry connecting GATT by timeout:%b"
            r11.a((java.lang.String) r13, (java.lang.Object) r12)
            if (r8 == 0) goto L_0x00e2
            goto L_0x00e4
        L_0x00da:
            aeia r8 = r15.c
            int r8 = r8.q()
            if (r9 < r8) goto L_0x00e4
        L_0x00e2:
            r8 = 0
            goto L_0x00fc
        L_0x00e4:
            boolean r8 = r6 instanceof com.google.android.libraries.bluetooth.util.BluetoothOperationExecutor$BluetoothOperationTimeoutException
            if (r8 != 0) goto L_0x00fb
            boolean r8 = r6 instanceof com.google.android.libraries.bluetooth.BluetoothTimeoutException
            if (r8 != 0) goto L_0x00fb
            boolean r8 = r6 instanceof com.google.android.libraries.bluetooth.BluetoothGattException
            if (r8 == 0) goto L_0x00e2
            r8 = r6
            com.google.android.libraries.bluetooth.BluetoothGattException r8 = (com.google.android.libraries.bluetooth.BluetoothGattException) r8
            int r8 = r8.a
            r11 = 133(0x85, float:1.86E-43)
            if (r8 != r11) goto L_0x00e2
            r8 = 1
            goto L_0x00fc
        L_0x00fb:
            r8 = 1
        L_0x00fc:
            anil r10 = defpackage.aehd.a
            anie r10 = r10.c()
            anih r10 = (defpackage.anih) r10
            r10.a((java.lang.Throwable) r6)
            r11 = 131(0x83, float:1.84E-43)
            anie r10 = r10.a((java.lang.String) r3, (java.lang.String) r4, (int) r11, (java.lang.String) r5)
            anih r10 = (defpackage.anih) r10
            java.lang.Integer r11 = java.lang.Integer.valueOf(r9)
            aeia r12 = r15.c
            int r12 = r12.q()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            if (r8 != 0) goto L_0x0122
            java.lang.String r13 = "permanently"
            goto L_0x0124
        L_0x0122:
            java.lang.String r13 = "recovering"
        L_0x0124:
            java.lang.String r14 = "GATT connect attempt %s of %s failed, %s"
            r10.a((java.lang.String) r14, (java.lang.Object) r11, (java.lang.Object) r12, (java.lang.Object) r13)
            if (r8 == 0) goto L_0x0133
            aeik r10 = r15.f
            r10.a()
            int r9 = r9 + 1
        L_0x0133:
            goto L_0x001b
        L_0x0135:
            defpackage.amrl.a((java.lang.Object) r6)
            throw r6
        L_0x0139:
            aeiy r0 = r15.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aehf.a():aeiy");
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        if (this.a != null) {
            aeih aeih = new aeih(this.h, "Close GATT");
            try {
                this.a.close();
                this.a = null;
                aeih.close();
                return;
            } catch (Throwable th) {
                apev.a(th, th);
            }
        } else {
            return;
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(String str) {
        ((anih) ((anih) aehd.a.d()).a("aehf", "a", 101, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Gatt connection with %s closed.", (Object) str);
        this.a = null;
    }
}
