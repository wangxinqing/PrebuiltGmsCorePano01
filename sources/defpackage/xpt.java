package defpackage;

/* renamed from: xpt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class xpt {
    /* JADX WARNING: Removed duplicated region for block: B:208:0x0529  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x059a A[EDGE_INSN: B:238:0x059a->B:216:0x059a ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static android.database.Cursor a(java.lang.String[] r37, defpackage.aqwc r38, java.lang.String r39, java.lang.String r40, long r41, boolean r43, boolean r44, boolean r45, defpackage.aucd r46) {
        /*
            r0 = r37
            r1 = r38
            r2 = r39
            r3 = r40
            r4 = r46
            r5 = -1
            r7 = 0
            r8 = -1
            r9 = -1
            r10 = -1
            r11 = -1
            r12 = -1
            r13 = -1
            r14 = -1
            r15 = -1
            r16 = -1
            r17 = -1
            r18 = -1
            r19 = -1
            r20 = -1
            r21 = -1
            r22 = -1
        L_0x0022:
            int r6 = r0.length
            r24 = r13
            java.lang.String r13 = "data4"
            java.lang.String r4 = "data3"
            r25 = r15
            java.lang.String r15 = "data2"
            r26 = r14
            java.lang.String r14 = "data1"
            if (r7 >= r6) goto L_0x015a
            r6 = r0[r7]
            r27 = r12
            java.lang.String r12 = "display_name"
            boolean r12 = r12.equals(r6)
            if (r12 == 0) goto L_0x004a
            r5 = r7
        L_0x0040:
            r13 = r24
            r15 = r25
            r14 = r26
            r12 = r27
            goto L_0x0154
        L_0x004a:
            java.lang.String r12 = "display_name_alt"
            boolean r12 = r12.equals(r6)
            if (r12 == 0) goto L_0x005d
            r8 = r7
            r13 = r24
            r15 = r25
            r14 = r26
            r12 = r27
            goto L_0x0154
        L_0x005d:
            java.lang.String r12 = "display_name_source"
            boolean r12 = r12.equals(r6)
            if (r12 == 0) goto L_0x0070
            r9 = r7
            r13 = r24
            r15 = r25
            r14 = r26
            r12 = r27
            goto L_0x0154
        L_0x0070:
            java.lang.String r12 = "has_phone_number"
            boolean r12 = r12.equals(r6)
            if (r12 == 0) goto L_0x0083
            r10 = r7
            r13 = r24
            r15 = r25
            r14 = r26
            r12 = r27
            goto L_0x0154
        L_0x0083:
            java.lang.String r12 = "photo_uri"
            boolean r12 = r12.equals(r6)
            if (r12 == 0) goto L_0x0096
            r11 = r7
            r13 = r24
            r15 = r25
            r14 = r26
            r12 = r27
            goto L_0x0154
        L_0x0096:
            java.lang.String r12 = "photo_thumb_uri"
            boolean r12 = r12.equals(r6)
            if (r12 == 0) goto L_0x00a7
            r12 = r7
            r13 = r24
            r15 = r25
            r14 = r26
            goto L_0x0154
        L_0x00a7:
            java.lang.String r12 = "_id"
            boolean r12 = r12.equals(r6)
            if (r12 == 0) goto L_0x00b8
            r13 = r7
            r15 = r25
            r14 = r26
            r12 = r27
            goto L_0x0154
        L_0x00b8:
            java.lang.String r12 = "contact_id"
            boolean r12 = r12.equals(r6)
            if (r12 == 0) goto L_0x00c9
            r14 = r7
            r13 = r24
            r15 = r25
            r12 = r27
            goto L_0x0154
        L_0x00c9:
            java.lang.String r12 = "lookup"
            boolean r12 = r12.equals(r6)
            if (r12 == 0) goto L_0x00da
            r15 = r7
            r13 = r24
            r14 = r26
            r12 = r27
            goto L_0x0154
        L_0x00da:
            if (r44 != 0) goto L_0x0110
            boolean r12 = r14.equals(r6)
            if (r12 == 0) goto L_0x00ee
            r20 = r7
            r13 = r24
            r15 = r25
            r14 = r26
            r12 = r27
            goto L_0x0154
        L_0x00ee:
            boolean r12 = r15.equals(r6)
            if (r12 == 0) goto L_0x00ff
            r21 = r7
            r13 = r24
            r15 = r25
            r14 = r26
            r12 = r27
            goto L_0x0154
        L_0x00ff:
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x0040
            r22 = r7
            r13 = r24
            r15 = r25
            r14 = r26
            r12 = r27
            goto L_0x0154
        L_0x0110:
            boolean r12 = r14.equals(r6)
            if (r12 == 0) goto L_0x0122
            r16 = r7
            r13 = r24
            r15 = r25
            r14 = r26
            r12 = r27
            goto L_0x0154
        L_0x0122:
            boolean r12 = r15.equals(r6)
            if (r12 == 0) goto L_0x0133
            r17 = r7
            r13 = r24
            r15 = r25
            r14 = r26
            r12 = r27
            goto L_0x0154
        L_0x0133:
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x0144
            r18 = r7
            r13 = r24
            r15 = r25
            r14 = r26
            r12 = r27
            goto L_0x0154
        L_0x0144:
            boolean r4 = r13.equals(r6)
            if (r4 == 0) goto L_0x0040
            r19 = r7
            r13 = r24
            r15 = r25
            r14 = r26
            r12 = r27
        L_0x0154:
            int r7 = r7 + 1
            r4 = r46
            goto L_0x0022
        L_0x015a:
            r27 = r12
            java.lang.String r6 = "sort_key"
            boolean r6 = r6.equals(r3)
            if (r6 != 0) goto L_0x018b
            java.lang.String r6 = "sort_key_alt"
            boolean r6 = r6.equals(r3)
            if (r6 != 0) goto L_0x0189
            java.lang.String r3 = java.lang.String.valueOf(r40)
            java.lang.String r6 = "Ignoring unsupported sort order: "
            int r29 = r3.length()
            if (r29 != 0) goto L_0x017e
            java.lang.String r3 = new java.lang.String
            r3.<init>(r6)
            goto L_0x0182
        L_0x017e:
            java.lang.String r3 = r6.concat(r3)
        L_0x0182:
            java.lang.String r6 = "PeopleGalProvider"
            android.util.Log.w(r6, r3)
            r3 = 3
            goto L_0x018c
        L_0x0189:
            r3 = 2
            goto L_0x018c
        L_0x018b:
            r3 = 1
        L_0x018c:
            java.util.TreeMap r6 = new java.util.TreeMap
            java.util.Comparator r12 = defpackage.xps.a
            r6.<init>(r12)
            r12 = 0
            r30 = 1
        L_0x0196:
            aucx r7 = r1.a
            int r7 = r7.size()
            if (r12 >= r7) goto L_0x059a
            aucx r7 = r1.a
            java.lang.Object r7 = r7.get(r12)
            aquk r7 = (defpackage.aquk) r7
            int r1 = r7.a
            r31 = r4
            r4 = 4
            if (r1 != r4) goto L_0x01b2
            java.lang.Object r1 = r7.b
            amgi r1 = (defpackage.amgi) r1
            goto L_0x01b4
        L_0x01b2:
            amgi r1 = defpackage.amgi.D
        L_0x01b4:
            android.util.Pair r7 = defpackage.xpw.a(r1)
            java.lang.String r4 = "AutocompleteCursorUtil"
            if (r7 == 0) goto L_0x052d
            r32 = r12
            java.lang.Object r12 = r7.first
            if (r12 != 0) goto L_0x01e6
            r2 = r46
            r34 = r3
            r28 = r11
            r11 = r13
            r7 = r21
            r0 = r24
            r12 = -1
            r21 = r8
            r24 = r10
            r10 = r18
            r8 = r22
            r22 = r9
            r9 = r31
            r31 = r27
            r27 = 3
            r36 = r20
            r20 = r5
            r5 = r36
            goto L_0x0551
        L_0x01e6:
            java.lang.Object r12 = r7.first
            java.lang.String r12 = (java.lang.String) r12
            java.lang.String r12 = defpackage.xpw.a(r1, r12)
            r33 = r13
            java.lang.Object r13 = r7.first
            java.lang.String r13 = (java.lang.String) r13
            r34 = r13
            r13 = 1
            if (r3 != r13) goto L_0x01fc
            r13 = r34
            goto L_0x0203
        L_0x01fc:
            r13 = 2
            if (r3 == r13) goto L_0x0202
            java.lang.String r13 = ""
            goto L_0x0203
        L_0x0202:
            r13 = r12
        L_0x0203:
            r34 = r3
            int r3 = r0.length
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r0 = -1
            if (r5 == r0) goto L_0x020f
            java.lang.Object r0 = r7.first
            r3[r5] = r0
        L_0x020f:
            r0 = -1
            if (r9 == r0) goto L_0x0216
            java.lang.Object r7 = r7.second
            r3[r9] = r7
        L_0x0216:
            if (r8 == r0) goto L_0x021a
            r3[r8] = r12
        L_0x021a:
            if (r10 == r0) goto L_0x022a
            aucx r0 = r1.h
            boolean r0 = r0.isEmpty()
            r7 = 1
            r0 = r0 ^ r7
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3[r10] = r0
        L_0x022a:
            r0 = -1
            if (r11 == r0) goto L_0x023c
            boolean r0 = com.google.android.gms.people.service.galprovider.PeopleGalChimeraProvider.a((defpackage.amgi) r1)
            if (r0 == 0) goto L_0x023c
            java.lang.String r0 = r1.b
            r7 = 0
            android.net.Uri r0 = com.google.android.gms.people.service.galprovider.PeopleGalChimeraProvider.a(r2, r7, r0)
            r3[r11] = r0
        L_0x023c:
            r12 = r27
            r0 = -1
            if (r12 == r0) goto L_0x0250
            boolean r0 = com.google.android.gms.people.service.galprovider.PeopleGalChimeraProvider.a((defpackage.amgi) r1)
            if (r0 == 0) goto L_0x0250
            java.lang.String r0 = r1.b
            r7 = 1
            android.net.Uri r0 = com.google.android.gms.people.service.galprovider.PeopleGalChimeraProvider.a(r2, r7, r0)
            r3[r12] = r0
        L_0x0250:
            r0 = r26
            r7 = -1
            if (r0 == r7) goto L_0x025b
            java.lang.Integer r23 = java.lang.Integer.valueOf(r30)
            r3[r0] = r23
        L_0x025b:
            r26 = r0
            r0 = r25
            if (r0 == r7) goto L_0x0265
            java.lang.String r7 = r1.b
            r3[r0] = r7
        L_0x0265:
            if (r43 == 0) goto L_0x03af
            java.util.HashSet r7 = new java.util.HashSet
            r7.<init>()
            r25 = r0
            aucx r0 = r1.g
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x038a
            aucx r0 = r1.g
            java.lang.String r1 = r1.b
            java.util.List r0 = defpackage.wsn.b(r0, r1)
            if (r0 != 0) goto L_0x02c7
            r1 = r46
            r0 = r31
            boolean r3 = r1.c
            if (r3 != 0) goto L_0x0289
            goto L_0x028f
        L_0x0289:
            r46.c()
            r3 = 0
            r1.c = r3
        L_0x028f:
            aucj r3 = r1.b
            xlj r3 = (defpackage.xlj) r3
            xlj r7 = defpackage.xlj.g
            r13 = 3
            r3.d = r13
            int r7 = r3.a
            r27 = 4
            r7 = r7 | 4
            r3.a = r7
            java.lang.String r3 = "Error converting emails."
            android.util.Log.e(r4, r3)
            r2 = r1
            r28 = r11
            r31 = r12
            r7 = r21
            r11 = r33
            r1 = 1
            r12 = -1
            r27 = 3
            r21 = r8
            r8 = r22
            r22 = r9
            r9 = r0
            r0 = r24
            r24 = r10
            r10 = r18
            r36 = r20
            r20 = r5
            r5 = r36
            goto L_0x0573
        L_0x02c7:
            r1 = r46
            r4 = r31
            r27 = 3
            int r1 = r0.size()
            r2 = 0
            r28 = 0
        L_0x02d4:
            if (r2 >= r1) goto L_0x0367
            java.lang.Object r31 = r0.get(r2)
            r40 = r0
            r0 = r31
            android.content.ContentValues r0 = (android.content.ContentValues) r0
            if (r45 == 0) goto L_0x0301
            java.lang.String r31 = r0.getAsString(r14)
            r35 = r1
            java.lang.String r1 = defpackage.ampw.a((java.lang.String) r31)
            boolean r1 = r7.add(r1)
            if (r1 != 0) goto L_0x0303
            r31 = r7
            r7 = r21
            r0 = r24
            r21 = r8
            r8 = r22
            r22 = r20
            r20 = r5
            goto L_0x0351
        L_0x0301:
            r35 = r1
        L_0x0303:
            r1 = r20
            r20 = r5
            r5 = -1
            if (r1 == r5) goto L_0x0310
            java.lang.Object r23 = r0.get(r14)
            r3[r1] = r23
        L_0x0310:
            r31 = r7
            r7 = r21
            if (r7 == r5) goto L_0x031c
            java.lang.Object r21 = r0.get(r15)
            r3[r7] = r21
        L_0x031c:
            r21 = r8
            r8 = r22
            if (r8 == r5) goto L_0x0328
            java.lang.Object r0 = r0.get(r4)
            r3[r8] = r0
        L_0x0328:
            r0 = r24
            if (r0 != r5) goto L_0x032d
            goto L_0x033b
        L_0x032d:
            int r5 = r6.size()
            r22 = 1
            int r5 = r5 + 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3[r0] = r5
        L_0x033b:
            android.util.Pair r5 = new android.util.Pair
            r22 = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r30)
            r5.<init>(r13, r1)
            java.lang.Object r1 = r3.clone()
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            r6.put(r5, r1)
            r28 = 1
        L_0x0351:
            int r2 = r2 + 1
            r24 = r0
            r5 = r20
            r20 = r22
            r1 = r35
            r0 = r40
            r22 = r8
            r8 = r21
            r21 = r7
            r7 = r31
            goto L_0x02d4
        L_0x0367:
            r7 = r21
            r0 = r24
            r21 = r8
            r8 = r22
            r22 = r20
            r20 = r5
            r2 = r46
            r24 = r10
            r31 = r12
            r1 = r16
            r10 = r18
            r5 = r22
            r22 = r9
            r9 = r4
            r4 = r28
            r28 = r11
            r11 = r33
            goto L_0x04a6
        L_0x038a:
            r7 = r21
            r0 = r24
            r4 = r31
            r27 = 3
            r21 = r8
            r8 = r22
            r22 = r20
            r20 = r5
            r2 = r46
            r24 = r10
            r28 = r11
            r31 = r12
            r10 = r18
            r5 = r22
            r11 = r33
            r1 = 1
            r12 = -1
            r22 = r9
            r9 = r4
            goto L_0x0573
        L_0x03af:
            r2 = r46
            r25 = r0
            r7 = r21
            r0 = r24
            r27 = 3
            r21 = r8
            r8 = r22
            r22 = r9
            r9 = r31
            r36 = r20
            r20 = r5
            r5 = r36
            if (r44 == 0) goto L_0x04bd
            r24 = r10
            java.util.HashSet r10 = new java.util.HashSet
            r10.<init>()
            r28 = r11
            aucx r11 = r1.h
            boolean r11 = r11.isEmpty()
            if (r11 != 0) goto L_0x04b1
            wsn r11 = defpackage.wsn.a
            r31 = r12
            aucx r12 = r1.h
            java.lang.String r1 = r1.b
            java.util.List r1 = r11.a((java.util.List) r12, (java.lang.String) r1)
            if (r1 != 0) goto L_0x040f
            boolean r1 = r2.c
            if (r1 != 0) goto L_0x03ed
            goto L_0x03f3
        L_0x03ed:
            r46.c()
            r1 = 0
            r2.c = r1
        L_0x03f3:
            aucj r1 = r2.b
            xlj r1 = (defpackage.xlj) r1
            xlj r3 = defpackage.xlj.g
            r11 = 2
            r1.d = r11
            int r3 = r1.a
            r10 = 4
            r3 = r3 | r10
            r1.a = r3
            java.lang.String r1 = "Error converting phone numbers"
            android.util.Log.e(r4, r1)
            r10 = r18
            r11 = r33
            r1 = 1
            r12 = -1
            goto L_0x0573
        L_0x040f:
            r11 = 2
            java.util.Iterator r1 = r1.iterator()
            r4 = 0
        L_0x0415:
            boolean r12 = r1.hasNext()
            if (r12 == 0) goto L_0x04a0
            java.lang.Object r12 = r1.next()
            android.content.ContentValues r12 = (android.content.ContentValues) r12
            r11 = r33
            java.lang.String r33 = r12.getAsString(r11)
            if (r45 == 0) goto L_0x0444
            if (r33 != 0) goto L_0x0430
            java.lang.String r35 = r12.getAsString(r14)
            goto L_0x0432
        L_0x0430:
            r35 = r33
        L_0x0432:
            r40 = r1
            java.lang.String r1 = defpackage.agxn.b((java.lang.CharSequence) r35)
            boolean r1 = r10.add(r1)
            if (r1 != 0) goto L_0x0446
            r1 = r40
            r33 = r11
            r11 = 2
            goto L_0x0415
        L_0x0444:
            r40 = r1
        L_0x0446:
            r1 = r16
            r4 = -1
            if (r1 == r4) goto L_0x0451
            java.lang.Object r16 = r12.get(r14)
            r3[r1] = r16
        L_0x0451:
            r16 = r10
            r10 = r19
            if (r10 == r4) goto L_0x0459
            r3[r10] = r33
        L_0x0459:
            r19 = r10
            r10 = r17
            if (r10 == r4) goto L_0x0465
            java.lang.Object r17 = r12.get(r15)
            r3[r10] = r17
        L_0x0465:
            r17 = r10
            r10 = r18
            if (r10 == r4) goto L_0x0471
            java.lang.Object r12 = r12.get(r9)
            r3[r10] = r12
        L_0x0471:
            if (r0 != r4) goto L_0x0474
            goto L_0x0480
        L_0x0474:
            int r4 = r6.size()
            r12 = 1
            int r4 = r4 + r12
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r0] = r4
        L_0x0480:
            android.util.Pair r4 = new android.util.Pair
            java.lang.Integer r12 = java.lang.Integer.valueOf(r30)
            r4.<init>(r13, r12)
            java.lang.Object r12 = r3.clone()
            java.lang.Object[] r12 = (java.lang.Object[]) r12
            r6.put(r4, r12)
            r18 = r10
            r33 = r11
            r10 = r16
            r4 = 1
            r11 = 2
            r16 = r1
            r1 = r40
            goto L_0x0415
        L_0x04a0:
            r1 = r16
            r10 = r18
            r11 = r33
        L_0x04a6:
            r16 = r1
            if (r4 == 0) goto L_0x04ad
            r12 = -1
            goto L_0x0520
        L_0x04ad:
            r1 = 1
            r12 = -1
            goto L_0x0573
        L_0x04b1:
            r31 = r12
            r1 = r16
            r10 = r18
            r11 = r33
            r1 = 1
            r12 = -1
            goto L_0x0573
        L_0x04bd:
            r24 = r10
            r28 = r11
            r31 = r12
            r10 = r18
            r11 = r33
            r4 = -1
            if (r0 != r4) goto L_0x04cb
            goto L_0x04d1
        L_0x04cb:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r30)
            r3[r0] = r4
        L_0x04d1:
            aucx r4 = r1.g
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x0513
            aucx r4 = r1.g
            java.lang.String r1 = r1.b
            java.util.List r1 = defpackage.wsn.b(r4, r1)
            if (r1 == 0) goto L_0x0510
            boolean r4 = r1.isEmpty()
            if (r4 != 0) goto L_0x050c
            r4 = 0
            java.lang.Object r1 = r1.get(r4)
            android.content.ContentValues r1 = (android.content.ContentValues) r1
            r12 = -1
            if (r5 == r12) goto L_0x04f9
            java.lang.Object r4 = r1.get(r14)
            r3[r5] = r4
        L_0x04f9:
            if (r7 == r12) goto L_0x0501
            java.lang.Object r4 = r1.get(r15)
            r3[r7] = r4
        L_0x0501:
            if (r8 != r12) goto L_0x0504
            goto L_0x0514
        L_0x0504:
            java.lang.Object r1 = r1.get(r9)
            r3[r8] = r1
            goto L_0x0514
        L_0x050c:
            r12 = -1
            r1 = 1
            goto L_0x0573
        L_0x0510:
            r12 = -1
            r1 = 1
            goto L_0x0573
        L_0x0513:
            r12 = -1
        L_0x0514:
            android.util.Pair r1 = new android.util.Pair
            java.lang.Integer r4 = java.lang.Integer.valueOf(r30)
            r1.<init>(r13, r4)
            r6.put(r1, r3)
        L_0x0520:
            int r1 = r30 + 1
            long r3 = (long) r1
            int r13 = (r3 > r41 ? 1 : (r3 == r41 ? 0 : -1))
            if (r13 <= 0) goto L_0x0529
            goto L_0x059a
        L_0x0529:
            r30 = r1
            r1 = 1
            goto L_0x0573
        L_0x052d:
            r2 = r46
            r34 = r3
            r28 = r11
            r32 = r12
            r11 = r13
            r7 = r21
            r0 = r24
            r12 = -1
            r21 = r8
            r24 = r10
            r10 = r18
            r8 = r22
            r22 = r9
            r9 = r31
            r31 = r27
            r27 = 3
            r36 = r20
            r20 = r5
            r5 = r36
        L_0x0551:
            boolean r1 = r2.c
            if (r1 != 0) goto L_0x0557
            r1 = 0
            goto L_0x055d
        L_0x0557:
            r46.c()
            r1 = 0
            r2.c = r1
        L_0x055d:
            aucj r3 = r2.b
            xlj r3 = (defpackage.xlj) r3
            xlj r13 = defpackage.xlj.g
            r1 = 1
            r3.d = r1
            int r13 = r3.a
            r18 = 4
            r13 = r13 | 4
            r3.a = r13
            java.lang.String r3 = "Can't find appropriate name for the contact."
            android.util.Log.e(r4, r3)
        L_0x0573:
            int r3 = r32 + 1
            r1 = r38
            r2 = r39
            r12 = r3
            r4 = r9
            r18 = r10
            r13 = r11
            r9 = r22
            r10 = r24
            r11 = r28
            r27 = r31
            r3 = r34
            r24 = r0
            r22 = r8
            r8 = r21
            r0 = r37
            r21 = r7
            r36 = r20
            r20 = r5
            r5 = r36
            goto L_0x0196
        L_0x059a:
            android.database.MatrixCursor r0 = new android.database.MatrixCursor
            int r1 = r6.size()
            r2 = r37
            r0.<init>(r2, r1)
            java.util.Collection r1 = r6.values()
            java.util.Iterator r1 = r1.iterator()
        L_0x05ad:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x05bd
            java.lang.Object r2 = r1.next()
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            r0.addRow(r2)
            goto L_0x05ad
        L_0x05bd:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xpt.a(java.lang.String[], aqwc, java.lang.String, java.lang.String, long, boolean, boolean, boolean, aucd):android.database.Cursor");
    }
}
