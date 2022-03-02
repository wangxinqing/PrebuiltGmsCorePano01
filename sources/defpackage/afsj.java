package defpackage;

/* renamed from: afsj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class afsj implements aoqb {
    private final afso a;
    private final int b;

    public afsj(afso afso, int i) {
        this.a = afso;
        this.b = i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v24, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v6, resolved type: afsn} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.aorr a(java.lang.Object r31) {
        /*
            r30 = this;
            r1 = r30
            afso r8 = r1.a
            int r7 = r1.b
            r0 = r31
            java.util.List r0 = (java.util.List) r0
            afpi r2 = r8.a
            java.util.List r2 = r2.c()
            java.util.Iterator r2 = r2.iterator()
        L_0x0014:
            boolean r3 = r2.hasNext()
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x008f
            java.lang.Object r3 = r2.next()
            afkr r3 = (defpackage.afkr) r3
            aflf r6 = defpackage.aflf.f
            aucd r6 = r6.o()
            java.lang.String r9 = r3.c
            boolean r10 = r6.c
            if (r10 != 0) goto L_0x002f
            goto L_0x0034
        L_0x002f:
            r6.c()
            r6.c = r5
        L_0x0034:
            aucj r10 = r6.b
            aflf r10 = (defpackage.aflf) r10
            r9.getClass()
            int r11 = r10.a
            r4 = r4 | r11
            r10.a = r4
            r10.b = r9
            java.lang.String r4 = r3.d
            boolean r4 = defpackage.amrk.a((java.lang.String) r4)
            if (r4 != 0) goto L_0x0066
            java.lang.String r4 = r3.d
            boolean r9 = r6.c
            if (r9 != 0) goto L_0x0051
            goto L_0x0056
        L_0x0051:
            r6.c()
            r6.c = r5
        L_0x0056:
            aucj r5 = r6.b
            aflf r5 = (defpackage.aflf) r5
            r4.getClass()
            int r9 = r5.a
            r9 = r9 | 2
            r5.a = r9
            r5.c = r4
            goto L_0x0081
        L_0x0066:
            boolean r4 = r6.c
            if (r4 != 0) goto L_0x006b
            goto L_0x0070
        L_0x006b:
            r6.c()
            r6.c = r5
        L_0x0070:
            aucj r4 = r6.b
            aflf r4 = (defpackage.aflf) r4
            java.lang.String r5 = "com.google.android.gms"
            r5.getClass()
            int r9 = r4.a
            r9 = r9 | 2
            r4.a = r9
            r4.c = r5
        L_0x0081:
            aucj r4 = r6.i()
            aflf r4 = (defpackage.aflf) r4
            android.util.Pair r3 = android.util.Pair.create(r4, r3)
            r0.add(r3)
            goto L_0x0014
        L_0x008f:
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            java.util.HashSet r18 = new java.util.HashSet
            r18.<init>()
            java.util.concurrent.atomic.AtomicLong r15 = new java.util.concurrent.atomic.AtomicLong
            r13 = 0
            r15.<init>(r13)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r19 = r0.iterator()
        L_0x00b8:
            boolean r0 = r19.hasNext()
            if (r0 == 0) goto L_0x01a8
            java.lang.Object r0 = r19.next()
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r10 = r0.first
            r11 = r10
            aflf r11 = (defpackage.aflf) r11
            java.lang.Object r0 = r0.second
            r10 = r0
            afkr r10 = (defpackage.afkr) r10
            java.lang.String r0 = defpackage.afso.a(r11)
            java.util.Set r20 = defpackage.afso.a(r2, r0)
            java.lang.String r0 = defpackage.afso.a(r11)
            java.lang.Object r16 = r6.get(r0)
            afsn r16 = (defpackage.afsn) r16
            if (r16 != 0) goto L_0x00f5
            afsn r4 = new afsn
            r4.<init>()
            r6.put(r0, r4)
            java.lang.Object r0 = r6.get(r0)
            r16 = r0
            afsn r16 = (defpackage.afsn) r16
            r4 = r16
            goto L_0x00f7
        L_0x00f5:
            r4 = r16
        L_0x00f7:
            boolean r0 = r11.e
            if (r0 == 0) goto L_0x0112
            java.lang.String r0 = defpackage.afso.a(r11)
            java.util.Set r0 = defpackage.afso.a(r3, r0)
            java.lang.String r5 = defpackage.afso.a(r11)
            int r13 = r10.e
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r9.put(r5, r13)
            r5 = r0
            goto L_0x0114
        L_0x0112:
            r0 = 0
            r5 = r0
        L_0x0114:
            aucx r14 = r10.j
            int r13 = r14.size()
            r1 = 0
        L_0x011b:
            if (r1 >= r13) goto L_0x0193
            java.lang.Object r0 = r14.get(r1)
            afkn r0 = (defpackage.afkn) r0
            r21 = r2
            int r2 = r10.f
            int r2 = defpackage.afkq.a(r2)
            if (r2 == 0) goto L_0x012e
            goto L_0x012f
        L_0x012e:
            r2 = 1
        L_0x012f:
            aflh r2 = defpackage.afqu.a((defpackage.afkn) r0, (int) r2)
            afqr r0 = r8.b     // Catch:{ afqs -> 0x014b }
            aorr r0 = r0.b(r2)     // Catch:{ afqs -> 0x014b }
            r22 = r3
            afsm r3 = new afsm
            r3.<init>(r8)
            r23 = r10
            java.util.concurrent.Executor r10 = r8.h
            aorr r0 = defpackage.aopr.a((defpackage.aorr) r0, (defpackage.amqy) r3, (java.util.concurrent.Executor) r10)
            r16 = 0
            goto L_0x015a
        L_0x014b:
            r0 = move-exception
            r22 = r3
            r23 = r10
            r16 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r16)
            aorr r0 = defpackage.aorl.a((java.lang.Object) r0)
        L_0x015a:
            afsk r3 = new afsk
            r10 = r3
            r24 = r11
            r11 = r18
            r25 = r7
            r7 = r12
            r12 = r2
            r2 = r13
            r26 = r16
            r13 = r15
            r28 = r14
            r14 = r20
            r29 = r15
            r15 = r4
            r16 = r24
            r17 = r5
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            java.util.concurrent.Executor r10 = r8.h
            aorr r0 = defpackage.aopr.a((defpackage.aorr) r0, (defpackage.amqy) r3, (java.util.concurrent.Executor) r10)
            r7.add(r0)
            int r1 = r1 + 1
            r13 = r2
            r12 = r7
            r2 = r21
            r3 = r22
            r10 = r23
            r11 = r24
            r7 = r25
            r14 = r28
            r15 = r29
            goto L_0x011b
        L_0x0193:
            r21 = r2
            r22 = r3
            r25 = r7
            r7 = r12
            r29 = r15
            r26 = 0
            r1 = r30
            r7 = r25
            r13 = r26
            r4 = 1
            r5 = 0
            goto L_0x00b8
        L_0x01a8:
            r25 = r7
            r7 = r12
            r29 = r15
            aord r0 = defpackage.aorl.b((java.lang.Iterable) r7)
            afsl r1 = new afsl
            r2 = r1
            r3 = r8
            r4 = r6
            r5 = r9
            r6 = r29
            r7 = r25
            r2.<init>(r3, r4, r5, r6, r7)
            java.util.concurrent.Executor r2 = r8.h
            aorr r0 = r0.a((java.util.concurrent.Callable) r1, (java.util.concurrent.Executor) r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afsj.a(java.lang.Object):aorr");
    }
}
