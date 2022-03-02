package defpackage;

/* renamed from: ahkf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahkf extends ahjm {
    public ahkf(ahix ahix, aizy aizy) {
        super(ahix);
    }

    private final boolean c(long j) {
        long j2;
        long j3 = this.b.ai;
        if (j >= 300000 || j3 == Long.MAX_VALUE) {
            return false;
        }
        if (j > j3) {
            j2 = j;
        } else {
            j2 = j3;
        }
        if (j > j3) {
            j = j3;
        }
        if (j == 0) {
            return false;
        }
        if (j2 % j == 0) {
            return true;
        }
        double d = (double) j2;
        double d2 = (double) j;
        Double.isNaN(d);
        Double.isNaN(d2);
        double d3 = d / d2;
        return d3 < 8.5d && Math.abs(((d3 + 0.5d) % 1.0d) + -0.5d) < 0.1d;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x023f  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0296  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x029a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.ahjl a(long r30) {
        /*
            r29 = this;
            r0 = r29
            long r9 = r29.a()
            long r11 = r29.b()
            ahix r1 = r0.b
            long r2 = r1.an
            long r4 = r1.i()
            r13 = 0
            r15 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r1 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r1 == 0) goto L_0x003c
            ahix r1 = r0.b
            ahla r4 = r1.r
            boolean r4 = r4.a
            if (r4 != 0) goto L_0x0037
            ahjy r4 = r1.K
            long r4 = r4.a
            long r6 = r1.i()
            long r4 = defpackage.ahjm.b(r4)
            long r6 = r6 - r4
            long r4 = java.lang.Math.max(r13, r6)
            goto L_0x003d
        L_0x0037:
            long r4 = r1.i()
            goto L_0x003d
        L_0x003c:
            r4 = r15
        L_0x003d:
            long r7 = defpackage.ajqz.a((long) r2, (long) r4)
            long r5 = r29.c()
            ahix r1 = r0.b
            aiac r1 = r1.aj
            if (r1 == 0) goto L_0x004e
            long r1 = r1.a
            goto L_0x0050
        L_0x004e:
            r1 = -1
        L_0x0050:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = 222(0xde, float:3.11E-43)
            r3.<init>(r4)
            java.lang.String r4 = "nextFullTrigger: "
            r3.append(r4)
            r3.append(r9)
            java.lang.String r4 = " nextTiltOnlyTrigger: "
            r3.append(r4)
            r3.append(r11)
            java.lang.String r4 = " nextPhonePositionOnlyTrigger: "
            r3.append(r4)
            r3.append(r7)
            java.lang.String r4 = " nextLocatorTrigger: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r4 = " nextSleepActivityOnlyTrigger: "
            r3.append(r4)
            r3.append(r5)
            r3.toString()
            ahix r3 = r0.b
            long r3 = r3.V
            boolean r3 = r0.c(r3)
            if (r3 == 0) goto L_0x00b6
            ahix r3 = r0.b
            long r13 = r3.V
            long r3 = r3.ai
            r25 = r1
            r1 = r11
            r17 = r3
            r30 = r11
            r11 = -1
            r3 = r25
            r27 = r5
            r5 = r13
            r13 = r7
            r7 = r17
            boolean r1 = defpackage.ahjm.a(r1, r3, r5, r7)
            if (r1 == 0) goto L_0x00b3
            r7 = r25
            r1 = 1000(0x3e8, double:4.94E-321)
            long r3 = defpackage.ajqz.a((long) r7, (long) r1)
            r5 = r3
            goto L_0x00c0
        L_0x00b3:
            r7 = r25
            goto L_0x00be
        L_0x00b6:
            r27 = r5
            r13 = r7
            r30 = r11
            r11 = -1
            r7 = r1
        L_0x00be:
            r5 = r30
        L_0x00c0:
            ahix r1 = r0.b
            long r1 = r1.i()
            boolean r1 = r0.c(r1)
            if (r1 == 0) goto L_0x00e9
            ahix r1 = r0.b
            long r21 = r1.i()
            ahix r1 = r0.b
            long r1 = r1.ai
            r17 = r13
            r19 = r7
            r23 = r1
            boolean r1 = defpackage.ahjm.a(r17, r19, r21, r23)
            if (r1 == 0) goto L_0x00e9
            r1 = 1000(0x3e8, double:4.94E-321)
            long r3 = defpackage.ajqz.a((long) r7, (long) r1)
            r13 = r3
        L_0x00e9:
            ahix r1 = r0.b
            long r1 = r1.U
            boolean r1 = r0.c(r1)
            if (r1 == 0) goto L_0x0116
            ahix r1 = r0.b
            long r3 = r1.U
            long r1 = r1.ai
            r17 = r1
            r1 = r9
            r19 = r3
            r3 = r7
            r11 = r5
            r5 = r19
            r25 = r13
            r13 = r7
            r7 = r17
            boolean r1 = defpackage.ahjm.a(r1, r3, r5, r7)
            if (r1 != 0) goto L_0x010e
            goto L_0x011a
        L_0x010e:
            r1 = 1000(0x3e8, double:4.94E-321)
            long r9 = defpackage.ajqz.a((long) r13, (long) r1)
            goto L_0x015f
        L_0x0116:
            r11 = r5
            r25 = r13
            r13 = r7
        L_0x011a:
            ahix r1 = r0.b
            boolean r1 = r1.a()
            if (r1 == 0) goto L_0x015e
            ahix r1 = r0.b
            long r1 = r1.ak
            long r3 = super.d()
            r5 = 180000(0x2bf20, double:8.8932E-319)
            long r3 = java.lang.Math.max(r3, r5)
            long r17 = defpackage.ajqz.a((long) r1, (long) r3)
            int r1 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r1 == 0) goto L_0x015e
            int r1 = (r17 > r11 ? 1 : (r17 == r11 ? 0 : -1))
            if (r1 <= 0) goto L_0x013f
            r9 = r11
            goto L_0x0141
        L_0x013f:
            r9 = r17
        L_0x0141:
            int r1 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r1 <= 0) goto L_0x015e
            ahix r1 = r0.b
            long r2 = r1.U
            long r4 = r1.ai
            r19 = r13
            r21 = r2
            r23 = r4
            boolean r1 = defpackage.ahjm.a(r17, r19, r21, r23)
            if (r1 == 0) goto L_0x015e
            r1 = 1000(0x3e8, double:4.94E-321)
            long r9 = defpackage.ajqz.a((long) r13, (long) r1)
            goto L_0x015f
        L_0x015e:
        L_0x015f:
            ahix r1 = r0.b
            long r2 = r1.au
            ajaj r1 = r1.B
            boolean r1 = r1.d()
            r4 = 45000(0xafc8, double:2.2233E-319)
            if (r1 != 0) goto L_0x0192
            r6 = -1
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x0192
            ahix r2 = r0.b
            long r2 = r2.au
            long r2 = defpackage.ajqz.a((long) r2, (long) r4)
            long r6 = android.os.SystemClock.elapsedRealtime()
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 >= 0) goto L_0x0189
            long r2 = java.lang.Math.min(r9, r2)
            goto L_0x018a
        L_0x0189:
            r2 = r9
        L_0x018a:
            ahix r6 = r0.b
            r7 = -1
            r6.a((long) r7)
            goto L_0x0194
        L_0x0192:
            r2 = r9
        L_0x0194:
            boolean r6 = defpackage.axwx.i()
            if (r6 == 0) goto L_0x01bd
            boolean r6 = defpackage.axwx.h()
            if (r6 == 0) goto L_0x01bd
            long r6 = r0.a
            r13 = 5000(0x1388, double:2.4703E-320)
            long r6 = r6 + r13
            long r13 = android.os.SystemClock.elapsedRealtime()
            int r8 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r8 >= 0) goto L_0x01b0
            long r6 = r0.a
            long r6 = r6 + r4
        L_0x01b0:
            long r4 = android.os.SystemClock.elapsedRealtime()
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 < 0) goto L_0x01bd
            long r2 = java.lang.Math.min(r2, r6)
            goto L_0x01be
        L_0x01bd:
        L_0x01be:
            r4 = 39
            int r6 = (r25 > r2 ? 1 : (r25 == r2 ? 0 : -1))
            if (r6 >= 0) goto L_0x01f8
            ahix r6 = r0.b
            long r21 = r6.i()
            r23 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r17 = r25
            r19 = r2
            boolean r6 = defpackage.ahjm.a(r17, r19, r21, r23)
            if (r6 != 0) goto L_0x01f8
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 123(0x7b, float:1.72E-43)
            r2.<init>(r3)
            java.lang.String r3 = "Running phone position only detector next: FullTrigger: "
            r2.append(r3)
            r2.append(r9)
            java.lang.String r3 = " PhonePositionOnlyTrigger: "
            r2.append(r3)
            r13 = r25
            r2.append(r13)
            r2.toString()
            r4 = 4
            goto L_0x01f9
        L_0x01f8:
            r13 = r2
        L_0x01f9:
            if (r1 == 0) goto L_0x01fc
            goto L_0x0221
        L_0x01fc:
            boolean r2 = r0.a(r11, r13)
            if (r2 == 0) goto L_0x0220
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 104(0x68, float:1.46E-43)
            r2.<init>(r3)
            java.lang.String r3 = "Running tilt only detector next: FullTrigger: "
            r2.append(r3)
            r2.append(r9)
            java.lang.String r3 = " TiltOnlyTrigger: "
            r2.append(r3)
            r2.append(r11)
            r2.toString()
            r4 = 2
            r13 = r11
            goto L_0x0221
        L_0x0220:
        L_0x0221:
            if (r1 == 0) goto L_0x0238
            ahix r1 = r0.b
            long r1 = r1.i()
            int r3 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            if (r3 != 0) goto L_0x0238
            ahix r1 = r0.b
            boolean r1 = r1.c()
            if (r1 != 0) goto L_0x0238
            r4 = 0
            goto L_0x0239
        L_0x0238:
        L_0x0239:
            r1 = r27
            int r3 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r3 >= 0) goto L_0x0272
            ahix r3 = r0.b
            long r21 = r3.k()
            r23 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r17 = r1
            r19 = r13
            boolean r3 = defpackage.ahjm.a(r17, r19, r21, r23)
            if (r3 != 0) goto L_0x0272
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = 121(0x79, float:1.7E-43)
            r3.<init>(r4)
            java.lang.String r4 = "Running sleep segment only detector next: FullTrigger: "
            r3.append(r4)
            r3.append(r9)
            java.lang.String r4 = " SleepSegmentOnlyTrigger: "
            r3.append(r4)
            r3.append(r1)
            r3.toString()
            r4 = 32
            r13 = r1
            goto L_0x0273
        L_0x0272:
        L_0x0273:
            ahix r1 = r0.b
            long r1 = r1.i()
            ahix r3 = r0.b
            long r6 = r3.U
            long r8 = r3.V
            long r6 = java.lang.Math.min(r6, r8)
            long r1 = java.lang.Math.min(r1, r6)
            ahix r3 = r0.b
            boolean r3 = r3.l()
            if (r3 == 0) goto L_0x0290
            goto L_0x029a
        L_0x0290:
            ahix r3 = r0.b
            boolean r3 = r3.aa
            if (r3 != 0) goto L_0x029a
            r6 = 8
            long r1 = r1 / r6
            goto L_0x029d
        L_0x029a:
            r6 = 3
            long r1 = r1 / r6
        L_0x029d:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r6 = 112(0x70, float:1.57E-43)
            r3.<init>(r6)
            java.lang.String r6 = "nextTriggerTime: "
            r3.append(r6)
            r3.append(r13)
            java.lang.String r6 = " detectorType: "
            r3.append(r6)
            r3.append(r4)
            java.lang.String r6 = " alarmWindowMillis: "
            r3.append(r6)
            r3.append(r1)
            r3.toString()
            ahjl r3 = new ahjl
            aiac r6 = new aiac
            r6.<init>(r13, r1)
            r3.<init>(r6, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahkf.a(long):ahjl");
    }
}
