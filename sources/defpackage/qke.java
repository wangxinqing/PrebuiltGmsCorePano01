package defpackage;

/* renamed from: qke  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qke {
    private static final String[] a = {"http", "https"};
    private static final String[] b = {"NONE", "android.intent.action.VIEW", "android.nfc.action.NDEF_DISCOVERED"};

    /* JADX WARNING: Removed duplicated region for block: B:155:0x016f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x016c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.util.List a(java.lang.String r22, defpackage.qje r23, java.util.Map r24, boolean r25) {
        /*
            r0 = r22
            r1 = r23
            if (r1 == 0) goto L_0x034b
            aucx r3 = r1.a
            int r3 = r3.size()
            if (r3 == 0) goto L_0x034b
            aucx r3 = r1.b
            int r3 = r3.size()
            if (r3 == 0) goto L_0x034b
            java.util.ArrayList r3 = new java.util.ArrayList
            aucx r4 = r1.b
            int r4 = r4.size()
            r3.<init>(r4)
            r5 = 0
        L_0x0022:
            aucx r6 = r1.b
            int r6 = r6.size()
            if (r5 >= r6) goto L_0x0035
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r3.add(r6)
            int r5 = r5 + 1
            goto L_0x0022
        L_0x0035:
            aucx r5 = r1.a
            int r6 = r5.size()
            r7 = 0
            r8 = 0
        L_0x003d:
            r9 = 2
            if (r7 >= r6) goto L_0x01f4
            java.lang.Object r10 = r5.get(r7)
            qjh r10 = (defpackage.qjh) r10
            int r11 = r10.c
            java.lang.Object r11 = r3.get(r11)
            java.util.List r11 = (java.util.List) r11
            int r12 = r10.a
            int r12 = defpackage.qjg.a(r12)
            r13 = 3
            if (r12 != r13) goto L_0x0069
            int r12 = r10.a
            if (r12 != r9) goto L_0x0060
            java.lang.Object r12 = r10.b
            auay r12 = (defpackage.auay) r12
            goto L_0x0062
        L_0x0060:
            auay r12 = defpackage.auay.b
        L_0x0062:
            java.nio.charset.Charset r14 = defpackage.qfb.b
            java.lang.String r12 = r12.b((java.nio.charset.Charset) r14)
            goto L_0x006a
        L_0x0069:
            r12 = 0
        L_0x006a:
            int r14 = r10.a
            int r14 = defpackage.qjg.a(r14)
            r15 = 4
            if (r14 != r15) goto L_0x0085
            int r14 = r10.a
            if (r14 != r13) goto L_0x007c
            java.lang.Object r14 = r10.b
            auay r14 = (defpackage.auay) r14
            goto L_0x007e
        L_0x007c:
            auay r14 = defpackage.auay.b
        L_0x007e:
            java.nio.charset.Charset r4 = defpackage.qfb.b
            java.lang.String r4 = r14.b((java.nio.charset.Charset) r4)
            goto L_0x0086
        L_0x0085:
            r4 = 0
        L_0x0086:
            int r14 = r10.a
            int r14 = defpackage.qjg.a(r14)
            r2 = 5
            if (r14 != r2) goto L_0x00a1
            int r14 = r10.a
            if (r14 != r15) goto L_0x0098
            java.lang.Object r14 = r10.b
            auay r14 = (defpackage.auay) r14
            goto L_0x009a
        L_0x0098:
            auay r14 = defpackage.auay.b
        L_0x009a:
            java.nio.charset.Charset r15 = defpackage.qfb.b
            java.lang.String r14 = r14.b((java.nio.charset.Charset) r15)
            goto L_0x00a2
        L_0x00a1:
            r14 = 0
        L_0x00a2:
            int r15 = r10.a
            int r15 = defpackage.qjg.a(r15)
            r13 = 6
            if (r15 != r13) goto L_0x00bd
            int r13 = r10.a
            if (r13 != r2) goto L_0x00b4
            java.lang.Object r2 = r10.b
            auay r2 = (defpackage.auay) r2
            goto L_0x00b6
        L_0x00b4:
            auay r2 = defpackage.auay.b
        L_0x00b6:
            java.nio.charset.Charset r13 = defpackage.qfb.b
            java.lang.String r2 = r2.b((java.nio.charset.Charset) r13)
            goto L_0x00be
        L_0x00bd:
            r2 = 0
        L_0x00be:
            int r13 = r10.a
            r15 = 1
            if (r13 != r15) goto L_0x00cc
            java.lang.Object r13 = r10.b
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            goto L_0x00cd
        L_0x00cc:
            r13 = 0
        L_0x00cd:
            axvh r16 = defpackage.axvh.a
            axvi r16 = r16.a()
            boolean r16 = r16.a()
            java.lang.String r15 = "android.intent.action.VIEW"
            if (r16 != 0) goto L_0x00e9
            amzy r10 = defpackage.amzy.a((java.lang.Object) r15)
            r21 = r3
            r17 = r5
            r18 = r6
            r9 = r10
            r10 = 1
            goto L_0x0189
        L_0x00e9:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            aucs r10 = r10.d
            r17 = r5
            int r5 = r10.size()
            r18 = r6
            r6 = 0
        L_0x00f9:
            if (r6 >= r5) goto L_0x017b
            java.lang.Object r19 = r10.get(r6)
            java.lang.Integer r19 = (java.lang.Integer) r19
            r20 = r5
            int r5 = r19.intValue()
            r19 = r10
            aucx r10 = r1.c
            java.lang.Object r5 = r10.get(r5)
            qjk r5 = (defpackage.qjk) r5
            int r10 = r5.a
            int r10 = defpackage.qjj.a(r10)
            r21 = r3
            r3 = 2
            if (r10 != r3) goto L_0x0151
            int r3 = r5.a
            r10 = 1
            if (r3 != r10) goto L_0x0132
            java.lang.Object r3 = r5.b
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            int r3 = defpackage.avwn.b(r3)
            if (r3 != 0) goto L_0x0130
            goto L_0x0152
        L_0x0130:
            if (r3 == r10) goto L_0x0152
        L_0x0132:
            java.lang.String[] r3 = b
            int r1 = r5.a
            if (r1 != r10) goto L_0x0149
            java.lang.Object r1 = r5.b
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            int r1 = defpackage.avwn.b(r1)
            if (r1 == 0) goto L_0x0147
            goto L_0x014a
        L_0x0147:
            r1 = 1
            goto L_0x014a
        L_0x0149:
            r1 = 2
        L_0x014a:
            int r1 = defpackage.avwn.a(r1)
            r1 = r3[r1]
            goto L_0x0169
        L_0x0151:
            r10 = 1
        L_0x0152:
            int r1 = r5.a
            int r1 = defpackage.qjj.a(r1)
            r3 = 3
            if (r1 != r3) goto L_0x0168
            int r1 = r5.a
            r3 = 2
            if (r1 != r3) goto L_0x0165
            java.lang.Object r1 = r5.b
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x0169
        L_0x0165:
            java.lang.String r1 = ""
            goto L_0x0169
        L_0x0168:
            r1 = 0
        L_0x0169:
            if (r1 != 0) goto L_0x016c
            goto L_0x016f
        L_0x016c:
            r9.add(r1)
        L_0x016f:
            int r6 = r6 + 1
            r1 = r23
            r10 = r19
            r5 = r20
            r3 = r21
            goto L_0x00f9
        L_0x017b:
            r21 = r3
            r10 = 1
            boolean r1 = r9.isEmpty()
            if (r1 == 0) goto L_0x0188
            r9.add(r15)
            goto L_0x0189
        L_0x0188:
        L_0x0189:
            int r1 = r8 + 1
            android.content.IntentFilter r3 = new android.content.IntentFilter
            r3.<init>()
            java.util.Iterator r5 = r9.iterator()
        L_0x0194:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x01a4
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            r3.addAction(r6)
            goto L_0x0194
        L_0x01a4:
            java.lang.String r5 = "android.intent.category.BROWSABLE"
            r3.addCategory(r5)
            java.lang.String r5 = "android.intent.category.DEFAULT"
            r3.addCategory(r5)
            r5 = 0
            r3.addDataAuthority(r0, r5)
            java.lang.String[] r5 = a
            int r6 = r5.length
            r9 = 0
        L_0x01b7:
            if (r9 >= r6) goto L_0x01c1
            r15 = r5[r9]
            r3.addDataScheme(r15)
            int r9 = r9 + 1
            goto L_0x01b7
        L_0x01c1:
            if (r13 == 0) goto L_0x01c6
            r9 = 0
            r12 = 0
            goto L_0x01db
        L_0x01c6:
            if (r12 == 0) goto L_0x01ca
            r9 = 0
            goto L_0x01db
        L_0x01ca:
            if (r4 == 0) goto L_0x01cf
            r12 = r4
            r9 = 1
            goto L_0x01db
        L_0x01cf:
            if (r14 == 0) goto L_0x01d4
            r12 = r14
            r9 = 2
            goto L_0x01db
        L_0x01d4:
            if (r2 != 0) goto L_0x01d9
            r9 = 0
            r12 = 0
            goto L_0x01db
        L_0x01d9:
            r12 = r2
            r9 = 3
        L_0x01db:
            if (r12 != 0) goto L_0x01de
            goto L_0x01e1
        L_0x01de:
            r3.addDataPath(r12, r9)
        L_0x01e1:
            r3.setOrder(r8)
            r11.add(r3)
            int r7 = r7 + 1
            r8 = r1
            r5 = r17
            r6 = r18
            r3 = r21
            r1 = r23
            goto L_0x003d
        L_0x01f4:
            r21 = r3
            android.util.ArrayMap r1 = new android.util.ArrayMap
            r1.<init>()
            r2 = 0
        L_0x01fc:
            r3 = r23
            aucx r4 = r3.b
            int r4 = r4.size()
            if (r2 >= r4) goto L_0x0234
            aucx r4 = r3.b
            java.lang.Object r4 = r4.get(r2)
            qjn r4 = (defpackage.qjn) r4
            java.lang.String r4 = r4.a
            java.lang.Object r4 = r1.get(r4)
            java.util.List r4 = (java.util.List) r4
            if (r4 != 0) goto L_0x022a
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            aucx r5 = r3.b
            java.lang.Object r5 = r5.get(r2)
            qjn r5 = (defpackage.qjn) r5
            java.lang.String r5 = r5.a
            r1.put(r5, r4)
        L_0x022a:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            r4.add(r5)
            int r2 = r2 + 1
            goto L_0x01fc
        L_0x0234:
            java.lang.String r2 = "*."
            boolean r2 = r0.startsWith(r2)
            if (r2 == 0) goto L_0x0242
            r2 = 2
            java.lang.String r0 = r0.substring(r2)
        L_0x0242:
            android.content.pm.InstantAppResolveInfo$InstantAppDigest r2 = new android.content.pm.InstantAppResolveInfo$InstantAppDigest
            r2.<init>(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0254:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x034a
            java.lang.Object r4 = r1.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            java.lang.String r5 = (java.lang.String) r5
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.lang.Object r4 = r4.getValue()
            java.util.List r4 = (java.util.List) r4
            java.util.Iterator r4 = r4.iterator()
            r7 = -1
        L_0x0276:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L_0x032e
            java.lang.Object r8 = r4.next()
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            aucx r9 = r3.b
            java.lang.Object r9 = r9.get(r8)
            qjn r9 = (defpackage.qjn) r9
            r10 = r21
            java.lang.Object r8 = r10.get(r8)
            java.util.List r8 = (java.util.List) r8
            boolean r11 = r9.e
            if (r11 != 0) goto L_0x0326
            int r7 = r9.c
            java.lang.String r11 = r9.a
            r12 = r24
            java.lang.Object r11 = r12.get(r11)
            byte[] r11 = (byte[]) r11
            if (r25 == 0) goto L_0x030c
            avql r13 = defpackage.avql.d
            aucd r13 = r13.o()
            java.lang.String r14 = r9.b
            boolean r15 = r13.c
            if (r15 != 0) goto L_0x02b5
            goto L_0x02bb
        L_0x02b5:
            r13.c()
            r15 = 0
            r13.c = r15
        L_0x02bb:
            aucj r15 = r13.b
            avql r15 = (defpackage.avql) r15
            r14.getClass()
            r15.a = r14
            int r9 = r9.d
            r15.b = r9
            if (r11 == 0) goto L_0x02cf
            auay r9 = defpackage.auay.a((byte[]) r11)
            goto L_0x02d1
        L_0x02cf:
            auay r9 = defpackage.auay.b
        L_0x02d1:
            boolean r11 = r13.c
            if (r11 != 0) goto L_0x02d7
            r11 = 0
            goto L_0x02dd
        L_0x02d7:
            r13.c()
            r11 = 0
            r13.c = r11
        L_0x02dd:
            aucj r14 = r13.b
            avql r14 = (defpackage.avql) r14
            r9.getClass()
            r14.c = r9
            aucj r9 = r13.i()
            avql r9 = (defpackage.avql) r9
            byte[] r9 = r9.k()
            r13 = 2
            java.lang.String r9 = android.util.Base64.encodeToString(r9, r13)
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.String r14 = "packageMetadata:"
            int r15 = r9.length()
            if (r15 != 0) goto L_0x0307
            java.lang.String r9 = new java.lang.String
            r9.<init>(r14)
            goto L_0x031a
        L_0x0307:
            java.lang.String r9 = r14.concat(r9)
            goto L_0x031a
        L_0x030c:
            r11 = 0
            r13 = 2
            java.lang.String r14 = r9.b
            boolean r14 = r14.isEmpty()
            if (r14 != 0) goto L_0x0319
            java.lang.String r9 = r9.b
            goto L_0x031a
        L_0x0319:
            r9 = 0
        L_0x031a:
            android.content.pm.InstantAppIntentFilter r14 = new android.content.pm.InstantAppIntentFilter
            r14.<init>(r9, r8)
            r6.add(r14)
            r21 = r10
            goto L_0x0276
        L_0x0326:
            r12 = r24
            r11 = 0
            r13 = 2
            r21 = r10
            goto L_0x0276
        L_0x032e:
            r12 = r24
            r10 = r21
            r11 = 0
            r13 = 2
            boolean r4 = r6.isEmpty()
            if (r4 != 0) goto L_0x0346
            android.content.pm.InstantAppResolveInfo r4 = new android.content.pm.InstantAppResolveInfo
            r4.<init>(r2, r5, r6, r7)
            r0.add(r4)
            r21 = r10
            goto L_0x0254
        L_0x0346:
            r21 = r10
            goto L_0x0254
        L_0x034a:
            return r0
        L_0x034b:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qke.a(java.lang.String, qje, java.util.Map, boolean):java.util.List");
    }
}
