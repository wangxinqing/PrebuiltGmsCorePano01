package defpackage;

/* renamed from: alko  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alko {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:600:0x0afa, code lost:
        if (r10.equals("LOCATION_AWARE_BATCH_BACKOFF_DEFAULT") != false) goto L_0x0c03;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.atda a(com.google.android.ulr.ApiRate r18) {
        /*
            if (r18 == 0) goto L_0x0e79
            atda r0 = defpackage.atda.l
            aucd r0 = r0.o()
            java.lang.Long r1 = r18.g()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x002c
            java.lang.Long r1 = r18.g()
            long r4 = r1.longValue()
            boolean r1 = r0.c
            if (r1 == 0) goto L_0x0021
            r0.c()
            r0.c = r3
        L_0x0021:
            aucj r1 = r0.b
            atda r1 = (defpackage.atda) r1
            int r6 = r1.a
            r6 = r6 | r2
            r1.a = r6
            r1.b = r4
        L_0x002c:
            java.lang.Long r1 = r18.d()
            r4 = 2
            if (r1 == 0) goto L_0x0050
            java.lang.Long r1 = r18.d()
            long r5 = r1.longValue()
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x0040
            goto L_0x0045
        L_0x0040:
            r0.c()
            r0.c = r3
        L_0x0045:
            aucj r1 = r0.b
            atda r1 = (defpackage.atda) r1
            int r7 = r1.a
            r7 = r7 | r4
            r1.a = r7
            r1.c = r5
        L_0x0050:
            java.lang.String r1 = r18.e()
            r5 = 18
            r6 = 15
            r7 = 19
            r8 = 14
            r9 = 17
            r12 = 9
            r14 = 12
            r15 = 13
            r10 = 11
            r2 = 10
            r13 = 16
            r16 = 32
            r4 = 4
            if (r1 == 0) goto L_0x04d1
            java.lang.String r1 = r18.e()
            int r17 = r1.hashCode()
            switch(r17) {
                case -2137942761: goto L_0x0288;
                case -2102236543: goto L_0x027d;
                case -2076224911: goto L_0x0272;
                case -2032180703: goto L_0x0268;
                case -1752517260: goto L_0x025d;
                case -1653763102: goto L_0x0252;
                case -1340613956: goto L_0x0247;
                case -1247774930: goto L_0x023c;
                case -1097441770: goto L_0x0231;
                case -1045973227: goto L_0x0225;
                case -979695407: goto L_0x0219;
                case -868629277: goto L_0x020d;
                case -613349876: goto L_0x0201;
                case -590713662: goto L_0x01f6;
                case -584345472: goto L_0x01eb;
                case -486630755: goto L_0x01df;
                case -422568257: goto L_0x01d3;
                case -388731508: goto L_0x01c7;
                case -387128953: goto L_0x01bb;
                case -238158823: goto L_0x01af;
                case -98468684: goto L_0x01a4;
                case 23120605: goto L_0x0198;
                case 34407375: goto L_0x018c;
                case 79227272: goto L_0x0180;
                case 109765032: goto L_0x0174;
                case 168438578: goto L_0x0168;
                case 339510046: goto L_0x015c;
                case 386623668: goto L_0x0151;
                case 393896591: goto L_0x0145;
                case 439494315: goto L_0x0139;
                case 638955646: goto L_0x012d;
                case 654817795: goto L_0x0121;
                case 778707600: goto L_0x0115;
                case 811351765: goto L_0x0109;
                case 975233750: goto L_0x00fe;
                case 1006279478: goto L_0x00f2;
                case 1436115569: goto L_0x00e6;
                case 1544803905: goto L_0x00db;
                case 1617010670: goto L_0x00cf;
                case 1626084507: goto L_0x00c3;
                case 1629972701: goto L_0x00b7;
                case 1643358022: goto L_0x00ab;
                case 1665123752: goto L_0x009f;
                case 2002645286: goto L_0x0093;
                case 2002662665: goto L_0x0087;
                case 2083811213: goto L_0x007c;
                default: goto L_0x007a;
            }
        L_0x007a:
            goto L_0x0293
        L_0x007c:
            java.lang.String r11 = "WIFI_TRIGGERED"
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x0293
            r1 = 6
            goto L_0x0294
        L_0x0087:
            java.lang.String r11 = "nonPrimaryStationary"
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x0293
            r1 = 21
            goto L_0x0294
        L_0x0093:
            java.lang.String r11 = "WORK_DEPARTURE"
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x0293
            r1 = 38
            goto L_0x0294
        L_0x009f:
            java.lang.String r11 = "homeEnteredWifiDisconnected"
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x0293
            r1 = 27
            goto L_0x0294
        L_0x00ab:
            java.lang.String r11 = "oversamplingStarted"
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x0293
            r1 = 43
            goto L_0x0294
        L_0x00b7:
            java.lang.String r11 = "OVERSAMPLING_STARTED"
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x0293
            r1 = 42
            goto L_0x0294
        L_0x00c3:
            java.lang.String r11 = "LOW_BATTERY_UNFAMILIAR"
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x0293
            r1 = 16
            goto L_0x0294
        L_0x00cf:
            java.lang.String r11 = "workEnteredWifiConnected"
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x0293
            r1 = 29
            goto L_0x0294
        L_0x00db:
            java.lang.String r11 = "default"
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x0293
            r1 = 1
            goto L_0x0294
        L_0x00e6:
            java.lang.String r11 = "charging"
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x0293
            r1 = 9
            goto L_0x0294
        L_0x00f2:
            java.lang.String r11 = "workEnteredWifiDisconnected"
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x0293
            r1 = 31
            goto L_0x0294
        L_0x00fe:
            java.lang.String r11 = "chargingInVehicle"
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x0293
            r1 = 5
            goto L_0x0294
        L_0x0109:
            java.lang.String r11 = "homeDeparture"
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x0293
            r1 = 35
            goto L_0x0294
        L_0x0115:
            java.lang.String r11 = "FIRST_UPLOAD"
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x0293
            r1 = 22
            goto L_0x0294
        L_0x0121:
            java.lang.String r11 = "NON_PRIMARY_STATIONARY"
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x0293
            r1 = 20
            goto L_0x0294
        L_0x012d:
            java.lang.String r11 = "HOME_EXIT"
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x0293
            r1 = 32
            goto L_0x0294
        L_0x0139:
            java.lang.String r11 = "WALKING_FAMILIAR"
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x0293
            r1 = 12
            goto L_0x0294
        L_0x0145:
            java.lang.String r11 = "WORK_ENTERED_WIFI_DISCONNECTED"
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x0293
            r1 = 30
            goto L_0x0294
        L_0x0151:
            java.lang.String r11 = "STATIONARY"
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x0293
            r1 = 2
            goto L_0x0294
        L_0x015c:
            java.lang.String r11 = "walkingFamiliar"
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x0293
            r1 = 13
            goto L_0x0294
        L_0x0168:
            java.lang.String r11 = "NON_PRIMARY_DEFAULT"
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x0293
            r1 = 18
            goto L_0x0294
        L_0x0174:
            java.lang.String r11 = "still"
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x0293
            r1 = 11
            goto L_0x0294
        L_0x0180:
            java.lang.String r11 = "STILL"
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x0293
            r1 = 10
            goto L_0x0294
        L_0x018c:
            java.lang.String r11 = "workExit"
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x0293
            r1 = 37
            goto L_0x0294
        L_0x0198:
            java.lang.String r11 = "HOME_ENTERED_WIFI_DISCONNECTED"
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x0293
            r1 = 26
            goto L_0x0294
        L_0x01a4:
            java.lang.String r11 = "stationary"
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x0293
            r1 = 3
            goto L_0x0294
        L_0x01af:
            java.lang.String r11 = "lowBattery"
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x0293
            r1 = 15
            goto L_0x0294
        L_0x01bb:
            java.lang.String r11 = "HOME_ENTERED_WIFI_CONNECTED"
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x0293
            r1 = 24
            goto L_0x0294
        L_0x01c7:
            java.lang.String r11 = "WORK_EXIT"
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x0293
            r1 = 36
            goto L_0x0294
        L_0x01d3:
            java.lang.String r11 = "oversamplingEnded"
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x0293
            r1 = 45
            goto L_0x0294
        L_0x01df:
            java.lang.String r11 = "homeExit"
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x0293
            r1 = 33
            goto L_0x0294
        L_0x01eb:
            java.lang.String r11 = "CHARGING_IN_VEHICLE"
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x0293
            r1 = 4
            goto L_0x0294
        L_0x01f6:
            java.lang.String r11 = "wifiTriggered"
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x0293
            r1 = 7
            goto L_0x0294
        L_0x0201:
            java.lang.String r11 = "nonPrimaryDefault"
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x0293
            r1 = 19
            goto L_0x0294
        L_0x020d:
            java.lang.String r11 = "workDeparture"
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x0293
            r1 = 39
            goto L_0x0294
        L_0x0219:
            java.lang.String r11 = "firstUpload"
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x0293
            r1 = 23
            goto L_0x0294
        L_0x0225:
            java.lang.String r11 = "WORK_ENTERED_WIFI_CONNECTED"
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x0293
            r1 = 28
            goto L_0x0294
        L_0x0231:
            java.lang.String r11 = "OVERSAMPLING_ENDED"
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x0293
            r1 = 44
            goto L_0x0294
        L_0x023c:
            java.lang.String r11 = "modelTriggered"
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x0293
            r1 = 41
            goto L_0x0294
        L_0x0247:
            java.lang.String r11 = "homeEnteredWifiConnected"
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x0293
            r1 = 25
            goto L_0x0294
        L_0x0252:
            java.lang.String r11 = "LOW_BATTERY"
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x0293
            r1 = 14
            goto L_0x0294
        L_0x025d:
            java.lang.String r11 = "HOME_DEPARTURE"
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x0293
            r1 = 34
            goto L_0x0294
        L_0x0268:
            java.lang.String r11 = "DEFAULT"
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x0293
            r1 = 0
            goto L_0x0294
        L_0x0272:
            java.lang.String r11 = "CHARGING"
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x0293
            r1 = 8
            goto L_0x0294
        L_0x027d:
            java.lang.String r11 = "MODEL_TRIGGERED"
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x0293
            r1 = 40
            goto L_0x0294
        L_0x0288:
            java.lang.String r11 = "lowBatteryUnfamiliar"
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x0293
            r1 = 17
            goto L_0x0294
        L_0x0293:
            r1 = -1
        L_0x0294:
            switch(r1) {
                case 0: goto L_0x04b3;
                case 1: goto L_0x04b3;
                case 2: goto L_0x049c;
                case 3: goto L_0x049c;
                case 4: goto L_0x0485;
                case 5: goto L_0x0485;
                case 6: goto L_0x046e;
                case 7: goto L_0x046e;
                case 8: goto L_0x0458;
                case 9: goto L_0x0458;
                case 10: goto L_0x0440;
                case 11: goto L_0x0440;
                case 12: goto L_0x0428;
                case 13: goto L_0x0428;
                case 14: goto L_0x0410;
                case 15: goto L_0x0410;
                case 16: goto L_0x03f7;
                case 17: goto L_0x03f7;
                case 18: goto L_0x03e0;
                case 19: goto L_0x03e0;
                case 20: goto L_0x03c9;
                case 21: goto L_0x03c9;
                case 22: goto L_0x03b2;
                case 23: goto L_0x03b2;
                case 24: goto L_0x039b;
                case 25: goto L_0x039b;
                case 26: goto L_0x0384;
                case 27: goto L_0x0384;
                case 28: goto L_0x036d;
                case 29: goto L_0x036d;
                case 30: goto L_0x0356;
                case 31: goto L_0x0356;
                case 32: goto L_0x033f;
                case 33: goto L_0x033f;
                case 34: goto L_0x0328;
                case 35: goto L_0x0328;
                case 36: goto L_0x0311;
                case 37: goto L_0x0311;
                case 38: goto L_0x02fa;
                case 39: goto L_0x02fa;
                case 40: goto L_0x02e1;
                case 41: goto L_0x02e1;
                case 42: goto L_0x02c8;
                case 43: goto L_0x02c8;
                case 44: goto L_0x02b0;
                case 45: goto L_0x02b0;
                default: goto L_0x0297;
            }
        L_0x0297:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r18.e()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "Json2LiteBadEnum userlocation.ApiRate.sample_reason "
            int r3 = r1.length()
            if (r3 != 0) goto L_0x04c9
            java.lang.String r1 = new java.lang.String
            r1.<init>(r2)
            goto L_0x04cd
        L_0x02b0:
            boolean r1 = r0.c
            if (r1 == 0) goto L_0x02b9
            r0.c()
            r0.c = r3
        L_0x02b9:
            aucj r1 = r0.b
            atda r1 = (defpackage.atda) r1
            r11 = 22
            r1.d = r11
            int r11 = r1.a
            r11 = r11 | r4
            r1.a = r11
            goto L_0x04d1
        L_0x02c8:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x02cd
            goto L_0x02d2
        L_0x02cd:
            r0.c()
            r0.c = r3
        L_0x02d2:
            aucj r1 = r0.b
            atda r1 = (defpackage.atda) r1
            r11 = 21
            r1.d = r11
            int r11 = r1.a
            r11 = r11 | r4
            r1.a = r11
            goto L_0x04d1
        L_0x02e1:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x02e6
            goto L_0x02eb
        L_0x02e6:
            r0.c()
            r0.c = r3
        L_0x02eb:
            aucj r1 = r0.b
            atda r1 = (defpackage.atda) r1
            r11 = 20
            r1.d = r11
            int r11 = r1.a
            r11 = r11 | r4
            r1.a = r11
            goto L_0x04d1
        L_0x02fa:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x02ff
            goto L_0x0304
        L_0x02ff:
            r0.c()
            r0.c = r3
        L_0x0304:
            aucj r1 = r0.b
            atda r1 = (defpackage.atda) r1
            r1.d = r7
            int r11 = r1.a
            r11 = r11 | r4
            r1.a = r11
            goto L_0x04d1
        L_0x0311:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x0316
            goto L_0x031b
        L_0x0316:
            r0.c()
            r0.c = r3
        L_0x031b:
            aucj r1 = r0.b
            atda r1 = (defpackage.atda) r1
            r1.d = r9
            int r11 = r1.a
            r11 = r11 | r4
            r1.a = r11
            goto L_0x04d1
        L_0x0328:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x032d
            goto L_0x0332
        L_0x032d:
            r0.c()
            r0.c = r3
        L_0x0332:
            aucj r1 = r0.b
            atda r1 = (defpackage.atda) r1
            r1.d = r5
            int r11 = r1.a
            r11 = r11 | r4
            r1.a = r11
            goto L_0x04d1
        L_0x033f:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x0344
            goto L_0x0349
        L_0x0344:
            r0.c()
            r0.c = r3
        L_0x0349:
            aucj r1 = r0.b
            atda r1 = (defpackage.atda) r1
            r1.d = r13
            int r11 = r1.a
            r11 = r11 | r4
            r1.a = r11
            goto L_0x04d1
        L_0x0356:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x035b
            goto L_0x0360
        L_0x035b:
            r0.c()
            r0.c = r3
        L_0x0360:
            aucj r1 = r0.b
            atda r1 = (defpackage.atda) r1
            r1.d = r6
            int r11 = r1.a
            r11 = r11 | r4
            r1.a = r11
            goto L_0x04d1
        L_0x036d:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x0372
            goto L_0x0377
        L_0x0372:
            r0.c()
            r0.c = r3
        L_0x0377:
            aucj r1 = r0.b
            atda r1 = (defpackage.atda) r1
            r1.d = r8
            int r11 = r1.a
            r11 = r11 | r4
            r1.a = r11
            goto L_0x04d1
        L_0x0384:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x0389
            goto L_0x038e
        L_0x0389:
            r0.c()
            r0.c = r3
        L_0x038e:
            aucj r1 = r0.b
            atda r1 = (defpackage.atda) r1
            r1.d = r15
            int r11 = r1.a
            r11 = r11 | r4
            r1.a = r11
            goto L_0x04d1
        L_0x039b:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x03a0
            goto L_0x03a5
        L_0x03a0:
            r0.c()
            r0.c = r3
        L_0x03a5:
            aucj r1 = r0.b
            atda r1 = (defpackage.atda) r1
            r1.d = r14
            int r11 = r1.a
            r11 = r11 | r4
            r1.a = r11
            goto L_0x04d1
        L_0x03b2:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x03b7
            goto L_0x03bc
        L_0x03b7:
            r0.c()
            r0.c = r3
        L_0x03bc:
            aucj r1 = r0.b
            atda r1 = (defpackage.atda) r1
            r1.d = r10
            int r11 = r1.a
            r11 = r11 | r4
            r1.a = r11
            goto L_0x04d1
        L_0x03c9:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x03ce
            goto L_0x03d3
        L_0x03ce:
            r0.c()
            r0.c = r3
        L_0x03d3:
            aucj r1 = r0.b
            atda r1 = (defpackage.atda) r1
            r1.d = r2
            int r11 = r1.a
            r11 = r11 | r4
            r1.a = r11
            goto L_0x04d1
        L_0x03e0:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x03e5
            goto L_0x03ea
        L_0x03e5:
            r0.c()
            r0.c = r3
        L_0x03ea:
            aucj r1 = r0.b
            atda r1 = (defpackage.atda) r1
            r1.d = r12
            int r11 = r1.a
            r11 = r11 | r4
            r1.a = r11
            goto L_0x04d1
        L_0x03f7:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x03fc
            goto L_0x0401
        L_0x03fc:
            r0.c()
            r0.c = r3
        L_0x0401:
            aucj r1 = r0.b
            atda r1 = (defpackage.atda) r1
            r11 = 8
            r1.d = r11
            int r11 = r1.a
            r11 = r11 | r4
            r1.a = r11
            goto L_0x04d1
        L_0x0410:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x0415
            goto L_0x041a
        L_0x0415:
            r0.c()
            r0.c = r3
        L_0x041a:
            aucj r1 = r0.b
            atda r1 = (defpackage.atda) r1
            r11 = 7
            r1.d = r11
            int r11 = r1.a
            r11 = r11 | r4
            r1.a = r11
            goto L_0x04d1
        L_0x0428:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x042d
            goto L_0x0432
        L_0x042d:
            r0.c()
            r0.c = r3
        L_0x0432:
            aucj r1 = r0.b
            atda r1 = (defpackage.atda) r1
            r11 = 6
            r1.d = r11
            int r11 = r1.a
            r11 = r11 | r4
            r1.a = r11
            goto L_0x04d1
        L_0x0440:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x0445
            goto L_0x044a
        L_0x0445:
            r0.c()
            r0.c = r3
        L_0x044a:
            aucj r1 = r0.b
            atda r1 = (defpackage.atda) r1
            r11 = 5
            r1.d = r11
            int r11 = r1.a
            r11 = r11 | r4
            r1.a = r11
            goto L_0x04d1
        L_0x0458:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x045d
            goto L_0x0462
        L_0x045d:
            r0.c()
            r0.c = r3
        L_0x0462:
            aucj r1 = r0.b
            atda r1 = (defpackage.atda) r1
            r1.d = r4
            int r11 = r1.a
            r11 = r11 | r4
            r1.a = r11
            goto L_0x04d1
        L_0x046e:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x0473
            goto L_0x0478
        L_0x0473:
            r0.c()
            r0.c = r3
        L_0x0478:
            aucj r1 = r0.b
            atda r1 = (defpackage.atda) r1
            r11 = 3
            r1.d = r11
            int r11 = r1.a
            r11 = r11 | r4
            r1.a = r11
            goto L_0x04d1
        L_0x0485:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x048a
            goto L_0x048f
        L_0x048a:
            r0.c()
            r0.c = r3
        L_0x048f:
            aucj r1 = r0.b
            atda r1 = (defpackage.atda) r1
            r11 = 2
            r1.d = r11
            int r11 = r1.a
            r11 = r11 | r4
            r1.a = r11
            goto L_0x04d1
        L_0x049c:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x04a1
            goto L_0x04a6
        L_0x04a1:
            r0.c()
            r0.c = r3
        L_0x04a6:
            aucj r1 = r0.b
            atda r1 = (defpackage.atda) r1
            r11 = 1
            r1.d = r11
            int r11 = r1.a
            r11 = r11 | r4
            r1.a = r11
            goto L_0x04d1
        L_0x04b3:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x04b8
            goto L_0x04bd
        L_0x04b8:
            r0.c()
            r0.c = r3
        L_0x04bd:
            aucj r1 = r0.b
            atda r1 = (defpackage.atda) r1
            r1.d = r3
            int r11 = r1.a
            r11 = r11 | r4
            r1.a = r11
            goto L_0x04d1
        L_0x04c9:
            java.lang.String r1 = r2.concat(r1)
        L_0x04cd:
            r0.<init>(r1)
            throw r0
        L_0x04d1:
            java.lang.String r1 = r18.f()
            if (r1 == 0) goto L_0x0568
            java.lang.String r1 = r18.f()
            int r11 = r1.hashCode()
            switch(r11) {
                case 63566080: goto L_0x0501;
                case 94103840: goto L_0x04f7;
                case 570410685: goto L_0x04ed;
                case 1353037501: goto L_0x04e3;
                default: goto L_0x04e2;
            }
        L_0x04e2:
            goto L_0x050b
        L_0x04e3:
            java.lang.String r11 = "INTERNAL"
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x050b
            r1 = 0
            goto L_0x050c
        L_0x04ed:
            java.lang.String r11 = "internal"
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x050b
            r1 = 1
            goto L_0x050c
        L_0x04f7:
            java.lang.String r11 = "burst"
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x050b
            r1 = 3
            goto L_0x050c
        L_0x0501:
            java.lang.String r11 = "BURST"
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x050b
            r1 = 2
            goto L_0x050c
        L_0x050b:
            r1 = -1
        L_0x050c:
            if (r1 == 0) goto L_0x0550
            r11 = 1
            if (r1 == r11) goto L_0x0550
            r11 = 2
            if (r1 == r11) goto L_0x0537
            r11 = 3
            if (r1 == r11) goto L_0x0537
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r18.f()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "Json2LiteBadEnum userlocation.ApiRate.sample_source "
            int r3 = r1.length()
            if (r3 != 0) goto L_0x052f
            java.lang.String r1 = new java.lang.String
            r1.<init>(r2)
            goto L_0x0533
        L_0x052f:
            java.lang.String r1 = r2.concat(r1)
        L_0x0533:
            r0.<init>(r1)
            throw r0
        L_0x0537:
            boolean r1 = r0.c
            if (r1 == 0) goto L_0x0540
            r0.c()
            r0.c = r3
        L_0x0540:
            aucj r1 = r0.b
            atda r1 = (defpackage.atda) r1
            r11 = 1
            r1.e = r11
            int r11 = r1.a
            r17 = 8
            r11 = r11 | 8
            r1.a = r11
            goto L_0x0568
        L_0x0550:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x0555
            goto L_0x055a
        L_0x0555:
            r0.c()
            r0.c = r3
        L_0x055a:
            aucj r1 = r0.b
            atda r1 = (defpackage.atda) r1
            r1.e = r3
            int r11 = r1.a
            r17 = 8
            r11 = r11 | 8
            r1.a = r11
        L_0x0568:
            java.lang.Long r1 = r18.h()
            if (r1 == 0) goto L_0x058b
            java.lang.Long r1 = r18.h()
            long r10 = r1.longValue()
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x057b
            goto L_0x0580
        L_0x057b:
            r0.c()
            r0.c = r3
        L_0x0580:
            aucj r1 = r0.b
            atda r1 = (defpackage.atda) r1
            int r4 = r1.a
            r4 = r4 | r13
            r1.a = r4
            r1.f = r10
        L_0x058b:
            java.lang.String r1 = r18.i()
            if (r1 == 0) goto L_0x0a0d
            java.lang.String r1 = r18.i()
            int r4 = r1.hashCode()
            switch(r4) {
                case -2137942761: goto L_0x07aa;
                case -2102236543: goto L_0x079f;
                case -2076224911: goto L_0x0794;
                case -2032180703: goto L_0x078a;
                case -1752517260: goto L_0x077f;
                case -1653763102: goto L_0x0774;
                case -1340613956: goto L_0x0769;
                case -1247774930: goto L_0x075e;
                case -1097441770: goto L_0x0753;
                case -1045973227: goto L_0x0747;
                case -979695407: goto L_0x073b;
                case -868629277: goto L_0x072f;
                case -613349876: goto L_0x0723;
                case -590713662: goto L_0x0718;
                case -584345472: goto L_0x070d;
                case -486630755: goto L_0x0701;
                case -422568257: goto L_0x06f5;
                case -388731508: goto L_0x06e9;
                case -387128953: goto L_0x06dd;
                case -238158823: goto L_0x06d1;
                case -98468684: goto L_0x06c6;
                case 23120605: goto L_0x06ba;
                case 34407375: goto L_0x06ae;
                case 79227272: goto L_0x06a2;
                case 109765032: goto L_0x0696;
                case 168438578: goto L_0x068a;
                case 339510046: goto L_0x067e;
                case 386623668: goto L_0x0673;
                case 393896591: goto L_0x0667;
                case 439494315: goto L_0x065b;
                case 638955646: goto L_0x064f;
                case 654817795: goto L_0x0643;
                case 778707600: goto L_0x0637;
                case 811351765: goto L_0x062b;
                case 975233750: goto L_0x0620;
                case 1006279478: goto L_0x0614;
                case 1436115569: goto L_0x0608;
                case 1544803905: goto L_0x05fd;
                case 1617010670: goto L_0x05f1;
                case 1626084507: goto L_0x05e5;
                case 1629972701: goto L_0x05d9;
                case 1643358022: goto L_0x05cd;
                case 1665123752: goto L_0x05c1;
                case 2002645286: goto L_0x05b5;
                case 2002662665: goto L_0x05a9;
                case 2083811213: goto L_0x059e;
                default: goto L_0x059c;
            }
        L_0x059c:
            goto L_0x07b5
        L_0x059e:
            java.lang.String r4 = "WIFI_TRIGGERED"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x07b5
            r1 = 6
            goto L_0x07b6
        L_0x05a9:
            java.lang.String r4 = "nonPrimaryStationary"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x07b5
            r1 = 21
            goto L_0x07b6
        L_0x05b5:
            java.lang.String r4 = "WORK_DEPARTURE"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x07b5
            r1 = 38
            goto L_0x07b6
        L_0x05c1:
            java.lang.String r4 = "homeEnteredWifiDisconnected"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x07b5
            r1 = 27
            goto L_0x07b6
        L_0x05cd:
            java.lang.String r4 = "oversamplingStarted"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x07b5
            r1 = 43
            goto L_0x07b6
        L_0x05d9:
            java.lang.String r4 = "OVERSAMPLING_STARTED"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x07b5
            r1 = 42
            goto L_0x07b6
        L_0x05e5:
            java.lang.String r4 = "LOW_BATTERY_UNFAMILIAR"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x07b5
            r1 = 16
            goto L_0x07b6
        L_0x05f1:
            java.lang.String r4 = "workEnteredWifiConnected"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x07b5
            r1 = 29
            goto L_0x07b6
        L_0x05fd:
            java.lang.String r4 = "default"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x07b5
            r1 = 1
            goto L_0x07b6
        L_0x0608:
            java.lang.String r4 = "charging"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x07b5
            r1 = 9
            goto L_0x07b6
        L_0x0614:
            java.lang.String r4 = "workEnteredWifiDisconnected"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x07b5
            r1 = 31
            goto L_0x07b6
        L_0x0620:
            java.lang.String r4 = "chargingInVehicle"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x07b5
            r1 = 5
            goto L_0x07b6
        L_0x062b:
            java.lang.String r4 = "homeDeparture"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x07b5
            r1 = 35
            goto L_0x07b6
        L_0x0637:
            java.lang.String r4 = "FIRST_UPLOAD"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x07b5
            r1 = 22
            goto L_0x07b6
        L_0x0643:
            java.lang.String r4 = "NON_PRIMARY_STATIONARY"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x07b5
            r1 = 20
            goto L_0x07b6
        L_0x064f:
            java.lang.String r4 = "HOME_EXIT"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x07b5
            r1 = 32
            goto L_0x07b6
        L_0x065b:
            java.lang.String r4 = "WALKING_FAMILIAR"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x07b5
            r1 = 12
            goto L_0x07b6
        L_0x0667:
            java.lang.String r4 = "WORK_ENTERED_WIFI_DISCONNECTED"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x07b5
            r1 = 30
            goto L_0x07b6
        L_0x0673:
            java.lang.String r4 = "STATIONARY"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x07b5
            r1 = 2
            goto L_0x07b6
        L_0x067e:
            java.lang.String r4 = "walkingFamiliar"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x07b5
            r1 = 13
            goto L_0x07b6
        L_0x068a:
            java.lang.String r4 = "NON_PRIMARY_DEFAULT"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x07b5
            r1 = 18
            goto L_0x07b6
        L_0x0696:
            java.lang.String r4 = "still"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x07b5
            r1 = 11
            goto L_0x07b6
        L_0x06a2:
            java.lang.String r4 = "STILL"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x07b5
            r1 = 10
            goto L_0x07b6
        L_0x06ae:
            java.lang.String r4 = "workExit"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x07b5
            r1 = 37
            goto L_0x07b6
        L_0x06ba:
            java.lang.String r4 = "HOME_ENTERED_WIFI_DISCONNECTED"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x07b5
            r1 = 26
            goto L_0x07b6
        L_0x06c6:
            java.lang.String r4 = "stationary"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x07b5
            r1 = 3
            goto L_0x07b6
        L_0x06d1:
            java.lang.String r4 = "lowBattery"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x07b5
            r1 = 15
            goto L_0x07b6
        L_0x06dd:
            java.lang.String r4 = "HOME_ENTERED_WIFI_CONNECTED"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x07b5
            r1 = 24
            goto L_0x07b6
        L_0x06e9:
            java.lang.String r4 = "WORK_EXIT"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x07b5
            r1 = 36
            goto L_0x07b6
        L_0x06f5:
            java.lang.String r4 = "oversamplingEnded"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x07b5
            r1 = 45
            goto L_0x07b6
        L_0x0701:
            java.lang.String r4 = "homeExit"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x07b5
            r1 = 33
            goto L_0x07b6
        L_0x070d:
            java.lang.String r4 = "CHARGING_IN_VEHICLE"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x07b5
            r1 = 4
            goto L_0x07b6
        L_0x0718:
            java.lang.String r4 = "wifiTriggered"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x07b5
            r1 = 7
            goto L_0x07b6
        L_0x0723:
            java.lang.String r4 = "nonPrimaryDefault"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x07b5
            r1 = 19
            goto L_0x07b6
        L_0x072f:
            java.lang.String r4 = "workDeparture"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x07b5
            r1 = 39
            goto L_0x07b6
        L_0x073b:
            java.lang.String r4 = "firstUpload"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x07b5
            r1 = 23
            goto L_0x07b6
        L_0x0747:
            java.lang.String r4 = "WORK_ENTERED_WIFI_CONNECTED"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x07b5
            r1 = 28
            goto L_0x07b6
        L_0x0753:
            java.lang.String r4 = "OVERSAMPLING_ENDED"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x07b5
            r1 = 44
            goto L_0x07b6
        L_0x075e:
            java.lang.String r4 = "modelTriggered"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x07b5
            r1 = 41
            goto L_0x07b6
        L_0x0769:
            java.lang.String r4 = "homeEnteredWifiConnected"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x07b5
            r1 = 25
            goto L_0x07b6
        L_0x0774:
            java.lang.String r4 = "LOW_BATTERY"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x07b5
            r1 = 14
            goto L_0x07b6
        L_0x077f:
            java.lang.String r4 = "HOME_DEPARTURE"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x07b5
            r1 = 34
            goto L_0x07b6
        L_0x078a:
            java.lang.String r4 = "DEFAULT"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x07b5
            r1 = 0
            goto L_0x07b6
        L_0x0794:
            java.lang.String r4 = "CHARGING"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x07b5
            r1 = 8
            goto L_0x07b6
        L_0x079f:
            java.lang.String r4 = "MODEL_TRIGGERED"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x07b5
            r1 = 40
            goto L_0x07b6
        L_0x07aa:
            java.lang.String r4 = "lowBatteryUnfamiliar"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x07b5
            r1 = 17
            goto L_0x07b6
        L_0x07b5:
            r1 = -1
        L_0x07b6:
            switch(r1) {
                case 0: goto L_0x09ee;
                case 1: goto L_0x09ee;
                case 2: goto L_0x09d6;
                case 3: goto L_0x09d6;
                case 4: goto L_0x09be;
                case 5: goto L_0x09be;
                case 6: goto L_0x09a6;
                case 7: goto L_0x09a6;
                case 8: goto L_0x098e;
                case 9: goto L_0x098e;
                case 10: goto L_0x0975;
                case 11: goto L_0x0975;
                case 12: goto L_0x095c;
                case 13: goto L_0x095c;
                case 14: goto L_0x0943;
                case 15: goto L_0x0943;
                case 16: goto L_0x0929;
                case 17: goto L_0x0929;
                case 18: goto L_0x0911;
                case 19: goto L_0x0911;
                case 20: goto L_0x08f9;
                case 21: goto L_0x08f9;
                case 22: goto L_0x08df;
                case 23: goto L_0x08df;
                case 24: goto L_0x08c7;
                case 25: goto L_0x08c7;
                case 26: goto L_0x08af;
                case 27: goto L_0x08af;
                case 28: goto L_0x0897;
                case 29: goto L_0x0897;
                case 30: goto L_0x087f;
                case 31: goto L_0x087f;
                case 32: goto L_0x0867;
                case 33: goto L_0x0867;
                case 34: goto L_0x084f;
                case 35: goto L_0x084f;
                case 36: goto L_0x0837;
                case 37: goto L_0x0837;
                case 38: goto L_0x081f;
                case 39: goto L_0x081f;
                case 40: goto L_0x0805;
                case 41: goto L_0x0805;
                case 42: goto L_0x07eb;
                case 43: goto L_0x07eb;
                case 44: goto L_0x07d2;
                case 45: goto L_0x07d2;
                default: goto L_0x07b9;
            }
        L_0x07b9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r18.i()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "Json2LiteBadEnum userlocation.ApiRate.upload_reason "
            int r3 = r1.length()
            if (r3 != 0) goto L_0x0a05
            java.lang.String r1 = new java.lang.String
            r1.<init>(r2)
            goto L_0x0a09
        L_0x07d2:
            boolean r1 = r0.c
            if (r1 == 0) goto L_0x07db
            r0.c()
            r0.c = r3
        L_0x07db:
            aucj r1 = r0.b
            atda r1 = (defpackage.atda) r1
            r4 = 22
            r1.g = r4
            int r4 = r1.a
            r4 = r4 | 32
            r1.a = r4
            goto L_0x0a0d
        L_0x07eb:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x07f0
            goto L_0x07f5
        L_0x07f0:
            r0.c()
            r0.c = r3
        L_0x07f5:
            aucj r1 = r0.b
            atda r1 = (defpackage.atda) r1
            r4 = 21
            r1.g = r4
            int r4 = r1.a
            r4 = r4 | 32
            r1.a = r4
            goto L_0x0a0d
        L_0x0805:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x080a
            goto L_0x080f
        L_0x080a:
            r0.c()
            r0.c = r3
        L_0x080f:
            aucj r1 = r0.b
            atda r1 = (defpackage.atda) r1
            r4 = 20
            r1.g = r4
            int r4 = r1.a
            r4 = r4 | 32
            r1.a = r4
            goto L_0x0a0d
        L_0x081f:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x0824
            goto L_0x0829
        L_0x0824:
            r0.c()
            r0.c = r3
        L_0x0829:
            aucj r1 = r0.b
            atda r1 = (defpackage.atda) r1
            r1.g = r7
            int r4 = r1.a
            r4 = r4 | 32
            r1.a = r4
            goto L_0x0a0d
        L_0x0837:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x083c
            goto L_0x0841
        L_0x083c:
            r0.c()
            r0.c = r3
        L_0x0841:
            aucj r1 = r0.b
            atda r1 = (defpackage.atda) r1
            r1.g = r9
            int r4 = r1.a
            r4 = r4 | 32
            r1.a = r4
            goto L_0x0a0d
        L_0x084f:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x0854
            goto L_0x0859
        L_0x0854:
            r0.c()
            r0.c = r3
        L_0x0859:
            aucj r1 = r0.b
            atda r1 = (defpackage.atda) r1
            r1.g = r5
            int r4 = r1.a
            r4 = r4 | 32
            r1.a = r4
            goto L_0x0a0d
        L_0x0867:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x086c
            goto L_0x0871
        L_0x086c:
            r0.c()
            r0.c = r3
        L_0x0871:
            aucj r1 = r0.b
            atda r1 = (defpackage.atda) r1
            r1.g = r13
            int r4 = r1.a
            r4 = r4 | 32
            r1.a = r4
            goto L_0x0a0d
        L_0x087f:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x0884
            goto L_0x0889
        L_0x0884:
            r0.c()
            r0.c = r3
        L_0x0889:
            aucj r1 = r0.b
            atda r1 = (defpackage.atda) r1
            r1.g = r6
            int r4 = r1.a
            r4 = r4 | 32
            r1.a = r4
            goto L_0x0a0d
        L_0x0897:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x089c
            goto L_0x08a1
        L_0x089c:
            r0.c()
            r0.c = r3
        L_0x08a1:
            aucj r1 = r0.b
            atda r1 = (defpackage.atda) r1
            r1.g = r8
            int r4 = r1.a
            r4 = r4 | 32
            r1.a = r4
            goto L_0x0a0d
        L_0x08af:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x08b4
            goto L_0x08b9
        L_0x08b4:
            r0.c()
            r0.c = r3
        L_0x08b9:
            aucj r1 = r0.b
            atda r1 = (defpackage.atda) r1
            r1.g = r15
            int r4 = r1.a
            r4 = r4 | 32
            r1.a = r4
            goto L_0x0a0d
        L_0x08c7:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x08cc
            goto L_0x08d1
        L_0x08cc:
            r0.c()
            r0.c = r3
        L_0x08d1:
            aucj r1 = r0.b
            atda r1 = (defpackage.atda) r1
            r1.g = r14
            int r4 = r1.a
            r4 = r4 | 32
            r1.a = r4
            goto L_0x0a0d
        L_0x08df:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x08e4
            goto L_0x08e9
        L_0x08e4:
            r0.c()
            r0.c = r3
        L_0x08e9:
            aucj r1 = r0.b
            atda r1 = (defpackage.atda) r1
            r4 = 11
            r1.g = r4
            int r4 = r1.a
            r4 = r4 | 32
            r1.a = r4
            goto L_0x0a0d
        L_0x08f9:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x08fe
            goto L_0x0903
        L_0x08fe:
            r0.c()
            r0.c = r3
        L_0x0903:
            aucj r1 = r0.b
            atda r1 = (defpackage.atda) r1
            r1.g = r2
            int r4 = r1.a
            r4 = r4 | 32
            r1.a = r4
            goto L_0x0a0d
        L_0x0911:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x0916
            goto L_0x091b
        L_0x0916:
            r0.c()
            r0.c = r3
        L_0x091b:
            aucj r1 = r0.b
            atda r1 = (defpackage.atda) r1
            r1.g = r12
            int r4 = r1.a
            r4 = r4 | 32
            r1.a = r4
            goto L_0x0a0d
        L_0x0929:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x092e
            goto L_0x0933
        L_0x092e:
            r0.c()
            r0.c = r3
        L_0x0933:
            aucj r1 = r0.b
            atda r1 = (defpackage.atda) r1
            r4 = 8
            r1.g = r4
            int r4 = r1.a
            r4 = r4 | 32
            r1.a = r4
            goto L_0x0a0d
        L_0x0943:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x0948
            goto L_0x094d
        L_0x0948:
            r0.c()
            r0.c = r3
        L_0x094d:
            aucj r1 = r0.b
            atda r1 = (defpackage.atda) r1
            r4 = 7
            r1.g = r4
            int r4 = r1.a
            r4 = r4 | 32
            r1.a = r4
            goto L_0x0a0d
        L_0x095c:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x0961
            goto L_0x0966
        L_0x0961:
            r0.c()
            r0.c = r3
        L_0x0966:
            aucj r1 = r0.b
            atda r1 = (defpackage.atda) r1
            r4 = 6
            r1.g = r4
            int r4 = r1.a
            r4 = r4 | 32
            r1.a = r4
            goto L_0x0a0d
        L_0x0975:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x097a
            goto L_0x097f
        L_0x097a:
            r0.c()
            r0.c = r3
        L_0x097f:
            aucj r1 = r0.b
            atda r1 = (defpackage.atda) r1
            r4 = 5
            r1.g = r4
            int r4 = r1.a
            r4 = r4 | 32
            r1.a = r4
            goto L_0x0a0d
        L_0x098e:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x0993
            goto L_0x0998
        L_0x0993:
            r0.c()
            r0.c = r3
        L_0x0998:
            aucj r1 = r0.b
            atda r1 = (defpackage.atda) r1
            r4 = 4
            r1.g = r4
            int r4 = r1.a
            r4 = r4 | 32
            r1.a = r4
            goto L_0x0a0d
        L_0x09a6:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x09ab
            goto L_0x09b0
        L_0x09ab:
            r0.c()
            r0.c = r3
        L_0x09b0:
            aucj r1 = r0.b
            atda r1 = (defpackage.atda) r1
            r4 = 3
            r1.g = r4
            int r4 = r1.a
            r4 = r4 | 32
            r1.a = r4
            goto L_0x0a0d
        L_0x09be:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x09c3
            goto L_0x09c8
        L_0x09c3:
            r0.c()
            r0.c = r3
        L_0x09c8:
            aucj r1 = r0.b
            atda r1 = (defpackage.atda) r1
            r4 = 2
            r1.g = r4
            int r4 = r1.a
            r4 = r4 | 32
            r1.a = r4
            goto L_0x0a0d
        L_0x09d6:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x09db
            goto L_0x09e0
        L_0x09db:
            r0.c()
            r0.c = r3
        L_0x09e0:
            aucj r1 = r0.b
            atda r1 = (defpackage.atda) r1
            r4 = 1
            r1.g = r4
            int r4 = r1.a
            r4 = r4 | 32
            r1.a = r4
            goto L_0x0a0d
        L_0x09ee:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x09f3
            goto L_0x09f8
        L_0x09f3:
            r0.c()
            r0.c = r3
        L_0x09f8:
            aucj r1 = r0.b
            atda r1 = (defpackage.atda) r1
            r1.g = r3
            int r4 = r1.a
            r4 = r4 | 32
            r1.a = r4
            goto L_0x0a0d
        L_0x0a05:
            java.lang.String r1 = r2.concat(r1)
        L_0x0a09:
            r0.<init>(r1)
            throw r0
        L_0x0a0d:
            java.lang.String r1 = r18.j()
            if (r1 == 0) goto L_0x0aa0
            java.lang.String r1 = r18.j()
            int r4 = r1.hashCode()
            switch(r4) {
                case 63566080: goto L_0x0a3d;
                case 94103840: goto L_0x0a33;
                case 570410685: goto L_0x0a29;
                case 1353037501: goto L_0x0a1f;
                default: goto L_0x0a1e;
            }
        L_0x0a1e:
            goto L_0x0a47
        L_0x0a1f:
            java.lang.String r4 = "INTERNAL"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x0a47
            r1 = 0
            goto L_0x0a48
        L_0x0a29:
            java.lang.String r4 = "internal"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x0a47
            r1 = 1
            goto L_0x0a48
        L_0x0a33:
            java.lang.String r4 = "burst"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x0a47
            r1 = 3
            goto L_0x0a48
        L_0x0a3d:
            java.lang.String r4 = "BURST"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x0a47
            r1 = 2
            goto L_0x0a48
        L_0x0a47:
            r1 = -1
        L_0x0a48:
            if (r1 == 0) goto L_0x0a8a
            r4 = 1
            if (r1 == r4) goto L_0x0a8a
            r4 = 2
            if (r1 == r4) goto L_0x0a73
            r4 = 3
            if (r1 == r4) goto L_0x0a73
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r18.j()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "Json2LiteBadEnum userlocation.ApiRate.upload_source "
            int r3 = r1.length()
            if (r3 != 0) goto L_0x0a6b
            java.lang.String r1 = new java.lang.String
            r1.<init>(r2)
            goto L_0x0a6f
        L_0x0a6b:
            java.lang.String r1 = r2.concat(r1)
        L_0x0a6f:
            r0.<init>(r1)
            throw r0
        L_0x0a73:
            boolean r1 = r0.c
            if (r1 == 0) goto L_0x0a7c
            r0.c()
            r0.c = r3
        L_0x0a7c:
            aucj r1 = r0.b
            atda r1 = (defpackage.atda) r1
            r4 = 1
            r1.h = r4
            int r4 = r1.a
            r4 = r4 | 64
            r1.a = r4
            goto L_0x0aa0
        L_0x0a8a:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x0a8f
            goto L_0x0a94
        L_0x0a8f:
            r0.c()
            r0.c = r3
        L_0x0a94:
            aucj r1 = r0.b
            atda r1 = (defpackage.atda) r1
            r1.h = r3
            int r4 = r1.a
            r4 = r4 | 64
            r1.a = r4
        L_0x0aa0:
            com.google.android.ulr.ApiBleRate r1 = r18.getBleRate()
            if (r1 == 0) goto L_0x0e2b
            com.google.android.ulr.ApiBleRate r1 = r18.getBleRate()
            if (r1 == 0) goto L_0x0e12
            atbv r4 = defpackage.atbv.g
            aucd r4 = r4.o()
            java.lang.String r10 = r1.f()
            if (r10 == 0) goto L_0x0d7b
            java.lang.String r10 = r1.f()
            int r11 = r10.hashCode()
            switch(r11) {
                case -2042815662: goto L_0x0bf7;
                case -1656155988: goto L_0x0bec;
                case -1484923863: goto L_0x0be1;
                case -1385659058: goto L_0x0bd6;
                case -1330467450: goto L_0x0bcb;
                case -891393195: goto L_0x0bc1;
                case -871495985: goto L_0x0bb6;
                case -863034019: goto L_0x0bab;
                case -665496214: goto L_0x0ba0;
                case -337314268: goto L_0x0b94;
                case -294865963: goto L_0x0b88;
                case -206149752: goto L_0x0b7d;
                case -84479774: goto L_0x0b71;
                case -59261374: goto L_0x0b66;
                case 22763946: goto L_0x0b5a;
                case 180682730: goto L_0x0b4f;
                case 193003762: goto L_0x0b43;
                case 433919643: goto L_0x0b38;
                case 607024323: goto L_0x0b2c;
                case 1025224214: goto L_0x0b21;
                case 1068890405: goto L_0x0b15;
                case 1151863002: goto L_0x0b09;
                case 1216546459: goto L_0x0afe;
                case 1424208890: goto L_0x0af4;
                case 1831583393: goto L_0x0ae8;
                case 1867842963: goto L_0x0adc;
                case 1918319192: goto L_0x0ad1;
                case 1927258678: goto L_0x0ac5;
                default: goto L_0x0ac3;
            }
        L_0x0ac3:
            goto L_0x0c02
        L_0x0ac5:
            java.lang.String r5 = "locationAwareBatchBackoffNearby"
            boolean r5 = r10.equals(r5)
            if (r5 == 0) goto L_0x0c02
            r5 = 21
            goto L_0x0c03
        L_0x0ad1:
            java.lang.String r5 = "locationAwareDefault"
            boolean r5 = r10.equals(r5)
            if (r5 == 0) goto L_0x0c02
            r5 = 5
            goto L_0x0c03
        L_0x0adc:
            java.lang.String r5 = "lowPowerOsBackoff"
            boolean r5 = r10.equals(r5)
            if (r5 == 0) goto L_0x0c02
            r5 = 27
            goto L_0x0c03
        L_0x0ae8:
            java.lang.String r5 = "LOCATION_AWARE_BATCH_SCANNING"
            boolean r5 = r10.equals(r5)
            if (r5 == 0) goto L_0x0c02
            r5 = 16
            goto L_0x0c03
        L_0x0af4:
            java.lang.String r6 = "LOCATION_AWARE_BATCH_BACKOFF_DEFAULT"
            boolean r6 = r10.equals(r6)
            if (r6 == 0) goto L_0x0c02
            goto L_0x0c03
        L_0x0afe:
            java.lang.String r5 = "PERIODIC"
            boolean r5 = r10.equals(r5)
            if (r5 == 0) goto L_0x0c02
            r5 = 2
            goto L_0x0c03
        L_0x0b09:
            java.lang.String r5 = "locationAwareLowPower"
            boolean r5 = r10.equals(r5)
            if (r5 == 0) goto L_0x0c02
            r5 = 23
            goto L_0x0c03
        L_0x0b15:
            java.lang.String r5 = "importantBeaconNearby"
            boolean r5 = r10.equals(r5)
            if (r5 == 0) goto L_0x0c02
            r5 = 15
            goto L_0x0c03
        L_0x0b21:
            java.lang.String r5 = "LOCATION_AWARE_DEFAULT"
            boolean r5 = r10.equals(r5)
            if (r5 == 0) goto L_0x0c02
            r5 = 4
            goto L_0x0c03
        L_0x0b2c:
            java.lang.String r5 = "activityBasedInVehicle"
            boolean r5 = r10.equals(r5)
            if (r5 == 0) goto L_0x0c02
            r5 = 13
            goto L_0x0c03
        L_0x0b38:
            java.lang.String r5 = "periodic"
            boolean r5 = r10.equals(r5)
            if (r5 == 0) goto L_0x0c02
            r5 = 3
            goto L_0x0c03
        L_0x0b43:
            java.lang.String r5 = "LOW_POWER_OS_BACKOFF"
            boolean r5 = r10.equals(r5)
            if (r5 == 0) goto L_0x0c02
            r5 = 26
            goto L_0x0c03
        L_0x0b4f:
            java.lang.String r5 = "LOCATION_AWARE_NEARBY"
            boolean r5 = r10.equals(r5)
            if (r5 == 0) goto L_0x0c02
            r5 = 6
            goto L_0x0c03
        L_0x0b5a:
            java.lang.String r5 = "ACTIVITY_BASED_MOVING"
            boolean r5 = r10.equals(r5)
            if (r5 == 0) goto L_0x0c02
            r5 = 10
            goto L_0x0c03
        L_0x0b66:
            java.lang.String r5 = "OPPORTUNISTIC_ONLY"
            boolean r5 = r10.equals(r5)
            if (r5 == 0) goto L_0x0c02
            r5 = 0
            goto L_0x0c03
        L_0x0b71:
            java.lang.String r5 = "locationAwareBatchScanning"
            boolean r5 = r10.equals(r5)
            if (r5 == 0) goto L_0x0c02
            r5 = 17
            goto L_0x0c03
        L_0x0b7d:
            java.lang.String r5 = "locationAwareNearby"
            boolean r5 = r10.equals(r5)
            if (r5 == 0) goto L_0x0c02
            r5 = 7
            goto L_0x0c03
        L_0x0b88:
            java.lang.String r5 = "lowPowerOs"
            boolean r5 = r10.equals(r5)
            if (r5 == 0) goto L_0x0c02
            r5 = 25
            goto L_0x0c03
        L_0x0b94:
            java.lang.String r5 = "activityBasedStill"
            boolean r5 = r10.equals(r5)
            if (r5 == 0) goto L_0x0c02
            r5 = 9
            goto L_0x0c03
        L_0x0ba0:
            java.lang.String r5 = "locationAwareBatchBackoffDefault"
            boolean r5 = r10.equals(r5)
            if (r5 == 0) goto L_0x0c02
            r5 = 19
            goto L_0x0c03
        L_0x0bab:
            java.lang.String r5 = "IMPORTANT_BEACON_NEARBY"
            boolean r5 = r10.equals(r5)
            if (r5 == 0) goto L_0x0c02
            r5 = 14
            goto L_0x0c03
        L_0x0bb6:
            java.lang.String r5 = "LOCATION_AWARE_LOW_POWER"
            boolean r5 = r10.equals(r5)
            if (r5 == 0) goto L_0x0c02
            r5 = 22
            goto L_0x0c03
        L_0x0bc1:
            java.lang.String r5 = "opportunisticOnly"
            boolean r5 = r10.equals(r5)
            if (r5 == 0) goto L_0x0c02
            r5 = 1
            goto L_0x0c03
        L_0x0bcb:
            java.lang.String r5 = "LOCATION_AWARE_BATCH_BACKOFF_NEARBY"
            boolean r5 = r10.equals(r5)
            if (r5 == 0) goto L_0x0c02
            r5 = 20
            goto L_0x0c03
        L_0x0bd6:
            java.lang.String r5 = "ACTIVITY_BASED_IN_VEHICLE"
            boolean r5 = r10.equals(r5)
            if (r5 == 0) goto L_0x0c02
            r5 = 12
            goto L_0x0c03
        L_0x0be1:
            java.lang.String r5 = "LOW_POWER_OS"
            boolean r5 = r10.equals(r5)
            if (r5 == 0) goto L_0x0c02
            r5 = 24
            goto L_0x0c03
        L_0x0bec:
            java.lang.String r5 = "ACTIVITY_BASED_STILL"
            boolean r5 = r10.equals(r5)
            if (r5 == 0) goto L_0x0c02
            r5 = 8
            goto L_0x0c03
        L_0x0bf7:
            java.lang.String r5 = "activityBasedMoving"
            boolean r5 = r10.equals(r5)
            if (r5 == 0) goto L_0x0c02
            r5 = 11
            goto L_0x0c03
        L_0x0c02:
            r5 = -1
        L_0x0c03:
            switch(r5) {
                case 0: goto L_0x0d5c;
                case 1: goto L_0x0d5c;
                case 2: goto L_0x0d45;
                case 3: goto L_0x0d45;
                case 4: goto L_0x0d2d;
                case 5: goto L_0x0d2d;
                case 6: goto L_0x0d15;
                case 7: goto L_0x0d15;
                case 8: goto L_0x0cfd;
                case 9: goto L_0x0cfd;
                case 10: goto L_0x0ce4;
                case 11: goto L_0x0ce4;
                case 12: goto L_0x0ccb;
                case 13: goto L_0x0ccb;
                case 14: goto L_0x0cb2;
                case 15: goto L_0x0cb2;
                case 16: goto L_0x0c98;
                case 17: goto L_0x0c98;
                case 18: goto L_0x0c80;
                case 19: goto L_0x0c80;
                case 20: goto L_0x0c68;
                case 21: goto L_0x0c68;
                case 22: goto L_0x0c4e;
                case 23: goto L_0x0c4e;
                case 24: goto L_0x0c36;
                case 25: goto L_0x0c36;
                case 26: goto L_0x0c1f;
                case 27: goto L_0x0c1f;
                default: goto L_0x0c06;
            }
        L_0x0c06:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.f()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "Json2LiteBadEnum userlocation.ApiBleRate.strategy "
            int r3 = r1.length()
            if (r3 != 0) goto L_0x0d73
            java.lang.String r1 = new java.lang.String
            r1.<init>(r2)
            goto L_0x0d77
        L_0x0c1f:
            boolean r2 = r4.c
            if (r2 == 0) goto L_0x0c28
            r4.c()
            r4.c = r3
        L_0x0c28:
            aucj r2 = r4.b
            atbv r2 = (defpackage.atbv) r2
            r2.b = r15
            int r5 = r2.a
            r6 = 1
            r5 = r5 | r6
            r2.a = r5
            goto L_0x0d7b
        L_0x0c36:
            boolean r2 = r4.c
            if (r2 != 0) goto L_0x0c3b
            goto L_0x0c40
        L_0x0c3b:
            r4.c()
            r4.c = r3
        L_0x0c40:
            aucj r2 = r4.b
            atbv r2 = (defpackage.atbv) r2
            r2.b = r14
            int r5 = r2.a
            r6 = 1
            r5 = r5 | r6
            r2.a = r5
            goto L_0x0d7b
        L_0x0c4e:
            boolean r2 = r4.c
            if (r2 != 0) goto L_0x0c53
            goto L_0x0c58
        L_0x0c53:
            r4.c()
            r4.c = r3
        L_0x0c58:
            aucj r2 = r4.b
            atbv r2 = (defpackage.atbv) r2
            r5 = 11
            r2.b = r5
            int r5 = r2.a
            r6 = 1
            r5 = r5 | r6
            r2.a = r5
            goto L_0x0d7b
        L_0x0c68:
            boolean r5 = r4.c
            if (r5 != 0) goto L_0x0c6d
            goto L_0x0c72
        L_0x0c6d:
            r4.c()
            r4.c = r3
        L_0x0c72:
            aucj r5 = r4.b
            atbv r5 = (defpackage.atbv) r5
            r5.b = r2
            int r2 = r5.a
            r6 = 1
            r2 = r2 | r6
            r5.a = r2
            goto L_0x0d7b
        L_0x0c80:
            boolean r2 = r4.c
            if (r2 != 0) goto L_0x0c85
            goto L_0x0c8a
        L_0x0c85:
            r4.c()
            r4.c = r3
        L_0x0c8a:
            aucj r2 = r4.b
            atbv r2 = (defpackage.atbv) r2
            r2.b = r12
            int r5 = r2.a
            r6 = 1
            r5 = r5 | r6
            r2.a = r5
            goto L_0x0d7b
        L_0x0c98:
            boolean r2 = r4.c
            if (r2 != 0) goto L_0x0c9d
            goto L_0x0ca2
        L_0x0c9d:
            r4.c()
            r4.c = r3
        L_0x0ca2:
            aucj r2 = r4.b
            atbv r2 = (defpackage.atbv) r2
            r5 = 8
            r2.b = r5
            int r5 = r2.a
            r6 = 1
            r5 = r5 | r6
            r2.a = r5
            goto L_0x0d7b
        L_0x0cb2:
            boolean r2 = r4.c
            if (r2 != 0) goto L_0x0cb7
            goto L_0x0cbc
        L_0x0cb7:
            r4.c()
            r4.c = r3
        L_0x0cbc:
            aucj r2 = r4.b
            atbv r2 = (defpackage.atbv) r2
            r5 = 7
            r2.b = r5
            int r5 = r2.a
            r6 = 1
            r5 = r5 | r6
            r2.a = r5
            goto L_0x0d7b
        L_0x0ccb:
            boolean r2 = r4.c
            if (r2 != 0) goto L_0x0cd0
            goto L_0x0cd5
        L_0x0cd0:
            r4.c()
            r4.c = r3
        L_0x0cd5:
            aucj r2 = r4.b
            atbv r2 = (defpackage.atbv) r2
            r5 = 6
            r2.b = r5
            int r5 = r2.a
            r6 = 1
            r5 = r5 | r6
            r2.a = r5
            goto L_0x0d7b
        L_0x0ce4:
            boolean r2 = r4.c
            if (r2 != 0) goto L_0x0ce9
            goto L_0x0cee
        L_0x0ce9:
            r4.c()
            r4.c = r3
        L_0x0cee:
            aucj r2 = r4.b
            atbv r2 = (defpackage.atbv) r2
            r5 = 5
            r2.b = r5
            int r5 = r2.a
            r6 = 1
            r5 = r5 | r6
            r2.a = r5
            goto L_0x0d7b
        L_0x0cfd:
            boolean r2 = r4.c
            if (r2 != 0) goto L_0x0d02
            goto L_0x0d07
        L_0x0d02:
            r4.c()
            r4.c = r3
        L_0x0d07:
            aucj r2 = r4.b
            atbv r2 = (defpackage.atbv) r2
            r5 = 4
            r2.b = r5
            int r5 = r2.a
            r6 = 1
            r5 = r5 | r6
            r2.a = r5
            goto L_0x0d7b
        L_0x0d15:
            boolean r2 = r4.c
            if (r2 != 0) goto L_0x0d1a
            goto L_0x0d1f
        L_0x0d1a:
            r4.c()
            r4.c = r3
        L_0x0d1f:
            aucj r2 = r4.b
            atbv r2 = (defpackage.atbv) r2
            r5 = 3
            r2.b = r5
            int r5 = r2.a
            r6 = 1
            r5 = r5 | r6
            r2.a = r5
            goto L_0x0d7b
        L_0x0d2d:
            boolean r2 = r4.c
            if (r2 != 0) goto L_0x0d32
            goto L_0x0d37
        L_0x0d32:
            r4.c()
            r4.c = r3
        L_0x0d37:
            aucj r2 = r4.b
            atbv r2 = (defpackage.atbv) r2
            r5 = 2
            r2.b = r5
            int r5 = r2.a
            r6 = 1
            r5 = r5 | r6
            r2.a = r5
            goto L_0x0d7b
        L_0x0d45:
            boolean r2 = r4.c
            if (r2 != 0) goto L_0x0d4a
            goto L_0x0d4f
        L_0x0d4a:
            r4.c()
            r4.c = r3
        L_0x0d4f:
            aucj r2 = r4.b
            atbv r2 = (defpackage.atbv) r2
            r5 = 1
            r2.b = r5
            int r6 = r2.a
            r5 = r5 | r6
            r2.a = r5
            goto L_0x0d7b
        L_0x0d5c:
            boolean r2 = r4.c
            if (r2 != 0) goto L_0x0d61
            goto L_0x0d66
        L_0x0d61:
            r4.c()
            r4.c = r3
        L_0x0d66:
            aucj r2 = r4.b
            atbv r2 = (defpackage.atbv) r2
            r2.b = r3
            int r5 = r2.a
            r6 = 1
            r5 = r5 | r6
            r2.a = r5
            goto L_0x0d7b
        L_0x0d73:
            java.lang.String r1 = r2.concat(r1)
        L_0x0d77:
            r0.<init>(r1)
            throw r0
        L_0x0d7b:
            java.lang.Long r2 = r1.b()
            if (r2 == 0) goto L_0x0d9f
            java.lang.Long r2 = r1.b()
            long r5 = r2.longValue()
            boolean r2 = r4.c
            if (r2 != 0) goto L_0x0d8e
            goto L_0x0d93
        L_0x0d8e:
            r4.c()
            r4.c = r3
        L_0x0d93:
            aucj r2 = r4.b
            atbv r2 = (defpackage.atbv) r2
            int r7 = r2.a
            r8 = 2
            r7 = r7 | r8
            r2.a = r7
            r2.c = r5
        L_0x0d9f:
            java.lang.Long r2 = r1.e()
            if (r2 == 0) goto L_0x0dc3
            java.lang.Long r2 = r1.e()
            long r5 = r2.longValue()
            boolean r2 = r4.c
            if (r2 != 0) goto L_0x0db2
            goto L_0x0db7
        L_0x0db2:
            r4.c()
            r4.c = r3
        L_0x0db7:
            aucj r2 = r4.b
            atbv r2 = (defpackage.atbv) r2
            int r7 = r2.a
            r8 = 4
            r7 = r7 | r8
            r2.a = r7
            r2.d = r5
        L_0x0dc3:
            java.lang.Long r2 = r1.d()
            if (r2 == 0) goto L_0x0de8
            java.lang.Long r2 = r1.d()
            long r5 = r2.longValue()
            boolean r2 = r4.c
            if (r2 != 0) goto L_0x0dd6
            goto L_0x0ddb
        L_0x0dd6:
            r4.c()
            r4.c = r3
        L_0x0ddb:
            aucj r2 = r4.b
            atbv r2 = (defpackage.atbv) r2
            int r7 = r2.a
            r8 = 8
            r7 = r7 | r8
            r2.a = r7
            r2.e = r5
        L_0x0de8:
            java.lang.Boolean r2 = r1.c()
            if (r2 == 0) goto L_0x0e0b
            java.lang.Boolean r1 = r1.c()
            boolean r1 = r1.booleanValue()
            boolean r2 = r4.c
            if (r2 != 0) goto L_0x0dfb
            goto L_0x0e00
        L_0x0dfb:
            r4.c()
            r4.c = r3
        L_0x0e00:
            aucj r2 = r4.b
            atbv r2 = (defpackage.atbv) r2
            int r5 = r2.a
            r5 = r5 | r13
            r2.a = r5
            r2.f = r1
        L_0x0e0b:
            aucj r1 = r4.i()
            atbv r1 = (defpackage.atbv) r1
            goto L_0x0e13
        L_0x0e12:
            r1 = 0
        L_0x0e13:
            boolean r2 = r0.c
            if (r2 == 0) goto L_0x0e1c
            r0.c()
            r0.c = r3
        L_0x0e1c:
            aucj r2 = r0.b
            atda r2 = (defpackage.atda) r2
            r1.getClass()
            r2.i = r1
            int r1 = r2.a
            r1 = r1 | 128(0x80, float:1.794E-43)
            r2.a = r1
        L_0x0e2b:
            java.lang.String r1 = r18.b()
            if (r1 == 0) goto L_0x0e4e
            java.lang.String r1 = r18.b()
            boolean r2 = r0.c
            if (r2 != 0) goto L_0x0e3a
            goto L_0x0e3f
        L_0x0e3a:
            r0.c()
            r0.c = r3
        L_0x0e3f:
            aucj r2 = r0.b
            atda r2 = (defpackage.atda) r2
            r1.getClass()
            int r4 = r2.a
            r4 = r4 | 256(0x100, float:3.59E-43)
            r2.a = r4
            r2.j = r1
        L_0x0e4e:
            java.lang.Boolean r1 = r18.c()
            if (r1 == 0) goto L_0x0e72
            java.lang.Boolean r1 = r18.c()
            boolean r1 = r1.booleanValue()
            boolean r2 = r0.c
            if (r2 != 0) goto L_0x0e61
            goto L_0x0e66
        L_0x0e61:
            r0.c()
            r0.c = r3
        L_0x0e66:
            aucj r2 = r0.b
            atda r2 = (defpackage.atda) r2
            int r3 = r2.a
            r3 = r3 | 512(0x200, float:7.175E-43)
            r2.a = r3
            r2.k = r1
        L_0x0e72:
            aucj r0 = r0.i()
            atda r0 = (defpackage.atda) r0
            return r0
        L_0x0e79:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alko.a(com.google.android.ulr.ApiRate):atda");
    }
}
