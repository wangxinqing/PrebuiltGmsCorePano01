package defpackage;

/* renamed from: ahiv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahiv extends ahir {
    final /* synthetic */ ahiw b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ahiv(ahiw ahiw) {
        super(ahiw);
        this.b = ahiw;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x0a90  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(long r55, long r57, defpackage.ahyq r59, defpackage.ahyq r60, defpackage.ahyq r61) {
        /*
            r54 = this;
            r6 = r54
            r3 = r57
            r0 = r59
            r1 = r60
            r2 = r61
            r7 = 40000000000(0x9502f9000, double:1.97626258336E-313)
            ahyq r5 = defpackage.ahiw.a((defpackage.ahyq) r0, (long) r7)
            ahiw r7 = r6.b
            long r7 = r7.r
            r16 = 1
            r18 = 0
            r20 = -1
            int r9 = (r7 > r20 ? 1 : (r7 == r20 ? 0 : -1))
            if (r9 == 0) goto L_0x0025
            long r7 = r7 + r16
            r8 = r7
            goto L_0x0027
        L_0x0025:
            r8 = r18
        L_0x0027:
            r10 = 0
            r12 = -1
            r14 = 0
            r7 = r59
            ahyq r22 = r7.a(r8, r10, r12, r14)
            ahiw r7 = r6.b
            long r7 = r7.s
            int r9 = (r7 > r20 ? 1 : (r7 == r20 ? 0 : -1))
            if (r9 == 0) goto L_0x003f
            long r7 = r7 + r16
            r8 = r7
            goto L_0x0041
        L_0x003f:
            r8 = r18
        L_0x0041:
            r10 = 0
            r12 = -1
            r14 = 0
            r7 = r60
            ahyq r23 = r7.a(r8, r10, r12, r14)
            ahiw r7 = r6.b
            long r7 = r7.t
            int r9 = (r7 > r20 ? 1 : (r7 == r20 ? 0 : -1))
            if (r9 == 0) goto L_0x0059
            long r7 = r7 + r16
            r8 = r7
            goto L_0x005b
        L_0x0059:
            r8 = r18
        L_0x005b:
            r10 = 0
            r12 = -1
            r14 = 0
            r7 = r61
            ahyq r14 = r7.a(r8, r10, r12, r14)
            int r7 = r0.b
            r19 = -1
            if (r7 <= 0) goto L_0x0077
            ahiw r8 = r6.b
            int r7 = r7 + -1
            long r9 = r0.a((int) r7)
            r8.r = r9
        L_0x0077:
            int r7 = r1.b
            if (r7 <= 0) goto L_0x0085
            ahiw r8 = r6.b
            int r7 = r7 + -1
            long r9 = r1.a((int) r7)
            r8.s = r9
        L_0x0085:
            int r7 = r2.b
            if (r7 > 0) goto L_0x008a
            goto L_0x0094
        L_0x008a:
            ahiw r8 = r6.b
            int r7 = r7 + -1
            long r9 = r2.a((int) r7)
            r8.t = r9
        L_0x0094:
            ahiw r7 = r6.b
            r7.b(r5)
            defpackage.ahis.a((defpackage.ahyq) r0, (defpackage.ahyq) r5)
            ahiw r7 = r6.b
            aicn r7 = r7.q
            aico r8 = defpackage.aico.ACCEL_SAMPLE_RATE
            double r9 = defpackage.ahis.a(r5)
            long r9 = java.lang.Math.round(r9)
            int r10 = (int) r9
            r7.a((defpackage.aico) r8, (int) r10)
            ahiw r7 = r6.b
            ahiq r7 = r7.e
            ahup r12 = defpackage.ahup.ACCELEROMETER
            r8 = r55
            r10 = r57
            r13 = r22
            r7.a(r8, r10, r12, r13)
            ahiw r7 = r6.b
            ahiq r7 = r7.e
            ahup r12 = defpackage.ahup.BAROMETER
            r13 = r23
            r7.a(r8, r10, r12, r13)
            ahiw r7 = r6.b
            ahiq r7 = r7.e
            ahup r12 = defpackage.ahup.LIGHT
            r13 = r14
            r7.a(r8, r10, r12, r13)
            ahiw r7 = r6.b
            boolean r8 = r7.i
            r20 = 1000000(0xf4240, double:4.940656E-318)
            if (r8 != 0) goto L_0x00e1
            r2 = r0
            r25 = r5
            r1 = 0
            goto L_0x0ac7
        L_0x00e1:
            ahnx r9 = r7.j
            if (r9 == 0) goto L_0x0ac3
            ahjw r8 = r7.y
            ahiq r7 = r7.e
            int r12 = r0.b
            int r13 = r1.b
            long r14 = r8.b
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r10 = 126(0x7e, float:1.77E-43)
            r11.<init>(r10)
            java.lang.String r10 = "Running floor change detection, accelSize="
            r11.append(r10)
            r11.append(r12)
            java.lang.String r10 = ", baroSize="
            r11.append(r10)
            r11.append(r13)
            java.lang.String r10 = ", timeSinceLastDetection: "
            r11.append(r10)
            long r12 = r3 - r14
            double r12 = (double) r12
            r14 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            java.lang.Double.isNaN(r12)
            double r12 = r12 * r14
            r11.append(r12)
            java.lang.String r10 = "s"
            r11.append(r10)
            r11.toString()
            int r10 = r0.b
            r11 = 1
            if (r10 <= r11) goto L_0x0abe
            int r10 = r1.b
            if (r10 <= r11) goto L_0x0abe
            long r10 = r8.b
            long r10 = r3 - r10
            r12 = 40000(0x9c40, double:1.97626E-319)
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 < 0) goto L_0x0abe
            r8.b = r3
            long r10 = r8.d
            r12 = 0
            long r13 = r0.a((int) r12)
            r25 = r5
            long r5 = r1.a((int) r12)
            long r5 = java.lang.Math.max(r13, r5)
            long r5 = java.lang.Math.max(r10, r5)
            int r10 = r0.b
            int r10 = r10 + -1
            long r10 = r0.a((int) r10)
            int r12 = r1.b
            int r12 = r12 + -1
            long r12 = r1.a((int) r12)
            long r14 = java.lang.Math.min(r10, r12)
            r8.c = r14
            ahlr r10 = r8.f
            boolean r10 = r10 instanceof defpackage.ahlo
            if (r10 != 0) goto L_0x0ab7
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            axwi r10 = defpackage.axwi.a
            axwj r10 = r10.a()
            java.lang.String r10 = r10.floorChangeFakeEvent()
            r26 = 0
            if (r10 == 0) goto L_0x0230
            int r27 = r10.length()
            if (r27 <= 0) goto L_0x0224
            java.lang.String r11 = ","
            java.lang.String[] r10 = r10.split(r11)
            int r11 = r10.length
            r28 = r7
            r7 = 5
            if (r11 != r7) goto L_0x021a
            r11 = 0
            r7 = r10[r11]
            int r23 = java.lang.Integer.parseInt(r7)
            r24 = 1
            r7 = r10[r24]
            int r36 = java.lang.Integer.parseInt(r7)
            r18 = 2
            r7 = r10[r18]
            long r29 = java.lang.Long.parseLong(r7)
            r27 = 3
            r7 = r10[r27]
            float r35 = java.lang.Float.parseFloat(r7)
            r22 = 4
            r7 = r10[r22]
            int r7 = java.lang.Integer.parseInt(r7)
            r31 = 60000(0xea60, double:2.9644E-319)
            r33 = r12
            long r11 = r3 / r31
            int r12 = (int) r11
            int r11 = r8.e
            int r11 = r11 + r7
            if (r11 > r12) goto L_0x020f
            long r31 = r55 - r29
            com.google.android.gms.location.FloorChangeEvent r11 = new com.google.android.gms.location.FloorChangeEvent
            long r29 = r3 - r29
            r2 = r28
            r7 = r11
            r2 = r8
            r8 = r23
            r3 = r9
            r9 = r36
            r4 = r11
            r1 = 3
            r24 = 0
            r10 = r31
            r37 = r3
            r3 = r12
            r0 = r13
            r1 = r33
            r12 = r55
            r40 = r14
            r14 = r29
            r16 = r57
            r18 = r35
            r7.<init>(r8, r9, r10, r12, r14, r16, r18)
            r1.add(r4)
            r2.e = r3
            int r23 = r23 + r23
            int r3 = (r35 > r26 ? 1 : (r35 == r26 ? 0 : -1))
            if (r3 <= 0) goto L_0x01fd
            r10 = 1
            goto L_0x01fe
        L_0x01fd:
            r10 = 0
        L_0x01fe:
            ahnw r3 = new ahnw
            int r30 = r23 - r10
            long r31 = r31 * r20
            long r33 = r55 * r20
            r29 = r3
            r29.<init>(r30, r31, r33, r35, r36)
            r0.add(r3)
            goto L_0x023b
        L_0x020f:
            r2 = r8
            r37 = r9
            r0 = r13
            r40 = r14
            r1 = r33
            r24 = 0
            goto L_0x023b
        L_0x021a:
            r2 = r8
            r37 = r9
            r1 = r12
            r0 = r13
            r40 = r14
            r24 = 0
            goto L_0x023b
        L_0x0224:
            r28 = r7
            r2 = r8
            r37 = r9
            r1 = r12
            r0 = r13
            r40 = r14
            r24 = 0
            goto L_0x023b
        L_0x0230:
            r28 = r7
            r2 = r8
            r37 = r9
            r1 = r12
            r0 = r13
            r40 = r14
            r24 = 0
        L_0x023b:
            r10 = 500000000(0x1dcd6500, double:2.47032823E-315)
            r14 = 500000000(0x1dcd6500, double:2.47032823E-315)
            r7 = r59
            r8 = r5
            r12 = r40
            ahyq r3 = r7.a(r8, r10, r12, r14)
            r7 = r60
            ahyq r4 = r7.a(r8, r10, r12, r14)
            int r7 = r3.b
            if (r7 != 0) goto L_0x025d
            r9 = r1
            r0 = r2
            r22 = r5
            r1 = 0
            r2 = r59
            goto L_0x0a6b
        L_0x025d:
            int r8 = r4.b
            if (r8 == 0) goto L_0x0a64
            r7 = -1027080192(0xffffffffc2c80000, float:-100.0)
            r8 = 1120403456(0x42c80000, float:100.0)
            ahyq r3 = defpackage.ahnz.a((defpackage.ahyq) r3, (float) r7, (float) r8)
            r7 = 1128792064(0x43480000, float:200.0)
            r9 = 1150681088(0x44960000, float:1200.0)
            ahyq r4 = defpackage.ahnz.a((defpackage.ahyq) r4, (float) r7, (float) r9)
            int r7 = r3.b
            if (r7 != 0) goto L_0x028c
            java.util.List r3 = java.util.Collections.emptyList()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r24)
            aiba r3 = defpackage.aiba.a(r3, r4)
            r32 = r0
            r36 = r1
            r16 = r2
            r22 = r5
            r1 = 0
            goto L_0x0992
        L_0x028c:
            int r7 = r4.b
            if (r7 == 0) goto L_0x097d
            long r9 = defpackage.ahnx.a
            int r7 = r4.b
            int r7 = r7 + -1
            long r11 = r4.a((int) r7)
            r7 = 0
            long r13 = r4.a((int) r7)
            long r11 = r11 - r13
            long r11 = r11 / r9
            int r12 = (int) r11
            r11 = 1
            int r12 = r12 + r11
            double[] r11 = new double[r12]
            float r13 = r4.a(r7, r7)
            double r13 = (double) r13
            r11[r7] = r13
            r13 = 1
            r14 = 0
        L_0x02af:
            if (r13 < r12) goto L_0x08f5
            java.util.PriorityQueue r9 = new java.util.PriorityQueue
            r10 = 35
            r9.<init>(r10)
            java.util.PriorityQueue r13 = new java.util.PriorityQueue
            java.util.Comparator r14 = java.util.Collections.reverseOrder()
            r13.<init>(r10, r14)
            r14 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            java.lang.Double r10 = java.lang.Double.valueOf(r14)
            r9.add(r10)
            r14 = -4503599627370496(0xfff0000000000000, double:-Infinity)
            java.lang.Double r10 = java.lang.Double.valueOf(r14)
            r13.add(r10)
            double[] r14 = new double[r12]
            r10 = 0
            r15 = 0
            r16 = -1
        L_0x02d9:
            if (r10 >= r12) goto L_0x03a7
            int r17 = r12 - r10
            int r8 = r17 + -1
            int r8 = java.lang.Math.min(r10, r8)
            int r7 = r10 + -25
            r17 = r15
            int r15 = r10 - r8
            int r7 = java.lang.Math.max(r7, r15)
            r15 = 0
            int r7 = java.lang.Math.max(r15, r7)
            int r15 = r12 + -1
            r22 = r5
            int r5 = r10 + 25
            int r8 = r8 + r10
            int r5 = java.lang.Math.min(r5, r8)
            int r5 = java.lang.Math.min(r15, r5)
            r15 = r17
        L_0x0303:
            if (r15 >= r7) goto L_0x032b
            r29 = r11[r15]
            java.lang.Object r6 = r13.peek()
            java.lang.Double r6 = (java.lang.Double) r6
            double r31 = r6.doubleValue()
            int r6 = (r29 > r31 ? 1 : (r29 == r31 ? 0 : -1))
            if (r6 <= 0) goto L_0x031f
            r29 = r11[r15]
            java.lang.Double r6 = java.lang.Double.valueOf(r29)
            r9.remove(r6)
            goto L_0x0328
        L_0x031f:
            r29 = r11[r15]
            java.lang.Double r6 = java.lang.Double.valueOf(r29)
            r13.remove(r6)
        L_0x0328:
            int r15 = r15 + 1
            goto L_0x0303
        L_0x032b:
            r6 = r16
        L_0x032d:
            if (r6 < r5) goto L_0x0381
        L_0x032f:
            int r5 = r13.size()
            int r7 = r9.size()
            if (r5 < r7) goto L_0x0377
        L_0x0339:
            int r5 = r13.size()
            int r7 = r9.size()
            r8 = 1
            int r7 = r7 + r8
            if (r5 <= r7) goto L_0x034f
            java.lang.Object r5 = r13.poll()
            java.lang.Double r5 = (java.lang.Double) r5
            r9.add(r5)
            goto L_0x0339
        L_0x034f:
            int r5 = r13.size()
            int r7 = r9.size()
            int r7 = r7 + r8
            if (r5 != r7) goto L_0x0371
            java.lang.Object r5 = r13.peek()
            java.lang.Double r5 = (java.lang.Double) r5
            double r7 = r5.doubleValue()
            r14[r10] = r7
            int r10 = r10 + 1
            r16 = r6
            r5 = r22
            r7 = 0
            r8 = 1120403456(0x42c80000, float:100.0)
            goto L_0x02d9
        L_0x0371:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x0377:
            java.lang.Object r5 = r9.poll()
            java.lang.Double r5 = (java.lang.Double) r5
            r13.add(r5)
            goto L_0x032f
        L_0x0381:
            int r6 = r6 + 1
            r7 = r11[r6]
            java.lang.Object r16 = r13.peek()
            java.lang.Double r16 = (java.lang.Double) r16
            double r16 = r16.doubleValue()
            int r29 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r29 <= 0) goto L_0x039d
            r7 = r11[r6]
            java.lang.Double r7 = java.lang.Double.valueOf(r7)
            r9.add(r7)
            goto L_0x032d
        L_0x039d:
            r7 = r11[r6]
            java.lang.Double r7 = java.lang.Double.valueOf(r7)
            r13.add(r7)
            goto L_0x032d
        L_0x03a7:
            r22 = r5
            double[] r5 = new double[r12]
            r11 = 0
        L_0x03ac:
            if (r11 >= r12) goto L_0x03ce
            int r6 = r11 + -25
            r7 = 0
            int r6 = java.lang.Math.max(r7, r6)
            int r7 = r12 + -1
            int r8 = r11 + 25
            int r7 = java.lang.Math.min(r7, r8)
            aiba r6 = defpackage.ahnz.a((double[]) r14, (int) r6, (int) r7)
            java.lang.Object r6 = r6.a
            java.lang.Double r6 = (java.lang.Double) r6
            double r6 = r6.doubleValue()
            r5[r11] = r6
            int r11 = r11 + 1
            goto L_0x03ac
        L_0x03ce:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r7 = 0
            r11 = 0
        L_0x03d5:
            r29 = 0
            if (r11 < r12) goto L_0x0836
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            int r5 = r6.size()
            r11 = 0
        L_0x03e3:
            if (r11 >= r5) goto L_0x041d
            java.lang.Object r7 = r6.get(r11)
            aiba r7 = (defpackage.aiba) r7
            java.lang.Object r9 = r7.a
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r9 = r14[r9]
            java.lang.Object r12 = r7.b
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r12 = r14[r12]
            double r9 = r9 - r12
            double r9 = java.lang.Math.abs(r9)
            r12 = 4594392195858285199(0x3fc28f5c28f5c28f, double:0.145)
            int r15 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r15 > 0) goto L_0x040e
        L_0x040d:
            goto L_0x041a
        L_0x040e:
            r12 = 4632937379169042432(0x404b800000000000, double:55.0)
            int r15 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r15 >= 0) goto L_0x040d
            r8.add(r7)
        L_0x041a:
            int r11 = r11 + 1
            goto L_0x03e3
        L_0x041d:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            int r6 = r8.size()
            r7 = 0
        L_0x0427:
            if (r7 < r6) goto L_0x0465
            int r3 = r8.size()
            int r4 = r5.size()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r7 = 58
            r6.<init>(r7)
            java.lang.String r7 = "Original segment: "
            r6.append(r7)
            r6.append(r3)
            java.lang.String r3 = ", Result segment: "
            r6.append(r3)
            r6.append(r4)
            r6.toString()
            int r3 = r8.size()
            int r4 = r5.size()
            int r3 = r3 - r4
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            aiba r3 = defpackage.aiba.a(r5, r3)
            r32 = r0
            r36 = r1
            r16 = r2
            r1 = 0
            goto L_0x0992
        L_0x0465:
            java.lang.Object r9 = r8.get(r7)
            r15 = r9
            aiba r15 = (defpackage.aiba) r15
            r9 = 0
            long r10 = r4.a((int) r9)
            java.lang.Object r12 = r15.a
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            long r12 = (long) r12
            long r16 = defpackage.ahnx.a
            long r12 = r12 * r16
            long r12 = r12 + r10
            long r10 = r4.a((int) r9)
            java.lang.Object r9 = r15.b
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r31 = r8
            long r8 = (long) r9
            long r16 = defpackage.ahnx.a
            long r8 = r8 * r16
            long r10 = r10 + r8
            r16 = 0
            r32 = 0
            r9 = r3
            r34 = r10
            r10 = r12
            r36 = r1
            r8 = r2
            r1 = r12
            r12 = r16
            r50 = r14
            r51 = r15
            r14 = r34
            r16 = r32
            ahyq r9 = r9.a(r10, r12, r14, r16)
            int r10 = r9.b
            r15 = 4
            if (r10 >= r15) goto L_0x04e4
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r10 = 82
            r9.<init>(r10)
            java.lang.String r10 = "Insufficient accelerometer readings, segment duration sec="
            r9.append(r10)
            r10 = r34
            long r10 = r10 - r1
            double r1 = (double) r10
            r10 = 4741671816366391296(0x41cdcd6500000000, double:1.0E9)
            java.lang.Double.isNaN(r1)
            double r1 = r1 / r10
            r9.append(r1)
            r9.toString()
            r32 = r0
            r35 = r4
            r1 = r5
            r17 = r6
            r0 = r7
            r16 = r8
            r4 = r37
            r9 = 3200000000(0xbebc2000, double:1.5810100667E-314)
            goto L_0x0821
        L_0x04e4:
            r10 = r34
            ahmm r12 = new ahmm
            r12.<init>()
            defpackage.ahmj.a(r12, r9)
            r9 = r51
            java.lang.Object r13 = r9.a
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            java.lang.Object r14 = r9.b
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            ahoa r15 = new ahoa
            r15.<init>()
            r17 = r6
            r16 = r8
            r8 = r50
            aiba r6 = defpackage.ahnz.a((double[]) r8, (int) r13, (int) r14)
            r32 = r0
            java.lang.Object r0 = r6.a
            java.lang.Double r0 = (java.lang.Double) r0
            float r0 = r0.floatValue()
            r15.a = r0
            java.lang.Object r0 = r6.a
            java.lang.Double r0 = (java.lang.Double) r0
            double r33 = r0.doubleValue()
            int r0 = (r33 > r29 ? 1 : (r33 == r29 ? 0 : -1))
            if (r0 >= 0) goto L_0x052a
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x052c
        L_0x052a:
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x052c:
            r15.b = r0
            java.lang.Object r0 = r6.b
            java.lang.Double r0 = (java.lang.Double) r0
            float r0 = r0.floatValue()
            r15.c = r0
            int r14 = r14 - r13
            r0 = 1
            int r14 = r14 + r0
            r0 = r7
            double r6 = (double) r14
            r33 = 4598175219545276416(0x3fd0000000000000, double:0.25)
            java.lang.Double.isNaN(r6)
            r35 = r4
            r14 = r5
            double r4 = r6 * r33
            int r4 = (int) r4
            int r4 = r4 + r13
            r33 = 4604930618986332160(0x3fe8000000000000, double:0.75)
            java.lang.Double.isNaN(r6)
            double r6 = r6 * r33
            int r5 = (int) r6
            int r13 = r13 + r5
            aiba r4 = defpackage.ahnz.a((double[]) r8, (int) r4, (int) r13)
            float r5 = r15.a
            float r5 = java.lang.Math.abs(r5)
            java.lang.Object r4 = r4.a
            java.lang.Double r4 = (java.lang.Double) r4
            double r6 = r4.doubleValue()
            double r6 = java.lang.Math.abs(r6)
            float r4 = (float) r6
            float r5 = r5 - r4
            r15.d = r5
            r4 = r37
            ahob r5 = r4.c
            float[] r6 = r12.a()
            r7 = 4
            float[] r12 = new float[r7]
            float r7 = r15.a
            r13 = 0
            r12[r13] = r7
            float r7 = r15.b
            r13 = 1
            r12[r13] = r7
            float r7 = r15.c
            r13 = 2
            r12[r13] = r7
            float r7 = r15.d
            r15 = 3
            r12[r15] = r7
            int r7 = r6.length
            int r15 = r7 + 4
            float[] r15 = new float[r15]
            r13 = 0
            java.lang.System.arraycopy(r6, r13, r15, r13, r7)
            r6 = 4
            java.lang.System.arraycopy(r12, r13, r15, r7, r6)
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            r7 = 0
        L_0x059e:
            ahmu r12 = r5.a
            int r12 = r12.a()
            if (r7 >= r12) goto L_0x05d9
            ahmu r12 = r5.a
            ahms r12 = r12.a(r7, r15)
            java.lang.Comparable r13 = r12.a
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            boolean r33 = r6.containsKey(r13)
            if (r33 == 0) goto L_0x05c9
            java.lang.Object r33 = r6.get(r13)
            java.lang.Float r33 = (java.lang.Float) r33
            float r33 = r33.floatValue()
            goto L_0x05cb
        L_0x05c9:
            r33 = 0
        L_0x05cb:
            float r12 = r12.b
            float r33 = r33 + r12
            java.lang.Float r12 = java.lang.Float.valueOf(r33)
            r6.put(r13, r12)
            int r7 = r7 + 1
            goto L_0x059e
        L_0x05d9:
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
            r7 = 0
            r12 = 0
        L_0x05e3:
            boolean r13 = r6.hasNext()
            if (r13 == 0) goto L_0x0614
            java.lang.Object r13 = r6.next()
            java.util.Map$Entry r13 = (java.util.Map.Entry) r13
            java.lang.Object r15 = r13.getValue()
            java.lang.Float r15 = (java.lang.Float) r15
            float r15 = r15.floatValue()
            int r15 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r15 >= 0) goto L_0x0612
            java.lang.Object r7 = r13.getValue()
            java.lang.Float r7 = (java.lang.Float) r7
            float r12 = r7.floatValue()
            java.lang.Object r7 = r13.getKey()
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            goto L_0x05e3
        L_0x0612:
            goto L_0x05e3
        L_0x0614:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
            r15 = 1120403456(0x42c80000, float:100.0)
            float r12 = r12 * r15
            ahmu r5 = r5.a
            int r5 = r5.a()
            float r5 = (float) r5
            float r12 = r12 / r5
            int r5 = java.lang.Math.round(r12)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            aiba r5 = defpackage.aiba.a(r6, r5)
            java.lang.Object r6 = r9.a
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r6 = r8[r6]
            java.lang.Object r12 = r9.b
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r12 = r8[r12]
            double r12 = defpackage.ahny.a(r12)
            double r6 = defpackage.ahny.a(r6)
            double r12 = r12 - r6
            float r6 = (float) r12
            boolean r7 = java.lang.Float.isNaN(r6)
            if (r7 == 0) goto L_0x0686
            java.lang.Object r7 = r9.a
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r12 = r8[r7]
            java.lang.Object r7 = r9.b
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r9 = r14
            r14 = r8[r7]
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r50 = r8
            r8 = 83
            r7.<init>(r8)
            java.lang.String r8 = "altitudeDiff is NaN. baro1="
            r7.append(r8)
            r7.append(r12)
            java.lang.String r8 = ", baro2="
            r7.append(r8)
            r7.append(r14)
            r7.toString()
            goto L_0x0689
        L_0x0686:
            r50 = r8
            r9 = r14
        L_0x0689:
            ahnw r7 = new ahnw
            java.lang.Object r8 = r5.a
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r43 = r8.intValue()
            java.lang.Object r8 = r5.b
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r49 = r8.intValue()
            r42 = r7
            r44 = r1
            r46 = r10
            r48 = r6
            r42.<init>(r43, r44, r46, r48, r49)
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r8 = java.lang.String.valueOf(r7)
            int r8 = r8.length()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            int r8 = r8 + 10
            r12.<init>(r8)
            java.lang.String r8 = "activity: "
            r12.append(r8)
            r12.append(r7)
            r12.toString()
            java.lang.Object r7 = r5.a
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            int r8 = r3.a((long) r1)
            if (r8 >= 0) goto L_0x06d5
            int r8 = -r8
            int r8 = r8 + -1
        L_0x06d5:
            int r12 = r3.a((long) r10)
            if (r12 >= 0) goto L_0x06de
            int r12 = -r12
            int r12 = r12 + -2
        L_0x06de:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            aiba r8 = defpackage.aiba.a(r8, r12)
            java.lang.Object r12 = r8.a
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            java.lang.Object r8 = r8.b
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            java.util.ArrayList r13 = new java.util.ArrayList
            r14 = 3
            r13.<init>(r14)
            r15 = r12
            r12 = 1
        L_0x0702:
            r33 = 1600000000(0x5f5e1000, double:7.905050333E-315)
            if (r12 <= r14) goto L_0x0715
            r37 = r5
            r48 = r6
            r46 = r10
            r11 = r9
            r9 = 3200000000(0xbebc2000, double:1.5810100667E-314)
            goto L_0x0773
        L_0x0715:
            r14 = r15
        L_0x0716:
            if (r14 <= 0) goto L_0x073b
            long r42 = r3.a((int) r14)
            r37 = r5
            r48 = r6
            long r5 = (long) r12
            r46 = r10
            r11 = r9
            r9 = 3200000000(0xbebc2000, double:1.5810100667E-314)
            long r5 = r5 * r9
            long r5 = r1 - r5
            int r38 = (r42 > r5 ? 1 : (r42 == r5 ? 0 : -1))
            if (r38 <= 0) goto L_0x0747
            int r14 = r14 + -1
            r9 = r11
            r5 = r37
            r10 = r46
            r6 = r48
            goto L_0x0716
        L_0x073b:
            r37 = r5
            r48 = r6
            r46 = r10
            r11 = r9
            r9 = 3200000000(0xbebc2000, double:1.5810100667E-314)
        L_0x0747:
            if (r14 >= r15) goto L_0x0773
            int r5 = r15 + -1
            long r5 = r3.a((int) r5)
            long r38 = r3.a((int) r14)
            long r5 = r5 - r38
            int r38 = (r5 > r33 ? 1 : (r5 == r33 ? 0 : -1))
            if (r38 < 0) goto L_0x0773
            ahmz r5 = r4.b
            int r15 = r15 - r14
            ahyq r6 = r3.b(r14, r15)
            java.util.List r5 = r5.a(r6)
            r13.add(r5)
            int r12 = r12 + 1
            r9 = r11
            r15 = r14
            r5 = r37
            r10 = r46
            r6 = r48
            r14 = 3
            goto L_0x0702
        L_0x0773:
            java.util.ArrayList r5 = new java.util.ArrayList
            r15 = 3
            r5.<init>(r15)
            r6 = 1
            int r8 = r8 + r6
            r6 = 1
        L_0x077c:
            if (r6 <= r15) goto L_0x077f
            goto L_0x07bb
        L_0x077f:
            r12 = r8
        L_0x0780:
            int r14 = r3.b
            if (r12 >= r14) goto L_0x0795
            long r38 = r3.a((int) r12)
            long r14 = (long) r6
            long r14 = r14 * r9
            long r14 = r46 + r14
            int r42 = (r38 > r14 ? 1 : (r38 == r14 ? 0 : -1))
            if (r42 >= 0) goto L_0x0795
            int r12 = r12 + 1
            r15 = 3
            goto L_0x0780
        L_0x0795:
            if (r8 >= r12) goto L_0x07bb
            int r14 = r12 + -1
            long r14 = r3.a((int) r14)
            long r38 = r3.a((int) r8)
            long r14 = r14 - r38
            int r38 = (r14 > r33 ? 1 : (r14 == r33 ? 0 : -1))
            if (r38 < 0) goto L_0x07bb
            ahmz r14 = r4.b
            int r15 = r12 - r8
            ahyq r8 = r3.b(r8, r15)
            java.util.List r8 = r14.a(r8)
            r5.add(r8)
            int r6 = r6 + 1
            r8 = r12
            r15 = 3
            goto L_0x077c
        L_0x07bb:
            aiba r6 = defpackage.ahoc.a((int) r7)
            java.lang.Object r7 = r6.a
            ahoc r7 = (defpackage.ahoc) r7
            java.lang.Object r6 = r6.b
            ahoc r6 = (defpackage.ahoc) r6
            boolean r8 = r13.isEmpty()
            if (r8 != 0) goto L_0x07d2
            double r7 = r7.a((java.util.List) r13)
            goto L_0x07d4
        L_0x07d2:
            r7 = r29
        L_0x07d4:
            boolean r12 = r5.isEmpty()
            if (r12 != 0) goto L_0x07df
            double r5 = r6.a((java.util.List) r5)
            goto L_0x07e1
        L_0x07df:
            r5 = r29
        L_0x07e1:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r13 = 85
            r12.<init>(r13)
            java.lang.String r13 = "likelihoodBefore: "
            r12.append(r13)
            r12.append(r7)
            java.lang.String r13 = ", likelihoodAfter: "
            r12.append(r13)
            r12.append(r5)
            r12.toString()
            double r7 = r7 + r5
            int r5 = (r7 > r29 ? 1 : (r7 == r29 ? 0 : -1))
            if (r5 < 0) goto L_0x0820
            ahnw r5 = new ahnw
            r6 = r37
            java.lang.Object r7 = r6.a
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r43 = r7.intValue()
            java.lang.Object r6 = r6.b
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r49 = r6.intValue()
            r42 = r5
            r44 = r1
            r42.<init>(r43, r44, r46, r48, r49)
            r1 = r11
            r1.add(r5)
            goto L_0x0821
        L_0x0820:
            r1 = r11
        L_0x0821:
            int r7 = r0 + 1
            r5 = r1
            r37 = r4
            r2 = r16
            r6 = r17
            r8 = r31
            r0 = r32
            r4 = r35
            r1 = r36
            r14 = r50
            goto L_0x0427
        L_0x0836:
            r32 = r0
            r36 = r1
            r16 = r2
            r35 = r4
            r50 = r14
            r4 = r37
            r9 = 3200000000(0xbebc2000, double:1.5810100667E-314)
            r0 = r5[r11]
            double r0 = java.lang.Math.abs(r0)
            r13 = 4563407430421976187(0x3f547ae147ae147b, double:0.00125)
            int r2 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r2 > 0) goto L_0x0858
            goto L_0x08e5
        L_0x0858:
            if (r11 == 0) goto L_0x0867
            int r0 = r11 + -1
            r0 = r5[r0]
            double r0 = java.lang.Math.abs(r0)
            int r2 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r2 <= 0) goto L_0x0867
            goto L_0x0869
        L_0x0867:
            r7 = r11
        L_0x0869:
            int r0 = r12 + -1
            if (r11 == r0) goto L_0x0883
            int r0 = r11 + 1
            r1 = r5[r0]
            double r1 = java.lang.Math.abs(r1)
            int r8 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r8 <= 0) goto L_0x0883
            r1 = r5[r11]
            r13 = r5[r0]
            double r1 = r1 * r13
            int r0 = (r1 > r29 ? 1 : (r1 == r29 ? 0 : -1))
            if (r0 >= 0) goto L_0x08e5
        L_0x0883:
            int r0 = r11 - r7
            r1 = 48
            if (r0 <= r1) goto L_0x08e5
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x089c
            int r0 = r6.size()
            int r0 = r0 + -1
            java.lang.Object r0 = r6.get(r0)
            aiba r0 = (defpackage.aiba) r0
            goto L_0x089d
        L_0x089c:
            r0 = 0
        L_0x089d:
            if (r0 == 0) goto L_0x08d6
            java.lang.Object r1 = r0.b
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r1 = r5[r1]
            r13 = r5[r7]
            double r1 = r1 * r13
            int r8 = (r1 > r29 ? 1 : (r1 == r29 ? 0 : -1))
            if (r8 <= 0) goto L_0x08d6
            java.lang.Object r1 = r0.b
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            int r1 = r7 - r1
            r2 = 24
            if (r1 < r2) goto L_0x08c0
            goto L_0x08d6
        L_0x08c0:
            int r1 = r6.size()
            int r1 = r1 + -1
            java.lang.Object r0 = r0.a
            java.lang.Integer r0 = (java.lang.Integer) r0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
            aiba r0 = defpackage.aiba.a(r0, r2)
            r6.set(r1, r0)
            goto L_0x08e5
        L_0x08d6:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            aiba r0 = defpackage.aiba.a(r0, r1)
            r6.add(r0)
        L_0x08e5:
            int r11 = r11 + 1
            r37 = r4
            r2 = r16
            r0 = r32
            r4 = r35
            r1 = r36
            r14 = r50
            goto L_0x03d5
        L_0x08f5:
            r32 = r0
            r36 = r1
            r16 = r2
            r35 = r4
            r22 = r5
            r0 = r9
            r4 = r37
            r2 = 2
            r9 = 3200000000(0xbebc2000, double:1.5810100667E-314)
            r5 = r35
            r6 = 0
            long r7 = r5.a((int) r6)
            r6 = r3
            long r2 = (long) r13
            long r2 = r2 * r0
            long r7 = r7 + r2
        L_0x0914:
            int r2 = r5.b
            int r2 = r2 + -1
            if (r14 >= r2) goto L_0x0926
            long r2 = r5.a((int) r14)
            int r15 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r15 < 0) goto L_0x0923
            goto L_0x0926
        L_0x0923:
            int r14 = r14 + 1
            goto L_0x0914
        L_0x0926:
            long r2 = r5.a((int) r14)
            int r15 = r14 + -1
            long r29 = r5.a((int) r15)
            int r17 = (r2 > r29 ? 1 : (r2 == r29 ? 0 : -1))
            if (r17 != 0) goto L_0x094b
            r2 = 0
            float r3 = r5.a(r14, r2)
            float r7 = r5.a(r15, r2)
            float r3 = r3 + r7
            double r7 = (double) r3
            r29 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            java.lang.Double.isNaN(r7)
            double r7 = r7 * r29
            r11[r13] = r7
            r33 = r0
            goto L_0x0968
        L_0x094b:
            r9 = 0
            float r10 = r5.a(r15, r9)
            r33 = r0
            long r0 = r2 - r7
            float r0 = (float) r0
            float r10 = r10 * r0
            float r0 = r5.a(r14, r9)
            long r7 = r7 - r29
            float r1 = (float) r7
            float r0 = r0 * r1
            float r10 = r10 + r0
            long r2 = r2 - r29
            float r0 = (float) r2
            float r10 = r10 / r0
            double r0 = (double) r10
            r11[r13] = r0
        L_0x0968:
            int r13 = r13 + 1
            r37 = r4
            r4 = r5
            r3 = r6
            r2 = r16
            r5 = r22
            r0 = r32
            r9 = r33
            r1 = r36
            r7 = 0
            r8 = 1120403456(0x42c80000, float:100.0)
            goto L_0x02af
        L_0x097d:
            r32 = r0
            r36 = r1
            r16 = r2
            r22 = r5
            java.util.List r0 = java.util.Collections.emptyList()
            r1 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            aiba r3 = defpackage.aiba.a(r0, r2)
        L_0x0992:
            java.lang.Object r0 = r3.a
            java.util.Collection r0 = (java.util.Collection) r0
            r2 = r32
            r2.addAll(r0)
            java.lang.Object r0 = r3.b
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r11 = r0.intValue()
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x09da
            int r0 = r2.size()
            int r0 = r0 + -1
            java.lang.Object r0 = r2.get(r0)
            ahnw r0 = (defpackage.ahnw) r0
            long r3 = r0.c
            r5 = 2000000000(0x77359400, double:9.881312917E-315)
            long r3 = r3 + r5
            r5 = r40
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x09d5
            long r3 = r0.b
            r5 = -2000000000(0xffffffff88ca6c00, double:NaN)
            long r3 = r3 + r5
            r0 = r16
            r0.d = r3
            int r3 = r2.size()
            int r3 = r3 + -1
            r2.remove(r3)
            goto L_0x09e7
        L_0x09d5:
            r0 = r16
            r0.d = r3
            goto L_0x09e7
        L_0x09da:
            r0 = r16
            r5 = r40
            r3 = -5000000000(0xfffffffed5fa0e00, double:NaN)
            long r14 = r5 + r3
            r0.d = r14
        L_0x09e7:
            r3 = r2
            r2 = r59
            int r4 = r2.b
            int r4 = r4 + -1
            long r4 = r2.a((int) r4)
            r6 = r60
            r7 = 3
            int r8 = r6.b
            int r8 = r8 + -1
            long r8 = r6.a((int) r8)
            long r4 = java.lang.Math.max(r4, r8)
            int r6 = r3.size()
            r8 = 0
        L_0x0a06:
            if (r8 >= r6) goto L_0x0a5f
            java.lang.Object r9 = r3.get(r8)
            ahnw r9 = (defpackage.ahnw) r9
            long r12 = r9.b
            long r12 = r4 - r12
            long r12 = r12 / r20
            long r14 = r9.c
            long r14 = r4 - r14
            long r14 = r14 / r20
            long r45 = r55 - r12
            long r49 = r57 - r12
            long r47 = r55 - r14
            long r51 = r57 - r14
            int r10 = r9.a
            switch(r10) {
                case 1: goto L_0x0a46;
                case 2: goto L_0x0a46;
                case 3: goto L_0x0a43;
                case 4: goto L_0x0a43;
                case 5: goto L_0x0a40;
                case 6: goto L_0x0a40;
                default: goto L_0x0a27;
            }
        L_0x0a27:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 47
            r1.<init>(r2)
            java.lang.String r2 = "Unknown floor change activity type: "
            r1.append(r2)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0a40:
            r43 = 3
            goto L_0x0a48
        L_0x0a43:
            r43 = 2
            goto L_0x0a48
        L_0x0a46:
            r43 = 1
        L_0x0a48:
            com.google.android.gms.location.FloorChangeEvent r10 = new com.google.android.gms.location.FloorChangeEvent
            int r12 = r9.e
            float r9 = r9.d
            r42 = r10
            r44 = r12
            r53 = r9
            r42.<init>(r43, r44, r45, r47, r49, r51, r53)
            r9 = r36
            r9.add(r10)
            int r8 = r8 + 1
            goto L_0x0a06
        L_0x0a5f:
            r9 = r36
            r17 = r11
            goto L_0x0a89
        L_0x0a64:
            r9 = r1
            r0 = r2
            r22 = r5
            r1 = 0
            r2 = r59
        L_0x0a6b:
            int r3 = r4.b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r5 = 94
            r4.<init>(r5)
            java.lang.String r5 = "No data for detection, trimmedAccelData.length="
            r4.append(r5)
            r4.append(r7)
            java.lang.String r5 = ", trimmedBaroData.length="
            r4.append(r5)
            r4.append(r3)
            r4.toString()
            r17 = 0
        L_0x0a89:
            boolean r3 = r9.isEmpty()
            if (r3 == 0) goto L_0x0a90
            goto L_0x0a95
        L_0x0a90:
            r3 = r28
            r3.a((java.util.List) r9)
        L_0x0a95:
            aicn r3 = r0.a
            long r4 = r0.c
            aicl r0 = new aicl
            aico r11 = defpackage.aico.FLOOR_CHANGE_DETECTION_DONE
            long r12 = r3.b()
            r15 = 0
            long r4 = r22 - r4
            r6 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            long r4 = r4 / r6
            int r5 = (int) r4
            r18 = -1
            java.lang.String r14 = "dataGapSec=%2$d numRejectedSegment=%3$d"
            r10 = r0
            r16 = r5
            r10.<init>(r11, r12, r14, r15, r16, r17, r18)
            r3.a((defpackage.aicl) r0)
            goto L_0x0ac7
        L_0x0ab7:
            r2 = r0
            r0 = r8
            r5 = r14
            r1 = 0
            r0.d = r5
            goto L_0x0ac7
        L_0x0abe:
            r2 = r0
            r25 = r5
            r1 = 0
            goto L_0x0ac7
        L_0x0ac3:
            r2 = r0
            r25 = r5
            r1 = 0
        L_0x0ac7:
            r6 = r54
            ahiw r0 = r6.b
            ahld r3 = r0.z
            if (r3 != 0) goto L_0x0ad5
            r2 = 3200000000(0xbebc2000, double:1.5810100667E-314)
            goto L_0x0afc
        L_0x0ad5:
            boolean r0 = r0.k
            if (r0 == 0) goto L_0x0af7
            r3 = 3200000000(0xbebc2000, double:1.5810100667E-314)
            ahyq r13 = defpackage.ahiw.a((defpackage.ahyq) r2, (long) r3)
            r0 = r61
            ahyq r14 = defpackage.ahiw.a((defpackage.ahyq) r0, (long) r3)
            ahiw r0 = r6.b
            ahld r7 = r0.z
            ahpe r8 = r0.l
            r2 = r3
            r9 = r55
            r11 = r57
            r7.a((defpackage.ahpe) r8, (long) r9, (long) r11, (defpackage.ahyq) r13, (defpackage.ahyq) r14)
            goto L_0x0afc
        L_0x0af7:
            r2 = 3200000000(0xbebc2000, double:1.5810100667E-314)
        L_0x0afc:
            r5 = r25
            int r0 = r5.b
            if (r0 != 0) goto L_0x0b11
            ahiw r0 = r6.b
            aicn r0 = r0.q
            defpackage.ahjb.a((defpackage.aicn) r0, (int) r1)
            java.lang.String r0 = "accel data is empty"
            ahip r0 = defpackage.ahip.a((java.lang.String) r0)
            goto L_0x0c3f
        L_0x0b11:
            int r0 = r0 + -1
            int r0 = r5.b(r0)
            float[][] r4 = r5.d
            int r4 = r4.length
            float[] r7 = new float[r4]
            r11 = 0
        L_0x0b1d:
            if (r11 < r4) goto L_0x0c47
            ahyr r4 = new ahyr
            long[] r8 = r5.c
            r9 = r8[r0]
            r4.<init>(r9, r7)
            ahiw r0 = r6.b
            ahyr r0 = r0.u
            if (r0 != 0) goto L_0x0b2f
            goto L_0x0b63
        L_0x0b2f:
            long r7 = r4.a
            long r9 = r0.a
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 != 0) goto L_0x0b63
            float[] r7 = r4.b
            int r7 = r7.length
            float[] r8 = r0.b
            int r8 = r8.length
            if (r7 != r8) goto L_0x0b63
            r11 = 0
        L_0x0b40:
            float[] r7 = r4.b
            int r8 = r7.length
            if (r11 >= r8) goto L_0x0b5a
            r7 = r7[r11]
            float[] r8 = r0.b
            r8 = r8[r11]
            float r7 = r7 - r8
            float r7 = java.lang.Math.abs(r7)
            r8 = 897988541(0x358637bd, float:1.0E-6)
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 > 0) goto L_0x0b63
            int r11 = r11 + 1
            goto L_0x0b40
        L_0x0b5a:
            java.lang.String r0 = "same accel data as previous one"
            ahip r0 = defpackage.ahip.a((java.lang.String) r0)
            goto L_0x0c3f
        L_0x0b63:
            ahiw r0 = r6.b
            r0.u = r4
            java.util.Locale r0 = java.util.Locale.ENGLISH
            r8 = 2
            java.lang.Object[] r0 = new java.lang.Object[r8]
            int r4 = r5.b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0[r1] = r4
            int r4 = r5.b
            int r4 = r4 + -1
            long r7 = r5.a((int) r4)
            long r9 = r5.a((int) r1)
            long r7 = r7 - r9
            double r7 = (double) r7
            r9 = 4472406533629990549(0x3e112e0be826d695, double:1.0E-9)
            java.lang.Double.isNaN(r7)
            double r7 = r7 * r9
            java.lang.Double r4 = java.lang.Double.valueOf(r7)
            r9 = 1
            r0[r9] = r4
            ahiw r0 = r6.b
            ahnc r0 = r0.g
            if (r0 == 0) goto L_0x0c0c
            int r0 = r5.b
            int r0 = r0 + -1
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L_0x0ba2:
            if (r0 >= 0) goto L_0x0bfe
            int r0 = r7.size()
            int r0 = r0 + -1
            r8 = r0
            r9 = 0
            r11 = 0
        L_0x0bad:
            if (r8 >= 0) goto L_0x0bc3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 76
            r0.<init>(r1)
            java.lang.String r1 = "Number of times phone position detection was run for this batch: "
            r0.append(r1)
            r0.append(r9)
            r0.toString()
            r14 = r5
            goto L_0x0c0d
        L_0x0bc3:
            java.lang.Object r0 = r7.get(r8)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r10 = r0.intValue()
            int r0 = r10 + 1
            int r0 = r0 - r11
            ahyq r12 = r5.b(r11, r0)
            int r0 = r12.b
            r13 = 4
            if (r0 < r13) goto L_0x0bf8
            int r0 = r5.b
            int r0 = r0 + -1
            long r0 = r5.a((int) r0)
            long r2 = r5.a((int) r11)
            long r0 = r0 - r2
            long r0 = r0 / r20
            long r2 = r55 - r0
            long r14 = r57 - r0
            r0 = r54
            r1 = r2
            r3 = r14
            r14 = r5
            r5 = r12
            r0.c(r1, r3, r5)
            int r9 = r9 + 1
            goto L_0x0bf9
        L_0x0bf8:
            r14 = r5
        L_0x0bf9:
            int r8 = r8 + -1
            r11 = r10
            r5 = r14
            goto L_0x0bad
        L_0x0bfe:
            r14 = r5
            r13 = 4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r7.add(r4)
            int r0 = defpackage.ahil.a((defpackage.ahyq) r14, (int) r0, (long) r2)
            goto L_0x0ba2
        L_0x0c0c:
            r14 = r5
        L_0x0c0d:
            ahip r0 = defpackage.ahip.c
            ahiw r1 = r6.b
            ahko r1 = r1.h
            if (r1 != 0) goto L_0x0c17
            r7 = r0
            goto L_0x0c23
        L_0x0c17:
            r0 = r54
            r1 = r55
            r3 = r57
            r5 = r14
            ahip r0 = r0.b(r1, r3, r5)
            r7 = r0
        L_0x0c23:
            ahip r0 = defpackage.ahip.c
            ahiw r1 = r6.b
            ahil r1 = r1.d
            if (r1 != 0) goto L_0x0c2c
            goto L_0x0c3b
        L_0x0c2c:
            boolean r1 = r1.c
            if (r1 == 0) goto L_0x0c3b
            r0 = r54
            r1 = r55
            r3 = r57
            r5 = r14
            ahip r0 = r0.a(r1, r3, r5)
        L_0x0c3b:
            ahip r0 = defpackage.ahis.a((defpackage.ahip) r7, (defpackage.ahip) r0)
        L_0x0c3f:
            ahiw r1 = r6.b
            ahiq r1 = r1.e
            r1.a((defpackage.ahip) r0)
            return
        L_0x0c47:
            r14 = r5
            r8 = 2
            r9 = 1
            r13 = 4
            float[][] r5 = r14.d
            r5 = r5[r11]
            r5 = r5[r0]
            r7[r11] = r5
            int r11 = r11 + 1
            r5 = r14
            goto L_0x0b1d
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahiv.a(long, long, ahyq, ahyq, ahyq):void");
    }
}
