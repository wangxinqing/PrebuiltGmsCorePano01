package defpackage;

/* renamed from: akut  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akut {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.rhj a(defpackage.adue r29, boolean r30) {
        /*
            r0 = r29
            com.google.android.gms.userlocation.SemanticLocation r0 = r0.a
            java.util.List r1 = r0.f
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            int r0 = r1.size()
            r3 = 0
            r4 = 0
        L_0x0011:
            if (r4 >= r0) goto L_0x003a
            java.lang.Object r5 = r1.get(r4)
            com.google.android.gms.userlocation.PlaceEstimate r5 = (com.google.android.gms.userlocation.PlaceEstimate) r5
            java.lang.String r6 = r5.b
            java.lang.String r5 = r5.d
            if (r5 != 0) goto L_0x0020
            goto L_0x0037
        L_0x0020:
            boolean r7 = r2.containsKey(r5)
            if (r7 != 0) goto L_0x002e
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r2.put(r5, r7)
        L_0x002e:
            java.lang.Object r5 = r2.get(r5)
            java.util.List r5 = (java.util.List) r5
            r5.add(r6)
        L_0x0037:
            int r4 = r4 + 1
            goto L_0x0011
        L_0x003a:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            int r5 = r1.size()
            r6 = 0
        L_0x0044:
            if (r6 >= r5) goto L_0x0456
            java.lang.Object r0 = r1.get(r6)
            r7 = r0
            com.google.android.gms.userlocation.PlaceEstimate r7 = (com.google.android.gms.userlocation.PlaceEstimate) r7
            java.lang.String r8 = r7.b
            java.lang.String r9 = r7.f
            r12 = 15
            r13 = 38
            r14 = 25
            r15 = 19
            r16 = 8
            r17 = 6
            r18 = 7
            r19 = 2
            r20 = 47
            r21 = 44
            r22 = 9
            r23 = 3
            r24 = 41
            r10 = 5
            r25 = 43
            r26 = 34
            java.util.Locale r0 = java.util.Locale.US     // Catch:{ IllegalArgumentException -> 0x03fb }
            java.lang.String r0 = r9.toUpperCase(r0)     // Catch:{ IllegalArgumentException -> 0x03fb }
            int r27 = r0.hashCode()
            r28 = 1
            switch(r27) {
                case -2133131170: goto L_0x02c9;
                case -2070287508: goto L_0x02be;
                case -2056856391: goto L_0x02b3;
                case -2009481710: goto L_0x02a8;
                case -1874876554: goto L_0x029d;
                case -1799129208: goto L_0x0292;
                case -1740549496: goto L_0x0288;
                case -1433764466: goto L_0x027d;
                case -1287375043: goto L_0x0272;
                case -1179629603: goto L_0x0266;
                case -1105543472: goto L_0x025a;
                case -1065450959: goto L_0x024f;
                case -999706252: goto L_0x0243;
                case -894356301: goto L_0x0237;
                case -833971400: goto L_0x022b;
                case -773714870: goto L_0x021f;
                case -385085615: goto L_0x0213;
                case -343723391: goto L_0x0208;
                case -287115508: goto L_0x01fc;
                case -273684309: goto L_0x01f1;
                case -208715283: goto L_0x01e5;
                case -141928716: goto L_0x01d9;
                case -64738588: goto L_0x01cd;
                case 65146: goto L_0x01c2;
                case 65523: goto L_0x01b7;
                case 71067: goto L_0x01ab;
                case 2031164: goto L_0x01a0;
                case 2060701: goto L_0x0194;
                case 2448362: goto L_0x0188;
                case 62540519: goto L_0x017c;
                case 75532016: goto L_0x0171;
                case 79233217: goto L_0x0165;
                case 201865848: goto L_0x0159;
                case 231355088: goto L_0x014d;
                case 464692167: goto L_0x0141;
                case 474306890: goto L_0x0135;
                case 478998074: goto L_0x0129;
                case 556625165: goto L_0x011d;
                case 662588263: goto L_0x0111;
                case 676684226: goto L_0x0105;
                case 1136324006: goto L_0x00f9;
                case 1230821159: goto L_0x00ed;
                case 1263663902: goto L_0x00e1;
                case 1336748448: goto L_0x00d5;
                case 1386153741: goto L_0x00c9;
                case 1440722907: goto L_0x00bd;
                case 1661418246: goto L_0x00b1;
                case 1839456654: goto L_0x00a5;
                case 1951856096: goto L_0x0099;
                case 1955267708: goto L_0x008d;
                case 2127033948: goto L_0x0081;
                default: goto L_0x007f;
            }
        L_0x007f:
            goto L_0x02d4
        L_0x0081:
            java.lang.String r11 = "HEALTH"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x02d4
            r0 = 34
            goto L_0x02d5
        L_0x008d:
            java.lang.String r11 = "BEAUTY"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x02d4
            r0 = 33
            goto L_0x02d5
        L_0x0099:
            java.lang.String r11 = "BAKERY"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x02d4
            r0 = 10
            goto L_0x02d5
        L_0x00a5:
            java.lang.String r11 = "CULTURE"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x02d4
            r0 = 12
            goto L_0x02d5
        L_0x00b1:
            java.lang.String r11 = "OUTLET_MALL"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x02d4
            r0 = 32
            goto L_0x02d5
        L_0x00bd:
            java.lang.String r11 = "FAST_FOOD_RESTAURANT"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x02d4
            r0 = 11
            goto L_0x02d5
        L_0x00c9:
            java.lang.String r11 = "HISTORICAL_LANDMARK"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x02d4
            r0 = 14
            goto L_0x02d5
        L_0x00d5:
            java.lang.String r11 = "FOOD_STORE"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x02d4
            r0 = 28
            goto L_0x02d5
        L_0x00e1:
            java.lang.String r11 = "FORTRESS"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x02d4
            r0 = 50
            goto L_0x02d5
        L_0x00ed:
            java.lang.String r11 = "HISTORIC_SITE"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x02d4
            r0 = 15
            goto L_0x02d5
        L_0x00f9:
            java.lang.String r11 = "PLACE_OF_WORSHIP"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x02d4
            r0 = 20
            goto L_0x02d5
        L_0x0105:
            java.lang.String r11 = "MOVIE_THEATER"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x02d4
            r0 = 18
            goto L_0x02d5
        L_0x0111:
            java.lang.String r11 = "ATTRACTION"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x02d4
            r0 = 17
            goto L_0x02d5
        L_0x011d:
            java.lang.String r11 = "REAL_ESTATE"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x02d4
            r0 = 45
            goto L_0x02d5
        L_0x0129:
            java.lang.String r11 = "HOSPITAL"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x02d4
            r0 = 38
            goto L_0x02d5
        L_0x0135:
            java.lang.String r11 = "CLOTHING_STORE"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x02d4
            r0 = 27
            goto L_0x02d5
        L_0x0141:
            java.lang.String r11 = "MONUMENT"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x02d4
            r0 = 49
            goto L_0x02d5
        L_0x014d:
            java.lang.String r11 = "AMUSEMENT_PARK"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x02d4
            r0 = 23
            goto L_0x02d5
        L_0x0159:
            java.lang.String r11 = "CAR_REPAIR"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x02d4
            r0 = 46
            goto L_0x02d5
        L_0x0165:
            java.lang.String r11 = "STORE"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x02d4
            r0 = 29
            goto L_0x02d5
        L_0x0171:
            java.lang.String r11 = "OTHER"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x02d4
            r0 = 0
            goto L_0x02d5
        L_0x017c:
            java.lang.String r11 = "ARENA"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x02d4
            r0 = 25
            goto L_0x02d5
        L_0x0188:
            java.lang.String r11 = "PARK"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x02d4
            r0 = 19
            goto L_0x02d5
        L_0x0194:
            java.lang.String r11 = "CAFE"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x02d4
            r0 = 8
            goto L_0x02d5
        L_0x01a0:
            java.lang.String r11 = "BANK"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x02d4
            r0 = 6
            goto L_0x02d5
        L_0x01ab:
            java.lang.String r11 = "GYM"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x02d4
            r0 = 35
            goto L_0x02d5
        L_0x01b7:
            java.lang.String r11 = "BAR"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x02d4
            r0 = 7
            goto L_0x02d5
        L_0x01c2:
            java.lang.String r11 = "ATM"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x02d4
            r0 = 5
            goto L_0x02d5
        L_0x01cd:
            java.lang.String r11 = "NATURE_PRESERVE"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x02d4
            r0 = 48
            goto L_0x02d5
        L_0x01d9:
            java.lang.String r11 = "NIGHTLIFE"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x02d4
            r0 = 22
            goto L_0x02d5
        L_0x01e5:
            java.lang.String r11 = "WHOLESALE_GROCER"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x02d4
            r0 = 31
            goto L_0x02d5
        L_0x01f1:
            java.lang.String r11 = "AIRPORT"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x02d4
            r0 = 1
            goto L_0x02d5
        L_0x01fc:
            java.lang.String r11 = "SHOPPING_CENTER"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x02d4
            r0 = 30
            goto L_0x02d5
        L_0x0208:
            java.lang.String r11 = "BUS_STOP"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x02d4
            r0 = 2
            goto L_0x02d5
        L_0x0213:
            java.lang.String r11 = "ENTERTAINMENT_AND_RECREATION"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x02d4
            r0 = 21
            goto L_0x02d5
        L_0x021f:
            java.lang.String r11 = "EVENT_VENUE"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x02d4
            r0 = 24
            goto L_0x02d5
        L_0x022b:
            java.lang.String r11 = "LANDMARK"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x02d4
            r0 = 47
            goto L_0x02d5
        L_0x0237:
            java.lang.String r11 = "PHARMACY"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x02d4
            r0 = 36
            goto L_0x02d5
        L_0x0243:
            java.lang.String r11 = "PUBLIC_SERVICES"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x02d4
            r0 = 44
            goto L_0x02d5
        L_0x024f:
            java.lang.String r11 = "ASSOCIATION_OR_ORGANIZATION"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x02d4
            r0 = 4
            goto L_0x02d5
        L_0x025a:
            java.lang.String r11 = "INDOOR_LODGING"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x02d4
            r0 = 40
            goto L_0x02d5
        L_0x0266:
            java.lang.String r11 = "STADIUM"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x02d4
            r0 = 26
            goto L_0x02d5
        L_0x0272:
            java.lang.String r11 = "RESTAURANT"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x02d4
            r0 = 9
            goto L_0x02d5
        L_0x027d:
            java.lang.String r11 = "GAS_STATION"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x02d4
            r0 = 39
            goto L_0x02d5
        L_0x0288:
            java.lang.String r11 = "TRANSIT_STATION"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x02d4
            r0 = 3
            goto L_0x02d5
        L_0x0292:
            java.lang.String r11 = "EDUCATION"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x02d4
            r0 = 13
            goto L_0x02d5
        L_0x029d:
            java.lang.String r11 = "PROFESSIONAL_SERVICES"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x02d4
            r0 = 43
            goto L_0x02d5
        L_0x02a8:
            java.lang.String r11 = "MUSEUM"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x02d4
            r0 = 16
            goto L_0x02d5
        L_0x02b3:
            java.lang.String r11 = "PRODUCTION"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x02d4
            r0 = 41
            goto L_0x02d5
        L_0x02be:
            java.lang.String r11 = "EMERGENCY_SERVICES"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x02d4
            r0 = 37
            goto L_0x02d5
        L_0x02c9:
            java.lang.String r11 = "SERVICES"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x02d4
            r0 = 42
            goto L_0x02d5
        L_0x02d4:
            r0 = -1
        L_0x02d5:
            switch(r0) {
                case 0: goto L_0x0382;
                case 1: goto L_0x0380;
                case 2: goto L_0x037d;
                case 3: goto L_0x037a;
                case 4: goto L_0x0378;
                case 5: goto L_0x0376;
                case 6: goto L_0x0374;
                case 7: goto L_0x0372;
                case 8: goto L_0x036f;
                case 9: goto L_0x036c;
                case 10: goto L_0x0369;
                case 11: goto L_0x0366;
                case 12: goto L_0x0363;
                case 13: goto L_0x0360;
                case 14: goto L_0x035d;
                case 15: goto L_0x035a;
                case 16: goto L_0x0357;
                case 17: goto L_0x0356;
                case 18: goto L_0x0353;
                case 19: goto L_0x0350;
                case 20: goto L_0x034d;
                case 21: goto L_0x034a;
                case 22: goto L_0x0347;
                case 23: goto L_0x0344;
                case 24: goto L_0x0341;
                case 25: goto L_0x033e;
                case 26: goto L_0x033b;
                case 27: goto L_0x0338;
                case 28: goto L_0x0334;
                case 29: goto L_0x0330;
                case 30: goto L_0x032c;
                case 31: goto L_0x0328;
                case 32: goto L_0x0324;
                case 33: goto L_0x0320;
                case 34: goto L_0x031c;
                case 35: goto L_0x0318;
                case 36: goto L_0x0314;
                case 37: goto L_0x0310;
                case 38: goto L_0x030c;
                case 39: goto L_0x0308;
                case 40: goto L_0x0304;
                case 41: goto L_0x0300;
                case 42: goto L_0x02fc;
                case 43: goto L_0x02f8;
                case 44: goto L_0x02f4;
                case 45: goto L_0x02f0;
                case 46: goto L_0x02ec;
                case 47: goto L_0x02e8;
                case 48: goto L_0x02e4;
                case 49: goto L_0x02e0;
                case 50: goto L_0x02dc;
                default: goto L_0x02d8;
            }
        L_0x02d8:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x03fb }
            goto L_0x03f7
        L_0x02dc:
            r10 = 44
            goto L_0x0383
        L_0x02e0:
            r10 = 43
            goto L_0x0383
        L_0x02e4:
            r10 = 42
            goto L_0x0383
        L_0x02e8:
            r10 = 41
            goto L_0x0383
        L_0x02ec:
            r10 = 37
            goto L_0x0383
        L_0x02f0:
            r10 = 31
            goto L_0x0383
        L_0x02f4:
            r10 = 30
            goto L_0x0383
        L_0x02f8:
            r10 = 29
            goto L_0x0383
        L_0x02fc:
            r10 = 33
            goto L_0x0383
        L_0x0300:
            r10 = 28
            goto L_0x0383
        L_0x0304:
            r10 = 22
            goto L_0x0383
        L_0x0308:
            r10 = 18
            goto L_0x0383
        L_0x030c:
            r10 = 21
            goto L_0x0383
        L_0x0310:
            r10 = 14
            goto L_0x0383
        L_0x0314:
            r10 = 26
            goto L_0x0383
        L_0x0318:
            r10 = 19
            goto L_0x0383
        L_0x031c:
            r10 = 20
            goto L_0x0383
        L_0x0320:
            r10 = 8
            goto L_0x0383
        L_0x0324:
            r10 = 40
            goto L_0x0383
        L_0x0328:
            r10 = 38
            goto L_0x0383
        L_0x032c:
            r10 = 34
            goto L_0x0383
        L_0x0330:
            r10 = 35
            goto L_0x0383
        L_0x0334:
            r10 = 17
            goto L_0x0383
        L_0x0338:
            r10 = 11
            goto L_0x0383
        L_0x033b:
            r10 = 48
            goto L_0x0383
        L_0x033e:
            r10 = 47
            goto L_0x0383
        L_0x0341:
            r10 = 16
            goto L_0x0383
        L_0x0344:
            r10 = 49
            goto L_0x0383
        L_0x0347:
            r10 = 24
            goto L_0x0383
        L_0x034a:
            r10 = 15
            goto L_0x0383
        L_0x034d:
            r10 = 27
            goto L_0x0383
        L_0x0350:
            r10 = 25
            goto L_0x0383
        L_0x0353:
            r10 = 23
            goto L_0x0383
        L_0x0356:
            goto L_0x0383
        L_0x0357:
            r10 = 50
            goto L_0x0383
        L_0x035a:
            r10 = 46
            goto L_0x0383
        L_0x035d:
            r10 = 45
            goto L_0x0383
        L_0x0360:
            r10 = 13
            goto L_0x0383
        L_0x0363:
            r10 = 12
            goto L_0x0383
        L_0x0366:
            r10 = 51
            goto L_0x0383
        L_0x0369:
            r10 = 39
            goto L_0x0383
        L_0x036c:
            r10 = 32
            goto L_0x0383
        L_0x036f:
            r10 = 10
            goto L_0x0383
        L_0x0372:
            r10 = 7
            goto L_0x0383
        L_0x0374:
            r10 = 6
            goto L_0x0383
        L_0x0376:
            r10 = 4
            goto L_0x0383
        L_0x0378:
            r10 = 3
            goto L_0x0383
        L_0x037a:
            r10 = 36
            goto L_0x0383
        L_0x037d:
            r10 = 9
            goto L_0x0383
        L_0x0380:
            r10 = 2
            goto L_0x0383
        L_0x0382:
            r10 = 1
        L_0x0383:
            int r10 = r10 + -1
            switch(r10) {
                case 1: goto L_0x03f5;
                case 2: goto L_0x03f2;
                case 3: goto L_0x03f0;
                case 4: goto L_0x03f2;
                case 5: goto L_0x03ed;
                case 6: goto L_0x03ea;
                case 7: goto L_0x03e7;
                case 8: goto L_0x03e4;
                case 9: goto L_0x03e1;
                case 10: goto L_0x03de;
                case 11: goto L_0x03f2;
                case 12: goto L_0x03f2;
                case 13: goto L_0x03db;
                case 14: goto L_0x03f2;
                case 15: goto L_0x03d8;
                case 16: goto L_0x03d5;
                case 17: goto L_0x03d2;
                case 18: goto L_0x03cf;
                case 19: goto L_0x03cc;
                case 20: goto L_0x03db;
                case 21: goto L_0x03c9;
                case 22: goto L_0x03c5;
                case 23: goto L_0x03c1;
                case 24: goto L_0x03bd;
                case 25: goto L_0x03b9;
                case 26: goto L_0x03b5;
                case 27: goto L_0x03d5;
                case 28: goto L_0x03f2;
                case 29: goto L_0x03f2;
                case 30: goto L_0x03b1;
                case 31: goto L_0x03ad;
                case 32: goto L_0x03f2;
                case 33: goto L_0x03a9;
                case 34: goto L_0x03a5;
                case 35: goto L_0x03a1;
                case 36: goto L_0x039d;
                case 37: goto L_0x0399;
                case 38: goto L_0x0396;
                case 39: goto L_0x03a9;
                case 40: goto L_0x0392;
                case 41: goto L_0x0392;
                case 42: goto L_0x0392;
                case 43: goto L_0x0392;
                case 44: goto L_0x03f2;
                case 45: goto L_0x03f2;
                case 46: goto L_0x03d8;
                case 47: goto L_0x03d8;
                case 48: goto L_0x038f;
                case 49: goto L_0x038b;
                case 50: goto L_0x03ad;
                default: goto L_0x0388;
            }     // Catch:{ IllegalArgumentException -> 0x03fb }
        L_0x0388:
            r0 = 0
            goto L_0x0420
        L_0x038b:
            r0 = 66
            goto L_0x0420
        L_0x038f:
            r0 = 3
            goto L_0x0420
        L_0x0392:
            r0 = 1013(0x3f5, float:1.42E-42)
            goto L_0x0420
        L_0x0396:
            r0 = 7
            goto L_0x0420
        L_0x0399:
            r0 = 38
            goto L_0x0420
        L_0x039d:
            r0 = 19
            goto L_0x0420
        L_0x03a1:
            r0 = 1030(0x406, float:1.443E-42)
            goto L_0x0420
        L_0x03a5:
            r0 = 88
            goto L_0x0420
        L_0x03a9:
            r0 = 84
            goto L_0x0420
        L_0x03ad:
            r0 = 79
            goto L_0x0420
        L_0x03b1:
            r0 = 78
            goto L_0x0420
        L_0x03b5:
            r0 = 74
            goto L_0x0420
        L_0x03b9:
            r0 = 72
            goto L_0x0420
        L_0x03bd:
            r0 = 69
            goto L_0x0420
        L_0x03c1:
            r0 = 67
            goto L_0x0420
        L_0x03c5:
            r0 = 64
            goto L_0x0420
        L_0x03c9:
            r0 = 59
            goto L_0x0420
        L_0x03cc:
            r0 = 47
            goto L_0x0420
        L_0x03cf:
            r0 = 44
            goto L_0x0420
        L_0x03d2:
            r0 = 41
            goto L_0x0420
        L_0x03d5:
            r0 = 43
            goto L_0x0420
        L_0x03d8:
            r0 = 86
            goto L_0x0420
        L_0x03db:
            r0 = 50
            goto L_0x0420
        L_0x03de:
            r0 = 25
            goto L_0x0420
        L_0x03e1:
            r0 = 15
            goto L_0x0420
        L_0x03e4:
            r0 = 14
            goto L_0x0420
        L_0x03e7:
            r0 = 10
            goto L_0x0420
        L_0x03ea:
            r0 = 9
            goto L_0x0420
        L_0x03ed:
            r0 = 8
            goto L_0x0420
        L_0x03f0:
            r0 = 6
            goto L_0x0420
        L_0x03f2:
            r0 = 34
            goto L_0x0420
        L_0x03f5:
            r0 = 2
            goto L_0x0420
        L_0x03f7:
            r0.<init>()     // Catch:{ IllegalArgumentException -> 0x03fb }
            throw r0     // Catch:{ IllegalArgumentException -> 0x03fb }
        L_0x03fb:
            r0 = move-exception
            java.lang.String r0 = "Places"
            boolean r10 = android.util.Log.isLoggable(r0, r10)
            if (r10 == 0) goto L_0x041e
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.String r10 = "Unable to find category ID for category "
            int r11 = r9.length()
            if (r11 != 0) goto L_0x0416
            java.lang.String r9 = new java.lang.String
            r9.<init>(r10)
            goto L_0x041a
        L_0x0416:
            java.lang.String r9 = r10.concat(r9)
        L_0x041a:
            android.util.Log.w(r0, r9)
            goto L_0x041f
        L_0x041e:
        L_0x041f:
            r0 = 0
        L_0x0420:
            r9 = 0
            r11 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.util.List r13 = java.util.Collections.singletonList(r0)
            com.google.android.gms.location.places.internal.PlaceEntity r0 = defpackage.akhp.a(r8, r9, r11, r13)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.lang.String r9 = r7.b
            boolean r9 = r2.containsKey(r9)
            if (r9 == 0) goto L_0x0445
            java.lang.String r8 = r7.b
            java.lang.Object r8 = r2.get(r8)
            java.util.List r8 = (java.util.List) r8
        L_0x0445:
            float r9 = r7.g
            float r10 = r7.c
            int r7 = r7.e
            com.google.android.gms.location.places.internal.HierarchicalPlaceLikelihoodEntity r0 = com.google.android.gms.location.places.internal.HierarchicalPlaceLikelihoodEntity.a(r0, r9, r10, r7, r8)
            r4.add(r0)
            int r6 = r6 + 1
            goto L_0x0044
        L_0x0456:
            if (r30 == 0) goto L_0x0459
            goto L_0x045e
        L_0x0459:
            java.util.Comparator r0 = defpackage.akus.a
            java.util.Collections.sort(r4, r0)
        L_0x045e:
            rhj r0 = new rhj
            java.lang.String[] r1 = defpackage.rks.b
            ilm r1 = com.google.android.gms.common.data.DataHolder.a((java.lang.String[]) r1)
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            int r5 = r4.size()
            r6 = 0
        L_0x0470:
            if (r6 >= r5) goto L_0x04c0
            java.lang.Object r7 = r4.get(r6)
            com.google.android.gms.location.places.internal.HierarchicalPlaceLikelihoodEntity r7 = (com.google.android.gms.location.places.internal.HierarchicalPlaceLikelihoodEntity) r7
            com.google.android.gms.location.places.internal.PlaceEntity r8 = r7.b
            android.content.ContentValues r8 = r8.s()
            float r9 = r7.c
            java.lang.Float r9 = java.lang.Float.valueOf(r9)
            java.lang.String r10 = "place_likelihood"
            r8.put(r10, r9)
            float r9 = r7.d
            java.lang.Float r9 = java.lang.Float.valueOf(r9)
            java.lang.String r10 = "place_hierarchy_likelihood"
            r8.put(r10, r9)
            int r9 = r7.e
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.String r10 = "place_hierarchy_level"
            r8.put(r10, r9)
            java.util.List r9 = r7.f
            byte[] r9 = defpackage.ilj.c((java.util.List) r9)
            java.lang.String r10 = "place_contained_place_ids"
            r8.put(r10, r9)
            byte[] r9 = defpackage.ivy.a(r7)
            java.lang.String r10 = "data"
            r8.put(r10, r9)
            r1.a((android.content.ContentValues) r8)
            com.google.android.gms.location.places.internal.PlaceEntity r7 = r7.b
            java.util.List r7 = r7.n
            r2.addAll(r7)
            int r6 = r6 + 1
            goto L_0x0470
        L_0x04c0:
            java.lang.String r2 = defpackage.rjd.a(r2)
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            if (r4 != 0) goto L_0x04d3
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            defpackage.ria.a(r4, r2)
            goto L_0x04d4
        L_0x04d3:
            r4 = 0
        L_0x04d4:
            com.google.android.gms.common.data.DataHolder r1 = r1.a(r3, r4)
            r2 = 105(0x69, float:1.47E-43)
            r0.<init>(r1, r3, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akut.a(adue, boolean):rhj");
    }
}
