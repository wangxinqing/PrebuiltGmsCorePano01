package defpackage;

/* renamed from: alkm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alkm {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.atcn a(com.google.android.ulr.ApiLocationStatus r17) {
        /*
            if (r17 == 0) goto L_0x0489
            atcn r0 = defpackage.atcn.e
            aucd r0 = r0.o()
            java.lang.String r1 = r17.b()
            java.lang.String r2 = "unableToQueryDatabase"
            java.lang.String r3 = "INDETERMINATE"
            java.lang.String r4 = "IN_PROGRESS"
            java.lang.String r5 = "successful"
            java.lang.String r6 = "SCANS_DISABLED_IN_SETTINGS"
            java.lang.String r7 = "invalidScan"
            java.lang.String r8 = "scansDisabledInSettings"
            java.lang.String r9 = "NO_INFO_IN_DATABASE"
            java.lang.String r10 = "inProgress"
            java.lang.String r11 = "INVALID_SCAN"
            java.lang.String r12 = "LOCATION_DISABLED_IN_SETTINGS"
            r15 = 1
            r14 = 0
            if (r1 == 0) goto L_0x023a
            java.lang.String r1 = r17.b()
            int r16 = r1.hashCode()
            switch(r16) {
                case -1826628860: goto L_0x0109;
                case -1420949531: goto L_0x0100;
                case -1347010958: goto L_0x00f7;
                case -1346978814: goto L_0x00ef;
                case -1200738246: goto L_0x00e6;
                case -953198316: goto L_0x00dd;
                case -819942429: goto L_0x00d4;
                case -733631846: goto L_0x00cc;
                case -604548089: goto L_0x00c3;
                case -545586021: goto L_0x00ba;
                case -307635275: goto L_0x00b1;
                case -284840886: goto L_0x00a6;
                case -248539494: goto L_0x009b;
                case 72103296: goto L_0x008f;
                case 123146148: goto L_0x0084;
                case 433141802: goto L_0x0079;
                case 633138363: goto L_0x006d;
                case 875135279: goto L_0x0062;
                case 962184106: goto L_0x0056;
                case 1159928985: goto L_0x004a;
                case 1579806835: goto L_0x003f;
                case 1757262227: goto L_0x0033;
                default: goto L_0x0031;
            }
        L_0x0031:
            goto L_0x0112
        L_0x0033:
            java.lang.String r13 = "failToComputeLocation"
            boolean r1 = r1.equals(r13)
            if (r1 == 0) goto L_0x0112
            r1 = 19
            goto L_0x0113
        L_0x003f:
            java.lang.String r13 = "timedOutOnScan"
            boolean r1 = r1.equals(r13)
            if (r1 == 0) goto L_0x0112
            r1 = 5
            goto L_0x0113
        L_0x004a:
            java.lang.String r13 = "locationDisabledInSettings"
            boolean r1 = r1.equals(r13)
            if (r1 == 0) goto L_0x0112
            r1 = 15
            goto L_0x0113
        L_0x0056:
            java.lang.String r13 = "UNABLE_TO_QUERY_DATABASE"
            boolean r1 = r1.equals(r13)
            if (r1 == 0) goto L_0x0112
            r1 = 10
            goto L_0x0113
        L_0x0062:
            java.lang.String r13 = "noInfoInDatabase"
            boolean r1 = r1.equals(r13)
            if (r1 == 0) goto L_0x0112
            r1 = 7
            goto L_0x0113
        L_0x006d:
            java.lang.String r13 = "indeterminate"
            boolean r1 = r1.equals(r13)
            if (r1 == 0) goto L_0x0112
            r1 = 21
            goto L_0x0113
        L_0x0079:
            java.lang.String r13 = "UNKNOWN"
            boolean r1 = r1.equals(r13)
            if (r1 == 0) goto L_0x0112
            r1 = 2
            goto L_0x0113
        L_0x0084:
            java.lang.String r13 = "TIMED_OUT_ON_SCAN"
            boolean r1 = r1.equals(r13)
            if (r1 == 0) goto L_0x0112
            r1 = 4
            goto L_0x0113
        L_0x008f:
            java.lang.String r13 = "FAIL_TO_COMPUTE_LOCATION"
            boolean r1 = r1.equals(r13)
            if (r1 == 0) goto L_0x0112
            r1 = 18
            goto L_0x0113
        L_0x009b:
            java.lang.String r13 = "SUCCESSFUL"
            boolean r1 = r1.equals(r13)
            if (r1 == 0) goto L_0x0112
            r1 = 0
            goto L_0x0113
        L_0x00a6:
            java.lang.String r13 = "unknown"
            boolean r1 = r1.equals(r13)
            if (r1 == 0) goto L_0x0112
            r1 = 3
            goto L_0x0113
        L_0x00b1:
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0112
            r1 = 11
            goto L_0x0113
        L_0x00ba:
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0112
            r1 = 20
            goto L_0x0113
        L_0x00c3:
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x0112
            r1 = 16
            goto L_0x0113
        L_0x00cc:
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x0112
            r1 = 1
            goto L_0x0113
        L_0x00d4:
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x0112
            r1 = 12
            goto L_0x0113
        L_0x00dd:
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L_0x0112
            r1 = 9
            goto L_0x0113
        L_0x00e6:
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L_0x0112
            r1 = 13
            goto L_0x0113
        L_0x00ef:
            boolean r1 = r1.equals(r9)
            if (r1 == 0) goto L_0x0112
            r1 = 6
            goto L_0x0113
        L_0x00f7:
            boolean r1 = r1.equals(r10)
            if (r1 == 0) goto L_0x0112
            r1 = 17
            goto L_0x0113
        L_0x0100:
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x0112
            r1 = 8
            goto L_0x0113
        L_0x0109:
            boolean r1 = r1.equals(r12)
            if (r1 == 0) goto L_0x0112
            r1 = 14
            goto L_0x0113
        L_0x0112:
            r1 = -1
        L_0x0113:
            switch(r1) {
                case 0: goto L_0x021c;
                case 1: goto L_0x021c;
                case 2: goto L_0x0206;
                case 3: goto L_0x0206;
                case 4: goto L_0x01ef;
                case 5: goto L_0x01ef;
                case 6: goto L_0x01d8;
                case 7: goto L_0x01d8;
                case 8: goto L_0x01c1;
                case 9: goto L_0x01c1;
                case 10: goto L_0x01a9;
                case 11: goto L_0x01a9;
                case 12: goto L_0x0191;
                case 13: goto L_0x0191;
                case 14: goto L_0x0179;
                case 15: goto L_0x0179;
                case 16: goto L_0x0160;
                case 17: goto L_0x0160;
                case 18: goto L_0x0147;
                case 19: goto L_0x0147;
                case 20: goto L_0x012f;
                case 21: goto L_0x012f;
                default: goto L_0x0116;
            }
        L_0x0116:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r17.b()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "Json2LiteBadEnum userlocation.ApiLocationStatus.cell_status "
            int r3 = r1.length()
            if (r3 != 0) goto L_0x0232
            java.lang.String r1 = new java.lang.String
            r1.<init>(r2)
            goto L_0x0236
        L_0x012f:
            boolean r1 = r0.c
            if (r1 == 0) goto L_0x0138
            r0.c()
            r0.c = r14
        L_0x0138:
            aucj r1 = r0.b
            atcn r1 = (defpackage.atcn) r1
            r13 = 99
            r1.b = r13
            int r13 = r1.a
            r13 = r13 | r15
            r1.a = r13
            goto L_0x023a
        L_0x0147:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x014c
            goto L_0x0151
        L_0x014c:
            r0.c()
            r0.c = r14
        L_0x0151:
            aucj r1 = r0.b
            atcn r1 = (defpackage.atcn) r1
            r13 = 9
            r1.b = r13
            int r13 = r1.a
            r13 = r13 | r15
            r1.a = r13
            goto L_0x023a
        L_0x0160:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x0165
            goto L_0x016a
        L_0x0165:
            r0.c()
            r0.c = r14
        L_0x016a:
            aucj r1 = r0.b
            atcn r1 = (defpackage.atcn) r1
            r13 = 8
            r1.b = r13
            int r13 = r1.a
            r13 = r13 | r15
            r1.a = r13
            goto L_0x023a
        L_0x0179:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x017e
            goto L_0x0183
        L_0x017e:
            r0.c()
            r0.c = r14
        L_0x0183:
            aucj r1 = r0.b
            atcn r1 = (defpackage.atcn) r1
            r13 = 7
            r1.b = r13
            int r13 = r1.a
            r13 = r13 | r15
            r1.a = r13
            goto L_0x023a
        L_0x0191:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x0196
            goto L_0x019b
        L_0x0196:
            r0.c()
            r0.c = r14
        L_0x019b:
            aucj r1 = r0.b
            atcn r1 = (defpackage.atcn) r1
            r13 = 6
            r1.b = r13
            int r13 = r1.a
            r13 = r13 | r15
            r1.a = r13
            goto L_0x023a
        L_0x01a9:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x01ae
            goto L_0x01b3
        L_0x01ae:
            r0.c()
            r0.c = r14
        L_0x01b3:
            aucj r1 = r0.b
            atcn r1 = (defpackage.atcn) r1
            r13 = 5
            r1.b = r13
            int r13 = r1.a
            r13 = r13 | r15
            r1.a = r13
            goto L_0x023a
        L_0x01c1:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x01c6
            goto L_0x01cb
        L_0x01c6:
            r0.c()
            r0.c = r14
        L_0x01cb:
            aucj r1 = r0.b
            atcn r1 = (defpackage.atcn) r1
            r13 = 4
            r1.b = r13
            int r13 = r1.a
            r13 = r13 | r15
            r1.a = r13
            goto L_0x023a
        L_0x01d8:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x01dd
            goto L_0x01e2
        L_0x01dd:
            r0.c()
            r0.c = r14
        L_0x01e2:
            aucj r1 = r0.b
            atcn r1 = (defpackage.atcn) r1
            r13 = 3
            r1.b = r13
            int r13 = r1.a
            r13 = r13 | r15
            r1.a = r13
            goto L_0x023a
        L_0x01ef:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x01f4
            goto L_0x01f9
        L_0x01f4:
            r0.c()
            r0.c = r14
        L_0x01f9:
            aucj r1 = r0.b
            atcn r1 = (defpackage.atcn) r1
            r13 = 2
            r1.b = r13
            int r13 = r1.a
            r13 = r13 | r15
            r1.a = r13
            goto L_0x023a
        L_0x0206:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x020b
            goto L_0x0210
        L_0x020b:
            r0.c()
            r0.c = r14
        L_0x0210:
            aucj r1 = r0.b
            atcn r1 = (defpackage.atcn) r1
            r1.b = r15
            int r13 = r1.a
            r13 = r13 | r15
            r1.a = r13
            goto L_0x023a
        L_0x021c:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x0221
            goto L_0x0226
        L_0x0221:
            r0.c()
            r0.c = r14
        L_0x0226:
            aucj r1 = r0.b
            atcn r1 = (defpackage.atcn) r1
            r1.b = r14
            int r13 = r1.a
            r13 = r13 | r15
            r1.a = r13
            goto L_0x023a
        L_0x0232:
            java.lang.String r1 = r2.concat(r1)
        L_0x0236:
            r0.<init>(r1)
            throw r0
        L_0x023a:
            java.lang.String r1 = r17.d()
            if (r1 == 0) goto L_0x045e
            java.lang.String r1 = r17.d()
            int r13 = r1.hashCode()
            switch(r13) {
                case -1826628860: goto L_0x0323;
                case -1420949531: goto L_0x031a;
                case -1347010958: goto L_0x0311;
                case -1346978814: goto L_0x0309;
                case -1200738246: goto L_0x0300;
                case -953198316: goto L_0x02f7;
                case -819942429: goto L_0x02ee;
                case -733631846: goto L_0x02e6;
                case -604548089: goto L_0x02dd;
                case -545586021: goto L_0x02d4;
                case -307635275: goto L_0x02cb;
                case -284840886: goto L_0x02c0;
                case -248539494: goto L_0x02b5;
                case 72103296: goto L_0x02a9;
                case 123146148: goto L_0x029e;
                case 433141802: goto L_0x0293;
                case 633138363: goto L_0x0287;
                case 875135279: goto L_0x027c;
                case 962184106: goto L_0x0270;
                case 1159928985: goto L_0x0264;
                case 1579806835: goto L_0x0259;
                case 1757262227: goto L_0x024d;
                default: goto L_0x024b;
            }
        L_0x024b:
            goto L_0x032c
        L_0x024d:
            java.lang.String r2 = "failToComputeLocation"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x032c
            r13 = 19
            goto L_0x032d
        L_0x0259:
            java.lang.String r2 = "timedOutOnScan"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x032c
            r13 = 5
            goto L_0x032d
        L_0x0264:
            java.lang.String r2 = "locationDisabledInSettings"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x032c
            r13 = 15
            goto L_0x032d
        L_0x0270:
            java.lang.String r2 = "UNABLE_TO_QUERY_DATABASE"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x032c
            r13 = 10
            goto L_0x032d
        L_0x027c:
            java.lang.String r2 = "noInfoInDatabase"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x032c
            r13 = 7
            goto L_0x032d
        L_0x0287:
            java.lang.String r2 = "indeterminate"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x032c
            r13 = 21
            goto L_0x032d
        L_0x0293:
            java.lang.String r2 = "UNKNOWN"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x032c
            r13 = 2
            goto L_0x032d
        L_0x029e:
            java.lang.String r2 = "TIMED_OUT_ON_SCAN"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x032c
            r13 = 4
            goto L_0x032d
        L_0x02a9:
            java.lang.String r2 = "FAIL_TO_COMPUTE_LOCATION"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x032c
            r13 = 18
            goto L_0x032d
        L_0x02b5:
            java.lang.String r2 = "SUCCESSFUL"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x032c
            r13 = 0
            goto L_0x032d
        L_0x02c0:
            java.lang.String r2 = "unknown"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x032c
            r13 = 3
            goto L_0x032d
        L_0x02cb:
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x032c
            r13 = 11
            goto L_0x032d
        L_0x02d4:
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x032c
            r13 = 20
            goto L_0x032d
        L_0x02dd:
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x032c
            r13 = 16
            goto L_0x032d
        L_0x02e6:
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x032c
            r13 = 1
            goto L_0x032d
        L_0x02ee:
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x032c
            r13 = 12
            goto L_0x032d
        L_0x02f7:
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L_0x032c
            r13 = 9
            goto L_0x032d
        L_0x0300:
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L_0x032c
            r13 = 13
            goto L_0x032d
        L_0x0309:
            boolean r1 = r1.equals(r9)
            if (r1 == 0) goto L_0x032c
            r13 = 6
            goto L_0x032d
        L_0x0311:
            boolean r1 = r1.equals(r10)
            if (r1 == 0) goto L_0x032c
            r13 = 17
            goto L_0x032d
        L_0x031a:
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x032c
            r13 = 8
            goto L_0x032d
        L_0x0323:
            boolean r1 = r1.equals(r12)
            if (r1 == 0) goto L_0x032c
            r13 = 14
            goto L_0x032d
        L_0x032c:
            r13 = -1
        L_0x032d:
            switch(r13) {
                case 0: goto L_0x043f;
                case 1: goto L_0x043f;
                case 2: goto L_0x0428;
                case 3: goto L_0x0428;
                case 4: goto L_0x0411;
                case 5: goto L_0x0411;
                case 6: goto L_0x03f9;
                case 7: goto L_0x03f9;
                case 8: goto L_0x03e1;
                case 9: goto L_0x03e1;
                case 10: goto L_0x03c8;
                case 11: goto L_0x03c8;
                case 12: goto L_0x03af;
                case 13: goto L_0x03af;
                case 14: goto L_0x0396;
                case 15: goto L_0x0396;
                case 16: goto L_0x037c;
                case 17: goto L_0x037c;
                case 18: goto L_0x0362;
                case 19: goto L_0x0362;
                case 20: goto L_0x0349;
                case 21: goto L_0x0349;
                default: goto L_0x0330;
            }
        L_0x0330:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r17.d()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "Json2LiteBadEnum userlocation.ApiLocationStatus.wifi_status "
            int r3 = r1.length()
            if (r3 != 0) goto L_0x0456
            java.lang.String r1 = new java.lang.String
            r1.<init>(r2)
            goto L_0x045a
        L_0x0349:
            boolean r1 = r0.c
            if (r1 == 0) goto L_0x0352
            r0.c()
            r0.c = r14
        L_0x0352:
            aucj r1 = r0.b
            atcn r1 = (defpackage.atcn) r1
            r2 = 99
            r1.c = r2
            int r2 = r1.a
            r3 = 2
            r2 = r2 | r3
            r1.a = r2
            goto L_0x045e
        L_0x0362:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x0367
            goto L_0x036c
        L_0x0367:
            r0.c()
            r0.c = r14
        L_0x036c:
            aucj r1 = r0.b
            atcn r1 = (defpackage.atcn) r1
            r2 = 9
            r1.c = r2
            int r2 = r1.a
            r3 = 2
            r2 = r2 | r3
            r1.a = r2
            goto L_0x045e
        L_0x037c:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x0381
            goto L_0x0386
        L_0x0381:
            r0.c()
            r0.c = r14
        L_0x0386:
            aucj r1 = r0.b
            atcn r1 = (defpackage.atcn) r1
            r2 = 8
            r1.c = r2
            int r2 = r1.a
            r3 = 2
            r2 = r2 | r3
            r1.a = r2
            goto L_0x045e
        L_0x0396:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x039b
            goto L_0x03a0
        L_0x039b:
            r0.c()
            r0.c = r14
        L_0x03a0:
            aucj r1 = r0.b
            atcn r1 = (defpackage.atcn) r1
            r2 = 7
            r1.c = r2
            int r2 = r1.a
            r3 = 2
            r2 = r2 | r3
            r1.a = r2
            goto L_0x045e
        L_0x03af:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x03b4
            goto L_0x03b9
        L_0x03b4:
            r0.c()
            r0.c = r14
        L_0x03b9:
            aucj r1 = r0.b
            atcn r1 = (defpackage.atcn) r1
            r2 = 6
            r1.c = r2
            int r2 = r1.a
            r3 = 2
            r2 = r2 | r3
            r1.a = r2
            goto L_0x045e
        L_0x03c8:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x03cd
            goto L_0x03d2
        L_0x03cd:
            r0.c()
            r0.c = r14
        L_0x03d2:
            aucj r1 = r0.b
            atcn r1 = (defpackage.atcn) r1
            r2 = 5
            r1.c = r2
            int r2 = r1.a
            r3 = 2
            r2 = r2 | r3
            r1.a = r2
            goto L_0x045e
        L_0x03e1:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x03e6
            goto L_0x03eb
        L_0x03e6:
            r0.c()
            r0.c = r14
        L_0x03eb:
            aucj r1 = r0.b
            atcn r1 = (defpackage.atcn) r1
            r2 = 4
            r1.c = r2
            int r2 = r1.a
            r3 = 2
            r2 = r2 | r3
            r1.a = r2
            goto L_0x045e
        L_0x03f9:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x03fe
            goto L_0x0403
        L_0x03fe:
            r0.c()
            r0.c = r14
        L_0x0403:
            aucj r1 = r0.b
            atcn r1 = (defpackage.atcn) r1
            r2 = 3
            r1.c = r2
            int r2 = r1.a
            r3 = 2
            r2 = r2 | r3
            r1.a = r2
            goto L_0x045e
        L_0x0411:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x0416
            goto L_0x041b
        L_0x0416:
            r0.c()
            r0.c = r14
        L_0x041b:
            aucj r1 = r0.b
            atcn r1 = (defpackage.atcn) r1
            r2 = 2
            r1.c = r2
            int r3 = r1.a
            r2 = r2 | r3
            r1.a = r2
            goto L_0x045e
        L_0x0428:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x042d
            goto L_0x0432
        L_0x042d:
            r0.c()
            r0.c = r14
        L_0x0432:
            aucj r1 = r0.b
            atcn r1 = (defpackage.atcn) r1
            r1.c = r15
            int r2 = r1.a
            r3 = 2
            r2 = r2 | r3
            r1.a = r2
            goto L_0x045e
        L_0x043f:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x0444
            goto L_0x0449
        L_0x0444:
            r0.c()
            r0.c = r14
        L_0x0449:
            aucj r1 = r0.b
            atcn r1 = (defpackage.atcn) r1
            r1.c = r14
            int r2 = r1.a
            r3 = 2
            r2 = r2 | r3
            r1.a = r2
            goto L_0x045e
        L_0x0456:
            java.lang.String r1 = r2.concat(r1)
        L_0x045a:
            r0.<init>(r1)
            throw r0
        L_0x045e:
            java.lang.Boolean r1 = r17.c()
            if (r1 == 0) goto L_0x0482
            java.lang.Boolean r1 = r17.c()
            boolean r1 = r1.booleanValue()
            boolean r2 = r0.c
            if (r2 != 0) goto L_0x0471
            goto L_0x0476
        L_0x0471:
            r0.c()
            r0.c = r14
        L_0x0476:
            aucj r2 = r0.b
            atcn r2 = (defpackage.atcn) r2
            int r3 = r2.a
            r4 = 4
            r3 = r3 | r4
            r2.a = r3
            r2.d = r1
        L_0x0482:
            aucj r0 = r0.i()
            atcn r0 = (defpackage.atcn) r0
            return r0
        L_0x0489:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alkm.a(com.google.android.ulr.ApiLocationStatus):atcn");
    }
}
