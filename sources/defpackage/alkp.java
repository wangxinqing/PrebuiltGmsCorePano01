package defpackage;

/* renamed from: alkp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alkp {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.atdd a(com.google.android.ulr.ApiReadingInfo r16) {
        /*
            r0 = 0
            if (r16 == 0) goto L_0x03aa
            atdd r1 = defpackage.atdd.g
            aucd r1 = r1.o()
            java.lang.String r2 = r16.d()
            r4 = 9
            r5 = -1
            r6 = 6
            r7 = 5
            r8 = 3
            r9 = 4
            r10 = 2
            r11 = 8
            r12 = 1
            r13 = 0
            if (r2 == 0) goto L_0x017e
            java.lang.String r2 = r16.d()
            int r14 = r2.hashCode()
            switch(r14) {
                case -2028086330: goto L_0x00b3;
                case -1081415738: goto L_0x00a8;
                case -284840886: goto L_0x009e;
                case -37081408: goto L_0x0093;
                case 70794: goto L_0x0089;
                case 102570: goto L_0x007f;
                case 2064738: goto L_0x0075;
                case 2664213: goto L_0x006b;
                case 3049826: goto L_0x0061;
                case 3649301: goto L_0x0057;
                case 433141802: goto L_0x004c;
                case 1453039593: goto L_0x0040;
                case 1926238405: goto L_0x0034;
                case 1950135342: goto L_0x0028;
                default: goto L_0x0026;
            }
        L_0x0026:
            goto L_0x00be
        L_0x0028:
            java.lang.String r14 = "visitArrival"
            boolean r2 = r2.equals(r14)
            if (r2 == 0) goto L_0x00be
            r2 = 11
            goto L_0x00bf
        L_0x0034:
            java.lang.String r14 = "VISIT_ARRIVAL"
            boolean r2 = r2.equals(r14)
            if (r2 == 0) goto L_0x00be
            r2 = 10
            goto L_0x00bf
        L_0x0040:
            java.lang.String r14 = "visitDeparture"
            boolean r2 = r2.equals(r14)
            if (r2 == 0) goto L_0x00be
            r2 = 13
            goto L_0x00bf
        L_0x004c:
            java.lang.String r14 = "UNKNOWN"
            boolean r2 = r2.equals(r14)
            if (r2 == 0) goto L_0x00be
            r2 = 6
            goto L_0x00bf
        L_0x0057:
            java.lang.String r14 = "wifi"
            boolean r2 = r2.equals(r14)
            if (r2 == 0) goto L_0x00be
            r2 = 1
            goto L_0x00bf
        L_0x0061:
            java.lang.String r14 = "cell"
            boolean r2 = r2.equals(r14)
            if (r2 == 0) goto L_0x00be
            r2 = 3
            goto L_0x00bf
        L_0x006b:
            java.lang.String r14 = "WIFI"
            boolean r2 = r2.equals(r14)
            if (r2 == 0) goto L_0x00be
            r2 = 0
            goto L_0x00bf
        L_0x0075:
            java.lang.String r14 = "CELL"
            boolean r2 = r2.equals(r14)
            if (r2 == 0) goto L_0x00be
            r2 = 2
            goto L_0x00bf
        L_0x007f:
            java.lang.String r14 = "gps"
            boolean r2 = r2.equals(r14)
            if (r2 == 0) goto L_0x00be
            r2 = 5
            goto L_0x00bf
        L_0x0089:
            java.lang.String r14 = "GPS"
            boolean r2 = r2.equals(r14)
            if (r2 == 0) goto L_0x00be
            r2 = 4
            goto L_0x00bf
        L_0x0093:
            java.lang.String r14 = "VISIT_DEPARTURE"
            boolean r2 = r2.equals(r14)
            if (r2 == 0) goto L_0x00be
            r2 = 12
            goto L_0x00bf
        L_0x009e:
            java.lang.String r14 = "unknown"
            boolean r2 = r2.equals(r14)
            if (r2 == 0) goto L_0x00be
            r2 = 7
            goto L_0x00bf
        L_0x00a8:
            java.lang.String r14 = "manual"
            boolean r2 = r2.equals(r14)
            if (r2 == 0) goto L_0x00be
            r2 = 9
            goto L_0x00bf
        L_0x00b3:
            java.lang.String r14 = "MANUAL"
            boolean r2 = r2.equals(r14)
            if (r2 == 0) goto L_0x00be
            r2 = 8
            goto L_0x00bf
        L_0x00be:
            r2 = -1
        L_0x00bf:
            switch(r2) {
                case 0: goto L_0x0160;
                case 1: goto L_0x0160;
                case 2: goto L_0x014a;
                case 3: goto L_0x014a;
                case 4: goto L_0x0134;
                case 5: goto L_0x0134;
                case 6: goto L_0x011e;
                case 7: goto L_0x011e;
                case 8: goto L_0x0108;
                case 9: goto L_0x0108;
                case 10: goto L_0x00f1;
                case 11: goto L_0x00f1;
                case 12: goto L_0x00db;
                case 13: goto L_0x00db;
                default: goto L_0x00c2;
            }
        L_0x00c2:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r16.d()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "Json2LiteBadEnum userlocation.ApiReadingInfo.source "
            int r3 = r1.length()
            if (r3 != 0) goto L_0x0176
            java.lang.String r1 = new java.lang.String
            r1.<init>(r2)
            goto L_0x017a
        L_0x00db:
            boolean r2 = r1.c
            if (r2 == 0) goto L_0x00e4
            r1.c()
            r1.c = r13
        L_0x00e4:
            aucj r2 = r1.b
            atdd r2 = (defpackage.atdd) r2
            r2.b = r6
            int r14 = r2.a
            r14 = r14 | r12
            r2.a = r14
            goto L_0x017e
        L_0x00f1:
            boolean r2 = r1.c
            if (r2 != 0) goto L_0x00f6
            goto L_0x00fb
        L_0x00f6:
            r1.c()
            r1.c = r13
        L_0x00fb:
            aucj r2 = r1.b
            atdd r2 = (defpackage.atdd) r2
            r2.b = r7
            int r14 = r2.a
            r14 = r14 | r12
            r2.a = r14
            goto L_0x017e
        L_0x0108:
            boolean r2 = r1.c
            if (r2 != 0) goto L_0x010d
            goto L_0x0112
        L_0x010d:
            r1.c()
            r1.c = r13
        L_0x0112:
            aucj r2 = r1.b
            atdd r2 = (defpackage.atdd) r2
            r2.b = r9
            int r14 = r2.a
            r14 = r14 | r12
            r2.a = r14
            goto L_0x017e
        L_0x011e:
            boolean r2 = r1.c
            if (r2 != 0) goto L_0x0123
            goto L_0x0128
        L_0x0123:
            r1.c()
            r1.c = r13
        L_0x0128:
            aucj r2 = r1.b
            atdd r2 = (defpackage.atdd) r2
            r2.b = r8
            int r14 = r2.a
            r14 = r14 | r12
            r2.a = r14
            goto L_0x017e
        L_0x0134:
            boolean r2 = r1.c
            if (r2 != 0) goto L_0x0139
            goto L_0x013e
        L_0x0139:
            r1.c()
            r1.c = r13
        L_0x013e:
            aucj r2 = r1.b
            atdd r2 = (defpackage.atdd) r2
            r2.b = r10
            int r14 = r2.a
            r14 = r14 | r12
            r2.a = r14
            goto L_0x017e
        L_0x014a:
            boolean r2 = r1.c
            if (r2 != 0) goto L_0x014f
            goto L_0x0154
        L_0x014f:
            r1.c()
            r1.c = r13
        L_0x0154:
            aucj r2 = r1.b
            atdd r2 = (defpackage.atdd) r2
            r2.b = r12
            int r14 = r2.a
            r14 = r14 | r12
            r2.a = r14
            goto L_0x017e
        L_0x0160:
            boolean r2 = r1.c
            if (r2 != 0) goto L_0x0165
            goto L_0x016a
        L_0x0165:
            r1.c()
            r1.c = r13
        L_0x016a:
            aucj r2 = r1.b
            atdd r2 = (defpackage.atdd) r2
            r2.b = r13
            int r14 = r2.a
            r14 = r14 | r12
            r2.a = r14
            goto L_0x017e
        L_0x0176:
            java.lang.String r1 = r2.concat(r1)
        L_0x017a:
            r0.<init>(r1)
            throw r0
        L_0x017e:
            java.lang.Integer r2 = r16.c()
            if (r2 == 0) goto L_0x01a1
            java.lang.Integer r2 = r16.c()
            int r2 = r2.intValue()
            boolean r14 = r1.c
            if (r14 != 0) goto L_0x0191
            goto L_0x0196
        L_0x0191:
            r1.c()
            r1.c = r13
        L_0x0196:
            aucj r14 = r1.b
            atdd r14 = (defpackage.atdd) r14
            int r15 = r14.a
            r15 = r15 | r10
            r14.a = r15
            r14.c = r2
        L_0x01a1:
            java.lang.Boolean r2 = r16.b()
            if (r2 == 0) goto L_0x01c4
            java.lang.Boolean r2 = r16.b()
            boolean r2 = r2.booleanValue()
            boolean r14 = r1.c
            if (r14 != 0) goto L_0x01b4
            goto L_0x01b9
        L_0x01b4:
            r1.c()
            r1.c = r13
        L_0x01b9:
            aucj r14 = r1.b
            atdd r14 = (defpackage.atdd) r14
            int r15 = r14.a
            r15 = r15 | r9
            r14.a = r15
            r14.d = r2
        L_0x01c4:
            com.google.android.ulr.ApiBatteryCondition r2 = r16.getBatteryCondition()
            if (r2 == 0) goto L_0x036a
            com.google.android.ulr.ApiBatteryCondition r2 = r16.getBatteryCondition()
            if (r2 == 0) goto L_0x0351
            atbt r0 = defpackage.atbt.f
            aucd r0 = r0.o()
            java.lang.Integer r14 = r2.d()
            if (r14 == 0) goto L_0x01f9
            java.lang.Integer r14 = r2.d()
            int r14 = r14.intValue()
            boolean r15 = r0.c
            if (r15 != 0) goto L_0x01e9
            goto L_0x01ee
        L_0x01e9:
            r0.c()
            r0.c = r13
        L_0x01ee:
            aucj r15 = r0.b
            atbt r15 = (defpackage.atbt) r15
            int r3 = r15.a
            r3 = r3 | r12
            r15.a = r3
            r15.b = r14
        L_0x01f9:
            java.lang.Integer r3 = r2.c()
            if (r3 == 0) goto L_0x021c
            java.lang.Integer r3 = r2.c()
            int r3 = r3.intValue()
            boolean r14 = r0.c
            if (r14 != 0) goto L_0x020c
            goto L_0x0211
        L_0x020c:
            r0.c()
            r0.c = r13
        L_0x0211:
            aucj r14 = r0.b
            atbt r14 = (defpackage.atbt) r14
            int r15 = r14.a
            r15 = r15 | r10
            r14.a = r15
            r14.c = r3
        L_0x021c:
            java.lang.Integer r3 = r2.e()
            if (r3 == 0) goto L_0x023f
            java.lang.Integer r3 = r2.e()
            int r3 = r3.intValue()
            boolean r14 = r0.c
            if (r14 != 0) goto L_0x022f
            goto L_0x0234
        L_0x022f:
            r0.c()
            r0.c = r13
        L_0x0234:
            aucj r14 = r0.b
            atbt r14 = (defpackage.atbt) r14
            int r15 = r14.a
            r15 = r15 | r9
            r14.a = r15
            r14.d = r3
        L_0x023f:
            java.lang.String r3 = r2.b()
            if (r3 == 0) goto L_0x034a
            java.lang.String r3 = r2.b()
            int r14 = r3.hashCode()
            switch(r14) {
                case -1000044642: goto L_0x02ae;
                case -217417826: goto L_0x02a4;
                case -59691395: goto L_0x029a;
                case 2082: goto L_0x0290;
                case 3106: goto L_0x0286;
                case 84324: goto L_0x027c;
                case 116100: goto L_0x0272;
                case 264166118: goto L_0x0267;
                case 1238730971: goto L_0x025c;
                case 1855123044: goto L_0x0252;
                default: goto L_0x0250;
            }
        L_0x0250:
            goto L_0x02b8
        L_0x0252:
            java.lang.String r4 = "notCharging"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x02b8
            r3 = 1
            goto L_0x02b9
        L_0x025c:
            java.lang.String r6 = "unknownCharging"
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L_0x02b8
            r3 = 9
            goto L_0x02b9
        L_0x0267:
            java.lang.String r4 = "UNKNOWN_CHARGING"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x02b8
            r3 = 8
            goto L_0x02b9
        L_0x0272:
            java.lang.String r4 = "usb"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x02b8
            r3 = 3
            goto L_0x02b9
        L_0x027c:
            java.lang.String r4 = "USB"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x02b8
            r3 = 2
            goto L_0x02b9
        L_0x0286:
            java.lang.String r4 = "ac"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x02b8
            r3 = 7
            goto L_0x02b9
        L_0x0290:
            java.lang.String r4 = "AC"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x02b8
            r3 = 6
            goto L_0x02b9
        L_0x029a:
            java.lang.String r4 = "NOT_CHARGING"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x02b8
            r3 = 0
            goto L_0x02b9
        L_0x02a4:
            java.lang.String r4 = "WIRELESS"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x02b8
            r3 = 4
            goto L_0x02b9
        L_0x02ae:
            java.lang.String r4 = "wireless"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x02b8
            r3 = 5
            goto L_0x02b9
        L_0x02b8:
            r3 = -1
        L_0x02b9:
            switch(r3) {
                case 0: goto L_0x032c;
                case 1: goto L_0x032c;
                case 2: goto L_0x0316;
                case 3: goto L_0x0316;
                case 4: goto L_0x0300;
                case 5: goto L_0x0300;
                case 6: goto L_0x02ea;
                case 7: goto L_0x02ea;
                case 8: goto L_0x02d5;
                case 9: goto L_0x02d5;
                default: goto L_0x02bc;
            }
        L_0x02bc:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r2.b()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "Json2LiteBadEnum userlocation.ApiBatteryCondition.charging "
            int r3 = r1.length()
            if (r3 != 0) goto L_0x0342
            java.lang.String r1 = new java.lang.String
            r1.<init>(r2)
            goto L_0x0346
        L_0x02d5:
            boolean r2 = r0.c
            if (r2 == 0) goto L_0x02de
            r0.c()
            r0.c = r13
        L_0x02de:
            aucj r2 = r0.b
            atbt r2 = (defpackage.atbt) r2
            r2.e = r9
            int r3 = r2.a
            r3 = r3 | r11
            r2.a = r3
            goto L_0x034a
        L_0x02ea:
            boolean r2 = r0.c
            if (r2 != 0) goto L_0x02ef
            goto L_0x02f4
        L_0x02ef:
            r0.c()
            r0.c = r13
        L_0x02f4:
            aucj r2 = r0.b
            atbt r2 = (defpackage.atbt) r2
            r2.e = r8
            int r3 = r2.a
            r3 = r3 | r11
            r2.a = r3
            goto L_0x034a
        L_0x0300:
            boolean r2 = r0.c
            if (r2 != 0) goto L_0x0305
            goto L_0x030a
        L_0x0305:
            r0.c()
            r0.c = r13
        L_0x030a:
            aucj r2 = r0.b
            atbt r2 = (defpackage.atbt) r2
            r2.e = r10
            int r3 = r2.a
            r3 = r3 | r11
            r2.a = r3
            goto L_0x034a
        L_0x0316:
            boolean r2 = r0.c
            if (r2 != 0) goto L_0x031b
            goto L_0x0320
        L_0x031b:
            r0.c()
            r0.c = r13
        L_0x0320:
            aucj r2 = r0.b
            atbt r2 = (defpackage.atbt) r2
            r2.e = r12
            int r3 = r2.a
            r3 = r3 | r11
            r2.a = r3
            goto L_0x034a
        L_0x032c:
            boolean r2 = r0.c
            if (r2 != 0) goto L_0x0331
            goto L_0x0336
        L_0x0331:
            r0.c()
            r0.c = r13
        L_0x0336:
            aucj r2 = r0.b
            atbt r2 = (defpackage.atbt) r2
            r2.e = r13
            int r3 = r2.a
            r3 = r3 | r11
            r2.a = r3
            goto L_0x034a
        L_0x0342:
            java.lang.String r1 = r2.concat(r1)
        L_0x0346:
            r0.<init>(r1)
            throw r0
        L_0x034a:
            aucj r0 = r0.i()
            atbt r0 = (defpackage.atbt) r0
            goto L_0x0352
        L_0x0351:
        L_0x0352:
            boolean r2 = r1.c
            if (r2 != 0) goto L_0x0357
            goto L_0x035c
        L_0x0357:
            r1.c()
            r1.c = r13
        L_0x035c:
            aucj r2 = r1.b
            atdd r2 = (defpackage.atdd) r2
            r0.getClass()
            r2.e = r0
            int r0 = r2.a
            r0 = r0 | r11
            r2.a = r0
        L_0x036a:
            java.util.ArrayList r0 = r16.getWifiScans()
            if (r0 == 0) goto L_0x03a3
            java.util.ArrayList r0 = r16.getWifiScans()
            int r2 = r0.size()
            r3 = 0
        L_0x0379:
            if (r3 >= r2) goto L_0x03a3
            java.lang.Object r4 = r0.get(r3)
            com.google.android.ulr.WifiStrengthProto r4 = (com.google.android.ulr.WifiStrengthProto) r4
            if (r4 == 0) goto L_0x03a0
            aten r4 = defpackage.allb.a(r4)
            boolean r5 = r1.c
            if (r5 != 0) goto L_0x038c
            goto L_0x0391
        L_0x038c:
            r1.c()
            r1.c = r13
        L_0x0391:
            aucj r5 = r1.b
            atdd r5 = (defpackage.atdd) r5
            r4.getClass()
            r5.a()
            aucx r5 = r5.f
            r5.add(r4)
        L_0x03a0:
            int r3 = r3 + 1
            goto L_0x0379
        L_0x03a3:
            aucj r0 = r1.i()
            atdd r0 = (defpackage.atdd) r0
            return r0
        L_0x03aa:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alkp.a(com.google.android.ulr.ApiReadingInfo):atdd");
    }
}
