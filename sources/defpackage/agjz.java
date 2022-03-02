package defpackage;

import java.util.concurrent.Callable;

/* renamed from: agjz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class agjz implements Callable {
    private final agka a;
    private final baql b;

    public agjz(agka agka, baql baql) {
        this.a = agka;
        this.b = baql;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0304, code lost:
        if ((r5 / r7) > 3.472222222222222E-5d) goto L_0x058a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x058d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r23 = this;
            r1 = r23
            agka r2 = r1.a
            baql r8 = r1.b
            defpackage.agzj.c()
            agkn r3 = r2.c
            monitor-enter(r3)
            agkn r0 = r2.c     // Catch:{ all -> 0x05af }
            agnd r0 = r0.a     // Catch:{ all -> 0x05af }
            java.lang.String r4 = "primes.battery.snapshot"
            agnx r5 = defpackage.agnx.k     // Catch:{ all -> 0x05af }
            r6 = 7
            java.lang.Object r5 = r5.c(r6)     // Catch:{ all -> 0x05af }
            auef r5 = (defpackage.auef) r5     // Catch:{ all -> 0x05af }
            java.lang.String r6 = "agnd"
            java.lang.String r7 = "a"
            java.lang.String r9 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            android.content.SharedPreferences r0 = r0.b     // Catch:{ all -> 0x05af }
            java.lang.String r10 = ""
            java.lang.String r0 = r0.getString(r4, r10)     // Catch:{ all -> 0x05af }
            r10 = 0
            byte[] r0 = android.util.Base64.decode(r0, r10)     // Catch:{ all -> 0x05af }
            r11 = 1
            r12 = 0
            if (r0 == 0) goto L_0x0074
            int r4 = r0.length     // Catch:{ all -> 0x05af }
            if (r4 == 0) goto L_0x0074
            byte r13 = r0[r10]     // Catch:{ all -> 0x05af }
            if (r13 == r11) goto L_0x0050
            anhq r0 = defpackage.agnd.a     // Catch:{ all -> 0x05af }
            anie r0 = r0.c()     // Catch:{ all -> 0x05af }
            anhn r0 = (defpackage.anhn) r0     // Catch:{ all -> 0x05af }
            r4 = 60
            anie r0 = r0.a((java.lang.String) r6, (java.lang.String) r7, (int) r4, (java.lang.String) r9)     // Catch:{ all -> 0x05af }
            anhn r0 = (defpackage.anhn) r0     // Catch:{ all -> 0x05af }
            java.lang.String r4 = "wrong header"
            r0.a((java.lang.String) r4)     // Catch:{ all -> 0x05af }
            r0 = r12
            goto L_0x0075
        L_0x0050:
            int r4 = r4 + -1
            java.lang.Object r0 = r5.a(r0, r11, r4)     // Catch:{ auda -> 0x0059 }
            audx r0 = (defpackage.audx) r0     // Catch:{ auda -> 0x0059 }
            goto L_0x0075
        L_0x0059:
            r0 = move-exception
            anhq r4 = defpackage.agnd.a     // Catch:{ all -> 0x05af }
            anie r4 = r4.c()     // Catch:{ all -> 0x05af }
            anhn r4 = (defpackage.anhn) r4     // Catch:{ all -> 0x05af }
            r4.a((java.lang.Throwable) r0)     // Catch:{ all -> 0x05af }
            r0 = 57
            anie r0 = r4.a((java.lang.String) r6, (java.lang.String) r7, (int) r0, (java.lang.String) r9)     // Catch:{ all -> 0x05af }
            anhn r0 = (defpackage.anhn) r0     // Catch:{ all -> 0x05af }
            java.lang.String r4 = "failure reading proto"
            r0.a((java.lang.String) r4)     // Catch:{ all -> 0x05af }
            r0 = r12
            goto L_0x0075
        L_0x0074:
            r0 = r12
        L_0x0075:
            agnx r0 = (defpackage.agnx) r0     // Catch:{ all -> 0x05af }
            if (r0 == 0) goto L_0x0114
            int r4 = r0.a     // Catch:{ all -> 0x05af }
            r4 = r4 & 32
            if (r4 == 0) goto L_0x008f
            int r4 = r0.g     // Catch:{ all -> 0x05af }
            baql r4 = defpackage.baql.a(r4)     // Catch:{ all -> 0x05af }
            if (r4 == 0) goto L_0x008a
            r19 = r4
            goto L_0x0091
        L_0x008a:
            baql r4 = defpackage.baql.UNKNOWN     // Catch:{ all -> 0x05af }
            r19 = r4
            goto L_0x0091
        L_0x008f:
            r19 = r12
        L_0x0091:
            agkm r4 = new agkm     // Catch:{ all -> 0x05af }
            baqx r5 = r0.b     // Catch:{ all -> 0x05af }
            if (r5 == 0) goto L_0x0099
            r14 = r5
            goto L_0x009c
        L_0x0099:
            baqx r5 = defpackage.baqx.ar     // Catch:{ all -> 0x05af }
            r14 = r5
        L_0x009c:
            int r5 = r0.a     // Catch:{ all -> 0x05af }
            r5 = r5 & 2
            if (r5 == 0) goto L_0x00aa
            long r5 = r0.c     // Catch:{ all -> 0x05af }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x05af }
            r15 = r5
            goto L_0x00ab
        L_0x00aa:
            r15 = r12
        L_0x00ab:
            int r5 = r0.a     // Catch:{ all -> 0x05af }
            r5 = r5 & 4
            if (r5 == 0) goto L_0x00ba
            long r5 = r0.d     // Catch:{ all -> 0x05af }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x05af }
            r16 = r5
            goto L_0x00bc
        L_0x00ba:
            r16 = r12
        L_0x00bc:
            int r5 = r0.a     // Catch:{ all -> 0x05af }
            r5 = r5 & 8
            if (r5 == 0) goto L_0x00cb
            long r5 = r0.e     // Catch:{ all -> 0x05af }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x05af }
            r17 = r5
            goto L_0x00cd
        L_0x00cb:
            r17 = r12
        L_0x00cd:
            int r5 = r0.a     // Catch:{ all -> 0x05af }
            r5 = r5 & 16
            if (r5 == 0) goto L_0x00dc
            long r5 = r0.f     // Catch:{ all -> 0x05af }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x05af }
            r18 = r5
            goto L_0x00de
        L_0x00dc:
            r18 = r12
        L_0x00de:
            int r5 = r0.a     // Catch:{ all -> 0x05af }
            r6 = r5 & 64
            if (r6 == 0) goto L_0x00e9
            java.lang.String r6 = r0.h     // Catch:{ all -> 0x05af }
            r20 = r6
            goto L_0x00eb
        L_0x00e9:
            r20 = r12
        L_0x00eb:
            r5 = r5 & 128(0x80, float:1.794E-43)
            if (r5 == 0) goto L_0x00f8
            boolean r5 = r0.i     // Catch:{ all -> 0x05af }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ all -> 0x05af }
            r21 = r5
            goto L_0x00fa
        L_0x00f8:
            r21 = r12
        L_0x00fa:
            int r5 = r0.a     // Catch:{ all -> 0x05af }
            r5 = r5 & 256(0x100, float:3.59E-43)
            if (r5 == 0) goto L_0x010c
            barb r0 = r0.j     // Catch:{ all -> 0x05af }
            if (r0 != 0) goto L_0x0109
            barb r0 = defpackage.barb.c     // Catch:{ all -> 0x05af }
            r22 = r0
            goto L_0x010e
        L_0x0109:
            r22 = r0
            goto L_0x010e
        L_0x010c:
            r22 = r12
        L_0x010e:
            r13 = r4
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22)     // Catch:{ all -> 0x05af }
            r0 = r4
            goto L_0x0115
        L_0x0114:
            r0 = r12
        L_0x0115:
            monitor-exit(r3)     // Catch:{ all -> 0x05af }
            agjv r4 = r2.d
            agju r13 = new agju
            aekn r3 = r4.b
            long r5 = android.os.SystemClock.elapsedRealtime()
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            aekn r3 = r4.b
            long r6 = java.lang.System.currentTimeMillis()
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            agkp r3 = r4.a
            android.content.Context r3 = r3.a
            java.lang.String r7 = "systemhealth"
            java.lang.Object r3 = r3.getSystemService(r7)
            android.os.health.SystemHealthManager r3 = (android.os.health.SystemHealthManager) r3
            if (r3 == 0) goto L_0x0142
            android.os.health.HealthStats r3 = r3.takeMyUidSnapshot()
            r7 = r3
            goto L_0x0143
        L_0x0142:
            r7 = r12
        L_0x0143:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r11)
            aggl r3 = r4.d
            r3 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9)
            agkm r3 = r13.a()
            agkn r4 = r2.c
            monitor-enter(r4)
            agkn r5 = r2.c     // Catch:{ all -> 0x05ac }
            agnx r6 = defpackage.agnx.k     // Catch:{ all -> 0x05ac }
            aucd r6 = r6.o()     // Catch:{ all -> 0x05ac }
            baqx r7 = r3.a     // Catch:{ all -> 0x05ac }
            if (r7 == 0) goto L_0x0179
            boolean r8 = r6.c     // Catch:{ all -> 0x05ac }
            if (r8 != 0) goto L_0x0166
            goto L_0x016b
        L_0x0166:
            r6.c()     // Catch:{ all -> 0x05ac }
            r6.c = r10     // Catch:{ all -> 0x05ac }
        L_0x016b:
            aucj r8 = r6.b     // Catch:{ all -> 0x05ac }
            agnx r8 = (defpackage.agnx) r8     // Catch:{ all -> 0x05ac }
            r7.getClass()     // Catch:{ all -> 0x05ac }
            r8.b = r7     // Catch:{ all -> 0x05ac }
            int r7 = r8.a     // Catch:{ all -> 0x05ac }
            r7 = r7 | r11
            r8.a = r7     // Catch:{ all -> 0x05ac }
        L_0x0179:
            java.lang.Long r7 = r3.b     // Catch:{ all -> 0x05ac }
            if (r7 == 0) goto L_0x0197
            long r7 = r7.longValue()     // Catch:{ all -> 0x05ac }
            boolean r9 = r6.c     // Catch:{ all -> 0x05ac }
            if (r9 != 0) goto L_0x0186
            goto L_0x018b
        L_0x0186:
            r6.c()     // Catch:{ all -> 0x05ac }
            r6.c = r10     // Catch:{ all -> 0x05ac }
        L_0x018b:
            aucj r9 = r6.b     // Catch:{ all -> 0x05ac }
            agnx r9 = (defpackage.agnx) r9     // Catch:{ all -> 0x05ac }
            int r13 = r9.a     // Catch:{ all -> 0x05ac }
            r13 = r13 | 2
            r9.a = r13     // Catch:{ all -> 0x05ac }
            r9.c = r7     // Catch:{ all -> 0x05ac }
        L_0x0197:
            java.lang.Long r7 = r3.c     // Catch:{ all -> 0x05ac }
            if (r7 == 0) goto L_0x01b5
            long r7 = r7.longValue()     // Catch:{ all -> 0x05ac }
            boolean r9 = r6.c     // Catch:{ all -> 0x05ac }
            if (r9 != 0) goto L_0x01a4
            goto L_0x01a9
        L_0x01a4:
            r6.c()     // Catch:{ all -> 0x05ac }
            r6.c = r10     // Catch:{ all -> 0x05ac }
        L_0x01a9:
            aucj r9 = r6.b     // Catch:{ all -> 0x05ac }
            agnx r9 = (defpackage.agnx) r9     // Catch:{ all -> 0x05ac }
            int r13 = r9.a     // Catch:{ all -> 0x05ac }
            r13 = r13 | 4
            r9.a = r13     // Catch:{ all -> 0x05ac }
            r9.d = r7     // Catch:{ all -> 0x05ac }
        L_0x01b5:
            java.lang.Long r7 = r3.d     // Catch:{ all -> 0x05ac }
            if (r7 == 0) goto L_0x01d3
            long r7 = r7.longValue()     // Catch:{ all -> 0x05ac }
            boolean r9 = r6.c     // Catch:{ all -> 0x05ac }
            if (r9 != 0) goto L_0x01c2
            goto L_0x01c7
        L_0x01c2:
            r6.c()     // Catch:{ all -> 0x05ac }
            r6.c = r10     // Catch:{ all -> 0x05ac }
        L_0x01c7:
            aucj r9 = r6.b     // Catch:{ all -> 0x05ac }
            agnx r9 = (defpackage.agnx) r9     // Catch:{ all -> 0x05ac }
            int r13 = r9.a     // Catch:{ all -> 0x05ac }
            r13 = r13 | 8
            r9.a = r13     // Catch:{ all -> 0x05ac }
            r9.e = r7     // Catch:{ all -> 0x05ac }
        L_0x01d3:
            java.lang.Long r7 = r3.e     // Catch:{ all -> 0x05ac }
            if (r7 == 0) goto L_0x01f1
            long r7 = r7.longValue()     // Catch:{ all -> 0x05ac }
            boolean r9 = r6.c     // Catch:{ all -> 0x05ac }
            if (r9 != 0) goto L_0x01e0
            goto L_0x01e5
        L_0x01e0:
            r6.c()     // Catch:{ all -> 0x05ac }
            r6.c = r10     // Catch:{ all -> 0x05ac }
        L_0x01e5:
            aucj r9 = r6.b     // Catch:{ all -> 0x05ac }
            agnx r9 = (defpackage.agnx) r9     // Catch:{ all -> 0x05ac }
            int r13 = r9.a     // Catch:{ all -> 0x05ac }
            r13 = r13 | 16
            r9.a = r13     // Catch:{ all -> 0x05ac }
            r9.f = r7     // Catch:{ all -> 0x05ac }
        L_0x01f1:
            baql r7 = r3.f     // Catch:{ all -> 0x05ac }
            if (r7 == 0) goto L_0x020d
            int r7 = r7.h     // Catch:{ all -> 0x05ac }
            boolean r8 = r6.c     // Catch:{ all -> 0x05ac }
            if (r8 != 0) goto L_0x01fc
            goto L_0x0201
        L_0x01fc:
            r6.c()     // Catch:{ all -> 0x05ac }
            r6.c = r10     // Catch:{ all -> 0x05ac }
        L_0x0201:
            aucj r8 = r6.b     // Catch:{ all -> 0x05ac }
            agnx r8 = (defpackage.agnx) r8     // Catch:{ all -> 0x05ac }
            int r9 = r8.a     // Catch:{ all -> 0x05ac }
            r9 = r9 | 32
            r8.a = r9     // Catch:{ all -> 0x05ac }
            r8.g = r7     // Catch:{ all -> 0x05ac }
        L_0x020d:
            java.lang.String r7 = r3.g     // Catch:{ all -> 0x05ac }
            if (r7 == 0) goto L_0x022a
            boolean r8 = r6.c     // Catch:{ all -> 0x05ac }
            if (r8 != 0) goto L_0x0216
            goto L_0x021b
        L_0x0216:
            r6.c()     // Catch:{ all -> 0x05ac }
            r6.c = r10     // Catch:{ all -> 0x05ac }
        L_0x021b:
            aucj r8 = r6.b     // Catch:{ all -> 0x05ac }
            agnx r8 = (defpackage.agnx) r8     // Catch:{ all -> 0x05ac }
            r7.getClass()     // Catch:{ all -> 0x05ac }
            int r9 = r8.a     // Catch:{ all -> 0x05ac }
            r9 = r9 | 64
            r8.a = r9     // Catch:{ all -> 0x05ac }
            r8.h = r7     // Catch:{ all -> 0x05ac }
        L_0x022a:
            java.lang.Boolean r7 = r3.h     // Catch:{ all -> 0x05ac }
            if (r7 == 0) goto L_0x0248
            boolean r7 = r7.booleanValue()     // Catch:{ all -> 0x05ac }
            boolean r8 = r6.c     // Catch:{ all -> 0x05ac }
            if (r8 != 0) goto L_0x0237
            goto L_0x023c
        L_0x0237:
            r6.c()     // Catch:{ all -> 0x05ac }
            r6.c = r10     // Catch:{ all -> 0x05ac }
        L_0x023c:
            aucj r8 = r6.b     // Catch:{ all -> 0x05ac }
            agnx r8 = (defpackage.agnx) r8     // Catch:{ all -> 0x05ac }
            int r9 = r8.a     // Catch:{ all -> 0x05ac }
            r9 = r9 | 128(0x80, float:1.794E-43)
            r8.a = r9     // Catch:{ all -> 0x05ac }
            r8.i = r7     // Catch:{ all -> 0x05ac }
        L_0x0248:
            barb r7 = r3.i     // Catch:{ all -> 0x05ac }
            if (r7 != 0) goto L_0x024d
            goto L_0x0266
        L_0x024d:
            boolean r8 = r6.c     // Catch:{ all -> 0x05ac }
            if (r8 != 0) goto L_0x0252
            goto L_0x0257
        L_0x0252:
            r6.c()     // Catch:{ all -> 0x05ac }
            r6.c = r10     // Catch:{ all -> 0x05ac }
        L_0x0257:
            aucj r8 = r6.b     // Catch:{ all -> 0x05ac }
            agnx r8 = (defpackage.agnx) r8     // Catch:{ all -> 0x05ac }
            r7.getClass()     // Catch:{ all -> 0x05ac }
            r8.j = r7     // Catch:{ all -> 0x05ac }
            int r7 = r8.a     // Catch:{ all -> 0x05ac }
            r7 = r7 | 256(0x100, float:3.59E-43)
            r8.a = r7     // Catch:{ all -> 0x05ac }
        L_0x0266:
            agnd r5 = r5.a     // Catch:{ all -> 0x05ac }
            java.lang.String r7 = "primes.battery.snapshot"
            aucj r6 = r6.i()     // Catch:{ all -> 0x05ac }
            agnx r6 = (defpackage.agnx) r6     // Catch:{ all -> 0x05ac }
            defpackage.amrl.a((java.lang.Object) r6)     // Catch:{ all -> 0x05ac }
            byte[] r6 = r6.k()     // Catch:{ all -> 0x05ac }
            int r8 = r6.length     // Catch:{ all -> 0x05ac }
            int r9 = r8 + 1
            byte[] r9 = new byte[r9]     // Catch:{ all -> 0x05ac }
            r9[r10] = r11     // Catch:{ all -> 0x05ac }
            java.lang.System.arraycopy(r6, r10, r9, r11, r8)     // Catch:{ all -> 0x05ac }
            android.content.SharedPreferences r5 = r5.b     // Catch:{ all -> 0x05ac }
            android.content.SharedPreferences$Editor r5 = r5.edit()     // Catch:{ all -> 0x05ac }
            java.lang.String r6 = android.util.Base64.encodeToString(r9, r10)     // Catch:{ all -> 0x05ac }
            android.content.SharedPreferences$Editor r5 = r5.putString(r7, r6)     // Catch:{ all -> 0x05ac }
            boolean r5 = r5.commit()     // Catch:{ all -> 0x05ac }
            monitor-exit(r4)     // Catch:{ all -> 0x05ac }
            if (r5 == 0) goto L_0x05a1
            agjv r4 = r2.d
            if (r0 == 0) goto L_0x058a
            java.lang.Long r5 = r0.d
            java.lang.Long r6 = r3.d
            boolean r5 = java.util.Objects.equals(r5, r6)
            if (r5 == 0) goto L_0x058a
            java.lang.Long r5 = r0.e
            java.lang.Long r6 = r3.e
            boolean r5 = java.util.Objects.equals(r5, r6)
            if (r5 == 0) goto L_0x058a
            java.lang.Long r5 = r0.b
            if (r5 == 0) goto L_0x058a
            java.lang.Long r5 = r0.c
            if (r5 == 0) goto L_0x058a
            java.lang.Long r5 = r3.b
            if (r5 == 0) goto L_0x058a
            java.lang.Long r6 = r3.c
            if (r6 == 0) goto L_0x058a
            defpackage.amrl.a((java.lang.Object) r5)
            long r5 = r5.longValue()
            java.lang.Long r7 = r0.b
            defpackage.amrl.a((java.lang.Object) r7)
            long r7 = r7.longValue()
            long r5 = r5 - r7
            java.lang.Long r7 = r3.c
            defpackage.amrl.a((java.lang.Object) r7)
            long r7 = r7.longValue()
            java.lang.Long r9 = r0.c
            defpackage.amrl.a((java.lang.Object) r9)
            long r13 = r9.longValue()
            long r7 = r7 - r13
            r13 = 0
            int r9 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r9 <= 0) goto L_0x058a
            long r5 = r5 - r7
            long r5 = java.lang.Math.abs(r5)
            r15 = 25
            int r9 = (r5 > r15 ? 1 : (r5 == r15 ? 0 : -1))
            if (r9 >= 0) goto L_0x02f4
            goto L_0x0308
        L_0x02f4:
            double r5 = (double) r5
            double r7 = (double) r7
            java.lang.Double.isNaN(r5)
            java.lang.Double.isNaN(r7)
            double r5 = r5 / r7
            r7 = 4540248920338119903(0x3f023456789abcdf, double:3.472222222222222E-5)
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 <= 0) goto L_0x0308
            goto L_0x058a
        L_0x0308:
            agkp r4 = r4.a
            baqx r5 = r3.a
            baqx r6 = r0.a
            baqx r5 = defpackage.agkj.a((defpackage.baqx) r5, (defpackage.baqx) r6)
            if (r5 == 0) goto L_0x0425
            r6 = 5
            java.lang.Object r6 = r5.c(r6)
            aucd r6 = (defpackage.aucd) r6
            r6.a((defpackage.aucj) r5)
            baqw r6 = (defpackage.baqw) r6
            agkc r4 = r4.b
            aucj r5 = r6.b
            baqx r5 = (defpackage.baqx) r5
            aucx r5 = r5.g
            java.util.Collections.unmodifiableList(r5)
            r5 = 0
        L_0x032c:
            aucj r7 = r6.b
            baqx r7 = (defpackage.baqx) r7
            aucx r7 = r7.g
            int r7 = r7.size()
            if (r5 >= r7) goto L_0x0346
            baqv r7 = r6.a((int) r5)
            baqv r7 = r4.a((defpackage.baqv) r7)
            r6.e(r5, r7)
            int r5 = r5 + 1
            goto L_0x032c
        L_0x0346:
            aucj r5 = r6.b
            baqx r5 = (defpackage.baqx) r5
            aucx r5 = r5.h
            java.util.Collections.unmodifiableList(r5)
            r5 = 0
        L_0x0350:
            aucj r7 = r6.b
            baqx r7 = (defpackage.baqx) r7
            aucx r7 = r7.h
            int r7 = r7.size()
            if (r5 >= r7) goto L_0x036a
            baqv r7 = r6.D(r5)
            baqv r7 = r4.a((defpackage.baqv) r7)
            r6.f(r5, r7)
            int r5 = r5 + 1
            goto L_0x0350
        L_0x036a:
            aucj r5 = r6.b
            baqx r5 = (defpackage.baqx) r5
            aucx r5 = r5.i
            java.util.Collections.unmodifiableList(r5)
            r5 = 0
        L_0x0374:
            aucj r7 = r6.b
            baqx r7 = (defpackage.baqx) r7
            aucx r7 = r7.i
            int r7 = r7.size()
            if (r5 >= r7) goto L_0x038e
            baqv r7 = r6.E(r5)
            baqv r7 = r4.a((defpackage.baqv) r7)
            r6.g(r5, r7)
            int r5 = r5 + 1
            goto L_0x0374
        L_0x038e:
            aucj r5 = r6.b
            baqx r5 = (defpackage.baqx) r5
            aucx r5 = r5.j
            java.util.Collections.unmodifiableList(r5)
            r5 = 0
        L_0x0398:
            aucj r7 = r6.b
            baqx r7 = (defpackage.baqx) r7
            aucx r7 = r7.j
            int r7 = r7.size()
            if (r5 >= r7) goto L_0x03b2
            baqv r7 = r6.F(r5)
            baqv r7 = r4.a((defpackage.baqv) r7)
            r6.d(r5, r7)
            int r5 = r5 + 1
            goto L_0x0398
        L_0x03b2:
            aucj r5 = r6.b
            baqx r5 = (defpackage.baqx) r5
            aucx r5 = r5.k
            java.util.Collections.unmodifiableList(r5)
            r5 = 0
        L_0x03bc:
            aucj r7 = r6.b
            baqx r7 = (defpackage.baqx) r7
            aucx r7 = r7.k
            int r7 = r7.size()
            if (r5 >= r7) goto L_0x03d6
            baqv r7 = r6.G(r5)
            baqv r7 = r4.a((defpackage.baqv) r7)
            r6.c(r5, r7)
            int r5 = r5 + 1
            goto L_0x03bc
        L_0x03d6:
            aucj r5 = r6.b
            baqx r5 = (defpackage.baqx) r5
            aucx r5 = r5.l
            java.util.Collections.unmodifiableList(r5)
            r5 = 0
        L_0x03e0:
            aucj r7 = r6.b
            baqx r7 = (defpackage.baqx) r7
            aucx r7 = r7.l
            int r7 = r7.size()
            if (r5 >= r7) goto L_0x03fa
            baqv r7 = r6.H(r5)
            baqv r7 = r4.a((defpackage.baqv) r7)
            r6.a(r5, r7)
            int r5 = r5 + 1
            goto L_0x03e0
        L_0x03fa:
            aucj r5 = r6.b
            baqx r5 = (defpackage.baqx) r5
            aucx r5 = r5.n
            java.util.Collections.unmodifiableList(r5)
            r5 = 0
        L_0x0404:
            aucj r7 = r6.b
            baqx r7 = (defpackage.baqx) r7
            aucx r7 = r7.n
            int r7 = r7.size()
            if (r5 >= r7) goto L_0x041e
            baqv r7 = r6.I(r5)
            baqv r7 = r4.a((defpackage.baqv) r7)
            r6.b(r5, r7)
            int r5 = r5 + 1
            goto L_0x0404
        L_0x041e:
            aucj r4 = r6.i()
            baqx r4 = (defpackage.baqx) r4
            goto L_0x0426
        L_0x0425:
            r4 = r12
        L_0x0426:
            if (r4 == 0) goto L_0x058a
            int r5 = r4.a
            r5 = r5 & r11
            if (r5 == 0) goto L_0x058a
            long r5 = r4.c
            int r7 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r7 <= 0) goto L_0x058a
            baqm r5 = defpackage.baqm.k
            aucd r5 = r5.o()
            java.lang.Long r6 = r3.b
            defpackage.amrl.a((java.lang.Object) r6)
            long r6 = r6.longValue()
            java.lang.Long r8 = r0.b
            defpackage.amrl.a((java.lang.Object) r8)
            long r8 = r8.longValue()
            long r6 = r6 - r8
            boolean r8 = r5.c
            if (r8 == 0) goto L_0x0455
            r5.c()
            r5.c = r10
        L_0x0455:
            aucj r8 = r5.b
            baqm r8 = (defpackage.baqm) r8
            int r9 = r8.a
            r9 = r9 | 64
            r8.a = r9
            r8.h = r6
            baql r6 = r0.f
            if (r6 == 0) goto L_0x047f
            defpackage.amrl.a((java.lang.Object) r6)
            boolean r7 = r5.c
            if (r7 != 0) goto L_0x046d
            goto L_0x0472
        L_0x046d:
            r5.c()
            r5.c = r10
        L_0x0472:
            aucj r7 = r5.b
            baqm r7 = (defpackage.baqm) r7
            int r6 = r6.h
            r7.b = r6
            int r6 = r7.a
            r6 = r6 | r11
            r7.a = r6
        L_0x047f:
            java.lang.String r6 = r0.g
            if (r6 == 0) goto L_0x04ca
            java.lang.Boolean r6 = r0.h
            defpackage.amrl.a((java.lang.Object) r6)
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x04ac
            java.lang.String r6 = r0.g
            defpackage.amrl.a((java.lang.Object) r6)
            boolean r7 = r5.c
            if (r7 == 0) goto L_0x049c
            r5.c()
            r5.c = r10
        L_0x049c:
            aucj r7 = r5.b
            baqm r7 = (defpackage.baqm) r7
            r6.getClass()
            int r8 = r7.a
            r8 = r8 | 8
            r7.a = r8
            r7.e = r6
            goto L_0x04ca
        L_0x04ac:
            java.lang.String r6 = r0.g
            defpackage.amrl.a((java.lang.Object) r6)
            boolean r7 = r5.c
            if (r7 != 0) goto L_0x04b6
            goto L_0x04bb
        L_0x04b6:
            r5.c()
            r5.c = r10
        L_0x04bb:
            aucj r7 = r5.b
            baqm r7 = (defpackage.baqm) r7
            r6.getClass()
            int r8 = r7.a
            r8 = r8 | 4
            r7.a = r8
            r7.d = r6
        L_0x04ca:
            barb r0 = r0.i
            if (r0 == 0) goto L_0x04ea
            defpackage.amrl.a((java.lang.Object) r0)
            boolean r6 = r5.c
            if (r6 != 0) goto L_0x04d6
            goto L_0x04db
        L_0x04d6:
            r5.c()
            r5.c = r10
        L_0x04db:
            aucj r6 = r5.b
            baqm r6 = (defpackage.baqm) r6
            r0.getClass()
            r6.f = r0
            int r0 = r6.a
            r0 = r0 | 16
            r6.a = r0
        L_0x04ea:
            baql r0 = r3.f
            if (r0 == 0) goto L_0x0509
            defpackage.amrl.a((java.lang.Object) r0)
            boolean r6 = r5.c
            if (r6 != 0) goto L_0x04f6
            goto L_0x04fb
        L_0x04f6:
            r5.c()
            r5.c = r10
        L_0x04fb:
            aucj r6 = r5.b
            baqm r6 = (defpackage.baqm) r6
            int r0 = r0.h
            r6.g = r0
            int r0 = r6.a
            r0 = r0 | 32
            r6.a = r0
        L_0x0509:
            java.lang.Long r0 = r3.b
            if (r0 != 0) goto L_0x050e
            goto L_0x052b
        L_0x050e:
            defpackage.amrl.a((java.lang.Object) r0)
            long r6 = r0.longValue()
            boolean r0 = r5.c
            if (r0 != 0) goto L_0x051a
            goto L_0x051f
        L_0x051a:
            r5.c()
            r5.c = r10
        L_0x051f:
            aucj r0 = r5.b
            baqm r0 = (defpackage.baqm) r0
            int r8 = r0.a
            r8 = r8 | 256(0x100, float:3.59E-43)
            r0.a = r8
            r0.j = r6
        L_0x052b:
            aucj r0 = r5.b
            baqm r0 = (defpackage.baqm) r0
            r4.getClass()
            r0.i = r4
            int r4 = r0.a
            r4 = r4 | 128(0x80, float:1.794E-43)
            r0.a = r4
            basu r0 = defpackage.basu.s
            aucd r0 = r0.o()
            baqn r4 = defpackage.baqn.c
            aucd r4 = r4.o()
            boolean r6 = r4.c
            if (r6 != 0) goto L_0x054b
            goto L_0x0550
        L_0x054b:
            r4.c()
            r4.c = r10
        L_0x0550:
            aucj r6 = r4.b
            baqn r6 = (defpackage.baqn) r6
            aucj r5 = r5.i()
            baqm r5 = (defpackage.baqm) r5
            r5.getClass()
            r6.b = r5
            int r5 = r6.a
            r5 = r5 | r11
            r6.a = r5
            boolean r5 = r0.c
            if (r5 != 0) goto L_0x0569
            goto L_0x056e
        L_0x0569:
            r0.c()
            r0.c = r10
        L_0x056e:
            aucj r5 = r0.b
            basu r5 = (defpackage.basu) r5
            aucj r4 = r4.i()
            baqn r4 = (defpackage.baqn) r4
            r4.getClass()
            r5.j = r4
            int r4 = r5.a
            r4 = r4 | 512(0x200, float:7.175E-43)
            r5.a = r4
            aucj r0 = r0.i()
            basu r0 = (defpackage.basu) r0
            goto L_0x058b
        L_0x058a:
            r0 = r12
        L_0x058b:
            if (r0 == 0) goto L_0x05a0
            java.lang.Boolean r4 = r3.h
            agks r2 = r2.e
            java.lang.String r5 = r3.g
            if (r4 == 0) goto L_0x059a
            boolean r10 = r4.booleanValue()
            goto L_0x059b
        L_0x059a:
        L_0x059b:
            barb r3 = r3.i
            r2.a(r5, r10, r0, r3)
        L_0x05a0:
            return r12
        L_0x05a1:
            r2.c()
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "Failure storing persistent snapshot and helper data"
            r0.<init>(r2)
            throw r0
        L_0x05ac:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x05ac }
            throw r0
        L_0x05af:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x05af }
            goto L_0x05b3
        L_0x05b2:
            throw r0
        L_0x05b3:
            goto L_0x05b2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agjz.call():java.lang.Object");
    }
}
