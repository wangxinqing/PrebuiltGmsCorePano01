package defpackage;

/* renamed from: afop  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afop implements aoqb {
    private final afpf a;
    private final aflb b;
    private final afkr c;
    private final aflf d;

    public afop(afpf afpf, aflb aflb, afkr afkr, aflf aflf) {
        this.a = afpf;
        this.b = aflb;
        this.c = afkr;
        this.d = aflf;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: aflf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: aflf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: aflh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v1, resolved type: aflf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: aflf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v2, resolved type: aflf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: aflf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v3, resolved type: aflf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: aflf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v5, resolved type: aflf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v6, resolved type: aflf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v6, resolved type: aflf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: aflf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: aflh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v7, resolved type: aflf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v7, resolved type: aflf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v8, resolved type: aflf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v9, resolved type: aflf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v10, resolved type: aflf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v11, resolved type: aflf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: aflf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v12, resolved type: aflf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v14, resolved type: aflf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v15, resolved type: aflf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v8, resolved type: aflf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v16, resolved type: aflf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: aflf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v17, resolved type: aflf} */
    /* JADX WARNING: type inference failed for: r6v0, types: [int] */
    /* JADX WARNING: type inference failed for: r11v3, types: [int] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.aorr a(java.lang.Object r26) {
        /*
            r25 = this;
            r1 = r25
            afpf r2 = r1.a
            aflb r0 = r1.b
            afkr r3 = r1.c
            aflf r13 = r1.d
            r4 = r26
            java.lang.Void r4 = (java.lang.Void) r4
            if (r0 != 0) goto L_0x0019
            aflb r0 = r3.i
            if (r0 == 0) goto L_0x0016
            r14 = r0
            goto L_0x001b
        L_0x0016:
            aflb r0 = defpackage.aflb.f
            goto L_0x001a
        L_0x0019:
        L_0x001a:
            r14 = r0
        L_0x001b:
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            aucx r12 = r3.j
            int r11 = r12.size()
            r9 = 0
        L_0x0027:
            if (r9 >= r11) goto L_0x025a
            java.lang.Object r0 = r12.get(r9)
            r7 = r0
            afkn r7 = (defpackage.afkn) r7
            int r0 = r3.f
            int r0 = defpackage.afkq.a(r0)
            if (r0 == 0) goto L_0x0039
            goto L_0x003a
        L_0x0039:
            r0 = 1
        L_0x003a:
            aflh r8 = defpackage.afqu.a((defpackage.afkn) r7, (int) r0)
            afqr r0 = r2.e     // Catch:{ afqs -> 0x021b }
            int r6 = r3.k     // Catch:{ afqs -> 0x021b }
            aucx r5 = r3.l     // Catch:{ afqs -> 0x021b }
            afqu r10 = r0.c     // Catch:{ afqs -> 0x021b }
            afli r10 = r10.a((defpackage.aflh) r8)     // Catch:{ afqs -> 0x021b }
            if (r10 == 0) goto L_0x01ff
            int r4 = r10.c     // Catch:{ afqs -> 0x021b }
            afle r4 = defpackage.afle.a(r4)     // Catch:{ afqs -> 0x021b }
            if (r4 == 0) goto L_0x0055
            goto L_0x0057
        L_0x0055:
            afle r4 = defpackage.afle.NONE     // Catch:{ afqs -> 0x021b }
        L_0x0057:
            afle r1 = defpackage.afle.DOWNLOAD_COMPLETE     // Catch:{ afqs -> 0x021b }
            r17 = 0
            if (r4 != r1) goto L_0x0088
            amri r1 = r0.g     // Catch:{ afqs -> 0x021b }
            boolean r1 = r1.a()     // Catch:{ afqs -> 0x021b }
            if (r1 == 0) goto L_0x0075
            amri r0 = r0.g     // Catch:{ afqs -> 0x021b }
            java.lang.Object r0 = r0.b()     // Catch:{ afqs -> 0x021b }
            afsx r0 = (defpackage.afsx) r0     // Catch:{ afqs -> 0x021b }
            java.lang.String r1 = r13.b     // Catch:{ afqs -> 0x021b }
            int r4 = r7.d     // Catch:{ afqs -> 0x021b }
            long r4 = (long) r4     // Catch:{ afqs -> 0x021b }
            r0.a(r1, r4)     // Catch:{ afqs -> 0x021b }
        L_0x0075:
            aorr r0 = defpackage.aorl.a((java.lang.Object) r17)     // Catch:{ afqs -> 0x021b }
            r20 = r3
            r19 = r9
            r22 = r11
            r17 = r12
            r21 = r13
            r18 = 0
            goto L_0x0249
        L_0x0088:
            int r1 = r8.e     // Catch:{ afqs -> 0x021b }
            int r1 = defpackage.afkq.a(r1)     // Catch:{ afqs -> 0x021b }
            if (r1 == 0) goto L_0x0091
            goto L_0x0092
        L_0x0091:
            r1 = 1
        L_0x0092:
            android.content.Context r4 = r0.a     // Catch:{ afqs -> 0x021b }
            r18 = r5
            afmh r5 = r0.b     // Catch:{ afqs -> 0x021b }
            afpj r4 = defpackage.afpk.a((android.content.Context) r4, (defpackage.afmh) r5)     // Catch:{ afqs -> 0x021b }
            int r4 = r4.d     // Catch:{ afqs -> 0x021b }
            afpj r5 = defpackage.afpj.USE_CHECKSUM_ONLY     // Catch:{ afqs -> 0x021b }
            int r5 = r5.d     // Catch:{ afqs -> 0x021b }
            if (r4 < r5) goto L_0x01b8
            amri r4 = r0.f     // Catch:{ afqs -> 0x021b }
            boolean r4 = r4.a()     // Catch:{ afqs -> 0x021b }
            if (r4 == 0) goto L_0x01b1
            amri r4 = r0.f     // Catch:{ afqs -> 0x021b }
            java.lang.Object r4 = r4.b()     // Catch:{ afqs -> 0x021b }
            afmo r4 = (defpackage.afmo) r4     // Catch:{ afqs -> 0x021b }
            int r4 = r4.b()     // Catch:{ afqs -> 0x021b }
            r5 = 1
            if (r4 == r5) goto L_0x01aa
            aucx r4 = r7.k     // Catch:{ afqs -> 0x021b }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ afqs -> 0x021b }
        L_0x00c1:
            boolean r16 = r4.hasNext()     // Catch:{ afqs -> 0x021b }
            if (r16 == 0) goto L_0x019f
            java.lang.Object r16 = r4.next()     // Catch:{ afqs -> 0x021b }
            r5 = r16
            afku r5 = (defpackage.afku) r5     // Catch:{ afqs -> 0x021b }
            r16 = r4
            int r4 = r5.e     // Catch:{ afqs -> 0x021b }
            int r4 = defpackage.afkt.a(r4)     // Catch:{ afqs -> 0x021b }
            if (r4 == 0) goto L_0x00da
            goto L_0x00db
        L_0x00da:
            r4 = 1
        L_0x00db:
            r20 = r6
            amri r6 = r0.f     // Catch:{ afqs -> 0x021b }
            java.lang.Object r6 = r6.b()     // Catch:{ afqs -> 0x021b }
            afmo r6 = (defpackage.afmo) r6     // Catch:{ afqs -> 0x021b }
            int r6 = r6.b()     // Catch:{ afqs -> 0x021b }
            if (r4 != r6) goto L_0x0192
            aflh r4 = defpackage.aflh.g     // Catch:{ afqs -> 0x021b }
            aucd r4 = r4.o()     // Catch:{ afqs -> 0x021b }
            afkk r6 = r5.f     // Catch:{ afqs -> 0x021b }
            if (r6 == 0) goto L_0x00f6
            goto L_0x00f8
        L_0x00f6:
            afkk r6 = defpackage.afkk.b     // Catch:{ afqs -> 0x021b }
        L_0x00f8:
            java.lang.String r6 = r6.a     // Catch:{ afqs -> 0x021b }
            r21 = r8
            boolean r8 = r4.c     // Catch:{ afqs -> 0x0185 }
            if (r8 != 0) goto L_0x0102
            r8 = 0
            goto L_0x0108
        L_0x0102:
            r4.c()     // Catch:{ afqs -> 0x0185 }
            r8 = 0
            r4.c = r8     // Catch:{ afqs -> 0x0185 }
        L_0x0108:
            aucj r8 = r4.b     // Catch:{ afqs -> 0x0185 }
            aflh r8 = (defpackage.aflh) r8     // Catch:{ afqs -> 0x0185 }
            r6.getClass()     // Catch:{ afqs -> 0x0185 }
            r22 = r9
            int r9 = r8.a     // Catch:{ afqs -> 0x01ed }
            r9 = r9 | 4
            r8.a = r9     // Catch:{ afqs -> 0x01ed }
            r8.d = r6     // Catch:{ afqs -> 0x01ed }
            int r6 = r1 + -1
            r8.e = r6     // Catch:{ afqs -> 0x01ed }
            r6 = r9 | 8
            r8.a = r6     // Catch:{ afqs -> 0x01ed }
            aucj r4 = r4.i()     // Catch:{ afqs -> 0x01ed }
            aflh r4 = (defpackage.aflh) r4     // Catch:{ afqs -> 0x01ed }
            afqu r6 = r0.c     // Catch:{ afqs -> 0x01ed }
            afli r6 = r6.a((defpackage.aflh) r4)     // Catch:{ afqs -> 0x01ed }
            if (r6 == 0) goto L_0x0178
            int r8 = r6.c     // Catch:{ afqs -> 0x01ed }
            afle r8 = defpackage.afle.a(r8)     // Catch:{ afqs -> 0x01ed }
            if (r8 == 0) goto L_0x0138
            goto L_0x013a
        L_0x0138:
            afle r8 = defpackage.afle.NONE     // Catch:{ afqs -> 0x01ed }
        L_0x013a:
            afle r9 = defpackage.afle.DOWNLOAD_COMPLETE     // Catch:{ afqs -> 0x01ed }
            if (r8 != r9) goto L_0x016b
            android.content.Context r8 = r0.a     // Catch:{ afqs -> 0x01ed }
            int r4 = r4.e     // Catch:{ afqs -> 0x01ed }
            int r4 = defpackage.afkq.a(r4)     // Catch:{ afqs -> 0x01ed }
            if (r4 == 0) goto L_0x0149
            goto L_0x014a
        L_0x0149:
            r4 = 1
        L_0x014a:
            java.lang.String r6 = r6.b     // Catch:{ afqs -> 0x01ed }
            afmh r9 = r0.b     // Catch:{ afqs -> 0x01ed }
            r23 = r1
            amri r1 = r0.j     // Catch:{ afqs -> 0x01ed }
            android.net.Uri r1 = defpackage.afsp.a(r8, r4, r6, r9, r1)     // Catch:{ afqs -> 0x01ed }
            if (r1 == 0) goto L_0x015e
            aorr r1 = defpackage.aorl.a((java.lang.Object) r5)     // Catch:{ afqs -> 0x01ed }
            goto L_0x01c3
        L_0x015e:
            r4 = r16
            r6 = r20
            r8 = r21
            r9 = r22
            r1 = r23
            r5 = 1
            goto L_0x00c1
        L_0x016b:
            r23 = r1
            r4 = r16
            r6 = r20
            r8 = r21
            r9 = r22
            r5 = 1
            goto L_0x00c1
        L_0x0178:
            r23 = r1
            r4 = r16
            r6 = r20
            r8 = r21
            r9 = r22
            r5 = 1
            goto L_0x00c1
        L_0x0185:
            r0 = move-exception
            r20 = r3
            r19 = r9
            r22 = r11
            r17 = r12
            r18 = 0
            goto L_0x01f8
        L_0x0192:
            r23 = r1
            r21 = r8
            r22 = r9
            r4 = r16
            r6 = r20
            r5 = 1
            goto L_0x00c1
        L_0x019f:
            r20 = r6
            r21 = r8
            r22 = r9
            aorr r1 = defpackage.aorl.a((java.lang.Object) r17)     // Catch:{ afqs -> 0x01ed }
            goto L_0x01c3
        L_0x01aa:
            r20 = r6
            r21 = r8
            r22 = r9
            goto L_0x01be
        L_0x01b1:
            r20 = r6
            r21 = r8
            r22 = r9
            goto L_0x01be
        L_0x01b8:
            r20 = r6
            r21 = r8
            r22 = r9
        L_0x01be:
            aorr r1 = defpackage.aorl.a((java.lang.Object) r17)     // Catch:{ afqs -> 0x01ed }
        L_0x01c3:
            afqo r9 = new afqo     // Catch:{ afqs -> 0x01ed }
            r4 = r9
            r16 = r18
            r5 = r0
            r17 = r20
            r6 = r10
            r10 = r21
            r18 = 0
            r8 = r13
            r20 = r3
            r3 = r9
            r19 = r22
            r9 = r10
            r21 = r13
            r13 = r10
            r10 = r14
            r22 = r11
            r11 = r17
            r17 = r12
            r12 = r16
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ afqs -> 0x0219 }
            java.util.concurrent.Executor r0 = r0.k     // Catch:{ afqs -> 0x0219 }
            aorr r0 = defpackage.aopr.a((defpackage.aorr) r1, (defpackage.aoqb) r3, (java.util.concurrent.Executor) r0)     // Catch:{ afqs -> 0x0219 }
            goto L_0x0249
        L_0x01ed:
            r0 = move-exception
            r20 = r3
            r17 = r12
            r19 = r22
            r18 = 0
            r22 = r11
        L_0x01f8:
            r24 = r21
            r21 = r13
            r13 = r24
            goto L_0x0229
        L_0x01ff:
            r20 = r3
            r19 = r9
            r22 = r11
            r17 = r12
            r21 = r13
            r18 = 0
            r13 = r8
            java.lang.String r0 = "%s: Start download called on file that doesn't exists. Key = %s!"
            java.lang.String r1 = "SharedFileManager"
            defpackage.afsh.a((java.lang.String) r0, (java.lang.Object) r1, (java.lang.Object) r13)     // Catch:{ afqs -> 0x0219 }
            afqs r0 = new afqs     // Catch:{ afqs -> 0x0219 }
            r0.<init>()     // Catch:{ afqs -> 0x0219 }
            throw r0     // Catch:{ afqs -> 0x0219 }
        L_0x0219:
            r0 = move-exception
            goto L_0x0229
        L_0x021b:
            r0 = move-exception
            r20 = r3
            r19 = r9
            r22 = r11
            r17 = r12
            r21 = r13
            r18 = 0
            r13 = r8
        L_0x0229:
            java.lang.String r1 = "%s: Shared file not found, newFileKey = %s"
            java.lang.String r3 = "FileGroupManager"
            defpackage.afsh.a((java.lang.String) r1, (java.lang.Object) r3, (java.lang.Object) r13)
            afmh r1 = r2.c
            java.lang.String r3 = "Shared file not found in downloadFileGroup"
            r1.a(r3, r0)
            afkd r1 = defpackage.afkf.a()
            afke r3 = defpackage.afke.SHARED_FILE_NOT_FOUND_ERROR
            r1.a = r3
            r1.c = r0
            afkf r0 = r1.a()
            aorr r0 = defpackage.aorl.a((java.lang.Throwable) r0)
        L_0x0249:
            r15.add(r0)
            int r9 = r19 + 1
            r1 = r25
            r12 = r17
            r3 = r20
            r13 = r21
            r11 = r22
            goto L_0x0027
        L_0x025a:
            r20 = r3
            r21 = r13
            aord r0 = defpackage.aorl.b((java.lang.Iterable) r15)
            afoq r1 = new afoq
            r4 = r21
            r1.<init>(r2, r4, r3, r15)
            java.util.concurrent.Executor r2 = r2.h
            aorr r0 = r0.a((defpackage.aoqa) r1, (java.util.concurrent.Executor) r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afop.a(java.lang.Object):aorr");
    }
}
