package defpackage;

/* renamed from: allb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class allb {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.aten a(com.google.android.ulr.WifiStrengthProto r14) {
        /*
            aten r0 = defpackage.aten.j
            aucd r0 = r0.o()
            java.lang.Long r1 = r14.e()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x002a
            java.lang.Long r1 = r14.e()
            long r4 = r1.longValue()
            boolean r1 = r0.c
            if (r1 == 0) goto L_0x001f
            r0.c()
            r0.c = r3
        L_0x001f:
            aucj r1 = r0.b
            aten r1 = (defpackage.aten) r1
            int r6 = r1.a
            r6 = r6 | r2
            r1.a = r6
            r1.b = r4
        L_0x002a:
            java.lang.Integer r1 = r14.g()
            r4 = 2
            if (r1 == 0) goto L_0x004e
            java.lang.Integer r1 = r14.g()
            int r1 = r1.intValue()
            boolean r5 = r0.c
            if (r5 != 0) goto L_0x003e
            goto L_0x0043
        L_0x003e:
            r0.c()
            r0.c = r3
        L_0x0043:
            aucj r5 = r0.b
            aten r5 = (defpackage.aten) r5
            int r6 = r5.a
            r6 = r6 | r4
            r5.a = r6
            r5.c = r1
        L_0x004e:
            java.lang.String r1 = r14.h()
            r5 = -1
            r6 = 5
            r7 = 8
            r8 = 3
            r9 = 4
            if (r1 == 0) goto L_0x018e
            java.lang.String r1 = r14.h()
            int r10 = r1.hashCode()
            switch(r10) {
                case -2038298883: goto L_0x00db;
                case -2038287759: goto L_0x00d1;
                case -2021675505: goto L_0x00c6;
                case -1392815138: goto L_0x00bb;
                case -781704820: goto L_0x00b1;
                case -781693696: goto L_0x00a7;
                case -781168582: goto L_0x009c;
                case -284840886: goto L_0x0092;
                case 2402104: goto L_0x0088;
                case 3387192: goto L_0x007e;
                case 433141802: goto L_0x0073;
                case 1057280835: goto L_0x0067;
                default: goto L_0x0065;
            }
        L_0x0065:
            goto L_0x00e5
        L_0x0067:
            java.lang.String r10 = "securedOther"
            boolean r1 = r1.equals(r10)
            if (r1 == 0) goto L_0x00e5
            r1 = 11
            goto L_0x00e6
        L_0x0073:
            java.lang.String r10 = "UNKNOWN"
            boolean r1 = r1.equals(r10)
            if (r1 == 0) goto L_0x00e5
            r1 = 0
            goto L_0x00e6
        L_0x007e:
            java.lang.String r10 = "none"
            boolean r1 = r1.equals(r10)
            if (r1 == 0) goto L_0x00e5
            r1 = 3
            goto L_0x00e6
        L_0x0088:
            java.lang.String r10 = "NONE"
            boolean r1 = r1.equals(r10)
            if (r1 == 0) goto L_0x00e5
            r1 = 2
            goto L_0x00e6
        L_0x0092:
            java.lang.String r10 = "unknown"
            boolean r1 = r1.equals(r10)
            if (r1 == 0) goto L_0x00e5
            r1 = 1
            goto L_0x00e6
        L_0x009c:
            java.lang.String r10 = "wpsEap"
            boolean r1 = r1.equals(r10)
            if (r1 == 0) goto L_0x00e5
            r1 = 9
            goto L_0x00e6
        L_0x00a7:
            java.lang.String r10 = "wpaPsk"
            boolean r1 = r1.equals(r10)
            if (r1 == 0) goto L_0x00e5
            r1 = 5
            goto L_0x00e6
        L_0x00b1:
            java.lang.String r10 = "wpaEap"
            boolean r1 = r1.equals(r10)
            if (r1 == 0) goto L_0x00e5
            r1 = 7
            goto L_0x00e6
        L_0x00bb:
            java.lang.String r10 = "SECURED_OTHER"
            boolean r1 = r1.equals(r10)
            if (r1 == 0) goto L_0x00e5
            r1 = 10
            goto L_0x00e6
        L_0x00c6:
            java.lang.String r10 = "WPS_EAP"
            boolean r1 = r1.equals(r10)
            if (r1 == 0) goto L_0x00e5
            r1 = 8
            goto L_0x00e6
        L_0x00d1:
            java.lang.String r10 = "WPA_PSK"
            boolean r1 = r1.equals(r10)
            if (r1 == 0) goto L_0x00e5
            r1 = 4
            goto L_0x00e6
        L_0x00db:
            java.lang.String r10 = "WPA_EAP"
            boolean r1 = r1.equals(r10)
            if (r1 == 0) goto L_0x00e5
            r1 = 6
            goto L_0x00e6
        L_0x00e5:
            r1 = -1
        L_0x00e6:
            switch(r1) {
                case 0: goto L_0x0170;
                case 1: goto L_0x0170;
                case 2: goto L_0x015a;
                case 3: goto L_0x015a;
                case 4: goto L_0x0144;
                case 5: goto L_0x0144;
                case 6: goto L_0x012e;
                case 7: goto L_0x012e;
                case 8: goto L_0x0118;
                case 9: goto L_0x0118;
                case 10: goto L_0x0102;
                case 11: goto L_0x0102;
                default: goto L_0x00e9;
            }
        L_0x00e9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r14 = r14.h()
            java.lang.String r14 = java.lang.String.valueOf(r14)
            java.lang.String r1 = "Json2LiteBadEnum userlocation.WifiStrengthProto.wifi_auth_type "
            int r2 = r14.length()
            if (r2 != 0) goto L_0x0186
            java.lang.String r14 = new java.lang.String
            r14.<init>(r1)
            goto L_0x018a
        L_0x0102:
            boolean r1 = r0.c
            if (r1 == 0) goto L_0x010b
            r0.c()
            r0.c = r3
        L_0x010b:
            aucj r1 = r0.b
            aten r1 = (defpackage.aten) r1
            r1.d = r9
            int r10 = r1.a
            r10 = r10 | r9
            r1.a = r10
            goto L_0x018e
        L_0x0118:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x011d
            goto L_0x0122
        L_0x011d:
            r0.c()
            r0.c = r3
        L_0x0122:
            aucj r1 = r0.b
            aten r1 = (defpackage.aten) r1
            r1.d = r8
            int r10 = r1.a
            r10 = r10 | r9
            r1.a = r10
            goto L_0x018e
        L_0x012e:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x0133
            goto L_0x0138
        L_0x0133:
            r0.c()
            r0.c = r3
        L_0x0138:
            aucj r1 = r0.b
            aten r1 = (defpackage.aten) r1
            r1.d = r8
            int r10 = r1.a
            r10 = r10 | r9
            r1.a = r10
            goto L_0x018e
        L_0x0144:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x0149
            goto L_0x014e
        L_0x0149:
            r0.c()
            r0.c = r3
        L_0x014e:
            aucj r1 = r0.b
            aten r1 = (defpackage.aten) r1
            r1.d = r4
            int r10 = r1.a
            r10 = r10 | r9
            r1.a = r10
            goto L_0x018e
        L_0x015a:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x015f
            goto L_0x0164
        L_0x015f:
            r0.c()
            r0.c = r3
        L_0x0164:
            aucj r1 = r0.b
            aten r1 = (defpackage.aten) r1
            r1.d = r2
            int r10 = r1.a
            r10 = r10 | r9
            r1.a = r10
            goto L_0x018e
        L_0x0170:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x0175
            goto L_0x017a
        L_0x0175:
            r0.c()
            r0.c = r3
        L_0x017a:
            aucj r1 = r0.b
            aten r1 = (defpackage.aten) r1
            r1.d = r3
            int r10 = r1.a
            r10 = r10 | r9
            r1.a = r10
            goto L_0x018e
        L_0x0186:
            java.lang.String r14 = r1.concat(r14)
        L_0x018a:
            r0.<init>(r14)
            throw r0
        L_0x018e:
            java.lang.Boolean r1 = r14.d()
            if (r1 == 0) goto L_0x01b1
            java.lang.Boolean r1 = r14.d()
            boolean r1 = r1.booleanValue()
            boolean r10 = r0.c
            if (r10 != 0) goto L_0x01a1
            goto L_0x01a6
        L_0x01a1:
            r0.c()
            r0.c = r3
        L_0x01a6:
            aucj r10 = r0.b
            aten r10 = (defpackage.aten) r10
            int r11 = r10.a
            r11 = r11 | r7
            r10.a = r11
            r10.e = r1
        L_0x01b1:
            java.lang.Integer r1 = r14.c()
            if (r1 == 0) goto L_0x01d5
            java.lang.Integer r1 = r14.c()
            int r1 = r1.intValue()
            boolean r10 = r0.c
            if (r10 != 0) goto L_0x01c4
            goto L_0x01c9
        L_0x01c4:
            r0.c()
            r0.c = r3
        L_0x01c9:
            aucj r10 = r0.b
            aten r10 = (defpackage.aten) r10
            int r11 = r10.a
            r11 = r11 | 16
            r10.a = r11
            r10.f = r1
        L_0x01d5:
            com.google.android.ulr.RttRangingProto r1 = r14.getRttRanging()
            if (r1 == 0) goto L_0x02b8
            com.google.android.ulr.RttRangingProto r1 = r14.getRttRanging()
            if (r1 == 0) goto L_0x029e
            ateo r10 = defpackage.ateo.g
            aucd r10 = r10.o()
            java.lang.Integer r11 = r1.b()
            if (r11 == 0) goto L_0x020a
            java.lang.Integer r11 = r1.b()
            int r11 = r11.intValue()
            boolean r12 = r10.c
            if (r12 != 0) goto L_0x01fa
            goto L_0x01ff
        L_0x01fa:
            r10.c()
            r10.c = r3
        L_0x01ff:
            aucj r12 = r10.b
            ateo r12 = (defpackage.ateo) r12
            int r13 = r12.a
            r13 = r13 | r2
            r12.a = r13
            r12.b = r11
        L_0x020a:
            java.lang.Integer r11 = r1.f()
            if (r11 == 0) goto L_0x022d
            java.lang.Integer r11 = r1.f()
            int r11 = r11.intValue()
            boolean r12 = r10.c
            if (r12 != 0) goto L_0x021d
            goto L_0x0222
        L_0x021d:
            r10.c()
            r10.c = r3
        L_0x0222:
            aucj r12 = r10.b
            ateo r12 = (defpackage.ateo) r12
            int r13 = r12.a
            r13 = r13 | r4
            r12.a = r13
            r12.c = r11
        L_0x022d:
            java.lang.Integer r11 = r1.e()
            if (r11 == 0) goto L_0x0250
            java.lang.Integer r11 = r1.e()
            int r11 = r11.intValue()
            boolean r12 = r10.c
            if (r12 != 0) goto L_0x0240
            goto L_0x0245
        L_0x0240:
            r10.c()
            r10.c = r3
        L_0x0245:
            aucj r12 = r10.b
            ateo r12 = (defpackage.ateo) r12
            int r13 = r12.a
            r13 = r13 | r9
            r12.a = r13
            r12.d = r11
        L_0x0250:
            java.lang.Integer r11 = r1.d()
            if (r11 == 0) goto L_0x0273
            java.lang.Integer r11 = r1.d()
            int r11 = r11.intValue()
            boolean r12 = r10.c
            if (r12 != 0) goto L_0x0263
            goto L_0x0268
        L_0x0263:
            r10.c()
            r10.c = r3
        L_0x0268:
            aucj r12 = r10.b
            ateo r12 = (defpackage.ateo) r12
            int r13 = r12.a
            r7 = r7 | r13
            r12.a = r7
            r12.e = r11
        L_0x0273:
            java.lang.Integer r7 = r1.c()
            if (r7 == 0) goto L_0x0297
            java.lang.Integer r1 = r1.c()
            int r1 = r1.intValue()
            boolean r7 = r10.c
            if (r7 != 0) goto L_0x0286
            goto L_0x028b
        L_0x0286:
            r10.c()
            r10.c = r3
        L_0x028b:
            aucj r7 = r10.b
            ateo r7 = (defpackage.ateo) r7
            int r11 = r7.a
            r11 = r11 | 16
            r7.a = r11
            r7.f = r1
        L_0x0297:
            aucj r1 = r10.i()
            ateo r1 = (defpackage.ateo) r1
            goto L_0x029f
        L_0x029e:
            r1 = 0
        L_0x029f:
            boolean r7 = r0.c
            if (r7 != 0) goto L_0x02a4
            goto L_0x02a9
        L_0x02a4:
            r0.c()
            r0.c = r3
        L_0x02a9:
            aucj r7 = r0.b
            aten r7 = (defpackage.aten) r7
            r1.getClass()
            r7.g = r1
            int r1 = r7.a
            r1 = r1 | 32
            r7.a = r1
        L_0x02b8:
            java.lang.String r1 = r14.f()
            if (r1 == 0) goto L_0x02db
            java.lang.String r1 = r14.f()
            boolean r7 = r0.c
            if (r7 != 0) goto L_0x02c7
            goto L_0x02cc
        L_0x02c7:
            r0.c()
            r0.c = r3
        L_0x02cc:
            aucj r7 = r0.b
            aten r7 = (defpackage.aten) r7
            r1.getClass()
            int r10 = r7.a
            r10 = r10 | 64
            r7.a = r10
            r7.h = r1
        L_0x02db:
            java.lang.String r1 = r14.b()
            if (r1 == 0) goto L_0x039a
            java.lang.String r1 = r14.b()
            int r7 = r1.hashCode()
            switch(r7) {
                case -2032180703: goto L_0x031f;
                case -1643146279: goto L_0x0315;
                case -1469529418: goto L_0x030b;
                case 489256948: goto L_0x0301;
                case 633404823: goto L_0x02f7;
                case 1544803905: goto L_0x02ed;
                default: goto L_0x02ec;
            }
        L_0x02ec:
            goto L_0x0329
        L_0x02ed:
            java.lang.String r7 = "default"
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L_0x0329
            r5 = 1
            goto L_0x032a
        L_0x02f7:
            java.lang.String r7 = "smartbatchingActive"
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L_0x0329
            r5 = 3
            goto L_0x032a
        L_0x0301:
            java.lang.String r7 = "SMARTBATCHING_ACTIVE"
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L_0x0329
            r5 = 2
            goto L_0x032a
        L_0x030b:
            java.lang.String r7 = "smartbatchingPassive"
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L_0x0329
            r5 = 5
            goto L_0x032a
        L_0x0315:
            java.lang.String r7 = "SMARTBATCHING_PASSIVE"
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L_0x0329
            r5 = 4
            goto L_0x032a
        L_0x031f:
            java.lang.String r7 = "DEFAULT"
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L_0x0329
            r5 = 0
            goto L_0x032a
        L_0x0329:
        L_0x032a:
            if (r5 == 0) goto L_0x0384
            if (r5 == r2) goto L_0x0384
            if (r5 == r4) goto L_0x036d
            if (r5 == r8) goto L_0x036d
            if (r5 == r9) goto L_0x0356
            if (r5 == r6) goto L_0x0356
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r14 = r14.b()
            java.lang.String r14 = java.lang.String.valueOf(r14)
            java.lang.String r1 = "Json2LiteBadEnum userlocation.WifiStrengthProto.collection_point "
            int r2 = r14.length()
            if (r2 != 0) goto L_0x034e
            java.lang.String r14 = new java.lang.String
            r14.<init>(r1)
            goto L_0x0352
        L_0x034e:
            java.lang.String r14 = r1.concat(r14)
        L_0x0352:
            r0.<init>(r14)
            throw r0
        L_0x0356:
            boolean r14 = r0.c
            if (r14 != 0) goto L_0x035b
            goto L_0x0360
        L_0x035b:
            r0.c()
            r0.c = r3
        L_0x0360:
            aucj r14 = r0.b
            aten r14 = (defpackage.aten) r14
            r14.i = r4
            int r1 = r14.a
            r1 = r1 | 128(0x80, float:1.794E-43)
            r14.a = r1
            goto L_0x039a
        L_0x036d:
            boolean r14 = r0.c
            if (r14 != 0) goto L_0x0372
            goto L_0x0377
        L_0x0372:
            r0.c()
            r0.c = r3
        L_0x0377:
            aucj r14 = r0.b
            aten r14 = (defpackage.aten) r14
            r14.i = r2
            int r1 = r14.a
            r1 = r1 | 128(0x80, float:1.794E-43)
            r14.a = r1
            goto L_0x039a
        L_0x0384:
            boolean r14 = r0.c
            if (r14 != 0) goto L_0x0389
            goto L_0x038e
        L_0x0389:
            r0.c()
            r0.c = r3
        L_0x038e:
            aucj r14 = r0.b
            aten r14 = (defpackage.aten) r14
            r14.i = r3
            int r1 = r14.a
            r1 = r1 | 128(0x80, float:1.794E-43)
            r14.a = r1
        L_0x039a:
            aucj r14 = r0.i()
            aten r14 = (defpackage.aten) r14
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.allb.a(com.google.android.ulr.WifiStrengthProto):aten");
    }
}
