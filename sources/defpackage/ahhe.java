package defpackage;

/* renamed from: ahhe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahhe implements hok {
    public final amob a;

    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0287, code lost:
        r0 = th;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ahhe(defpackage.ahhc r18) {
        /*
            r17 = this;
            r0 = r18
            r17.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.Object r2 = r0.b
            monitor-enter(r2)
            java.util.Map r0 = r0.a     // Catch:{ all -> 0x0282 }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x0282 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0282 }
        L_0x0017:
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x0282 }
            r5 = 0
            if (r3 == 0) goto L_0x0052
            java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x0282 }
            ahgz r3 = (defpackage.ahgz) r3     // Catch:{ all -> 0x0282 }
            ahgx[] r6 = r3.c     // Catch:{ all -> 0x0282 }
            int r6 = r6.length     // Catch:{ all -> 0x0282 }
            if (r6 <= 0) goto L_0x002c
            r4 = 10
            goto L_0x002d
        L_0x002c:
            r4 = 1
        L_0x002d:
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ all -> 0x0282 }
            r6.<init>(r4)     // Catch:{ all -> 0x0282 }
            ahgy r4 = new ahgy     // Catch:{ all -> 0x0282 }
            java.lang.String r7 = r3.b     // Catch:{ all -> 0x0282 }
            ahgx[] r8 = r3.c     // Catch:{ all -> 0x0282 }
            r4.<init>(r7, r8)     // Catch:{ all -> 0x0282 }
            java.lang.Object r7 = r3.a     // Catch:{ all -> 0x0282 }
            monitor-enter(r7)     // Catch:{ all -> 0x0282 }
            java.util.Map r8 = r3.d     // Catch:{ all -> 0x004f }
            r4.c = r8     // Catch:{ all -> 0x004f }
            int r8 = r3.e     // Catch:{ all -> 0x004f }
            r4.d = r8     // Catch:{ all -> 0x004f }
            r3.d = r6     // Catch:{ all -> 0x004f }
            r3.e = r5     // Catch:{ all -> 0x004f }
            monitor-exit(r7)     // Catch:{ all -> 0x004f }
            r1.add(r4)     // Catch:{ all -> 0x0282 }
            goto L_0x0017
        L_0x004f:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x004f }
            throw r0     // Catch:{ all -> 0x0282 }
        L_0x0052:
            monitor-exit(r2)     // Catch:{ all -> 0x0282 }
            amob r0 = defpackage.amob.b
            aucd r0 = r0.o()
            int r2 = r1.size()
            r3 = 0
        L_0x005e:
            if (r3 >= r2) goto L_0x0277
            java.lang.Object r6 = r1.get(r3)
            ahgy r6 = (defpackage.ahgy) r6
            int r7 = r6.d
            if (r7 == 0) goto L_0x0240
            aqdh r7 = defpackage.aqdh.e
            aucd r7 = r7.o()
            java.lang.String r8 = r6.a
            long r8 = defpackage.ahhc.b(r8)
            boolean r10 = r7.c
            if (r10 == 0) goto L_0x007f
            r7.c()
            r7.c = r5
        L_0x007f:
            aucj r10 = r7.b
            aqdh r10 = (defpackage.aqdh) r10
            int r11 = r10.a
            r12 = 2
            r11 = r11 | r12
            r10.a = r11
            r10.b = r8
            ahgx[] r8 = r6.b
            int r9 = r8.length
            r10 = 0
        L_0x008f:
            if (r10 >= r9) goto L_0x00bf
            r11 = r8[r10]
            java.lang.String r11 = r11.a
            long r13 = defpackage.ahhc.b(r11)
            boolean r11 = r7.c
            if (r11 != 0) goto L_0x009e
            goto L_0x00a3
        L_0x009e:
            r7.c()
            r7.c = r5
        L_0x00a3:
            aucj r11 = r7.b
            aqdh r11 = (defpackage.aqdh) r11
            aucv r15 = r11.c
            boolean r15 = r15.a()
            if (r15 != 0) goto L_0x00b7
            aucv r15 = r11.c
            aucv r15 = defpackage.aucj.a((defpackage.aucv) r15)
            r11.c = r15
        L_0x00b7:
            aucv r11 = r11.c
            r11.a((long) r13)
            int r10 = r10 + 1
            goto L_0x008f
        L_0x00bf:
            java.util.Map r8 = r6.c
            java.util.Set r8 = r8.entrySet()
            java.util.Iterator r8 = r8.iterator()
        L_0x00c9:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0236
            java.lang.Object r9 = r8.next()
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9
            aqdg r10 = defpackage.aqdg.d
            aucd r10 = r10.o()
            java.lang.Object r11 = r9.getKey()
            ahgo r11 = (defpackage.ahgo) r11
            java.lang.Object r9 = r9.getValue()
            ahgp r9 = (defpackage.ahgp) r9
            ahgx[] r13 = r6.b
            int r13 = r13.length
            if (r13 <= 0) goto L_0x01e4
            java.lang.String r13 = r6.a
            java.util.ArrayList r14 = new java.util.ArrayList
            java.lang.Object[] r15 = r11.c
            int r15 = r15.length
            r14.<init>(r15)
            r15 = 0
        L_0x00f7:
            java.lang.Object[] r12 = r11.c
            int r12 = r12.length
            if (r15 >= r12) goto L_0x01bd
            aqde r12 = defpackage.aqde.c
            aucd r12 = r12.o()
            java.lang.Object[] r4 = r11.c
            r4 = r4[r15]
            boolean r5 = r4 instanceof java.lang.String
            if (r5 == 0) goto L_0x0126
            java.lang.String r4 = (java.lang.String) r4
            boolean r5 = r12.c
            if (r5 != 0) goto L_0x0111
            goto L_0x0117
        L_0x0111:
            r12.c()
            r5 = 0
            r12.c = r5
        L_0x0117:
            aucj r5 = r12.b
            aqde r5 = (defpackage.aqde) r5
            r4.getClass()
            r16 = r1
            r1 = 1
            r5.a = r1
            r5.b = r4
            goto L_0x016e
        L_0x0126:
            r16 = r1
            boolean r1 = r4 instanceof java.lang.Integer
            if (r1 == 0) goto L_0x014b
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r1 = r4.intValue()
            boolean r4 = r12.c
            if (r4 != 0) goto L_0x0137
            goto L_0x013d
        L_0x0137:
            r12.c()
            r4 = 0
            r12.c = r4
        L_0x013d:
            aucj r4 = r12.b
            aqde r4 = (defpackage.aqde) r4
            r5 = 2
            r4.a = r5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4.b = r1
            goto L_0x016e
        L_0x014b:
            r5 = 2
            boolean r1 = r4 instanceof java.lang.Boolean
            if (r1 == 0) goto L_0x017f
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r1 = r4.booleanValue()
            boolean r4 = r12.c
            if (r4 != 0) goto L_0x015b
            goto L_0x0161
        L_0x015b:
            r12.c()
            r4 = 0
            r12.c = r4
        L_0x0161:
            aucj r4 = r12.b
            aqde r4 = (defpackage.aqde) r4
            r5 = 3
            r4.a = r5
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r4.b = r1
        L_0x016e:
            aucj r1 = r12.i()
            aqde r1 = (defpackage.aqde) r1
            r14.add(r1)
            int r15 = r15 + 1
            r1 = r16
            r5 = 0
            r12 = 2
            goto L_0x00f7
        L_0x017f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = java.lang.String.valueOf(r4)
            java.lang.String r2 = java.lang.String.valueOf(r13)
            int r2 = r2.length()
            java.lang.String r3 = java.lang.String.valueOf(r1)
            int r3 = r3.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r2 = r2 + 56
            int r2 = r2 + r3
            r4.<init>(r2)
            java.lang.String r2 = "Metric "
            r4.append(r2)
            r4.append(r13)
            java.lang.String r2 = " has field "
            r4.append(r2)
            r4.append(r15)
            java.lang.String r2 = " with an unexpected value: "
            r4.append(r2)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r0.<init>(r1)
            throw r0
        L_0x01bd:
            r16 = r1
            boolean r1 = r10.c
            if (r1 != 0) goto L_0x01c4
            goto L_0x01ca
        L_0x01c4:
            r10.c()
            r1 = 0
            r10.c = r1
        L_0x01ca:
            aucj r1 = r10.b
            aqdg r1 = (defpackage.aqdg) r1
            aucx r4 = r1.b
            boolean r4 = r4.a()
            if (r4 != 0) goto L_0x01de
            aucx r4 = r1.b
            aucx r4 = defpackage.aucj.a((defpackage.aucx) r4)
            r1.b = r4
        L_0x01de:
            aucx r1 = r1.b
            defpackage.auab.a((java.lang.Iterable) r14, (java.util.List) r1)
            goto L_0x01e6
        L_0x01e4:
            r16 = r1
        L_0x01e6:
            aqdf r1 = r9.a()
            boolean r4 = r10.c
            if (r4 == 0) goto L_0x01f4
            r10.c()
            r4 = 0
            r10.c = r4
        L_0x01f4:
            aucj r4 = r10.b
            aqdg r4 = (defpackage.aqdg) r4
            r1.getClass()
            r4.c = r1
            int r1 = r4.a
            r5 = 1
            r1 = r1 | r5
            r4.a = r1
            boolean r1 = r7.c
            if (r1 != 0) goto L_0x0208
            goto L_0x020e
        L_0x0208:
            r7.c()
            r1 = 0
            r7.c = r1
        L_0x020e:
            aucj r1 = r7.b
            aqdh r1 = (defpackage.aqdh) r1
            aucj r4 = r10.i()
            aqdg r4 = (defpackage.aqdg) r4
            r4.getClass()
            aucx r9 = r1.d
            boolean r9 = r9.a()
            if (r9 != 0) goto L_0x022b
            aucx r9 = r1.d
            aucx r9 = defpackage.aucj.a((defpackage.aucx) r9)
            r1.d = r9
        L_0x022b:
            aucx r1 = r1.d
            r1.add(r4)
            r1 = r16
            r5 = 0
            r12 = 2
            goto L_0x00c9
        L_0x0236:
            r16 = r1
            r5 = 1
            aucj r1 = r7.i()
            aqdh r1 = (defpackage.aqdh) r1
            goto L_0x0244
        L_0x0240:
            r16 = r1
            r5 = 1
            r1 = 0
        L_0x0244:
            if (r1 != 0) goto L_0x0248
            r4 = 0
            goto L_0x0270
        L_0x0248:
            boolean r4 = r0.c
            if (r4 != 0) goto L_0x024e
            r4 = 0
            goto L_0x0254
        L_0x024e:
            r0.c()
            r4 = 0
            r0.c = r4
        L_0x0254:
            aucj r6 = r0.b
            amob r6 = (defpackage.amob) r6
            r1.getClass()
            aucx r7 = r6.a
            boolean r7 = r7.a()
            if (r7 != 0) goto L_0x026b
            aucx r7 = r6.a
            aucx r7 = defpackage.aucj.a((defpackage.aucx) r7)
            r6.a = r7
        L_0x026b:
            aucx r6 = r6.a
            r6.add(r1)
        L_0x0270:
            int r3 = r3 + 1
            r1 = r16
            r5 = 0
            goto L_0x005e
        L_0x0277:
            aucj r0 = r0.i()
            amob r0 = (defpackage.amob) r0
            r1 = r17
            r1.a = r0
            return
        L_0x0282:
            r0 = move-exception
            r1 = r17
        L_0x0285:
            monitor-exit(r2)     // Catch:{ all -> 0x0287 }
            throw r0
        L_0x0287:
            r0 = move-exception
            goto L_0x0285
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahhe.<init>(ahhc):void");
    }

    public final byte[] a() {
        return this.a.k();
    }
}
