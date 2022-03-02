package defpackage;

/* renamed from: airo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class airo implements arpv {
    public final airm a;
    public final aizy b;
    public final aiae c = new aiae();
    public final ahqq d;
    public final ahyt e;
    public final airq f;

    public airo(ahqq ahqq, aizy aizy, airq airq, airm airm) {
        this.d = ahqq;
        this.b = aizy;
        this.f = airq;
        this.a = airm;
        this.e = new ahyt(getClass().getSimpleName());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: aiar} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: aibo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: aiah} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: aiah} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: aiah} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v51, resolved type: aiar} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: aiar} */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x06fe, code lost:
        if (r1.c.d > r0.c.d) goto L_0x0700;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e1, code lost:
        r1 = (((r10[0] & 255) << 16) | ((r10[1] & 255) << 8)) | (r10[2] & 255);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0426  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x04ad  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x04c6  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x067f  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x06aa  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x06b1  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x06e3 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x06ea  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x0706  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x0708  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x01c7 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x040f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01b5 A[LOOP:0: B:48:0x013c->B:65:0x01b5, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01d7  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01f0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.aiax a(defpackage.aibw r37, defpackage.aiam r38, defpackage.aiaq r39, defpackage.aibe r40, boolean r41) {
        /*
            r36 = this;
            r1 = r36
            r2 = r37
            r3 = r38
            ahyt r0 = r1.e
            r0.a()
            airm r4 = r1.a
            aizy r0 = r4.a
            long r5 = r0.b()
            if (r3 == 0) goto L_0x001c
            aiaj r0 = r3.a
            java.util.List r8 = r3.b
            r9 = r8
            r8 = r0
            goto L_0x001e
        L_0x001c:
            r8 = 0
            r9 = 0
        L_0x001e:
            r10 = 0
            if (r8 != 0) goto L_0x0026
            r7 = 0
            r9 = 1
            goto L_0x066b
        L_0x0026:
            boolean r0 = r8.e()
            if (r0 == 0) goto L_0x0669
            defpackage.amrl.a((java.lang.Object) r38)
            boolean r0 = r4.a()
            if (r0 == 0) goto L_0x052e
            arhu r0 = r4.b
            defpackage.amrl.a((java.lang.Object) r0)
            arhu r14 = r4.b
            long r12 = r14.c
            r17 = 1
            long r12 = r12 + r17
            r14.c = r12
            if (r8 == 0) goto L_0x0510
            int r0 = r8.i
            r12 = 4
            r13 = 3
            if (r0 != r13) goto L_0x004d
            goto L_0x0076
        L_0x004d:
            if (r0 != r12) goto L_0x0510
            axyo r0 = defpackage.axyo.a
            axyp r0 = r0.a()
            long r19 = r0.cellFingerprintHoldbackConfig()
            long r19 = r19 & r17
            int r0 = (r19 > r10 ? 1 : (r19 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x0076
            axyo r0 = defpackage.axyo.a
            axyp r0 = r0.a()
            long r19 = r0.cellFingerprintHoldback()
            long r19 = r19 & r17
            int r0 = (r19 > r10 ? 1 : (r19 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x0076
            r10 = r4
            r29 = r5
            r28 = r9
            goto L_0x0515
        L_0x0076:
            arhz r7 = r14.a
            int r0 = r8.i
            r20 = -1
            if (r0 != r13) goto L_0x008d
            int r0 = r8.c     // Catch:{ IllegalArgumentException -> 0x0089 }
            int r15 = r8.d     // Catch:{ IllegalArgumentException -> 0x0089 }
            int r13 = r8.b     // Catch:{ IllegalArgumentException -> 0x0089 }
            long r20 = defpackage.artx.a(r0, r15, r13)     // Catch:{ IllegalArgumentException -> 0x0089 }
            goto L_0x009a
        L_0x0089:
            r0 = move-exception
            r12 = r20
            goto L_0x009c
        L_0x008d:
            if (r0 != r12) goto L_0x0099
            int r0 = r8.c     // Catch:{ IllegalArgumentException -> 0x0089 }
            int r13 = r8.d     // Catch:{ IllegalArgumentException -> 0x0089 }
            int r15 = r8.b     // Catch:{ IllegalArgumentException -> 0x0089 }
            long r20 = defpackage.artu.a(r0, r13, r15)     // Catch:{ IllegalArgumentException -> 0x0089 }
        L_0x0099:
        L_0x009a:
            r12 = r20
        L_0x009c:
            int r20 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r20 < 0) goto L_0x0335
            arhy r7 = (defpackage.arhy) r7
            arib r15 = r7.a
            aqek r10 = r15.c
            if (r10 != 0) goto L_0x00a9
            goto L_0x00cb
        L_0x00a9:
            long r10 = r15.d
            int r21 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r21 != 0) goto L_0x00cb
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r11 = 43
            r10.<init>(r11)
            java.lang.String r11 = "Fast return Cell Map : "
            r10.append(r11)
            r10.append(r12)
            r10.toString()
            aqek r10 = r15.c
            r29 = r5
            r28 = r9
            r11 = r10
            r10 = r4
            goto L_0x0224
        L_0x00cb:
            arhx r10 = r15.b
            r11 = 1
            byte[] r10 = r10.a((long) r12, (boolean) r11)
            if (r10 == 0) goto L_0x0207
            arie r11 = r15.g
            aqek r11 = new aqek
            aqem r0 = defpackage.ajck.x
            r11.<init>(r0)
            int r0 = r10.length
            r1 = 6
            if (r0 < r1) goto L_0x01cf
            r22 = 0
            byte r1 = r10[r22]
            r2 = 2
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 16
            r16 = 1
            byte r2 = r10[r16]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 8
            r1 = r1 | r2
            r2 = 2
            byte r3 = r10[r2]
            r2 = r3 & 255(0xff, float:3.57E-43)
            r1 = r1 | r2
            r2 = 3
            double[] r3 = defpackage.arie.a(r1, r10, r2)
            if (r3 == 0) goto L_0x01cf
            r28 = r9
            int r9 = r3.length
            if (r9 != r2) goto L_0x01cb
            r2 = 0
            r29 = r3[r2]
            r31 = 4711630319722168320(0x416312d000000000, double:1.0E7)
            r9 = r3
            double r2 = r29 * r31
            int r2 = (int) r2
            r3 = 2
            r11.g(r3, r2)
            r2 = 1
            r29 = r9[r2]
            r2 = r4
            double r3 = r29 * r31
            int r3 = (int) r3
            r4 = 3
            r11.g(r4, r3)
            r29 = r5
            r3 = 2
            r4 = r9[r3]
            float r3 = (float) r4
            r4 = 4
            r11.b((int) r4, (float) r3)
            r3 = 6
            if (r0 == r3) goto L_0x01c9
            int r0 = r0 + -6
            byte[] r4 = new byte[r0]
            r5 = 0
            java.lang.System.arraycopy(r10, r3, r4, r5, r0)
            arid r3 = new arid
            r3.<init>(r4)
            r3.a = r5
        L_0x013c:
            int r6 = r3.a
            byte[] r9 = r3.b
            int r9 = r9.length
            int r9 = r9 + -1
            if (r6 >= r9) goto L_0x01c9
            int r9 = r3.a()
            int r9 = r9 + r6
            if (r0 < r9) goto L_0x01ad
            aqek r9 = new aqek
            aqem r10 = defpackage.ajck.w
            r9.<init>(r10)
            int r10 = defpackage.arie.a(r4, r6)
            int r6 = r6 + 1
            byte r20 = r4[r6]
            r16 = 1
            int r6 = r6 + 1
            r5 = 0
        L_0x0160:
            if (r5 >= r10) goto L_0x0186
            int r33 = defpackage.arie.a(r4, r6)
            r34 = 128(0x80, float:1.794E-43)
            int r34 = r34 >> r5
            r34 = r20 & r34
            if (r34 <= 0) goto L_0x0171
            r34 = 256(0x100, float:3.59E-43)
            goto L_0x0173
        L_0x0171:
            r34 = 0
        L_0x0173:
            r35 = r0
            int r0 = r34 + r33
            r33 = r10
            r10 = 2
            r9.a((int) r10, (int) r0)
            int r6 = r6 + 1
            int r5 = r5 + 1
            r10 = r33
            r0 = r35
            goto L_0x0160
        L_0x0186:
            r35 = r0
            double[] r0 = defpackage.arie.a(r1, r4, r6)
            if (r0 == 0) goto L_0x01af
            r5 = 0
            r33 = r0[r5]
            double r5 = r33 * r31
            int r5 = (int) r5
            r6 = 3
            r9.a((int) r6, (int) r5)
            r5 = 1
            r33 = r0[r5]
            double r5 = r33 * r31
            int r5 = (int) r5
            r6 = 4
            r9.a((int) r6, (int) r5)
            r6 = r1
            r10 = r2
            r5 = 2
            r1 = r0[r5]
            float r0 = (float) r1
            r1 = 5
            r9.a((int) r1, (float) r0)
            goto L_0x01b3
        L_0x01ad:
            r35 = r0
        L_0x01af:
            r6 = r1
            r10 = r2
            r1 = 5
            r9 = 0
        L_0x01b3:
            if (r9 == 0) goto L_0x01c7
            r11.a((int) r1, (java.lang.Object) r9)
            int r0 = r3.a
            int r1 = r3.a()
            int r0 = r0 + r1
            r3.a = r0
            r1 = r6
            r2 = r10
            r0 = r35
            goto L_0x013c
        L_0x01c7:
            r11 = 0
            goto L_0x01d5
        L_0x01c9:
            r10 = r2
            goto L_0x01d5
        L_0x01cb:
            r10 = r4
            r29 = r5
            goto L_0x01d4
        L_0x01cf:
            r10 = r4
            r29 = r5
            r28 = r9
        L_0x01d4:
            r11 = 0
        L_0x01d5:
            if (r11 != 0) goto L_0x01f0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 34
            r0.<init>(r1)
            java.lang.String r1 = "Decode "
            r0.append(r1)
            r0.append(r12)
            java.lang.String r1 = " Failed"
            r0.append(r1)
            r0.toString()
            r11 = 0
            goto L_0x0224
        L_0x01f0:
            r15.c = r11
            r15.d = r12
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 37
            r0.<init>(r1)
            java.lang.String r1 = "Found Cell Map : "
            r0.append(r1)
            r0.append(r12)
            r0.toString()
            goto L_0x0224
        L_0x0207:
            r10 = r4
            r29 = r5
            r28 = r9
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 56
            r0.<init>(r1)
            java.lang.String r1 = "Can NOT found key: "
            r0.append(r1)
            r0.append(r12)
            java.lang.String r1 = " in Cache Manager"
            r0.append(r1)
            r0.toString()
            r11 = 0
        L_0x0224:
            if (r11 != 0) goto L_0x033b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 44
            r0.<init>(r1)
            java.lang.String r1 = "Cell Map was not found: "
            r0.append(r1)
            r0.append(r12)
            r0.toString()
            java.lang.String r0 = r8.a()
            int r1 = r8.i
            java.lang.String r2 = ":"
            r3 = 3
            if (r1 != r3) goto L_0x0294
            java.lang.String[] r0 = r0.split(r2)
            int r1 = r0.length
            r4 = 5
            if (r1 != r4) goto L_0x0292
            r1 = 0
            r4 = r0[r1]
            int r4 = defpackage.aric.a(r4)
            if (r4 != r3) goto L_0x0292
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r4 = r0[r1]
            r3.append(r4)
            r3.append(r2)
            r1 = 1
            r4 = r0[r1]
            r3.append(r4)
            r3.append(r2)
            r1 = 2
            r4 = r0[r1]
            r3.append(r4)
            r3.append(r2)
            r1 = 4
            r4 = r0[r1]
            int r4 = java.lang.Integer.parseInt(r4)
            int r4 = r4 >> 16
            char r4 = (char) r4
            r3.append(r4)
            r3.append(r2)
            r0 = r0[r1]
            int r0 = java.lang.Integer.parseInt(r0)
            char r0 = (char) r0
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            goto L_0x02d2
        L_0x0292:
            r0 = 0
            goto L_0x02d2
        L_0x0294:
            r3 = 4
            if (r1 != r3) goto L_0x02d1
            java.lang.String[] r0 = r0.split(r2)
            int r1 = r0.length
            if (r1 != r3) goto L_0x02d1
            r1 = 0
            r4 = r0[r1]
            int r4 = defpackage.aric.a(r4)
            if (r4 != r3) goto L_0x02d1
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r4 = r0[r1]
            r3.append(r4)
            r3.append(r2)
            r1 = 1
            r4 = r0[r1]
            r3.append(r4)
            r3.append(r2)
            r1 = 2
            r4 = r0[r1]
            r3.append(r4)
            r3.append(r2)
            r1 = 3
            r0 = r0[r1]
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            goto L_0x02d2
        L_0x02d1:
            r0 = 0
        L_0x02d2:
            if (r0 != 0) goto L_0x02d5
            goto L_0x02eb
        L_0x02d5:
            arib r1 = r7.a
            r1.f = r0
            java.lang.String r1 = "Set missing Cell ID Key: "
            int r2 = r0.length()
            if (r2 != 0) goto L_0x02e8
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            goto L_0x02eb
        L_0x02e8:
            r1.concat(r0)
        L_0x02eb:
            aizy r0 = r7.c
            long r0 = r0.b()
            long r2 = r7.g
            long r4 = r7.e
            long r2 = r0 - r2
            r4 = 86400000(0x5265c00, double:4.2687272E-316)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x033b
            long r2 = r7.f
            r2 = -604800000(0xffffffffdbf37c00, double:NaN)
            long r2 = r2 + r0
            arib r4 = r7.a
            arhx r4 = r4.b
            arta r4 = r4.values()
            artb r4 = r4.iterator()
        L_0x0315:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0332
            r4.f()
            artd r5 = r4.a
            long[] r5 = r5.a
            arhf r6 = r4.b
            int r6 = r6.d()
            r12 = r5[r6]
            int r5 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r5 >= 0) goto L_0x0315
            r4.remove()
            goto L_0x0315
        L_0x0332:
            r7.g = r0
            goto L_0x033b
        L_0x0335:
            r10 = r4
            r29 = r5
            r28 = r9
            r11 = 0
        L_0x033b:
            if (r11 == 0) goto L_0x04cd
            arhz r0 = r14.a
            arhy r0 = (defpackage.arhy) r0
            arhs r0 = r0.d
            java.util.Collection r1 = r8.h
            int r1 = r1.size()
            int r2 = r0.e
            int r2 = r2 + r1
            r0.e = r2
            arht r0 = r14.b
            defpackage.amrl.a((java.lang.Object) r8)
            defpackage.amrl.a((java.lang.Object) r11)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            boolean r2 = r8 instanceof defpackage.aiar
            java.lang.String r3 = "#"
            if (r2 == 0) goto L_0x0386
            r2 = r8
            aiar r2 = (defpackage.aiar) r2
            java.util.Collection r2 = r2.h
            java.util.Iterator r2 = r2.iterator()
        L_0x036a:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x03af
            java.lang.Object r4 = r2.next()
            aiaj r4 = (defpackage.aiaj) r4
            boolean r5 = r4 instanceof defpackage.aiar
            if (r5 == 0) goto L_0x036a
            aiar r4 = (defpackage.aiar) r4
            int r4 = r4.l
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1.add(r4)
            goto L_0x036a
        L_0x0386:
            boolean r2 = r8 instanceof defpackage.aiaw
            if (r2 == 0) goto L_0x03d9
            r2 = r8
            aiaw r2 = (defpackage.aiaw) r2
            java.util.Collection r2 = r2.h
            java.util.Iterator r2 = r2.iterator()
        L_0x0393:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x03af
            java.lang.Object r4 = r2.next()
            aiaj r4 = (defpackage.aiaj) r4
            boolean r5 = r4 instanceof defpackage.aiaw
            if (r5 == 0) goto L_0x0393
            aiaw r4 = (defpackage.aiaw) r4
            int r4 = r4.l
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1.add(r4)
            goto L_0x0393
        L_0x03af:
            java.util.Collections.sort(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            int r4 = r1.size()
            r5 = 0
        L_0x03bf:
            if (r5 >= r4) goto L_0x03d4
            java.lang.Object r6 = r1.get(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r2.append(r3)
            r2.append(r6)
            int r5 = r5 + 1
            goto L_0x03bf
        L_0x03d4:
            java.lang.String r1 = r2.toString()
            goto L_0x03da
        L_0x03d9:
            r1 = 0
        L_0x03da:
            r2 = 5
            int r4 = r11.j(r2)
            defpackage.amrl.a((java.lang.Object) r11)
            r2 = 2
            int r5 = r11.b((int) r2)
            r2 = 3
            int r6 = r11.b((int) r2)
            r2 = 4
            float r7 = r11.d(r2)
            double r12 = (double) r7
            r31 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            java.lang.Double.isNaN(r12)
            double r12 = r12 * r31
            int r2 = (int) r12
            r7 = 100000(0x186a0, float:1.4013E-40)
            int r2 = java.lang.Math.max(r7, r2)
            aibe r9 = new aibe
            r9.<init>(r5, r6, r2)
            r0.d = r9
            r2 = 0
        L_0x040d:
            if (r2 < r4) goto L_0x0426
            long r1 = r0.b
            long r1 = r1 + r17
            r0.b = r1
            arhz r1 = r0.a
            arhy r1 = (defpackage.arhy) r1
            arhs r1 = r1.d
            int r2 = r1.b
            r3 = 1
            int r2 = r2 + r3
            r1.b = r2
            aibe r0 = r0.d
            r2 = 1
            goto L_0x04ab
        L_0x0426:
            r5 = 5
            aqek r6 = r11.f(r5, r2)
            defpackage.amrl.a((java.lang.Object) r1)
            defpackage.amrl.a((java.lang.Object) r6)
            if (r6 == 0) goto L_0x0457
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            r9 = 2
            int r12 = r6.j(r9)
            r13 = 0
        L_0x0442:
            if (r13 >= r12) goto L_0x0452
            r5.append(r3)
            int r15 = r6.c((int) r9, (int) r13)
            r5.append(r15)
            int r13 = r13 + 1
            r9 = 2
            goto L_0x0442
        L_0x0452:
            java.lang.String r5 = r5.toString()
            goto L_0x0458
        L_0x0457:
            r5 = 0
        L_0x0458:
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x047e
            r5 = 3
            int r9 = r6.b((int) r5)
            r12 = 4
            int r13 = r6.b((int) r12)
            r15 = 5
            float r6 = r6.d(r15)
            double r5 = (double) r6
            java.lang.Double.isNaN(r5)
            double r5 = r5 * r31
            int r5 = (int) r5
            int r5 = java.lang.Math.max(r7, r5)
            aibe r6 = new aibe
            r6.<init>(r9, r13, r5)
            goto L_0x0481
        L_0x047e:
            r12 = 4
            r15 = 5
            r6 = 0
        L_0x0481:
            if (r6 == 0) goto L_0x04c8
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "Got Location With Cell Neighbors: "
            int r3 = r1.length()
            if (r3 != 0) goto L_0x0495
            java.lang.String r1 = new java.lang.String
            r1.<init>(r2)
            goto L_0x0498
        L_0x0495:
            r2.concat(r1)
        L_0x0498:
            long r1 = r0.c
            long r1 = r1 + r17
            r0.c = r1
            arhz r0 = r0.a
            arhy r0 = (defpackage.arhy) r0
            arhs r0 = r0.d
            int r1 = r0.a
            r2 = 1
            int r1 = r1 + r2
            r0.a = r1
            r0 = r6
        L_0x04ab:
            if (r0 == 0) goto L_0x04c6
            arhz r1 = r14.a
            arhy r1 = (defpackage.arhy) r1
            arhs r1 = r1.d
            int r3 = r1.c
            int r3 = r3 + r2
            r1.c = r3
            long r1 = r14.d
            long r1 = r1 + r17
            r14.d = r1
            long r1 = r8.g
            r5 = 2
            aiah r0 = defpackage.aiah.a(r5, r0, r1, r8)
            goto L_0x0516
        L_0x04c6:
            r0 = 0
            goto L_0x0516
        L_0x04c8:
            r5 = 2
            int r2 = r2 + 1
            goto L_0x040d
        L_0x04cd:
            arhz r0 = r14.a
            arhy r0 = (defpackage.arhy) r0
            arhs r1 = r0.d
            int r2 = r1.d
            r3 = 1
            int r2 = r2 + r3
            r1.d = r2
            aria r0 = r0.b
            boolean r1 = r0.b
            if (r1 != 0) goto L_0x050e
            arhy r1 = r0.e
            arib r1 = r1.a
            java.lang.String r1 = r1.f
            if (r1 == 0) goto L_0x050e
            aizy r1 = r0.f
            long r1 = r1.b()
            long r3 = r0.c
            long r1 = r1 - r3
            int r0 = r0.h
            long r3 = (long) r0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x050e
            boolean r0 = defpackage.aybc.c()
            if (r0 == 0) goto L_0x0505
            aiau r0 = defpackage.aiau.NO_LOCATION
            r1 = 0
            aiah r0 = defpackage.aiah.a((int) r1, (defpackage.aiau) r0, (defpackage.aiaj) r8)
            goto L_0x0516
        L_0x0505:
            aiau r0 = defpackage.aiau.CACHE_MISS
            r1 = 0
            aiah r0 = defpackage.aiah.a((defpackage.aiau) r0, (long) r1, (defpackage.aiaj) r8)
            goto L_0x0516
        L_0x050e:
            r0 = 0
            goto L_0x0516
        L_0x0510:
            r10 = r4
            r29 = r5
            r28 = r9
        L_0x0515:
            r0 = 0
        L_0x0516:
            if (r0 == 0) goto L_0x0533
            aiau r1 = r0.d
            aiau r2 = defpackage.aiau.OK
            if (r1 != r2) goto L_0x0533
            aibe r1 = r0.c
            if (r1 == 0) goto L_0x0533
            int r0 = r0.a
            long r2 = r8.g
            aiah r0 = defpackage.aiah.a(r0, r1, r2, r8)
            r7 = 0
            r9 = 1
            goto L_0x0673
        L_0x052e:
            r10 = r4
            r29 = r5
            r28 = r9
        L_0x0533:
            r1 = r10
            r2 = r29
            aibe r0 = r1.a(r8, r2)
            if (r0 != 0) goto L_0x0568
            aizy r0 = r1.a
            long r0 = r0.c()
            aqek r0 = r8.a((long) r0)
            r1 = r39
            r2 = 1
            r1.a(r0, r2)
            boolean r0 = defpackage.aybc.c()
            if (r0 == 0) goto L_0x055c
            aiau r0 = defpackage.aiau.NO_LOCATION
            aiah r0 = defpackage.aiah.a((int) r2, (defpackage.aiau) r0, (defpackage.aiaj) r8)
            r7 = 0
            r9 = 1
            goto L_0x0673
        L_0x055c:
            aiau r0 = defpackage.aiau.CACHE_MISS
            long r1 = r8.g
            aiah r0 = defpackage.aiah.a((defpackage.aiau) r0, (long) r1, (defpackage.aiaj) r8)
            r7 = 0
            r9 = 1
            goto L_0x0673
        L_0x0568:
            boolean r0 = r0.a()
            if (r0 != 0) goto L_0x057a
            aiau r0 = defpackage.aiau.NO_LOCATION
            r1 = 0
            aiah r0 = defpackage.aiah.a((defpackage.aiau) r0, (long) r1, (defpackage.aiaj) r8)
            r7 = 0
            r9 = 1
            goto L_0x0673
        L_0x057a:
            if (r28 == 0) goto L_0x0581
            int r22 = r28.size()
            goto L_0x0583
        L_0x0581:
            r22 = 0
        L_0x0583:
            airn r0 = new airn
            r4 = 1
            int r5 = r22 + 1
            r0.<init>(r5)
            aial r4 = new aial
            r4.<init>(r1, r2, r0)
            long r1 = r8.g
            r5 = -30000(0xffffffffffff8ad0, double:NaN)
            long r1 = r1 + r5
            r3 = r38
            aiaj r5 = r3.a
            if (r5 != 0) goto L_0x059c
            goto L_0x059f
        L_0x059c:
            r4.a(r5)
        L_0x059f:
            java.util.List r3 = r3.b
            int r5 = r3.size()
            r6 = 0
        L_0x05a6:
            if (r6 < r5) goto L_0x0653
            aibe r1 = new aibe
            double r2 = r0.a()
            int r2 = defpackage.aell.b((double) r2)
            double r3 = r0.b()
            int r3 = defpackage.aell.b((double) r3)
            int r4 = r0.c
            if (r4 != 0) goto L_0x05c2
            r7 = 0
            r22 = 0
            goto L_0x0616
        L_0x05c2:
            r5 = 1
            if (r4 == r5) goto L_0x0611
            double r4 = r0.a()
            double r6 = r0.b()
            r9 = 5000(0x1388, float:7.006E-42)
            r10 = 5000(0x1388, float:7.006E-42)
            r11 = 0
            r12 = 0
            r13 = 0
        L_0x05d4:
            int r14 = r0.c
            if (r11 >= r14) goto L_0x0605
            double[] r14 = r0.d
            r24 = r14[r11]
            double[] r14 = r0.e
            r26 = r14[r11]
            r20 = r4
            r22 = r6
            double r17 = defpackage.aell.b((double) r20, (double) r22, (double) r24, (double) r26)
            r38 = r4
            long r4 = java.lang.Math.round(r17)
            int r5 = (int) r4
            int r13 = r13 + r5
            int[] r4 = r0.f
            r4 = r4[r11]
            if (r5 > r4) goto L_0x05f7
            goto L_0x05f8
        L_0x05f7:
            r12 = 1
        L_0x05f8:
            if (r4 < r9) goto L_0x05fb
            goto L_0x05fc
        L_0x05fb:
            r10 = r5
        L_0x05fc:
            if (r4 < r9) goto L_0x05ff
            goto L_0x0600
        L_0x05ff:
            r9 = r4
        L_0x0600:
            int r11 = r11 + 1
            r4 = r38
            goto L_0x05d4
        L_0x0605:
            if (r12 == 0) goto L_0x060b
            int r22 = r13 / r14
            r7 = 0
            goto L_0x0616
        L_0x060b:
            int r22 = java.lang.Math.max(r9, r10)
            r7 = 0
            goto L_0x0616
        L_0x0611:
            int[] r0 = r0.f
            r7 = 0
            r22 = r0[r7]
        L_0x0616:
            int r0 = defpackage.aias.b(r22)
            r1.<init>(r2, r3, r0)
            boolean r0 = defpackage.aias.a((defpackage.aibe) r1)
            if (r0 == 0) goto L_0x0649
            java.lang.String r0 = java.lang.String.valueOf(r1)
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 21
            r3.<init>(r2)
            java.lang.String r2 = "Found cell location: "
            r3.append(r2)
            r3.append(r0)
            r3.toString()
            long r2 = r8.g
            r9 = 1
            aiah r0 = defpackage.aiah.a(r9, r1, r2, r8)
            goto L_0x0673
        L_0x0649:
            r9 = 1
            aiau r0 = defpackage.aiau.NO_LOCATION
            long r1 = r8.g
            aiah r0 = defpackage.aiah.a((defpackage.aiau) r0, (long) r1, (defpackage.aiaj) r8)
            goto L_0x0673
        L_0x0653:
            r7 = 0
            r9 = 1
            java.lang.Object r10 = r3.get(r6)
            aiaj r10 = (defpackage.aiaj) r10
            long r11 = r10.g
            int r13 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r13 > 0) goto L_0x0662
            goto L_0x0665
        L_0x0662:
            r4.a(r10)
        L_0x0665:
            int r6 = r6 + 1
            goto L_0x05a6
        L_0x0669:
            r7 = 0
            r9 = 1
        L_0x066b:
            aiau r0 = defpackage.aiau.EMPTY_SCAN
            r1 = 0
            aiah r0 = defpackage.aiah.a((defpackage.aiau) r0, (long) r1, (defpackage.aiaj) r8)
        L_0x0673:
            if (r40 != 0) goto L_0x06aa
            aiau r1 = r0.d
            aiau r2 = defpackage.aiau.OK
            if (r1 != r2) goto L_0x06aa
            aibe r1 = r0.c
            if (r1 == 0) goto L_0x06aa
            aibe r2 = new aibe
            int r3 = r1.b
            int r1 = r1.c
            r4 = 50000000(0x2faf080, float:3.6872239E-37)
            r2.<init>(r3, r1, r4)
            java.lang.String r1 = java.lang.String.valueOf(r2)
            java.lang.String r3 = java.lang.String.valueOf(r1)
            int r3 = r3.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r3 = r3 + 50
            r4.<init>(r3)
            java.lang.String r3 = "Generating cell-based outlier rejection aperture: "
            r4.append(r3)
            r4.append(r1)
            r4.toString()
            goto L_0x06ad
        L_0x06aa:
            r2 = r40
        L_0x06ad:
            r1 = r37
            if (r1 == 0) goto L_0x06d3
            long r3 = r37.d()
            boolean r5 = r37.f()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r8 = 57
            r6.<init>(r8)
            java.lang.String r8 = "WiFi scan "
            r6.append(r8)
            r6.append(r3)
            java.lang.String r3 = " has RTT information: "
            r6.append(r3)
            r6.append(r5)
            r6.toString()
        L_0x06d3:
            r3 = r36
            aibo r1 = r3.a(r1, r2)
            aiau r2 = r1.d
            aiau r4 = defpackage.aiau.OK
            aiau r5 = r0.d
            aiau r6 = defpackage.aiau.OK
            if (r2 == r4) goto L_0x06e7
            if (r5 == r6) goto L_0x06e7
            r2 = 0
            goto L_0x0704
        L_0x06e7:
            if (r2 == r4) goto L_0x06ea
            goto L_0x0700
        L_0x06ea:
            if (r5 != r6) goto L_0x0702
            aibe r2 = r1.c
            defpackage.amrl.a((java.lang.Object) r2)
            aibe r2 = r0.c
            defpackage.amrl.a((java.lang.Object) r2)
            aibe r2 = r1.c
            int r2 = r2.d
            aibe r4 = r0.c
            int r4 = r4.d
            if (r2 <= r4) goto L_0x0702
        L_0x0700:
            r2 = r0
            goto L_0x0704
        L_0x0702:
            r2 = r1
        L_0x0704:
            if (r41 != 0) goto L_0x0708
            r12 = 0
            goto L_0x070d
        L_0x0708:
            if (r2 != r0) goto L_0x070c
            r12 = 1
            goto L_0x070d
        L_0x070c:
            r12 = 0
        L_0x070d:
            aiax r4 = new aiax
            r4.<init>(r2, r1, r0, r12)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.airo.a(aibw, aiam, aiaq, aibe, boolean):aiax");
    }

    public final arpu a(Long l) {
        throw null;
    }

    public final aibo a(aibw aibw, aibe aibe) {
        aibo a2;
        aibe aibe2;
        this.e.a();
        if (aibw == null || aibw.b() == 0) {
            return aibo.a(aiau.EMPTY_SCAN, this.b.c(), aibw);
        }
        if (!aydu.c() || !aibw.f() || (a2 = airp.a((arpv) this).a(aibw.e())) == null || a2.d != aiau.OK) {
            aibo a3 = this.f.a(aibw, aibe);
            return a3 == null ? aibo.a(aiau.NO_LOCATION, this.b.c(), aibw) : a3;
        } else if (!aybc.a.a().overwriteRttZAxisInfoWithFrewle()) {
            return a2;
        } else {
            aibo a4 = this.f.a(aibw, aibe);
            if (a2.c == null || a4 == null || a4.d != aiau.OK || (aibe2 = a4.c) == null) {
                return a2;
            }
            aibd l = a2.c.l();
            if (aibe2.f()) {
                l.b = aibe2.k();
            }
            if (aibe2.d()) {
                l.a(aibe2.i());
            }
            if (aibe2.b() && aibe2.c()) {
                l.a(aibe2.g(), aibe2.h());
            }
            if (aibe2.e()) {
                l.a = aibe2.j();
            }
            return aibo.a(a2.a, l.a(), a2.e, a2.b);
        }
    }

    public final boolean a() {
        this.e.a();
        return this.a.a();
    }
}
