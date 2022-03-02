package defpackage;

/* renamed from: alkx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alkx {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.aujm a(com.google.android.ulr.SemanticPlace r14) {
        /*
            aujm r0 = defpackage.aujm.g
            aucd r0 = r0.o()
            com.google.android.ulr.FeatureIdProto r1 = r14.getFeatureId()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x002d
            com.google.android.ulr.FeatureIdProto r1 = r14.getFeatureId()
            auip r1 = defpackage.alkq.a(r1)
            boolean r4 = r0.c
            if (r4 == 0) goto L_0x001f
            r0.c()
            r0.c = r3
        L_0x001f:
            aucj r4 = r0.b
            aujm r4 = (defpackage.aujm) r4
            r1.getClass()
            r4.b = r1
            int r1 = r4.a
            r1 = r1 | r2
            r4.a = r1
        L_0x002d:
            java.util.ArrayList r1 = r14.getGconceptInstances()
            r4 = -1
            r5 = 3
            r6 = 2
            if (r1 == 0) goto L_0x012f
            java.util.ArrayList r1 = r14.getGconceptInstances()
            int r7 = r1.size()
            r8 = 0
        L_0x003f:
            if (r8 >= r7) goto L_0x012f
            java.lang.Object r9 = r1.get(r8)
            com.google.android.ulr.SemanticPlaceGConceptInstanceProto r9 = (com.google.android.ulr.SemanticPlaceGConceptInstanceProto) r9
            if (r9 == 0) goto L_0x012b
            aujj r10 = defpackage.aujj.d
            aucd r10 = r10.o()
            java.lang.String r11 = r9.b()
            if (r11 == 0) goto L_0x0070
            java.lang.String r11 = r9.b()
            boolean r12 = r10.c
            if (r12 == 0) goto L_0x0062
            r10.c()
            r10.c = r3
        L_0x0062:
            aucj r12 = r10.b
            aujj r12 = (defpackage.aujj) r12
            r11.getClass()
            int r13 = r12.a
            r13 = r13 | r2
            r12.a = r13
            r12.b = r11
        L_0x0070:
            java.lang.String r11 = r9.c()
            if (r11 == 0) goto L_0x00ff
            java.lang.String r11 = r9.c()
            int r12 = r11.hashCode()
            switch(r12) {
                case -1849003440: goto L_0x00a0;
                case -314765822: goto L_0x0096;
                case 403216866: goto L_0x008c;
                case 879864437: goto L_0x0082;
                default: goto L_0x0081;
            }
        L_0x0081:
            goto L_0x00aa
        L_0x0082:
            java.lang.String r12 = "nonPrimary"
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L_0x00aa
            r11 = 1
            goto L_0x00ab
        L_0x008c:
            java.lang.String r12 = "PRIMARY"
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L_0x00aa
            r11 = 2
            goto L_0x00ab
        L_0x0096:
            java.lang.String r12 = "primary"
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L_0x00aa
            r11 = 3
            goto L_0x00ab
        L_0x00a0:
            java.lang.String r12 = "NON_PRIMARY"
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L_0x00aa
            r11 = 0
            goto L_0x00ab
        L_0x00aa:
            r11 = -1
        L_0x00ab:
            if (r11 == 0) goto L_0x00ea
            if (r11 == r2) goto L_0x00ea
            if (r11 == r6) goto L_0x00d3
            if (r11 == r5) goto L_0x00d3
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r9.c()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Json2LiteBadEnum location.unified.SemanticPlace.GConceptInstanceProto.prominence "
            int r2 = r0.length()
            if (r2 != 0) goto L_0x00cb
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            goto L_0x00cf
        L_0x00cb:
            java.lang.String r0 = r1.concat(r0)
        L_0x00cf:
            r14.<init>(r0)
            throw r14
        L_0x00d3:
            boolean r9 = r10.c
            if (r9 == 0) goto L_0x00dc
            r10.c()
            r10.c = r3
        L_0x00dc:
            aucj r9 = r10.b
            aujj r9 = (defpackage.aujj) r9
            r11 = 1000(0x3e8, float:1.401E-42)
            r9.c = r11
            int r11 = r9.a
            r11 = r11 | r6
            r9.a = r11
            goto L_0x00ff
        L_0x00ea:
            boolean r9 = r10.c
            if (r9 != 0) goto L_0x00ef
            goto L_0x00f4
        L_0x00ef:
            r10.c()
            r10.c = r3
        L_0x00f4:
            aucj r9 = r10.b
            aujj r9 = (defpackage.aujj) r9
            r9.c = r3
            int r11 = r9.a
            r11 = r11 | r6
            r9.a = r11
        L_0x00ff:
            aucj r9 = r10.i()
            aujj r9 = (defpackage.aujj) r9
            boolean r10 = r0.c
            if (r10 != 0) goto L_0x010a
            goto L_0x010f
        L_0x010a:
            r0.c()
            r0.c = r3
        L_0x010f:
            aucj r10 = r0.b
            aujm r10 = (defpackage.aujm) r10
            r9.getClass()
            aucx r11 = r10.c
            boolean r11 = r11.a()
            if (r11 != 0) goto L_0x0126
            aucx r11 = r10.c
            aucx r11 = defpackage.aucj.a((defpackage.aucx) r11)
            r10.c = r11
        L_0x0126:
            aucx r10 = r10.c
            r10.add(r9)
        L_0x012b:
            int r8 = r8 + 1
            goto L_0x003f
        L_0x012f:
            java.lang.Float r1 = r14.c()
            if (r1 == 0) goto L_0x0152
            java.lang.Float r1 = r14.c()
            float r1 = r1.floatValue()
            boolean r7 = r0.c
            if (r7 != 0) goto L_0x0142
            goto L_0x0147
        L_0x0142:
            r0.c()
            r0.c = r3
        L_0x0147:
            aucj r7 = r0.b
            aujm r7 = (defpackage.aujm) r7
            int r8 = r7.a
            r8 = r8 | r6
            r7.a = r8
            r7.d = r1
        L_0x0152:
            java.lang.String r1 = r14.b()
            r7 = 5
            r8 = 7
            r9 = 6
            r10 = 4
            if (r1 == 0) goto L_0x0233
            java.lang.String r1 = r14.b()
            int r11 = r1.hashCode()
            switch(r11) {
                case -1921560249: goto L_0x01ae;
                case -747047476: goto L_0x01a4;
                case -740571906: goto L_0x019a;
                case -723799947: goto L_0x0190;
                case -132740673: goto L_0x0186;
                case 121213556: goto L_0x017c;
                case 517782495: goto L_0x0172;
                case 1729417620: goto L_0x0168;
                default: goto L_0x0167;
            }
        L_0x0167:
            goto L_0x01b8
        L_0x0168:
            java.lang.String r11 = "MEDIUM_CONFIDENCE"
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x01b8
            r1 = 4
            goto L_0x01b9
        L_0x0172:
            java.lang.String r11 = "mediumConfidence"
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x01b8
            r1 = 5
            goto L_0x01b9
        L_0x017c:
            java.lang.String r11 = "unknownConfidence"
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x01b8
            r1 = 1
            goto L_0x01b9
        L_0x0186:
            java.lang.String r11 = "UNKNOWN_CONFIDENCE"
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x01b8
            r1 = 0
            goto L_0x01b9
        L_0x0190:
            java.lang.String r11 = "LOW_CONFIDENCE"
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x01b8
            r1 = 2
            goto L_0x01b9
        L_0x019a:
            java.lang.String r11 = "lowConfidence"
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x01b8
            r1 = 3
            goto L_0x01b9
        L_0x01a4:
            java.lang.String r11 = "highConfidence"
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x01b8
            r1 = 7
            goto L_0x01b9
        L_0x01ae:
            java.lang.String r11 = "HIGH_CONFIDENCE"
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x01b8
            r1 = 6
            goto L_0x01b9
        L_0x01b8:
            r1 = -1
        L_0x01b9:
            switch(r1) {
                case 0: goto L_0x0215;
                case 1: goto L_0x0215;
                case 2: goto L_0x01ff;
                case 3: goto L_0x01ff;
                case 4: goto L_0x01e9;
                case 5: goto L_0x01e9;
                case 6: goto L_0x01d4;
                case 7: goto L_0x01d4;
                default: goto L_0x01bc;
            }
        L_0x01bc:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r14 = r14.b()
            java.lang.String r14 = java.lang.String.valueOf(r14)
            java.lang.String r1 = "Json2LiteBadEnum location.unified.SemanticPlace.confidence "
            int r2 = r14.length()
            if (r2 != 0) goto L_0x022b
            java.lang.String r14 = new java.lang.String
            r14.<init>(r1)
            goto L_0x022f
        L_0x01d4:
            boolean r1 = r0.c
            if (r1 == 0) goto L_0x01dd
            r0.c()
            r0.c = r3
        L_0x01dd:
            aucj r1 = r0.b
            aujm r1 = (defpackage.aujm) r1
            r1.e = r5
            int r11 = r1.a
            r11 = r11 | r10
            r1.a = r11
            goto L_0x0233
        L_0x01e9:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x01ee
            goto L_0x01f3
        L_0x01ee:
            r0.c()
            r0.c = r3
        L_0x01f3:
            aucj r1 = r0.b
            aujm r1 = (defpackage.aujm) r1
            r1.e = r6
            int r11 = r1.a
            r11 = r11 | r10
            r1.a = r11
            goto L_0x0233
        L_0x01ff:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x0204
            goto L_0x0209
        L_0x0204:
            r0.c()
            r0.c = r3
        L_0x0209:
            aucj r1 = r0.b
            aujm r1 = (defpackage.aujm) r1
            r1.e = r2
            int r11 = r1.a
            r11 = r11 | r10
            r1.a = r11
            goto L_0x0233
        L_0x0215:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x021a
            goto L_0x021f
        L_0x021a:
            r0.c()
            r0.c = r3
        L_0x021f:
            aucj r1 = r0.b
            aujm r1 = (defpackage.aujm) r1
            r1.e = r3
            int r11 = r1.a
            r11 = r11 | r10
            r1.a = r11
            goto L_0x0233
        L_0x022b:
            java.lang.String r14 = r1.concat(r14)
        L_0x022f:
            r0.<init>(r14)
            throw r0
        L_0x0233:
            java.lang.String r1 = r14.d()
            if (r1 == 0) goto L_0x0315
            java.lang.String r1 = r14.d()
            int r11 = r1.hashCode()
            switch(r11) {
                case -2101128988: goto L_0x028b;
                case -1174121573: goto L_0x0281;
                case -284840886: goto L_0x0277;
                case -174817277: goto L_0x026d;
                case 81560823: goto L_0x0263;
                case 433141802: goto L_0x0259;
                case 1281444928: goto L_0x024f;
                case 1640131487: goto L_0x0245;
                default: goto L_0x0244;
            }
        L_0x0244:
            goto L_0x0295
        L_0x0245:
            java.lang.String r7 = "ANDROID_CONTEXT"
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L_0x0295
            r4 = 6
            goto L_0x0296
        L_0x024f:
            java.lang.String r7 = "androidContext"
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L_0x0295
            r4 = 7
            goto L_0x0296
        L_0x0259:
            java.lang.String r7 = "UNKNOWN"
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L_0x0295
            r4 = 0
            goto L_0x0296
        L_0x0263:
            java.lang.String r8 = "hulkRealTime"
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L_0x0295
            r4 = 5
            goto L_0x0296
        L_0x026d:
            java.lang.String r7 = "HAPPY_HOUR"
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L_0x0295
            r4 = 2
            goto L_0x0296
        L_0x0277:
            java.lang.String r7 = "unknown"
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L_0x0295
            r4 = 1
            goto L_0x0296
        L_0x0281:
            java.lang.String r7 = "HULK_REAL_TIME"
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L_0x0295
            r4 = 4
            goto L_0x0296
        L_0x028b:
            java.lang.String r7 = "happyHour"
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L_0x0295
            r4 = 3
            goto L_0x0296
        L_0x0295:
        L_0x0296:
            switch(r4) {
                case 0: goto L_0x02f6;
                case 1: goto L_0x02f6;
                case 2: goto L_0x02df;
                case 3: goto L_0x02df;
                case 4: goto L_0x02c8;
                case 5: goto L_0x02c8;
                case 6: goto L_0x02b1;
                case 7: goto L_0x02b1;
                default: goto L_0x0299;
            }
        L_0x0299:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r14 = r14.d()
            java.lang.String r14 = java.lang.String.valueOf(r14)
            java.lang.String r1 = "Json2LiteBadEnum location.unified.SemanticPlace.source "
            int r2 = r14.length()
            if (r2 != 0) goto L_0x030d
            java.lang.String r14 = new java.lang.String
            r14.<init>(r1)
            goto L_0x0311
        L_0x02b1:
            boolean r14 = r0.c
            if (r14 != 0) goto L_0x02b6
            goto L_0x02bb
        L_0x02b6:
            r0.c()
            r0.c = r3
        L_0x02bb:
            aucj r14 = r0.b
            aujm r14 = (defpackage.aujm) r14
            r14.f = r5
            int r1 = r14.a
            r1 = r1 | 8
            r14.a = r1
            goto L_0x0315
        L_0x02c8:
            boolean r14 = r0.c
            if (r14 != 0) goto L_0x02cd
            goto L_0x02d2
        L_0x02cd:
            r0.c()
            r0.c = r3
        L_0x02d2:
            aucj r14 = r0.b
            aujm r14 = (defpackage.aujm) r14
            r14.f = r6
            int r1 = r14.a
            r1 = r1 | 8
            r14.a = r1
            goto L_0x0315
        L_0x02df:
            boolean r14 = r0.c
            if (r14 != 0) goto L_0x02e4
            goto L_0x02e9
        L_0x02e4:
            r0.c()
            r0.c = r3
        L_0x02e9:
            aucj r14 = r0.b
            aujm r14 = (defpackage.aujm) r14
            r14.f = r2
            int r1 = r14.a
            r1 = r1 | 8
            r14.a = r1
            goto L_0x0315
        L_0x02f6:
            boolean r14 = r0.c
            if (r14 != 0) goto L_0x02fb
            goto L_0x0300
        L_0x02fb:
            r0.c()
            r0.c = r3
        L_0x0300:
            aucj r14 = r0.b
            aujm r14 = (defpackage.aujm) r14
            r14.f = r3
            int r1 = r14.a
            r1 = r1 | 8
            r14.a = r1
            goto L_0x0315
        L_0x030d:
            java.lang.String r14 = r1.concat(r14)
        L_0x0311:
            r0.<init>(r14)
            throw r0
        L_0x0315:
            aucj r14 = r0.i()
            aujm r14 = (defpackage.aujm) r14
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alkx.a(com.google.android.ulr.SemanticPlace):aujm");
    }
}
