package defpackage;

/* renamed from: alkj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alkj {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.atbp a(com.google.android.ulr.ApiActivityTransitionEventRecord r16) {
        /*
            if (r16 == 0) goto L_0x03bb
            atbp r0 = defpackage.atbp.e
            aucd r0 = r0.o()
            java.lang.String r1 = r16.b()
            r3 = 4
            r6 = 1
            r7 = 0
            if (r1 == 0) goto L_0x0300
            java.lang.String r1 = r16.b()
            int r8 = r1.hashCode()
            r9 = 14
            r10 = 12
            r11 = 8
            r12 = 7
            r13 = 6
            r14 = 9
            r15 = 10
            r2 = 5
            r5 = 13
            r4 = 11
            switch(r8) {
                case -2130108346: goto L_0x017b;
                case -2130108006: goto L_0x0170;
                case -2026200673: goto L_0x0165;
                case -1848623673: goto L_0x015a;
                case -1584802318: goto L_0x0150;
                case -1314394107: goto L_0x0145;
                case -1312982983: goto L_0x013a;
                case -1272596344: goto L_0x012f;
                case -1013348627: goto L_0x0125;
                case -866953016: goto L_0x0119;
                case -788012149: goto L_0x010d;
                case -596411419: goto L_0x0101;
                case -578681138: goto L_0x00f6;
                case -361826745: goto L_0x00eb;
                case -330673777: goto L_0x00df;
                case -284840886: goto L_0x00d3;
                case -122960505: goto L_0x00c7;
                case 79227272: goto L_0x00bc;
                case 100313883: goto L_0x00b0;
                case 100314223: goto L_0x00a4;
                case 109765032: goto L_0x0099;
                case 433141802: goto L_0x008d;
                case 821361846: goto L_0x0081;
                case 878250929: goto L_0x0075;
                case 1071255167: goto L_0x006a;
                case 1118815609: goto L_0x005e;
                case 1218519584: goto L_0x0053;
                case 1550783935: goto L_0x0047;
                case 1836798297: goto L_0x003b;
                case 2111075541: goto L_0x002f;
                default: goto L_0x002d;
            }
        L_0x002d:
            goto L_0x0186
        L_0x002f:
            java.lang.String r8 = "inRailVehicle"
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L_0x0186
            r1 = 21
            goto L_0x0187
        L_0x003b:
            java.lang.String r8 = "WALKING"
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L_0x0186
            r1 = 14
            goto L_0x0187
        L_0x0047:
            java.lang.String r8 = "running"
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L_0x0186
            r1 = 17
            goto L_0x0187
        L_0x0053:
            java.lang.String r8 = "onBicycle"
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L_0x0186
            r1 = 3
            goto L_0x0187
        L_0x005e:
            java.lang.String r8 = "walking"
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L_0x0186
            r1 = 15
            goto L_0x0187
        L_0x006a:
            java.lang.String r8 = "ON_BICYCLE"
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L_0x0186
            r1 = 2
            goto L_0x0187
        L_0x0075:
            java.lang.String r8 = "EXITING_VEHICLE"
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L_0x0186
            r1 = 12
            goto L_0x0187
        L_0x0081:
            java.lang.String r8 = "IN_FOUR_WHEELER_VEHICLE"
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L_0x0186
            r1 = 24
            goto L_0x0187
        L_0x008d:
            java.lang.String r8 = "UNKNOWN"
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L_0x0186
            r1 = 8
            goto L_0x0187
        L_0x0099:
            java.lang.String r8 = "still"
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L_0x0186
            r1 = 7
            goto L_0x0187
        L_0x00a4:
            java.lang.String r8 = "inCar"
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L_0x0186
            r1 = 27
            goto L_0x0187
        L_0x00b0:
            java.lang.String r8 = "inBus"
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L_0x0186
            r1 = 29
            goto L_0x0187
        L_0x00bc:
            java.lang.String r8 = "STILL"
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L_0x0186
            r1 = 6
            goto L_0x0187
        L_0x00c7:
            java.lang.String r8 = "inRoadVehicle"
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L_0x0186
            r1 = 19
            goto L_0x0187
        L_0x00d3:
            java.lang.String r8 = "unknown"
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L_0x0186
            r1 = 9
            goto L_0x0187
        L_0x00df:
            java.lang.String r8 = "inFourWheelerVehicle"
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L_0x0186
            r1 = 25
            goto L_0x0187
        L_0x00eb:
            java.lang.String r8 = "inVehicle"
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L_0x0186
            r1 = 1
            goto L_0x0187
        L_0x00f6:
            java.lang.String r8 = "ON_FOOT"
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L_0x0186
            r1 = 4
            goto L_0x0187
        L_0x0101:
            java.lang.String r8 = "TILTING"
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L_0x0186
            r1 = 10
            goto L_0x0187
        L_0x010d:
            java.lang.String r8 = "inTwoWheelerVehicle"
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L_0x0186
            r1 = 23
            goto L_0x0187
        L_0x0119:
            java.lang.String r8 = "IN_TWO_WHEELER_VEHICLE"
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L_0x0186
            r1 = 22
            goto L_0x0187
        L_0x0125:
            java.lang.String r8 = "onFoot"
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L_0x0186
            r1 = 5
            goto L_0x0187
        L_0x012f:
            java.lang.String r8 = "exitingVehicle"
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L_0x0186
            r1 = 13
            goto L_0x0187
        L_0x013a:
            java.lang.String r8 = "IN_RAIL_VEHICLE"
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L_0x0186
            r1 = 20
            goto L_0x0187
        L_0x0145:
            java.lang.String r8 = "tilting"
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L_0x0186
            r1 = 11
            goto L_0x0187
        L_0x0150:
            java.lang.String r8 = "IN_VEHICLE"
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L_0x0186
            r1 = 0
            goto L_0x0187
        L_0x015a:
            java.lang.String r8 = "IN_ROAD_VEHICLE"
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L_0x0186
            r1 = 18
            goto L_0x0187
        L_0x0165:
            java.lang.String r8 = "RUNNING"
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L_0x0186
            r1 = 16
            goto L_0x0187
        L_0x0170:
            java.lang.String r8 = "IN_CAR"
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L_0x0186
            r1 = 26
            goto L_0x0187
        L_0x017b:
            java.lang.String r8 = "IN_BUS"
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L_0x0186
            r1 = 28
            goto L_0x0187
        L_0x0186:
            r1 = -1
        L_0x0187:
            switch(r1) {
                case 0: goto L_0x02e2;
                case 1: goto L_0x02e2;
                case 2: goto L_0x02cc;
                case 3: goto L_0x02cc;
                case 4: goto L_0x02b5;
                case 5: goto L_0x02b5;
                case 6: goto L_0x029e;
                case 7: goto L_0x029e;
                case 8: goto L_0x0288;
                case 9: goto L_0x0288;
                case 10: goto L_0x0271;
                case 11: goto L_0x0271;
                case 12: goto L_0x025a;
                case 13: goto L_0x025a;
                case 14: goto L_0x0243;
                case 15: goto L_0x0243;
                case 16: goto L_0x022c;
                case 17: goto L_0x022c;
                case 18: goto L_0x0215;
                case 19: goto L_0x0215;
                case 20: goto L_0x01fe;
                case 21: goto L_0x01fe;
                case 22: goto L_0x01e7;
                case 23: goto L_0x01e7;
                case 24: goto L_0x01d0;
                case 25: goto L_0x01d0;
                case 26: goto L_0x01b9;
                case 27: goto L_0x01b9;
                case 28: goto L_0x01a3;
                case 29: goto L_0x01a3;
                default: goto L_0x018a;
            }
        L_0x018a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r16.b()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "Json2LiteBadEnum userlocation.ApiActivityTransitionEventRecord.activity_type "
            int r3 = r1.length()
            if (r3 != 0) goto L_0x02f8
            java.lang.String r1 = new java.lang.String
            r1.<init>(r2)
            goto L_0x02fc
        L_0x01a3:
            boolean r1 = r0.c
            if (r1 == 0) goto L_0x01ac
            r0.c()
            r0.c = r7
        L_0x01ac:
            aucj r1 = r0.b
            atbp r1 = (defpackage.atbp) r1
            r1.b = r9
            int r2 = r1.a
            r2 = r2 | r6
            r1.a = r2
            goto L_0x0300
        L_0x01b9:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x01be
            goto L_0x01c3
        L_0x01be:
            r0.c()
            r0.c = r7
        L_0x01c3:
            aucj r1 = r0.b
            atbp r1 = (defpackage.atbp) r1
            r1.b = r5
            int r2 = r1.a
            r2 = r2 | r6
            r1.a = r2
            goto L_0x0300
        L_0x01d0:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x01d5
            goto L_0x01da
        L_0x01d5:
            r0.c()
            r0.c = r7
        L_0x01da:
            aucj r1 = r0.b
            atbp r1 = (defpackage.atbp) r1
            r1.b = r10
            int r2 = r1.a
            r2 = r2 | r6
            r1.a = r2
            goto L_0x0300
        L_0x01e7:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x01ec
            goto L_0x01f1
        L_0x01ec:
            r0.c()
            r0.c = r7
        L_0x01f1:
            aucj r1 = r0.b
            atbp r1 = (defpackage.atbp) r1
            r1.b = r4
            int r2 = r1.a
            r2 = r2 | r6
            r1.a = r2
            goto L_0x0300
        L_0x01fe:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x0203
            goto L_0x0208
        L_0x0203:
            r0.c()
            r0.c = r7
        L_0x0208:
            aucj r1 = r0.b
            atbp r1 = (defpackage.atbp) r1
            r1.b = r15
            int r2 = r1.a
            r2 = r2 | r6
            r1.a = r2
            goto L_0x0300
        L_0x0215:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x021a
            goto L_0x021f
        L_0x021a:
            r0.c()
            r0.c = r7
        L_0x021f:
            aucj r1 = r0.b
            atbp r1 = (defpackage.atbp) r1
            r1.b = r14
            int r2 = r1.a
            r2 = r2 | r6
            r1.a = r2
            goto L_0x0300
        L_0x022c:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x0231
            goto L_0x0236
        L_0x0231:
            r0.c()
            r0.c = r7
        L_0x0236:
            aucj r1 = r0.b
            atbp r1 = (defpackage.atbp) r1
            r1.b = r11
            int r2 = r1.a
            r2 = r2 | r6
            r1.a = r2
            goto L_0x0300
        L_0x0243:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x0248
            goto L_0x024d
        L_0x0248:
            r0.c()
            r0.c = r7
        L_0x024d:
            aucj r1 = r0.b
            atbp r1 = (defpackage.atbp) r1
            r1.b = r12
            int r2 = r1.a
            r2 = r2 | r6
            r1.a = r2
            goto L_0x0300
        L_0x025a:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x025f
            goto L_0x0264
        L_0x025f:
            r0.c()
            r0.c = r7
        L_0x0264:
            aucj r1 = r0.b
            atbp r1 = (defpackage.atbp) r1
            r1.b = r13
            int r2 = r1.a
            r2 = r2 | r6
            r1.a = r2
            goto L_0x0300
        L_0x0271:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x0276
            goto L_0x027b
        L_0x0276:
            r0.c()
            r0.c = r7
        L_0x027b:
            aucj r1 = r0.b
            atbp r1 = (defpackage.atbp) r1
            r1.b = r2
            int r2 = r1.a
            r2 = r2 | r6
            r1.a = r2
            goto L_0x0300
        L_0x0288:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x028d
            goto L_0x0292
        L_0x028d:
            r0.c()
            r0.c = r7
        L_0x0292:
            aucj r1 = r0.b
            atbp r1 = (defpackage.atbp) r1
            r1.b = r3
            int r2 = r1.a
            r2 = r2 | r6
            r1.a = r2
            goto L_0x0300
        L_0x029e:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x02a3
            goto L_0x02a8
        L_0x02a3:
            r0.c()
            r0.c = r7
        L_0x02a8:
            aucj r1 = r0.b
            atbp r1 = (defpackage.atbp) r1
            r2 = 3
            r1.b = r2
            int r2 = r1.a
            r2 = r2 | r6
            r1.a = r2
            goto L_0x0300
        L_0x02b5:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x02ba
            goto L_0x02bf
        L_0x02ba:
            r0.c()
            r0.c = r7
        L_0x02bf:
            aucj r1 = r0.b
            atbp r1 = (defpackage.atbp) r1
            r2 = 2
            r1.b = r2
            int r2 = r1.a
            r2 = r2 | r6
            r1.a = r2
            goto L_0x0300
        L_0x02cc:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x02d1
            goto L_0x02d6
        L_0x02d1:
            r0.c()
            r0.c = r7
        L_0x02d6:
            aucj r1 = r0.b
            atbp r1 = (defpackage.atbp) r1
            r1.b = r6
            int r2 = r1.a
            r2 = r2 | r6
            r1.a = r2
            goto L_0x0300
        L_0x02e2:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x02e7
            goto L_0x02ec
        L_0x02e7:
            r0.c()
            r0.c = r7
        L_0x02ec:
            aucj r1 = r0.b
            atbp r1 = (defpackage.atbp) r1
            r1.b = r7
            int r2 = r1.a
            r2 = r2 | r6
            r1.a = r2
            goto L_0x0300
        L_0x02f8:
            java.lang.String r1 = r2.concat(r1)
        L_0x02fc:
            r0.<init>(r1)
            throw r0
        L_0x0300:
            java.lang.String r1 = r16.d()
            if (r1 == 0) goto L_0x0391
            java.lang.String r1 = r16.d()
            int r2 = r1.hashCode()
            switch(r2) {
                case -1483548520: goto L_0x0330;
                case -1107616908: goto L_0x0326;
                case -728456958: goto L_0x031c;
                case 1254348414: goto L_0x0312;
                default: goto L_0x0311;
            }
        L_0x0311:
            goto L_0x033a
        L_0x0312:
            java.lang.String r2 = "ACTIVITY_TRANSITION_ENTER"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x033a
            r2 = 0
            goto L_0x033b
        L_0x031c:
            java.lang.String r2 = "activityTransitionExit"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x033a
            r2 = 3
            goto L_0x033b
        L_0x0326:
            java.lang.String r2 = "activityTransitionEnter"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x033a
            r2 = 1
            goto L_0x033b
        L_0x0330:
            java.lang.String r2 = "ACTIVITY_TRANSITION_EXIT"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x033a
            r2 = 2
            goto L_0x033b
        L_0x033a:
            r2 = -1
        L_0x033b:
            if (r2 == 0) goto L_0x037b
            if (r2 == r6) goto L_0x037b
            r1 = 2
            if (r2 == r1) goto L_0x0365
            r1 = 3
            if (r2 == r1) goto L_0x0365
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r16.d()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "Json2LiteBadEnum userlocation.ApiActivityTransitionEventRecord.type "
            int r3 = r1.length()
            if (r3 != 0) goto L_0x035d
            java.lang.String r1 = new java.lang.String
            r1.<init>(r2)
            goto L_0x0361
        L_0x035d:
            java.lang.String r1 = r2.concat(r1)
        L_0x0361:
            r0.<init>(r1)
            throw r0
        L_0x0365:
            boolean r1 = r0.c
            if (r1 == 0) goto L_0x036e
            r0.c()
            r0.c = r7
        L_0x036e:
            aucj r1 = r0.b
            atbp r1 = (defpackage.atbp) r1
            r1.c = r6
            int r2 = r1.a
            r4 = 2
            r2 = r2 | r4
            r1.a = r2
            goto L_0x0391
        L_0x037b:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x0380
            goto L_0x0385
        L_0x0380:
            r0.c()
            r0.c = r7
        L_0x0385:
            aucj r1 = r0.b
            atbp r1 = (defpackage.atbp) r1
            r1.c = r7
            int r2 = r1.a
            r4 = 2
            r2 = r2 | r4
            r1.a = r2
        L_0x0391:
            java.lang.Long r1 = r16.c()
            if (r1 == 0) goto L_0x03b4
            java.lang.Long r1 = r16.c()
            long r1 = r1.longValue()
            boolean r4 = r0.c
            if (r4 != 0) goto L_0x03a4
            goto L_0x03a9
        L_0x03a4:
            r0.c()
            r0.c = r7
        L_0x03a9:
            aucj r4 = r0.b
            atbp r4 = (defpackage.atbp) r4
            int r5 = r4.a
            r3 = r3 | r5
            r4.a = r3
            r4.d = r1
        L_0x03b4:
            aucj r0 = r0.i()
            atbp r0 = (defpackage.atbp) r0
            return r0
        L_0x03bb:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alkj.a(com.google.android.ulr.ApiActivityTransitionEventRecord):atbp");
    }
}
