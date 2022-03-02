package defpackage;

/* renamed from: airq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class airq {
    public final arpl a;

    public airq(arpl arpl) {
        this.a = arpl;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: arpn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v38, resolved type: arpt} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v42, resolved type: arpn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v40, resolved type: arpn} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.aibo a(defpackage.aibw r42, defpackage.aibe r43) {
        /*
            r41 = this;
            r7 = r42
            r9 = r41
            r0 = r43
            arpl r1 = r9.a
            arsf r2 = r1.a
            arqy r2 = r2.u
            boolean r3 = r2.e
            if (r3 == 0) goto L_0x001b
            arrx r3 = new arrx
            r3.<init>()
            arqp r2 = r2.b
            r2.a(r3)
            goto L_0x001d
        L_0x001b:
            arrv r3 = defpackage.arrv.a
        L_0x001d:
            r1.c = r3
            arrc r2 = r1.c
            arsf r3 = r1.a
            aizy r3 = r3.c
            long r3 = r3.b()
            r2.a((long) r3)
            arrc r2 = r1.c
            r2.b((defpackage.aibe) r0)
            arrc r2 = r1.c
            int r3 = r42.b()
            r2.a((int) r3)
            arrc r2 = r1.c
            long r3 = r42.d()
            r2.b((long) r3)
            arsf r2 = r1.a
            arpj r3 = r2.s
            aizy r2 = r2.c
            java.lang.String r4 = "os_"
            arpi r3 = r3.a((java.lang.String) r4)
            r3.a(r2)
            arsf r2 = r1.a
            aybd r2 = r2.g
            boolean r2 = r2.enableRnnFrewleEngine()
            r3 = 0
            if (r2 != 0) goto L_0x0070
            r1.d = r3
            arpn r2 = new arpn
            arsf r11 = r1.a
            arrd r12 = r1.b
            int r13 = r1.e
            int r14 = r1.f
            boolean r15 = r1.g
            r10 = r2
            r10.<init>(r11, r12, r13, r14, r15)
            goto L_0x0081
        L_0x0070:
            arpt r2 = r1.d
            if (r2 != 0) goto L_0x007f
            arpt r2 = new arpt
            arsf r5 = r1.a
            ajaa r6 = r5.d
            r2.<init>(r6, r5)
            r1.d = r2
        L_0x007f:
            arpt r2 = r1.d
        L_0x0081:
            arpk r5 = new arpk
            arsf r6 = r1.a
            arsy r8 = r1.i
            arrc r10 = r1.c
            r5.<init>(r6, r8, r10, r2)
            arsg r2 = r5.a
            arsf r2 = (defpackage.arsf) r2
            arpj r6 = r2.s
            aizy r2 = r2.c
            java.lang.String r8 = "ld_"
            arpi r6 = r6.a((java.lang.String) r8)
            r6.a(r2)
            arsy r2 = r5.d
            arrc r6 = r5.b
            arsw r8 = r2.e
            r8.a()
            int r8 = r42.b()
            int r10 = r2.d
            r15 = 1000(0x3e8, float:1.401E-42)
            int r8 = java.lang.Math.min(r8, r15)
            arsw r10 = r2.f
            r10.b(r8)
            r10.a()
            aibv[] r14 = r42.e()
            r13 = 0
            r11 = 0
        L_0x00c0:
            r21 = -8388608(0xffffffffff800000, float:-Infinity)
            if (r11 < r8) goto L_0x0664
            arsw r8 = r2.f
            int r10 = r8.b
            if (r10 <= 0) goto L_0x00f2
            java.util.Comparator r11 = defpackage.artg.b
            r8.a((java.util.Comparator) r11)
            arsw r8 = r2.f
            long r16 = defpackage.arsy.a(r8, r13)
            r8 = 1
            r11 = 1
        L_0x00d7:
            if (r8 < r10) goto L_0x00db
            r3 = r11
            goto L_0x00f3
        L_0x00db:
            arsw r3 = r2.f
            long r18 = defpackage.arsy.a(r3, r8)
            int r3 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r3 != 0) goto L_0x00e6
            goto L_0x00e8
        L_0x00e6:
            int r11 = r11 + 1
        L_0x00e8:
            arsw r3 = r2.f
            long r16 = defpackage.arsy.a(r3, r8)
            int r8 = r8 + 1
            r3 = 0
            goto L_0x00d7
        L_0x00f2:
            r3 = 0
        L_0x00f3:
            arsw r8 = r2.e
            r8.b(r3)
            r8 = 0
            r10 = 1
            r11 = 0
        L_0x00fb:
            r12 = 2
            if (r8 < r3) goto L_0x0532
            arsw r6 = r2.e
            java.util.Comparator r8 = defpackage.artg.a
            r6.a((java.util.Comparator) r8)
            arsw r6 = r2.e
            int r8 = r2.c
            int r3 = java.lang.Math.min(r3, r15)
            r6.a((int) r3)
            arsw r3 = r2.e
            java.util.Comparator r6 = defpackage.artg.b
            r3.a((java.util.Comparator) r6)
            r5.d = r2
            arsg r2 = r5.a
            arsy r3 = r5.d
            arrc r6 = r5.b
            java.util.Set r2 = r2.a(r3, r6)
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L_0x0134
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r23 = r4
            r25 = r5
            goto L_0x02b6
        L_0x0134:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            int[] r11 = new int[r12]
            int[] r15 = new int[r12]
            java.util.Iterator r17 = r2.iterator()
        L_0x0150:
            boolean r18 = r17.hasNext()
            if (r18 == 0) goto L_0x020e
            java.lang.Object r18 = r17.next()
            r12 = r18
            arpu r12 = (defpackage.arpu) r12
            long r13 = r12.b
            defpackage.aema.a((long) r13, (int[]) r11)
            arsv r13 = new arsv
            r13.<init>(r12)
            r10.add(r13)
            int r12 = r6.size()
            r13 = 0
        L_0x0170:
            if (r13 >= r12) goto L_0x01d3
            java.lang.Object r14 = r6.get(r13)
            arsv r14 = (defpackage.arsv) r14
            java.util.List r9 = r14.a
            r22 = r12
            int r12 = r9.size()
            r7 = 0
        L_0x0181:
            if (r7 >= r12) goto L_0x01bf
            java.lang.Object r23 = r9.get(r7)
            r24 = r9
            r9 = r23
            arpu r9 = (defpackage.arpu) r9
            r23 = r4
            r25 = r5
            long r4 = r9.b
            defpackage.aema.a((long) r4, (int[]) r15)
            int r7 = r7 + 1
            r4 = 0
            r5 = r11[r4]
            r26 = r7
            r9 = 1
            r7 = r11[r9]
            r27 = r12
            r12 = r15[r4]
            r4 = r15[r9]
            double r4 = defpackage.aell.a((int) r5, (int) r7, (int) r12, (int) r4)
            r28 = 4641240890982006784(0x4069000000000000, double:200.0)
            int r7 = (r4 > r28 ? 1 : (r4 == r28 ? 0 : -1))
            if (r7 > 0) goto L_0x01b4
            r10.add(r14)
            goto L_0x01c6
        L_0x01b4:
            r4 = r23
            r9 = r24
            r5 = r25
            r7 = r26
            r12 = r27
            goto L_0x0181
        L_0x01bf:
            r23 = r4
            r25 = r5
            r8.add(r14)
        L_0x01c6:
            int r13 = r13 + 1
            r9 = r41
            r7 = r42
            r12 = r22
            r4 = r23
            r5 = r25
            goto L_0x0170
        L_0x01d3:
            r23 = r4
            r25 = r5
            arsv r4 = new arsv
            r4.<init>()
            int r5 = r10.size()
            r7 = 0
        L_0x01e1:
            if (r7 >= r5) goto L_0x01f3
            java.lang.Object r9 = r10.get(r7)
            arsv r9 = (defpackage.arsv) r9
            java.util.List r12 = r4.a
            java.util.List r9 = r9.a
            r12.addAll(r9)
            int r7 = r7 + 1
            goto L_0x01e1
        L_0x01f3:
            r8.add(r4)
            r10.clear()
            r6.clear()
            r6.addAll(r8)
            r8.clear()
            r9 = r41
            r7 = r42
            r4 = r23
            r5 = r25
            r12 = 2
            r13 = 0
            goto L_0x0150
        L_0x020e:
            r23 = r4
            r25 = r5
            int r4 = r6.size()
            if (r4 <= 0) goto L_0x02b4
            int r4 = r6.size()
            boolean[] r4 = new boolean[r4]
            r5 = 0
            r7 = 0
            r8 = 0
        L_0x0221:
            int r9 = r6.size()
            if (r5 >= r9) goto L_0x0271
            java.lang.Object r9 = r6.get(r5)
            arsv r9 = (defpackage.arsv) r9
            java.util.List r9 = r9.a
            r10 = 0
            java.lang.Object r12 = r9.get(r10)
            arpu r12 = (defpackage.arpu) r12
            long r12 = r12.b
            defpackage.aema.a((long) r12, (int[]) r11)
            if (r0 == 0) goto L_0x0262
            r12 = r11[r10]
            r10 = 1
            r13 = r11[r10]
            int r10 = r0.b
            int r14 = r0.c
            double r12 = defpackage.aell.a((int) r12, (int) r13, (int) r10, (int) r14)
            r14 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r12 = r12 * r14
            int r10 = r0.d
            double r14 = (double) r10
            int r10 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r10 >= 0) goto L_0x0259
            goto L_0x0262
        L_0x0259:
            int r9 = r9.size()
            int r7 = java.lang.Math.max(r7, r9)
            goto L_0x026e
        L_0x0262:
            r10 = 1
            r4[r5] = r10
            int r9 = r9.size()
            int r8 = java.lang.Math.max(r8, r9)
        L_0x026e:
            int r5 = r5 + 1
            goto L_0x0221
        L_0x0271:
            r5 = 3
            if (r7 < r5) goto L_0x027d
            int r0 = r7 - r8
            r9 = 2
            if (r0 >= r9) goto L_0x027b
            r0 = 1
            goto L_0x027e
        L_0x027b:
            r0 = 0
            goto L_0x027e
        L_0x027d:
            r0 = 1
        L_0x027e:
            if (r0 == 0) goto L_0x0282
            r7 = r8
            goto L_0x0283
        L_0x0282:
        L_0x0283:
            r5 = 0
        L_0x0284:
            int r8 = r6.size()
            if (r5 >= r8) goto L_0x02b4
            java.lang.Object r8 = r6.get(r5)
            arsv r8 = (defpackage.arsv) r8
            java.util.List r8 = r8.a
            boolean r9 = r4[r5]
            if (r9 == r0) goto L_0x0297
            goto L_0x029e
        L_0x0297:
            int r9 = r8.size()
            if (r9 < r7) goto L_0x029e
            goto L_0x02b1
        L_0x029e:
            int r9 = r8.size()
            r10 = 0
        L_0x02a3:
            if (r10 >= r9) goto L_0x02b1
            java.lang.Object r11 = r8.get(r10)
            arpu r11 = (defpackage.arpu) r11
            r3.add(r11)
            int r10 = r10 + 1
            goto L_0x02a3
        L_0x02b1:
            int r5 = r5 + 1
            goto L_0x0284
        L_0x02b4:
            r0 = r3
        L_0x02b6:
            int r3 = r0.size()
            r4 = 0
        L_0x02bb:
            if (r4 >= r3) goto L_0x02f3
            java.lang.Object r5 = r0.get(r4)
            arpu r5 = (defpackage.arpu) r5
            r2.remove(r5)
            r7 = r25
            arrc r6 = r7.b
            long r8 = r5.a
            float r10 = r5.f
            int r10 = (int) r10
            r28 = 10
            long r11 = r5.b
            float r13 = r5.e
            int r14 = r5.g
            float r15 = r5.h
            arqq r5 = r5.l
            r24 = r6
            r25 = r8
            r27 = r10
            r29 = r11
            r31 = r13
            r32 = r14
            r33 = r15
            r34 = r5
            r24.a(r25, r27, r28, r29, r31, r32, r33, r34)
            int r4 = r4 + 1
            r25 = r7
            goto L_0x02bb
        L_0x02f3:
            r7 = r25
            arrc r0 = r7.b
            arpm r3 = r7.c
            aibe r0 = r3.a(r2, r0)
            java.util.Set r3 = java.util.Collections.emptySet()
            if (r0 == 0) goto L_0x03bc
            arsg r4 = r7.a
            arsf r4 = (defpackage.arsf) r4
            aybd r4 = r4.g
            boolean r4 = r4.elevationFromWifiEnabled()
            if (r4 == 0) goto L_0x032f
            arsg r3 = r7.a
            arsf r3 = (defpackage.arsf) r3
            aybd r3 = r3.g
            arpg r3 = defpackage.arph.a((java.util.Set) r2, (defpackage.aybd) r3)
            float r4 = r3.a
            float r5 = r3.b
            java.util.Collection r3 = r3.c
            int r6 = (r4 > r21 ? 1 : (r4 == r21 ? 0 : -1))
            if (r6 == 0) goto L_0x0330
            aibd r0 = r0.l()
            r0.a(r4, r5)
            aibe r0 = r0.a()
            goto L_0x0330
        L_0x032f:
        L_0x0330:
            arsg r4 = r7.a
            arsf r4 = (defpackage.arsf) r4
            aybd r4 = r4.g
            boolean r4 = r4.enableFrewleFloorEstimator()
            if (r4 == 0) goto L_0x03b9
            arsg r4 = r7.a
            arsf r4 = (defpackage.arsf) r4
            aybd r4 = r4.g
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.util.Iterator r6 = r2.iterator()
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = 0
        L_0x034e:
            boolean r10 = r6.hasNext()
            if (r10 == 0) goto L_0x0392
            java.lang.Object r10 = r6.next()
            arpu r10 = (defpackage.arpu) r10
            arqq r11 = r10.l
            if (r11 == 0) goto L_0x034e
            float r11 = r10.f
            long r12 = r4.elevationFromWifiMinRssiDbm()
            float r12 = (float) r12
            int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r11 < 0) goto L_0x034e
            arqq r11 = r10.l
            boolean r11 = r5.containsKey(r11)
            if (r11 == 0) goto L_0x0380
            arqq r11 = r10.l
            java.lang.Object r11 = r5.get(r11)
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r12 = 1
            int r11 = r11 + r12
            goto L_0x0381
        L_0x0380:
            r11 = 1
        L_0x0381:
            if (r11 <= r8) goto L_0x0387
            arqq r9 = r10.l
            r8 = r11
            goto L_0x0388
        L_0x0387:
        L_0x0388:
            arqq r10 = r10.l
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r5.put(r10, r11)
            goto L_0x034e
        L_0x0392:
            if (r9 == 0) goto L_0x03b9
            java.lang.String r4 = r9.a
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x03b9
            aibd r0 = r0.l()
            java.lang.String r4 = r9.a
            r0.b = r4
            java.lang.String r4 = r9.a()
            if (r4 == 0) goto L_0x03b3
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L_0x03b3
            r0.a(r4)
        L_0x03b3:
            aibe r0 = r0.a()
            r4 = r0
            goto L_0x03bd
        L_0x03b9:
            r4 = r0
            goto L_0x03bd
        L_0x03bc:
            r4 = r0
        L_0x03bd:
            java.util.Iterator r0 = r2.iterator()
        L_0x03c1:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0421
            java.lang.Object r2 = r0.next()
            arpu r2 = (defpackage.arpu) r2
            boolean r5 = r3.contains(r2)
            if (r5 == 0) goto L_0x03fa
            arrc r5 = r7.b
            long r8 = r2.a
            float r6 = r2.f
            int r6 = (int) r6
            r28 = 11
            long r10 = r2.b
            float r12 = r2.e
            int r13 = r2.g
            float r14 = r2.h
            arqq r2 = r2.l
            r24 = r5
            r25 = r8
            r27 = r6
            r29 = r10
            r31 = r12
            r32 = r13
            r33 = r14
            r34 = r2
            r24.a(r25, r27, r28, r29, r31, r32, r33, r34)
            goto L_0x03c1
        L_0x03fa:
            arrc r5 = r7.b
            long r8 = r2.a
            float r6 = r2.f
            int r6 = (int) r6
            r33 = 1
            long r10 = r2.b
            float r12 = r2.e
            int r13 = r2.g
            float r14 = r2.h
            arqq r2 = r2.l
            r29 = r5
            r30 = r8
            r32 = r6
            r34 = r10
            r36 = r12
            r37 = r13
            r38 = r14
            r39 = r2
            r29.a(r30, r32, r33, r34, r36, r37, r38, r39)
            goto L_0x03c1
        L_0x0421:
            arrd r0 = r1.b
            r0.b()
            arsf r0 = r1.a
            aizy r2 = r0.c
            long r2 = r2.b()
            long r5 = r0.p
            long r5 = r2 - r5
            r7 = 86400000(0x5265c00, double:4.2687272E-316)
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 <= 0) goto L_0x0444
            arsn r5 = r0.i
            r6 = -604800000(0xffffffffdbf37c00, double:NaN)
            long r6 = r6 + r2
            r5.a((long) r6)
            r0.p = r2
        L_0x0444:
            long r5 = r0.q
            long r5 = r2 - r5
            r7 = 3600000(0x36ee80, double:1.7786363E-317)
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 > 0) goto L_0x0450
            goto L_0x0457
        L_0x0450:
            arsn r5 = r0.i
            r5.d()
            r0.q = r2
        L_0x0457:
            arsj r2 = r0.h
            boolean r0 = r2.j
            if (r0 != 0) goto L_0x045f
            r13 = 0
            goto L_0x0493
        L_0x045f:
            aqek r0 = r2.d
            if (r0 == 0) goto L_0x0492
            boolean r0 = r2.e
            if (r0 == 0) goto L_0x0492
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.c
            r3 = 1
            boolean r0 = r0.getAndSet(r3)
            if (r0 != 0) goto L_0x0490
            aqek r0 = r2.d     // Catch:{ IOException -> 0x0486 }
            byte[] r0 = r0.b()     // Catch:{ IOException -> 0x0486 }
            ajaa r3 = r2.h     // Catch:{ IOException -> 0x0486 }
            java.util.concurrent.ExecutorService r3 = r3.f()     // Catch:{ IOException -> 0x0486 }
            arsi r5 = new arsi     // Catch:{ IOException -> 0x0486 }
            r5.<init>(r2, r0)     // Catch:{ IOException -> 0x0486 }
            r3.execute(r5)     // Catch:{ IOException -> 0x0486 }
            r13 = 0
            goto L_0x048d
        L_0x0486:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.c
            r13 = 0
            r0.set(r13)
        L_0x048d:
            r2.e = r13
            goto L_0x0493
        L_0x0490:
            r13 = 0
            goto L_0x0493
        L_0x0492:
            r13 = 0
        L_0x0493:
            arsf r0 = r1.a
            arpj r2 = r0.s
            aizy r0 = r0.c
            r14 = r23
            arpi r3 = r2.a((java.lang.String) r14)
            r3.b(r0)
            if (r4 == 0) goto L_0x04aa
            int r0 = r2.a
            r3 = 1
            int r0 = r0 + r3
            r2.a = r0
        L_0x04aa:
            arsf r0 = r1.a
            boolean r0 = r0.e()
            r2 = 5
            if (r0 == 0) goto L_0x04ff
            arrc r0 = r1.c
            r3 = 7
            arsf r5 = r1.a
            aizy r5 = r5.c
            long r5 = r5.b()
            r0.a(r3, r5)
            arsf r0 = r1.a
            aybd r0 = r0.g
            boolean r0 = r0.usePartialGlsFix142179343()
            if (r0 != 0) goto L_0x04dc
            aiau r0 = defpackage.aiau.CACHE_MISS
            arsf r1 = r1.a
            aizy r1 = r1.c
            long r1 = r1.c()
            r12 = r42
            aibo r3 = defpackage.aibo.a(r0, r1, r12)
            goto L_0x0531
        L_0x04dc:
            r12 = r42
            if (r4 != 0) goto L_0x04e2
            r2 = 0
            goto L_0x04e3
        L_0x04e2:
        L_0x04e3:
            if (r4 == 0) goto L_0x04e8
            aiau r0 = defpackage.aiau.OK
            goto L_0x04ea
        L_0x04e8:
            aiau r0 = defpackage.aiau.GLS_ERROR
        L_0x04ea:
            arsf r1 = r1.a
            aizy r1 = r1.c
            long r5 = r1.c()
            aibo r9 = new aibo
            r8 = 1
            r1 = r9
            r3 = r4
            r4 = r0
            r7 = r42
            r1.<init>(r2, r3, r4, r5, r7, r8)
            r3 = r9
            goto L_0x0531
        L_0x04ff:
            r12 = r42
            if (r4 == 0) goto L_0x0523
            arrc r0 = r1.c
            r0.a((defpackage.aibe) r4)
            arrc r0 = r1.c
            arsf r3 = r1.a
            aizy r3 = r3.c
            long r5 = r3.b()
            r3 = 1
            r0.a(r3, r5)
            arsf r0 = r1.a
            aizy r0 = r0.c
            long r0 = r0.c()
            aibo r3 = defpackage.aibo.a(r2, r4, r0, r12)
            goto L_0x0531
        L_0x0523:
            arrc r0 = r1.c
            arsf r1 = r1.a
            aizy r1 = r1.c
            long r3 = r1.b()
            r0.a(r2, r3)
            r3 = 0
        L_0x0531:
            return r3
        L_0x0532:
            r14 = r4
            r12 = r7
            r4 = 1
            r9 = 2
            r7 = r5
            r5 = 3
            arsw r4 = r2.f
            long r23 = defpackage.arsy.a(r4, r11)
            r4 = r10
        L_0x053f:
            arsw r10 = r2.f
            int r5 = r10.b
            if (r4 < r5) goto L_0x0552
            r40 = r11
            r9 = r12
            r5 = r14
            r28 = 2
            r29 = 0
            r30 = 1
            r31 = 1000(0x3e8, float:1.401E-42)
            goto L_0x05ac
        L_0x0552:
            long r17 = defpackage.arsy.a(r10, r4)
            int r5 = (r23 > r17 ? 1 : (r23 == r17 ? 0 : -1))
            if (r5 != 0) goto L_0x05a0
            arsw r5 = r2.f
            int r5 = defpackage.arsy.e(r5, r4)
            arsw r10 = r2.f
            int r18 = defpackage.arsy.d(r10, r4)
            arsw r10 = r2.f
            float r19 = defpackage.arsy.b(r10, r4)
            arsw r10 = r2.f
            defpackage.arsy.c(r10, r4)
            r17 = 6
            r25 = 0
            r22 = -8388608(0xffffffffff800000, float:-Infinity)
            r27 = 0
            r10 = r6
            r40 = r11
            r9 = r12
            r28 = 2
            r11 = r23
            r29 = 0
            r13 = r5
            r5 = r14
            r30 = 1
            r14 = r17
            r31 = 1000(0x3e8, float:1.401E-42)
            r15 = r25
            r17 = r22
            r20 = r27
            r10.a(r11, r13, r14, r15, r17, r18, r19, r20)
            int r4 = r4 + 1
            r14 = r5
            r12 = r9
            r11 = r40
            r5 = 3
            r9 = 2
            r13 = 0
            r15 = 1000(0x3e8, float:1.401E-42)
            goto L_0x053f
        L_0x05a0:
            r40 = r11
            r9 = r12
            r5 = r14
            r28 = 2
            r29 = 0
            r30 = 1
            r31 = 1000(0x3e8, float:1.401E-42)
        L_0x05ac:
            arsw r10 = r2.e
            arsw r11 = r2.f
            java.util.Comparator r12 = defpackage.artg.a
            r13 = r40
            if (r13 < 0) goto L_0x064b
            int r14 = r11.b
            if (r13 >= r14) goto L_0x064b
            if (r4 <= 0) goto L_0x0632
            if (r4 > r14) goto L_0x0632
            java.lang.Object[] r14 = r11.a     // Catch:{ IllegalArgumentException -> 0x0610 }
            java.util.Arrays.sort(r14, r13, r4, r12)     // Catch:{ IllegalArgumentException -> 0x0610 }
            int r12 = r4 - r13
            int r14 = r12 / 2
            int r14 = r14 + r13
            int r12 = r12 % 2
            if (r12 != 0) goto L_0x05e0
            java.lang.Object[] r11 = r11.a
            artg[] r11 = (defpackage.artg[]) r11
            int r12 = r14 + -1
            r12 = r11[r12]
            int r12 = r12.d
            r11 = r11[r14]
            int r11 = r11.d
            int r12 = r12 + r11
            int r12 = r12 / 2
            r25 = r12
            goto L_0x05ea
        L_0x05e0:
            java.lang.Object[] r11 = r11.a
            artg[] r11 = (defpackage.artg[]) r11
            r11 = r11[r14]
            int r11 = r11.d
            r25 = r11
        L_0x05ea:
            arsw r11 = r2.f
            int r26 = defpackage.arsy.d(r11, r13)
            arsw r11 = r2.f
            float r27 = defpackage.arsy.b(r11, r13)
            arsw r11 = r2.f
            float r28 = defpackage.arsy.c(r11, r13)
            r22 = r10
            defpackage.arsy.a(r22, r23, r25, r26, r27, r28)
            int r10 = r4 + 1
            int r8 = r8 + 1
            r11 = r4
            r4 = r5
            r5 = r7
            r7 = r9
            r13 = 0
            r15 = 1000(0x3e8, float:1.401E-42)
            r9 = r41
            goto L_0x00fb
        L_0x0610:
            r0 = move-exception
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 82
            r1.<init>(r2)
            java.lang.String r2 = "Illegal argument exception on sort: toIndex = "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r2 = ", fromIndex = "
            r1.append(r2)
            r1.append(r13)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0632:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 50
            r1.<init>(r2)
            java.lang.String r2 = "Index out of bounds on sort: toIndex = "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x064b:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 52
            r1.<init>(r2)
            java.lang.String r2 = "Index out of bounds on sort: fromIndex = "
            r1.append(r2)
            r1.append(r13)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0664:
            r9 = r7
            r29 = 0
            r31 = 1000(0x3e8, float:1.401E-42)
            r7 = r5
            r5 = r4
            byte r3 = r9.b(r11)
            long r16 = r9.a(r11)
            if (r14 == 0) goto L_0x06ad
            int r4 = r14.length
            r10 = 0
            r12 = -8388608(0xffffffffff800000, float:-Infinity)
            r13 = 0
        L_0x067a:
            if (r13 >= r4) goto L_0x06a4
            r15 = r14[r13]
            r22 = r1
            long r0 = r15.a
            int r18 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r18 == 0) goto L_0x0688
            r1 = 3
            goto L_0x069d
        L_0x0688:
            int r0 = r15.i
            r1 = 3
            if (r0 <= r1) goto L_0x069c
            int r10 = r15.e
            float r10 = (float) r10
            r12 = 1120403456(0x42c80000, float:100.0)
            float r10 = r10 / r12
            int r15 = r15.f
            float r15 = (float) r15
            float r12 = r15 / r12
            r21 = r10
            r10 = r0
            goto L_0x069d
        L_0x069c:
        L_0x069d:
            int r13 = r13 + 1
            r0 = r43
            r1 = r22
            goto L_0x067a
        L_0x06a4:
            r22 = r1
            r19 = r10
            r20 = r21
            r21 = r12
            goto L_0x06b3
        L_0x06ad:
            r22 = r1
            r19 = 0
            r20 = -8388608(0xffffffffff800000, float:-Infinity)
        L_0x06b3:
            int r0 = r2.a
            if (r3 < r0) goto L_0x06c8
            int r0 = r2.b
            r0 = -35
            if (r3 > r0) goto L_0x06c8
            arsw r15 = r2.f
            r18 = r3
            defpackage.arsy.a(r15, r16, r18, r19, r20, r21)
            r21 = r11
            r3 = r14
            goto L_0x06e3
        L_0x06c8:
            r0 = 5
            r23 = 0
            r1 = -8388608(0xffffffffff800000, float:-Infinity)
            r4 = 0
            r10 = r6
            r21 = r11
            r11 = r16
            r13 = r3
            r3 = r14
            r14 = r0
            r15 = r23
            r17 = r1
            r18 = r19
            r19 = r20
            r20 = r4
            r10.a(r11, r13, r14, r15, r17, r18, r19, r20)
        L_0x06e3:
            int r11 = r21 + 1
            r0 = r43
            r14 = r3
            r4 = r5
            r5 = r7
            r7 = r9
            r1 = r22
            r3 = 0
            r13 = 0
            r15 = 1000(0x3e8, float:1.401E-42)
            r9 = r41
            goto L_0x00c0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.airq.a(aibw, aibe):aibo");
    }
}
