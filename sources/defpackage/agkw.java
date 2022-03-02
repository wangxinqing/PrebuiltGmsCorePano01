package defpackage;

import java.io.File;

/* renamed from: agkw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class agkw implements Runnable {
    final /* synthetic */ agky a;
    private final File b;
    private final baqz c;
    private final Float d;
    private final Long e;
    private final Long f;

    public agkw(agky agky, File file, baqz baqz, Float f2, Long l, Long l2) {
        this.a = agky;
        this.b = file;
        this.c = baqz;
        this.d = f2;
        this.e = l;
        this.f = l2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x0144 A[Catch:{ IOException -> 0x0148 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r14 = this;
            agky r0 = r14.a
            anhq r1 = defpackage.agky.a
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.b
            r1 = 0
            r0.set(r1)
            android.os.Debug.stopMethodTracing()
            agky r0 = r14.a
            aekn r0 = r0.k
            long r2 = r0.a()
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            long r2 = r0.longValue()
            java.lang.Long r4 = r14.e
            long r4 = r4.longValue()
            agky r6 = r14.a
            int r7 = r6.i
            long r7 = (long) r7
            long r4 = r4 + r7
            java.lang.String r7 = "agkw"
            java.lang.String r8 = "run"
            java.lang.String r9 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            int r10 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r10 >= 0) goto L_0x0240
            android.app.Application r2 = r6.c
            android.content.IntentFilter r3 = r6.j
            r4 = 0
            android.content.Intent r2 = r2.registerReceiver(r4, r3)
            baqz r3 = r14.c
            r5 = 5
            java.lang.Object r5 = r3.c(r5)
            aucd r5 = (defpackage.aucd) r5
            r5.a((defpackage.aucj) r3)
            agky r3 = r14.a
            bara r3 = r3.a(r2)
            boolean r6 = r5.c
            if (r6 == 0) goto L_0x0057
            r5.c()
            r5.c = r1
        L_0x0057:
            aucj r6 = r5.b
            baqz r6 = (defpackage.baqz) r6
            baqz r10 = defpackage.baqz.e
            r3.getClass()
            r6.c = r3
            int r3 = r6.a
            r3 = r3 | 2
            r6.a = r3
            java.lang.Float r3 = r14.d
            float r3 = r3.floatValue()
            agky r6 = r14.a
            float r2 = r6.b(r2)
            float r3 = r3 - r2
            boolean r2 = r5.c
            if (r2 != 0) goto L_0x007a
            goto L_0x007f
        L_0x007a:
            r5.c()
            r5.c = r1
        L_0x007f:
            aucj r2 = r5.b
            baqz r2 = (defpackage.baqz) r2
            int r6 = r2.a
            r6 = r6 | 4
            r2.a = r6
            r2.d = r3
            aucj r2 = r5.i()
            baqz r2 = (defpackage.baqz) r2
            baqy r3 = defpackage.baqy.i
            aucd r3 = r3.o()
            boolean r5 = r3.c
            if (r5 != 0) goto L_0x009c
            goto L_0x00a1
        L_0x009c:
            r3.c()
            r3.c = r1
        L_0x00a1:
            aucj r5 = r3.b
            baqy r5 = (defpackage.baqy) r5
            r2.getClass()
            r5.c = r2
            int r2 = r5.a
            r2 = r2 | 2
            r5.a = r2
            java.io.File r2 = r14.b
            if (r2 == 0) goto L_0x0164
            boolean r2 = r2.exists()
            if (r2 != 0) goto L_0x00bc
            goto L_0x0164
        L_0x00bc:
            java.io.File r2 = r14.b     // Catch:{ IOException -> 0x0148 }
            agky r5 = r14.a     // Catch:{ IOException -> 0x0148 }
            int r5 = r5.e     // Catch:{ IOException -> 0x0148 }
            long r10 = r2.length()     // Catch:{ all -> 0x0141 }
            r12 = 0
            int r6 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r6 <= 0) goto L_0x00ee
            long r5 = (long) r5     // Catch:{ all -> 0x0141 }
            int r12 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r12 > 0) goto L_0x00ee
            int r5 = (int) r10     // Catch:{ all -> 0x0141 }
            byte[] r6 = new byte[r5]     // Catch:{ all -> 0x0141 }
            java.io.FileInputStream r10 = new java.io.FileInputStream     // Catch:{ all -> 0x0141 }
            r10.<init>(r2)     // Catch:{ all -> 0x0141 }
            r2 = 0
        L_0x00da:
            if (r2 >= r5) goto L_0x00e4
            int r4 = r5 - r2
            int r4 = r10.read(r6, r2, r4)     // Catch:{ all -> 0x00eb }
            int r2 = r2 + r4
            goto L_0x00da
        L_0x00e4:
            r10.close()     // Catch:{ all -> 0x00eb }
            r10.close()     // Catch:{ IOException -> 0x0148 }
            goto L_0x00f1
        L_0x00eb:
            r2 = move-exception
            r4 = r10
            goto L_0x0142
        L_0x00ee:
            byte[] r6 = new byte[r1]     // Catch:{ IOException -> 0x0148 }
        L_0x00f1:
            java.util.zip.Deflater r2 = new java.util.zip.Deflater     // Catch:{ IOException -> 0x0148 }
            r4 = 9
            r2.<init>(r4)     // Catch:{ IOException -> 0x0148 }
            r2.setInput(r6)     // Catch:{ IOException -> 0x0148 }
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x0148 }
            int r5 = r6.length     // Catch:{ IOException -> 0x0148 }
            r4.<init>(r5)     // Catch:{ IOException -> 0x0148 }
            r2.finish()     // Catch:{ IOException -> 0x0148 }
            r5 = 1024(0x400, float:1.435E-42)
            byte[] r5 = new byte[r5]     // Catch:{ IOException -> 0x0148 }
        L_0x0108:
            boolean r6 = r2.finished()     // Catch:{ IOException -> 0x0148 }
            if (r6 == 0) goto L_0x0138
            r4.close()     // Catch:{ IOException -> 0x0148 }
            byte[] r2 = r4.toByteArray()     // Catch:{ IOException -> 0x0148 }
            auay r2 = defpackage.auay.a((byte[]) r2)     // Catch:{ IOException -> 0x0148 }
            boolean r4 = r3.c     // Catch:{ IOException -> 0x0148 }
            if (r4 != 0) goto L_0x011e
            goto L_0x0123
        L_0x011e:
            r3.c()     // Catch:{ IOException -> 0x0148 }
            r3.c = r1     // Catch:{ IOException -> 0x0148 }
        L_0x0123:
            aucj r4 = r3.b     // Catch:{ IOException -> 0x0148 }
            baqy r4 = (defpackage.baqy) r4     // Catch:{ IOException -> 0x0148 }
            r2.getClass()     // Catch:{ IOException -> 0x0148 }
            int r5 = r4.a     // Catch:{ IOException -> 0x0148 }
            r5 = r5 | 1
            r4.a = r5     // Catch:{ IOException -> 0x0148 }
            r4.b = r2     // Catch:{ IOException -> 0x0148 }
            agky r2 = r14.a     // Catch:{ IOException -> 0x0148 }
            r2.f()     // Catch:{ IOException -> 0x0148 }
            goto L_0x0179
        L_0x0138:
            int r6 = r2.deflate(r5)     // Catch:{ IOException -> 0x0148 }
            r4.write(r5, r1, r6)     // Catch:{ IOException -> 0x0148 }
            goto L_0x0108
        L_0x0141:
            r2 = move-exception
        L_0x0142:
            if (r4 == 0) goto L_0x0147
            r4.close()     // Catch:{ IOException -> 0x0148 }
        L_0x0147:
            throw r2     // Catch:{ IOException -> 0x0148 }
        L_0x0148:
            r2 = move-exception
            anhq r4 = defpackage.agky.a
            anie r4 = r4.b()
            anhn r4 = (defpackage.anhn) r4
            r4.a((java.lang.Throwable) r2)
            r2 = 287(0x11f, float:4.02E-43)
            anie r2 = r4.a((java.lang.String) r7, (java.lang.String) r8, (int) r2, (java.lang.String) r9)
            anhn r2 = (defpackage.anhn) r2
            java.io.File r4 = r14.b
            java.lang.String r5 = "Unable to read file %s"
            r2.a((java.lang.String) r5, (java.lang.Object) r4)
            goto L_0x0179
        L_0x0164:
            anhq r2 = defpackage.agky.a
            anie r2 = r2.b()
            anhn r2 = (defpackage.anhn) r2
            r4 = 290(0x122, float:4.06E-43)
            anie r2 = r2.a((java.lang.String) r7, (java.lang.String) r8, (int) r4, (java.lang.String) r9)
            anhn r2 = (defpackage.anhn) r2
            java.lang.String r4 = "Missing trace file"
            r2.a((java.lang.String) r4)
        L_0x0179:
            agky r2 = r14.a
            double r4 = r2.h
            boolean r2 = r3.c
            if (r2 == 0) goto L_0x0186
            r3.c()
            r3.c = r1
        L_0x0186:
            aucj r2 = r3.b
            baqy r2 = (defpackage.baqy) r2
            int r6 = r2.a
            r6 = r6 | 4
            r2.a = r6
            r2.d = r4
            agky r4 = r14.a
            int r4 = r4.f
            r5 = r6 | 32
            r2.a = r5
            r2.g = r4
            long r4 = r0.longValue()
            java.lang.Long r2 = r14.f
            long r6 = r2.longValue()
            long r4 = r4 - r6
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x01d0
            long r4 = r0.longValue()
            java.lang.Long r0 = r14.f
            long r6 = r0.longValue()
            long r4 = r4 - r6
            int r0 = (int) r4
            boolean r2 = r3.c
            if (r2 == 0) goto L_0x01c3
            r3.c()
            r3.c = r1
        L_0x01c3:
            aucj r2 = r3.b
            baqy r2 = (defpackage.baqy) r2
            int r4 = r2.a
            r4 = r4 | 16
            r2.a = r4
            r2.f = r0
            goto L_0x01e7
        L_0x01d0:
            boolean r0 = r3.c
            if (r0 != 0) goto L_0x01d5
            goto L_0x01da
        L_0x01d5:
            r3.c()
            r3.c = r1
        L_0x01da:
            aucj r0 = r3.b
            baqy r0 = (defpackage.baqy) r0
            int r2 = r0.a
            r2 = r2 | 16
            r0.a = r2
            r2 = -1
            r0.f = r2
        L_0x01e7:
            agky r0 = r14.a
            int r2 = r0.g
            aucj r4 = r3.b
            baqy r4 = (defpackage.baqy) r4
            int r5 = r4.a
            r5 = r5 | 8
            r4.a = r5
            r4.e = r2
            int r0 = r0.e
            r2 = r5 | 64
            r4.a = r2
            r4.h = r0
            auay r0 = r4.b
            int r0 = r0.a()
            if (r0 <= 0) goto L_0x023a
            basu r0 = defpackage.basu.s
            aucd r0 = r0.o()
            boolean r2 = r0.c
            if (r2 != 0) goto L_0x0212
            goto L_0x0217
        L_0x0212:
            r0.c()
            r0.c = r1
        L_0x0217:
            aucj r1 = r0.b
            basu r1 = (defpackage.basu) r1
            aucj r2 = r3.i()
            baqy r2 = (defpackage.baqy) r2
            r2.getClass()
            r1.o = r2
            int r2 = r1.a
            r3 = 262144(0x40000, float:3.67342E-40)
            r2 = r2 | r3
            r1.a = r2
            aucj r0 = r0.i()
            basu r0 = (defpackage.basu) r0
            agky r1 = r14.a
            agks r1 = r1.l
            r1.a(r0)
        L_0x023a:
            agky r0 = r14.a
            r0.d()
            return
        L_0x0240:
            r6.d()
            anhq r1 = defpackage.agky.a
            anie r1 = r1.c()
            anhn r1 = (defpackage.anhn) r1
            r2 = 265(0x109, float:3.71E-43)
            anie r1 = r1.a((java.lang.String) r7, (java.lang.String) r8, (int) r2, (java.lang.String) r9)
            anhn r1 = (defpackage.anhn) r1
            long r2 = r0.longValue()
            java.lang.Long r0 = r14.e
            long r4 = r0.longValue()
            long r2 = r2 - r4
            java.lang.String r0 = "Missed sample window by %d ms"
            r1.a((java.lang.String) r0, (long) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agkw.run():void");
    }
}
