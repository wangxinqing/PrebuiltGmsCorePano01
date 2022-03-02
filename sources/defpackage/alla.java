package defpackage;

/* renamed from: alla  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alla {
    /* JADX WARNING: type inference failed for: r1v11, types: [aucj] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.aujq a(com.google.android.ulr.VisibleNetwork r11) {
        /*
            aujq r0 = defpackage.aujq.f
            aucd r0 = r0.o()
            com.google.android.ulr.VisibleNetworkWiFi r1 = r11.getWifi()
            r2 = 0
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L_0x007d
            com.google.android.ulr.VisibleNetworkWiFi r1 = r11.getWifi()
            if (r1 == 0) goto L_0x0067
            aujp r6 = defpackage.aujp.d
            aucd r6 = r6.o()
            java.lang.String r7 = r1.b()
            if (r7 == 0) goto L_0x003d
            java.lang.String r7 = r1.b()
            boolean r8 = r6.c
            if (r8 == 0) goto L_0x002f
            r6.c()
            r6.c = r5
        L_0x002f:
            aucj r8 = r6.b
            aujp r8 = (defpackage.aujp) r8
            r7.getClass()
            int r9 = r8.a
            r9 = r9 | r4
            r8.a = r9
            r8.b = r7
        L_0x003d:
            java.lang.Integer r7 = r1.c()
            if (r7 == 0) goto L_0x0060
            java.lang.Integer r1 = r1.c()
            int r1 = r1.intValue()
            boolean r7 = r6.c
            if (r7 != 0) goto L_0x0050
            goto L_0x0055
        L_0x0050:
            r6.c()
            r6.c = r5
        L_0x0055:
            aucj r7 = r6.b
            aujp r7 = (defpackage.aujp) r7
            int r8 = r7.a
            r8 = r8 | r3
            r7.a = r8
            r7.c = r1
        L_0x0060:
            aucj r1 = r6.i()
            aujp r1 = (defpackage.aujp) r1
            goto L_0x0068
        L_0x0067:
            r1 = r2
        L_0x0068:
            boolean r6 = r0.c
            if (r6 != 0) goto L_0x006d
            goto L_0x0072
        L_0x006d:
            r0.c()
            r0.c = r5
        L_0x0072:
            aucj r6 = r0.b
            aujq r6 = (defpackage.aujq) r6
            r1.getClass()
            r6.c = r1
            r6.b = r4
        L_0x007d:
            com.google.android.ulr.VisibleNetworkCell r1 = r11.getCell()
            r6 = 8
            r7 = 4
            if (r1 == 0) goto L_0x02b5
            com.google.android.ulr.VisibleNetworkCell r1 = r11.getCell()
            if (r1 == 0) goto L_0x029f
            aujo r2 = defpackage.aujo.j
            aucd r2 = r2.o()
            java.lang.String r8 = r1.i()
            if (r8 == 0) goto L_0x019e
            java.lang.String r8 = r1.i()
            int r9 = r8.hashCode()
            r10 = 3
            switch(r9) {
                case -284840886: goto L_0x0102;
                case 70881: goto L_0x00f8;
                case 75709: goto L_0x00ee;
                case 102657: goto L_0x00e4;
                case 107485: goto L_0x00da;
                case 2063797: goto L_0x00d0;
                case 3048885: goto L_0x00c6;
                case 82410124: goto L_0x00bb;
                case 112947884: goto L_0x00b0;
                case 433141802: goto L_0x00a6;
                default: goto L_0x00a4;
            }
        L_0x00a4:
            goto L_0x010c
        L_0x00a6:
            java.lang.String r9 = "UNKNOWN"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x010c
            r8 = 0
            goto L_0x010d
        L_0x00b0:
            java.lang.String r9 = "wcdma"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x010c
            r8 = 9
            goto L_0x010d
        L_0x00bb:
            java.lang.String r9 = "WCDMA"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x010c
            r8 = 8
            goto L_0x010d
        L_0x00c6:
            java.lang.String r9 = "cdma"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x010c
            r8 = 7
            goto L_0x010d
        L_0x00d0:
            java.lang.String r9 = "CDMA"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x010c
            r8 = 6
            goto L_0x010d
        L_0x00da:
            java.lang.String r9 = "lte"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x010c
            r8 = 5
            goto L_0x010d
        L_0x00e4:
            java.lang.String r9 = "gsm"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x010c
            r8 = 3
            goto L_0x010d
        L_0x00ee:
            java.lang.String r9 = "LTE"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x010c
            r8 = 4
            goto L_0x010d
        L_0x00f8:
            java.lang.String r9 = "GSM"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x010c
            r8 = 2
            goto L_0x010d
        L_0x0102:
            java.lang.String r9 = "unknown"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x010c
            r8 = 1
            goto L_0x010d
        L_0x010c:
            r8 = -1
        L_0x010d:
            switch(r8) {
                case 0: goto L_0x0180;
                case 1: goto L_0x0180;
                case 2: goto L_0x016a;
                case 3: goto L_0x016a;
                case 4: goto L_0x0154;
                case 5: goto L_0x0154;
                case 6: goto L_0x013e;
                case 7: goto L_0x013e;
                case 8: goto L_0x0129;
                case 9: goto L_0x0129;
                default: goto L_0x0110;
            }
        L_0x0110:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r1.i()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Json2LiteBadEnum location.unified.VisibleNetwork.Cell.type "
            int r2 = r0.length()
            if (r2 != 0) goto L_0x0196
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            goto L_0x019a
        L_0x0129:
            boolean r8 = r2.c
            if (r8 == 0) goto L_0x0132
            r2.c()
            r2.c = r5
        L_0x0132:
            aucj r8 = r2.b
            aujo r8 = (defpackage.aujo) r8
            r8.b = r7
            int r9 = r8.a
            r4 = r4 | r9
            r8.a = r4
            goto L_0x019e
        L_0x013e:
            boolean r8 = r2.c
            if (r8 != 0) goto L_0x0143
            goto L_0x0148
        L_0x0143:
            r2.c()
            r2.c = r5
        L_0x0148:
            aucj r8 = r2.b
            aujo r8 = (defpackage.aujo) r8
            r8.b = r10
            int r9 = r8.a
            r4 = r4 | r9
            r8.a = r4
            goto L_0x019e
        L_0x0154:
            boolean r8 = r2.c
            if (r8 != 0) goto L_0x0159
            goto L_0x015e
        L_0x0159:
            r2.c()
            r2.c = r5
        L_0x015e:
            aucj r8 = r2.b
            aujo r8 = (defpackage.aujo) r8
            r8.b = r3
            int r9 = r8.a
            r4 = r4 | r9
            r8.a = r4
            goto L_0x019e
        L_0x016a:
            boolean r8 = r2.c
            if (r8 != 0) goto L_0x016f
            goto L_0x0174
        L_0x016f:
            r2.c()
            r2.c = r5
        L_0x0174:
            aucj r8 = r2.b
            aujo r8 = (defpackage.aujo) r8
            r8.b = r4
            int r9 = r8.a
            r4 = r4 | r9
            r8.a = r4
            goto L_0x019e
        L_0x0180:
            boolean r8 = r2.c
            if (r8 != 0) goto L_0x0185
            goto L_0x018a
        L_0x0185:
            r2.c()
            r2.c = r5
        L_0x018a:
            aucj r8 = r2.b
            aujo r8 = (defpackage.aujo) r8
            r8.b = r5
            int r9 = r8.a
            r4 = r4 | r9
            r8.a = r4
            goto L_0x019e
        L_0x0196:
            java.lang.String r0 = r1.concat(r0)
        L_0x019a:
            r11.<init>(r0)
            throw r11
        L_0x019e:
            java.lang.Integer r4 = r1.b()
            if (r4 == 0) goto L_0x01c1
            java.lang.Integer r4 = r1.b()
            int r4 = r4.intValue()
            boolean r8 = r2.c
            if (r8 != 0) goto L_0x01b1
            goto L_0x01b6
        L_0x01b1:
            r2.c()
            r2.c = r5
        L_0x01b6:
            aucj r8 = r2.b
            aujo r8 = (defpackage.aujo) r8
            int r9 = r8.a
            r9 = r9 | r3
            r8.a = r9
            r8.c = r4
        L_0x01c1:
            java.lang.Integer r4 = r1.c()
            if (r4 == 0) goto L_0x01e4
            java.lang.Integer r4 = r1.c()
            int r4 = r4.intValue()
            boolean r8 = r2.c
            if (r8 != 0) goto L_0x01d4
            goto L_0x01d9
        L_0x01d4:
            r2.c()
            r2.c = r5
        L_0x01d9:
            aucj r8 = r2.b
            aujo r8 = (defpackage.aujo) r8
            int r9 = r8.a
            r9 = r9 | r7
            r8.a = r9
            r8.d = r4
        L_0x01e4:
            java.lang.Integer r4 = r1.d()
            if (r4 == 0) goto L_0x0207
            java.lang.Integer r4 = r1.d()
            int r4 = r4.intValue()
            boolean r8 = r2.c
            if (r8 != 0) goto L_0x01f7
            goto L_0x01fc
        L_0x01f7:
            r2.c()
            r2.c = r5
        L_0x01fc:
            aucj r8 = r2.b
            aujo r8 = (defpackage.aujo) r8
            int r9 = r8.a
            r9 = r9 | r6
            r8.a = r9
            r8.e = r4
        L_0x0207:
            java.lang.Integer r4 = r1.e()
            if (r4 == 0) goto L_0x022b
            java.lang.Integer r4 = r1.e()
            int r4 = r4.intValue()
            boolean r8 = r2.c
            if (r8 != 0) goto L_0x021a
            goto L_0x021f
        L_0x021a:
            r2.c()
            r2.c = r5
        L_0x021f:
            aucj r8 = r2.b
            aujo r8 = (defpackage.aujo) r8
            int r9 = r8.a
            r9 = r9 | 16
            r8.a = r9
            r8.f = r4
        L_0x022b:
            java.lang.Integer r4 = r1.g()
            if (r4 == 0) goto L_0x024f
            java.lang.Integer r4 = r1.g()
            int r4 = r4.intValue()
            boolean r8 = r2.c
            if (r8 != 0) goto L_0x023e
            goto L_0x0243
        L_0x023e:
            r2.c()
            r2.c = r5
        L_0x0243:
            aucj r8 = r2.b
            aujo r8 = (defpackage.aujo) r8
            int r9 = r8.a
            r9 = r9 | 32
            r8.a = r9
            r8.g = r4
        L_0x024f:
            java.lang.Integer r4 = r1.f()
            if (r4 == 0) goto L_0x0273
            java.lang.Integer r4 = r1.f()
            int r4 = r4.intValue()
            boolean r8 = r2.c
            if (r8 != 0) goto L_0x0262
            goto L_0x0267
        L_0x0262:
            r2.c()
            r2.c = r5
        L_0x0267:
            aucj r8 = r2.b
            aujo r8 = (defpackage.aujo) r8
            int r9 = r8.a
            r9 = r9 | 64
            r8.a = r9
            r8.h = r4
        L_0x0273:
            java.lang.Integer r4 = r1.h()
            if (r4 == 0) goto L_0x0297
            java.lang.Integer r1 = r1.h()
            int r1 = r1.intValue()
            boolean r4 = r2.c
            if (r4 != 0) goto L_0x0286
            goto L_0x028b
        L_0x0286:
            r2.c()
            r2.c = r5
        L_0x028b:
            aucj r4 = r2.b
            aujo r4 = (defpackage.aujo) r4
            int r8 = r4.a
            r8 = r8 | 128(0x80, float:1.794E-43)
            r4.a = r8
            r4.i = r1
        L_0x0297:
            aucj r1 = r2.i()
            r2 = r1
            aujo r2 = (defpackage.aujo) r2
            goto L_0x02a0
        L_0x029f:
        L_0x02a0:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x02a5
            goto L_0x02aa
        L_0x02a5:
            r0.c()
            r0.c = r5
        L_0x02aa:
            aucj r1 = r0.b
            aujq r1 = (defpackage.aujq) r1
            r2.getClass()
            r1.c = r2
            r1.b = r3
        L_0x02b5:
            java.lang.Boolean r1 = r11.b()
            if (r1 == 0) goto L_0x02d8
            java.lang.Boolean r1 = r11.b()
            boolean r1 = r1.booleanValue()
            boolean r2 = r0.c
            if (r2 != 0) goto L_0x02c8
            goto L_0x02cd
        L_0x02c8:
            r0.c()
            r0.c = r5
        L_0x02cd:
            aucj r2 = r0.b
            aujq r2 = (defpackage.aujq) r2
            int r3 = r2.a
            r3 = r3 | r7
            r2.a = r3
            r2.d = r1
        L_0x02d8:
            java.lang.Long r1 = r11.c()
            if (r1 == 0) goto L_0x02fb
            java.lang.Long r11 = r11.c()
            long r1 = r11.longValue()
            boolean r11 = r0.c
            if (r11 != 0) goto L_0x02eb
            goto L_0x02f0
        L_0x02eb:
            r0.c()
            r0.c = r5
        L_0x02f0:
            aucj r11 = r0.b
            aujq r11 = (defpackage.aujq) r11
            int r3 = r11.a
            r3 = r3 | r6
            r11.a = r3
            r11.e = r1
        L_0x02fb:
            aucj r11 = r0.i()
            aujq r11 = (defpackage.aujq) r11
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alla.a(com.google.android.ulr.VisibleNetwork):aujq");
    }
}
