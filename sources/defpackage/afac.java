package defpackage;

/* renamed from: afac  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afac implements aoqb {
    private final afae a;
    private final String b;

    public afac(afae afae, String str) {
        this.a = afae;
        this.b = str;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.aorr a(java.lang.Object r15) {
        /*
            r14 = this;
            afae r0 = r14.a
            java.lang.String r1 = r14.b
            java.util.List r15 = (java.util.List) r15
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.Iterator r15 = r15.iterator()
        L_0x000f:
            boolean r3 = r15.hasNext()
            if (r3 == 0) goto L_0x0035
            java.lang.Object r3 = r15.next()
            afdx r3 = (defpackage.afdx) r3
            aump r4 = r3.d()
            boolean r4 = defpackage.afgu.a((defpackage.aump) r4)
            if (r4 == 0) goto L_0x000f
            android.accounts.Account r4 = r3.b()
            aukh r3 = r3.c()
            aerd r3 = defpackage.aerd.a(r4, r3)
            r2.add(r3)
            goto L_0x000f
        L_0x0035:
            aezz r15 = r0.f
            r3 = 0
            byte[] r1 = android.util.Base64.decode(r1, r3)     // Catch:{ auda -> 0x00f9 }
            aulv r4 = defpackage.aulv.b     // Catch:{ auda -> 0x00f9 }
            aucj r1 = defpackage.aucj.a((defpackage.aucj) r4, (byte[]) r1)     // Catch:{ auda -> 0x00f9 }
            aulv r1 = (defpackage.aulv) r1     // Catch:{ auda -> 0x00f9 }
            amzt r4 = defpackage.amzy.j()     // Catch:{ auda -> 0x00f9 }
            aucx r1 = r1.a     // Catch:{ auda -> 0x00f9 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ auda -> 0x00f9 }
        L_0x004e:
            boolean r5 = r1.hasNext()     // Catch:{ auda -> 0x00f9 }
            if (r5 == 0) goto L_0x00f4
            java.lang.Object r5 = r1.next()     // Catch:{ auda -> 0x00f9 }
            aulu r5 = (defpackage.aulu) r5     // Catch:{ auda -> 0x00f9 }
            java.lang.String r6 = r15.a     // Catch:{ auda -> 0x00f9 }
            java.lang.String r7 = r5.b     // Catch:{ auda -> 0x00f9 }
            boolean r6 = r6.equals(r7)     // Catch:{ auda -> 0x00f9 }
            if (r6 == 0) goto L_0x004e
            auay r6 = r5.c     // Catch:{ auda -> 0x00f9 }
            aulm r7 = defpackage.aulm.c     // Catch:{ auda -> 0x00f9 }
            aucj r6 = defpackage.aucj.a((defpackage.aucj) r7, (defpackage.auay) r6)     // Catch:{ auda -> 0x00f9 }
            aulm r6 = (defpackage.aulm) r6     // Catch:{ auda -> 0x00f9 }
            aezu r7 = r15.b     // Catch:{ auda -> 0x00f9 }
            int r8 = r6.a     // Catch:{ auda -> 0x00f9 }
            r9 = 2
            r10 = 1
            if (r8 == 0) goto L_0x0080
            if (r8 == r10) goto L_0x007e
            if (r8 == r9) goto L_0x007c
            r11 = 0
            goto L_0x0081
        L_0x007c:
            r11 = 2
            goto L_0x0081
        L_0x007e:
            r11 = 1
            goto L_0x0081
        L_0x0080:
            r11 = 3
        L_0x0081:
            int r12 = r11 + -1
            r13 = 0
            if (r11 == 0) goto L_0x00f2
            if (r12 == 0) goto L_0x00cd
            if (r12 == r10) goto L_0x0098
            if (r12 != r9) goto L_0x0092
            aorr r7 = defpackage.aorl.a((java.lang.Object) r13)     // Catch:{ auda -> 0x00f9 }
            goto L_0x00e2
        L_0x0092:
            java.lang.AssertionError r15 = new java.lang.AssertionError     // Catch:{ auda -> 0x00f9 }
            r15.<init>()     // Catch:{ auda -> 0x00f9 }
            throw r15     // Catch:{ auda -> 0x00f9 }
        L_0x0098:
            aeri r8 = r7.e     // Catch:{ auda -> 0x00f9 }
            boolean r8 = r8.r()     // Catch:{ auda -> 0x00f9 }
            if (r8 == 0) goto L_0x00c7
            java.lang.Object r8 = r7.f     // Catch:{ auda -> 0x00f9 }
            monitor-enter(r8)     // Catch:{ auda -> 0x00f9 }
            java.util.Map r9 = r7.a     // Catch:{ all -> 0x00c4 }
            java.lang.Object r9 = r9.get(r6)     // Catch:{ all -> 0x00c4 }
            android.accounts.Account r9 = (android.accounts.Account) r9     // Catch:{ all -> 0x00c4 }
            if (r9 != 0) goto L_0x00be
            aorr r9 = r7.a()     // Catch:{ all -> 0x00c4 }
            monitor-exit(r8)     // Catch:{ all -> 0x00c4 }
            aezq r8 = new aezq     // Catch:{ auda -> 0x00f9 }
            r8.<init>(r7, r6)     // Catch:{ auda -> 0x00f9 }
            java.util.concurrent.Executor r7 = r7.d     // Catch:{ auda -> 0x00f9 }
            aorr r7 = defpackage.aopr.a((defpackage.aorr) r9, (defpackage.amqy) r8, (java.util.concurrent.Executor) r7)     // Catch:{ auda -> 0x00f9 }
            goto L_0x00e2
        L_0x00be:
            aorr r7 = defpackage.aorl.a((java.lang.Object) r9)     // Catch:{ all -> 0x00c4 }
            monitor-exit(r8)     // Catch:{ all -> 0x00c4 }
            goto L_0x00e2
        L_0x00c4:
            r15 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x00c4 }
            throw r15     // Catch:{ auda -> 0x00f9 }
        L_0x00c7:
            aorr r7 = defpackage.aorl.a((java.lang.Object) r13)     // Catch:{ auda -> 0x00f9 }
            goto L_0x00e2
        L_0x00cd:
            android.accounts.Account r7 = new android.accounts.Account     // Catch:{ auda -> 0x00f9 }
            java.lang.String r9 = ""
            if (r8 == r10) goto L_0x00d4
            goto L_0x00d9
        L_0x00d4:
            java.lang.Object r8 = r6.b     // Catch:{ auda -> 0x00f9 }
            r9 = r8
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ auda -> 0x00f9 }
        L_0x00d9:
            java.lang.String r8 = "com.google"
            r7.<init>(r9, r8)     // Catch:{ auda -> 0x00f9 }
            aorr r7 = defpackage.aorl.a((java.lang.Object) r7)     // Catch:{ auda -> 0x00f9 }
        L_0x00e2:
            aezy r8 = new aezy     // Catch:{ auda -> 0x00f9 }
            r8.<init>(r6, r5)     // Catch:{ auda -> 0x00f9 }
            java.util.concurrent.Executor r5 = r15.c     // Catch:{ auda -> 0x00f9 }
            aorr r5 = defpackage.aopr.a((defpackage.aorr) r7, (defpackage.amqy) r8, (java.util.concurrent.Executor) r5)     // Catch:{ auda -> 0x00f9 }
            r4.c(r5)     // Catch:{ auda -> 0x00f9 }
            goto L_0x004e
        L_0x00f2:
            throw r13     // Catch:{ auda -> 0x00f9 }
        L_0x00f4:
            amzy r15 = r4.a()     // Catch:{ auda -> 0x00f9 }
            goto L_0x0102
        L_0x00f9:
            r15 = move-exception
            aorr r15 = defpackage.aorl.a((java.lang.Throwable) r15)
            amzy r15 = defpackage.amzy.a((java.lang.Object) r15)
        L_0x0102:
            aord r1 = defpackage.aorl.b((java.lang.Iterable) r15)
            afad r3 = new afad
            r3.<init>(r0, r15, r2)
            pbw r15 = r0.e
            aorr r15 = r1.a((java.util.concurrent.Callable) r3, (java.util.concurrent.Executor) r15)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afac.a(java.lang.Object):aorr");
    }
}
