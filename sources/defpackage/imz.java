package defpackage;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/* renamed from: imz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class imz {
    public final String a;
    public final imh b;
    public final amzy c;
    public boolean d;
    private final anax e;
    private final double f;
    private final Random g;

    public imz(String str, imh imh, amzy amzy, anax anax) {
        this(str, imh, amzy, anax, false, 1.0d);
    }

    /* JADX WARNING: Removed duplicated region for block: B:121:0x02d9  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x02ed A[SYNTHETIC, Splitter:B:124:0x02ed] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.imx a(defpackage.inb r21, defpackage.ilw r22, java.util.Set r23) {
        /*
            r20 = this;
            r1 = r20
            java.lang.String r2 = "Exception shutting down executor, we may leak a thread: "
            java.lang.String r3 = "Fixer"
            java.lang.String r0 = r20.a()
            java.lang.String r4 = "Running fixer!"
            android.util.Log.i(r0, r4)
            aogx r0 = defpackage.aogx.e
            aucd r0 = r0.o()
            aogo r0 = (defpackage.aogo) r0
            r4 = r21
            aogr r5 = r4.a
            boolean r6 = r0.c
            r7 = 0
            if (r6 != 0) goto L_0x0021
            goto L_0x0026
        L_0x0021:
            r0.c()
            r0.c = r7
        L_0x0026:
            aucj r6 = r0.b
            aogx r6 = (defpackage.aogx) r6
            int r5 = r5.j
            r6.b = r5
            int r5 = r6.a
            r8 = 1
            r5 = r5 | r8
            r6.a = r5
            aucj r0 = r0.i()
            aogx r0 = (defpackage.aogx) r0
            r5 = 5
            java.lang.Object r6 = r0.c(r5)
            aucd r6 = (defpackage.aucd) r6
            r6.a((defpackage.aucj) r0)
            aogo r6 = (defpackage.aogo) r6
            imh r0 = r1.b
            aogp r9 = defpackage.aogp.c
            aucd r9 = r9.o()
            java.lang.String r0 = r0.a
            boolean r10 = r9.c
            if (r10 != 0) goto L_0x0055
            goto L_0x005a
        L_0x0055:
            r9.c()
            r9.c = r7
        L_0x005a:
            aucj r10 = r9.b
            aogp r10 = (defpackage.aogp) r10
            r0.getClass()
            int r11 = r10.a
            r11 = r11 | r8
            r10.a = r11
            r10.b = r0
            aucj r0 = r9.i()
            aogp r0 = (defpackage.aogp) r0
            boolean r9 = r6.c
            if (r9 != 0) goto L_0x0073
            goto L_0x0078
        L_0x0073:
            r6.c()
            r6.c = r7
        L_0x0078:
            aucj r9 = r6.b
            aogx r9 = (defpackage.aogx) r9
            r0.getClass()
            r9.c = r0
            int r0 = r9.a
            r10 = 2
            r0 = r0 | r10
            r9.a = r0
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            amzy r0 = r1.c
            anhk r0 = r0.listIterator()
        L_0x0092:
            boolean r11 = r0.hasNext()
            if (r11 == 0) goto L_0x00ce
            java.lang.Object r11 = r0.next()
            imt r11 = (defpackage.imt) r11
            aogw r12 = defpackage.aogw.e
            aucd r12 = r12.o()
            java.lang.String r11 = r11.a
            boolean r13 = r12.c
            if (r13 != 0) goto L_0x00ab
            goto L_0x00b0
        L_0x00ab:
            r12.c()
            r12.c = r7
        L_0x00b0:
            aucj r13 = r12.b
            aogw r13 = (defpackage.aogw) r13
            r11.getClass()
            int r14 = r13.a
            r14 = r14 | r8
            r13.a = r14
            r13.b = r11
            r13.c = r8
            r11 = r14 | 2
            r13.a = r11
            aucj r11 = r12.i()
            aogw r11 = (defpackage.aogw) r11
            r9.add(r11)
            goto L_0x0092
        L_0x00ce:
            ina r0 = r21.d()     // Catch:{ all -> 0x02d0 }
            r12 = 0
        L_0x00d3:
            amzy r13 = r1.c     // Catch:{ all -> 0x02d0 }
            int r13 = r13.size()     // Catch:{ all -> 0x02d0 }
            if (r12 >= r13) goto L_0x00f0
            amzy r13 = r1.c     // Catch:{ all -> 0x02d0 }
            java.lang.Object r13 = r13.get(r12)     // Catch:{ all -> 0x02d0 }
            imt r13 = (defpackage.imt) r13     // Catch:{ all -> 0x02d0 }
            imu r14 = new imu     // Catch:{ all -> 0x02d0 }
            java.lang.String r13 = r13.a     // Catch:{ all -> 0x02d0 }
            r14.<init>(r13, r8)     // Catch:{ all -> 0x02d0 }
            r0.a(r14)     // Catch:{ all -> 0x02d0 }
            int r12 = r12 + 1
            goto L_0x00d3
        L_0x00f0:
            inb r4 = r0.a()     // Catch:{ all -> 0x02d0 }
            java.util.concurrent.ExecutorService r12 = java.util.concurrent.Executors.newSingleThreadExecutor()     // Catch:{ all -> 0x02cb }
            r13 = 0
        L_0x00f9:
            amzy r0 = r1.c     // Catch:{ all -> 0x02c7 }
            int r0 = r0.size()     // Catch:{ all -> 0x02c7 }
            if (r13 >= r0) goto L_0x0260
            amzy r0 = r1.c     // Catch:{ all -> 0x02c7 }
            java.lang.Object r0 = r0.get(r13)     // Catch:{ all -> 0x02c7 }
            r14 = r0
            imt r14 = (defpackage.imt) r14     // Catch:{ all -> 0x02c7 }
            java.lang.Object r0 = r9.get(r13)     // Catch:{ all -> 0x02c7 }
            aogw r0 = (defpackage.aogw) r0     // Catch:{ all -> 0x02c7 }
            java.lang.Object r15 = r0.c(r5)     // Catch:{ all -> 0x02c7 }
            aucd r15 = (defpackage.aucd) r15     // Catch:{ all -> 0x02c7 }
            r15.a((defpackage.aucj) r0)     // Catch:{ all -> 0x02c7 }
            r11 = r23
            boolean r0 = r11.contains(r14)     // Catch:{ all -> 0x024c }
            if (r0 == 0) goto L_0x0144
            r17 = r6
            long r5 = r14.c     // Catch:{ all -> 0x024a }
            r18 = 0
            int r0 = (r5 > r18 ? 1 : (r5 == r18 ? 0 : -1))
            if (r0 <= 0) goto L_0x0136
            imw r0 = new imw     // Catch:{ all -> 0x024a }
            r0.<init>(r14, r4)     // Catch:{ all -> 0x024a }
            java.util.concurrent.Future r0 = r12.submit(r0)     // Catch:{ all -> 0x024a }
            r5 = r0
            goto L_0x014d
        L_0x0136:
            inb r0 = r14.c(r4)     // Catch:{ all -> 0x024a }
            amri r0 = defpackage.amri.b(r0)     // Catch:{ all -> 0x024a }
            aorr r0 = defpackage.aorl.a((java.lang.Object) r0)     // Catch:{ all -> 0x024a }
            r5 = r0
            goto L_0x014d
        L_0x0144:
            r17 = r6
            ampu r0 = defpackage.ampu.a     // Catch:{ all -> 0x024a }
            aorr r0 = defpackage.aorl.a((java.lang.Object) r0)     // Catch:{ all -> 0x024a }
            r5 = r0
        L_0x014d:
            long r10 = r14.c     // Catch:{ TimeoutException -> 0x015d, InterruptedException -> 0x015b, ExecutionException -> 0x0159 }
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ TimeoutException -> 0x015d, InterruptedException -> 0x015b, ExecutionException -> 0x0159 }
            java.lang.Object r0 = r5.get(r10, r0)     // Catch:{ TimeoutException -> 0x015d, InterruptedException -> 0x015b, ExecutionException -> 0x0159 }
            amri r0 = (defpackage.amri) r0     // Catch:{ TimeoutException -> 0x015d, InterruptedException -> 0x015b, ExecutionException -> 0x0159 }
            r5 = 5
            goto L_0x01ac
        L_0x0159:
            r0 = move-exception
            goto L_0x015e
        L_0x015b:
            r0 = move-exception
            goto L_0x015e
        L_0x015d:
            r0 = move-exception
        L_0x015e:
            r5.cancel(r8)     // Catch:{ all -> 0x024a }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x024a }
            java.lang.String r5 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x024a }
            int r5 = r5.length()     // Catch:{ all -> 0x024a }
            int r5 = r5 + 25
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x024a }
            r10.<init>(r5)     // Catch:{ all -> 0x024a }
            java.lang.String r5 = "Fix failed or timed out: "
            r10.append(r5)     // Catch:{ all -> 0x024a }
            r10.append(r0)     // Catch:{ all -> 0x024a }
            java.lang.String r0 = r10.toString()     // Catch:{ all -> 0x024a }
            android.util.Log.w(r3, r0)     // Catch:{ all -> 0x024a }
            boolean r0 = r15.c     // Catch:{ all -> 0x024a }
            if (r0 != 0) goto L_0x0188
            goto L_0x018d
        L_0x0188:
            r15.c()     // Catch:{ all -> 0x024a }
            r15.c = r7     // Catch:{ all -> 0x024a }
        L_0x018d:
            aucj r0 = r15.b     // Catch:{ all -> 0x024a }
            aogw r0 = (defpackage.aogw) r0     // Catch:{ all -> 0x024a }
            aogw r5 = defpackage.aogw.e     // Catch:{ all -> 0x024a }
            r5 = 4
            r0.c = r5     // Catch:{ all -> 0x024a }
            int r5 = r0.a     // Catch:{ all -> 0x024a }
            r6 = 2
            r5 = r5 | r6
            r0.a = r5     // Catch:{ all -> 0x024a }
            ina r0 = r4.d()     // Catch:{ all -> 0x024a }
            r5 = 5
            r0.a(r14, r5)     // Catch:{ all -> 0x024a }
            inb r0 = r0.a()     // Catch:{ all -> 0x024a }
            amri r0 = defpackage.amri.b(r0)     // Catch:{ all -> 0x024a }
        L_0x01ac:
            boolean r10 = r0.a()     // Catch:{ all -> 0x024a }
            if (r10 == 0) goto L_0x0216
            java.lang.Object r0 = r0.b()     // Catch:{ all -> 0x024a }
            inb r0 = (defpackage.inb) r0     // Catch:{ all -> 0x024a }
            r10 = r22
            inb r4 = r1.a((defpackage.inb) r0, (defpackage.imt) r14, (defpackage.ilw) r10)     // Catch:{ all -> 0x024a }
            java.lang.String r0 = r14.a     // Catch:{ all -> 0x0214 }
            imu r0 = r4.a(r0)     // Catch:{ all -> 0x0214 }
            int r11 = r0.c     // Catch:{ all -> 0x0214 }
            boolean r14 = r15.c     // Catch:{ all -> 0x0214 }
            if (r14 != 0) goto L_0x01cb
            goto L_0x01d0
        L_0x01cb:
            r15.c()     // Catch:{ all -> 0x0214 }
            r15.c = r7     // Catch:{ all -> 0x0214 }
        L_0x01d0:
            aucj r14 = r15.b     // Catch:{ all -> 0x0214 }
            aogw r14 = (defpackage.aogw) r14     // Catch:{ all -> 0x0214 }
            aogw r16 = defpackage.aogw.e     // Catch:{ all -> 0x0214 }
            int r5 = r11 + -1
            if (r11 == 0) goto L_0x0211
            r14.c = r5     // Catch:{ all -> 0x0214 }
            int r11 = r14.a     // Catch:{ all -> 0x0214 }
            r6 = 2
            r11 = r11 | r6
            r14.a = r11     // Catch:{ all -> 0x0214 }
            int r5 = defpackage.aogv.a(r5)     // Catch:{ all -> 0x0214 }
            if (r5 != 0) goto L_0x01e9
            goto L_0x020e
        L_0x01e9:
            if (r5 != r6) goto L_0x020e
            aogt r0 = r0.b     // Catch:{ all -> 0x0214 }
            if (r0 != 0) goto L_0x01f5
            java.lang.String r0 = "Fix has stage PROPOSED but no proposal"
            android.util.Log.w(r3, r0)     // Catch:{ all -> 0x0214 }
            goto L_0x020e
        L_0x01f5:
            boolean r5 = r15.c     // Catch:{ all -> 0x0214 }
            if (r5 != 0) goto L_0x01fa
            goto L_0x01ff
        L_0x01fa:
            r15.c()     // Catch:{ all -> 0x0214 }
            r15.c = r7     // Catch:{ all -> 0x0214 }
        L_0x01ff:
            aucj r5 = r15.b     // Catch:{ all -> 0x0214 }
            aogw r5 = (defpackage.aogw) r5     // Catch:{ all -> 0x0214 }
            r0.getClass()     // Catch:{ all -> 0x0214 }
            r5.d = r0     // Catch:{ all -> 0x0214 }
            int r0 = r5.a     // Catch:{ all -> 0x0214 }
            r0 = r0 | 16
            r5.a = r0     // Catch:{ all -> 0x0214 }
        L_0x020e:
            r5 = 0
            r6 = 2
            goto L_0x0232
        L_0x0211:
            r5 = 0
            throw r5     // Catch:{ all -> 0x0214 }
        L_0x0214:
            r0 = move-exception
            goto L_0x024f
        L_0x0216:
            r10 = r22
            r5 = 0
            boolean r0 = r15.c     // Catch:{ all -> 0x024a }
            if (r0 != 0) goto L_0x021e
            goto L_0x0223
        L_0x021e:
            r15.c()     // Catch:{ all -> 0x024a }
            r15.c = r7     // Catch:{ all -> 0x024a }
        L_0x0223:
            aucj r0 = r15.b     // Catch:{ all -> 0x024a }
            aogw r0 = (defpackage.aogw) r0     // Catch:{ all -> 0x024a }
            aogw r11 = defpackage.aogw.e     // Catch:{ all -> 0x024a }
            r11 = 3
            r0.c = r11     // Catch:{ all -> 0x024a }
            int r11 = r0.a     // Catch:{ all -> 0x024a }
            r6 = 2
            r11 = r11 | r6
            r0.a = r11     // Catch:{ all -> 0x024a }
        L_0x0232:
            aucj r0 = r15.i()     // Catch:{ all -> 0x0243 }
            aogw r0 = (defpackage.aogw) r0     // Catch:{ all -> 0x0243 }
            r9.set(r13, r0)     // Catch:{ all -> 0x0243 }
            int r13 = r13 + 1
            r6 = r17
            r5 = 5
            r10 = 2
            goto L_0x00f9
        L_0x0243:
            r0 = move-exception
            r5 = r0
            r11 = r12
            r6 = r17
            goto L_0x02d4
        L_0x024a:
            r0 = move-exception
            goto L_0x024f
        L_0x024c:
            r0 = move-exception
            r17 = r6
        L_0x024f:
            aucj r5 = r15.i()     // Catch:{ all -> 0x0259 }
            aogw r5 = (defpackage.aogw) r5     // Catch:{ all -> 0x0259 }
            r9.set(r13, r5)     // Catch:{ all -> 0x0259 }
            throw r0     // Catch:{ all -> 0x0259 }
        L_0x0259:
            r0 = move-exception
            r5 = r0
            r11 = r12
            r6 = r17
            goto L_0x02d4
        L_0x0260:
            r17 = r6
            boolean r0 = r6.c
            if (r0 != 0) goto L_0x0267
            goto L_0x026c
        L_0x0267:
            r6.c()
            r6.c = r7
        L_0x026c:
            aucj r0 = r6.b
            aogx r0 = (defpackage.aogx) r0
            aucx r5 = defpackage.aucj.s()
            r0.d = r5
            r6.a(r9)
            if (r12 == 0) goto L_0x02a1
            r12.shutdownNow()     // Catch:{ SecurityException -> 0x027f }
            goto L_0x02a1
        L_0x027f:
            r0 = move-exception
            r5 = r0
            java.lang.String r0 = java.lang.String.valueOf(r5)
            java.lang.String r5 = java.lang.String.valueOf(r0)
            int r5 = r5.length()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            int r5 = r5 + 56
            r7.<init>(r5)
            r7.append(r2)
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            android.util.Log.e(r3, r0)
        L_0x02a1:
            boolean r0 = defpackage.awyw.b()
            if (r0 == 0) goto L_0x02b4
            java.util.Random r0 = r1.g
            float r0 = r0.nextFloat()
            double r2 = (double) r0
            double r7 = r1.f
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x02bf
        L_0x02b4:
            inx r0 = r4.c
            aucj r2 = r6.i()
            aogx r2 = (defpackage.aogx) r2
            r0.a(r2)
        L_0x02bf:
            imx r0 = new imx
            boolean r2 = r4.j
            r0.<init>(r2)
            return r0
        L_0x02c7:
            r0 = move-exception
            r5 = r0
            r11 = r12
            goto L_0x02d4
        L_0x02cb:
            r0 = move-exception
            r5 = 0
            r11 = r5
            r5 = r0
            goto L_0x02d4
        L_0x02d0:
            r0 = move-exception
            r5 = 0
            r11 = r5
            r5 = r0
        L_0x02d4:
            boolean r0 = r6.c
            if (r0 != 0) goto L_0x02d9
            goto L_0x02de
        L_0x02d9:
            r6.c()
            r6.c = r7
        L_0x02de:
            aucj r0 = r6.b
            aogx r0 = (defpackage.aogx) r0
            aucx r7 = defpackage.aucj.s()
            r0.d = r7
            r6.a(r9)
            if (r11 == 0) goto L_0x0313
            r11.shutdownNow()     // Catch:{ SecurityException -> 0x02f1 }
            goto L_0x0313
        L_0x02f1:
            r0 = move-exception
            r7 = r0
            java.lang.String r0 = java.lang.String.valueOf(r7)
            java.lang.String r7 = java.lang.String.valueOf(r0)
            int r7 = r7.length()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            int r7 = r7 + 56
            r8.<init>(r7)
            r8.append(r2)
            r8.append(r0)
            java.lang.String r0 = r8.toString()
            android.util.Log.e(r3, r0)
        L_0x0313:
            boolean r0 = defpackage.awyw.b()
            if (r0 == 0) goto L_0x0326
            java.util.Random r0 = r1.g
            float r0 = r0.nextFloat()
            double r2 = (double) r0
            double r7 = r1.f
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x0331
        L_0x0326:
            inx r0 = r4.c
            aucj r2 = r6.i()
            aogx r2 = (defpackage.aogx) r2
            r0.a(r2)
        L_0x0331:
            goto L_0x0333
        L_0x0332:
            throw r5
        L_0x0333:
            goto L_0x0332
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.imz.a(inb, ilw, java.util.Set):imx");
    }

    public imz(String str, imh imh, amzy amzy, anax anax, boolean z, double d2) {
        this.d = false;
        iva.c(str);
        this.a = str;
        iva.a((Object) imh);
        this.b = imh;
        iva.a((Object) amzy);
        this.c = amzy;
        iva.a((Object) anax);
        this.e = anax;
        this.d = z;
        this.f = Math.min(d2, awyw.a.a().s());
        Random random = new Random();
        this.g = random;
        random.nextLong();
        this.g.nextLong();
    }

    /* access modifiers changed from: protected */
    public inb a(inb inb, imt imt, ilw ilw) {
        return a(inb, imt, ilw, (byte[]) null);
    }

    /* access modifiers changed from: protected */
    public final inb a(inb inb, imt imt, ilw ilw, byte[] bArr) {
        long j;
        inb inb2 = inb;
        imt imt2 = imt;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        int i = inb2.a(imt2.a).c;
        if (!axbk.a.a().b()) {
            j = imt2.b + seconds;
        } else {
            j = (i != 3 ? awyw.a.a().m() : imt2.b) + seconds;
        }
        String str = this.a;
        String str2 = this.b.a;
        String str3 = imt2.a;
        int i2 = i - 1;
        if (i != 0) {
            imb imb = new imb(str, str2, str3, seconds, j, (long) i2, inb2.a, inb2.c.a(), bArr);
            ilw.a(imb);
            ina d2 = inb.d();
            amzt j2 = amzy.j();
            j2.b((Iterable) d2.e);
            j2.c(imb);
            d2.e = j2.a();
            return d2.a();
        }
        throw null;
    }

    /* access modifiers changed from: protected */
    public final String a() {
        String str = this.a;
        return str.substring(0, Math.min(str.length(), 23));
    }

    public final boolean a(inb inb) {
        ina d2 = inb.d();
        d2.h = this;
        inb a2 = d2.a();
        if (this.e.contains(a2.a)) {
            imh imh = this.b;
            try {
                if (imh.a(a2)) {
                    return true;
                }
            } catch (RuntimeException e2) {
                ims.a(e2, a2, imh.a);
            }
        }
        return false;
    }
}
