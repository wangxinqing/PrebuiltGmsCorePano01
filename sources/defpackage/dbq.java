package defpackage;

/* renamed from: dbq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class dbq implements ax {
    private final dch a;

    public dbq(dch dch) {
        this.a = dch;
    }

    /* JADX WARNING: Removed duplicated region for block: B:162:0x0498  */
    /* JADX WARNING: Removed duplicated region for block: B:164:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            dch r1 = r0.a
            r2 = r18
            csl r2 = (defpackage.csl) r2
            aqso r2 = r2.a
            dgb r3 = r1.a
            dga r4 = r3.a
            dfg r4 = (defpackage.dfg) r4
            int r4 = r4.g
            r5 = 0
            r6 = 3
            r7 = 4
            r8 = 1
            r9 = 0
            if (r4 == r8) goto L_0x002d
            aqro r3 = r3.a()
            if (r3 == 0) goto L_0x002c
            dcg r3 = r1.e
            dgb r10 = r1.a
            aqro r10 = r10.a()
            r3.d = r10
            r3.c = r5
            goto L_0x008b
        L_0x002c:
            goto L_0x008b
        L_0x002d:
            int r3 = r2.b
            if (r3 == r7) goto L_0x0037
            dcg r3 = r1.e
            r3.a = r9
            r4 = 3
            goto L_0x008b
        L_0x0037:
            android.content.Context r3 = r1.getContext()
            boolean r3 = defpackage.cyd.b(r3)
            if (r3 == 0) goto L_0x0042
            goto L_0x0066
        L_0x0042:
            int r3 = r2.b
            if (r3 != r7) goto L_0x004b
            java.lang.Object r3 = r2.c
            aqtw r3 = (defpackage.aqtw) r3
            goto L_0x004d
        L_0x004b:
            aqtw r3 = defpackage.aqtw.h
        L_0x004d:
            int r3 = r3.a
            r3 = r3 & 16
            if (r3 != 0) goto L_0x0066
            dcg r3 = r1.e
            r3.a = r9
            int r10 = r2.b
            if (r10 != r7) goto L_0x0060
            java.lang.Object r10 = r2.c
            aqtw r10 = (defpackage.aqtw) r10
            goto L_0x0062
        L_0x0060:
            aqtw r10 = defpackage.aqtw.h
        L_0x0062:
            r3.a(r10)
            goto L_0x008b
        L_0x0066:
            dcg r3 = r1.e
            r3.a = r8
            int r10 = r2.b
            if (r10 != r7) goto L_0x0073
            java.lang.Object r10 = r2.c
            aqtw r10 = (defpackage.aqtw) r10
            goto L_0x0075
        L_0x0073:
            aqtw r10 = defpackage.aqtw.h
        L_0x0075:
            r3.a(r10)
            dcg r3 = r1.e
            dgb r10 = r1.a
            dih r10 = r10.b()
            r3.e = r10
            dcg r3 = r1.e
            dcd r10 = new dcd
            r10.<init>(r1)
            r3.f = r10
        L_0x008b:
            dbp r3 = r1.b
            dcg r10 = r1.e
            boolean r11 = r10.a
            java.lang.String r12 = ""
            r14 = 2131427431(0x7f0b0067, float:1.8476478E38)
            r15 = 2131428902(0x7f0b0626, float:1.8479462E38)
            if (r11 == 0) goto L_0x01db
            boolean r11 = r10.b
            r11 = r11 ^ r8
            boolean r16 = r3.b()
            if (r16 == 0) goto L_0x00a6
            goto L_0x022d
        L_0x00a6:
            if (r11 != 0) goto L_0x00ab
            dbo r16 = defpackage.dbo.EXPANDABLE_MAXIMIZED
            goto L_0x00ad
        L_0x00ab:
            dbo r16 = defpackage.dbo.EXPANDABLE_MINIMIZED
        L_0x00ad:
            r7 = r16
            r3.m = r7
            ajsf r7 = r3.o
            if (r7 == 0) goto L_0x00bc
            com.google.android.material.appbar.AppBarLayout r13 = r3.b
            r13.b((defpackage.ajsd) r7)
            r3.o = r5
        L_0x00bc:
            boolean r7 = defpackage.awgy.c()
            if (r7 == 0) goto L_0x00d4
            android.content.Context r7 = r3.a
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            r13 = 2131624056(0x7f0e0078, float:1.887528E38)
            com.google.android.material.appbar.AppBarLayout r5 = r3.b
            android.view.View r5 = r7.inflate(r13, r5, r9)
            com.google.android.material.appbar.CollapsingToolbarLayout r5 = (com.google.android.material.appbar.CollapsingToolbarLayout) r5
            goto L_0x00e5
        L_0x00d4:
            android.content.Context r5 = r3.a
            android.view.LayoutInflater r5 = android.view.LayoutInflater.from(r5)
            r7 = 2131624055(0x7f0e0077, float:1.8875279E38)
            com.google.android.material.appbar.AppBarLayout r13 = r3.b
            android.view.View r5 = r5.inflate(r7, r13, r9)
            com.google.android.material.appbar.CollapsingToolbarLayout r5 = (com.google.android.material.appbar.CollapsingToolbarLayout) r5
        L_0x00e5:
            defpackage.que.a((android.view.View) r5, (int) r6)
            boolean r7 = defpackage.awgy.c()
            if (r7 == 0) goto L_0x00f8
            r7 = 2131427409(0x7f0b0051, float:1.8476433E38)
            android.view.View r7 = r5.findViewById(r7)
            r3.f = r7
        L_0x00f8:
            android.view.View r7 = r5.findViewById(r15)
            com.google.android.libraries.material.productlockup.ProductLockupView r7 = (com.google.android.libraries.material.productlockup.ProductLockupView) r7
            r3.d = r7
            r3.c()
            r7 = 2131427418(0x7f0b005a, float:1.8476452E38)
            android.view.View r7 = r5.findViewById(r7)
            r3.e = r7
            r7 = 2131429815(0x7f0b09b7, float:1.8481313E38)
            android.view.View r7 = r5.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r3.h = r7
            android.view.View r7 = r5.findViewById(r14)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r3.i = r7
            r7 = 2131427395(0x7f0b0043, float:1.8476405E38)
            android.view.View r7 = r5.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r3.g = r7
            android.content.Context r7 = r3.a
            android.content.res.Resources r7 = r7.getResources()
            r13 = 2131165373(0x7f0700bd, float:1.7944961E38)
            int r7 = r7.getDimensionPixelSize(r13)
            android.content.Context r13 = r3.a
            android.content.res.Resources r13 = r13.getResources()
            r14 = 2131165420(0x7f0700ec, float:1.7945057E38)
            int r13 = r13.getDimensionPixelSize(r14)
            int r7 = r7 - r13
            r3.r = r7
            android.content.Context r7 = r3.a
            android.content.res.Resources r7 = r7.getResources()
            r13 = 2131165419(0x7f0700eb, float:1.7945055E38)
            int r7 = r7.getDimensionPixelSize(r13)
            float r7 = (float) r7
            r3.s = r7
            android.content.Context r7 = r3.a
            android.content.res.Resources r7 = r7.getResources()
            r13 = 2131165418(0x7f0700ea, float:1.7945053E38)
            int r7 = r7.getDimensionPixelSize(r13)
            float r7 = (float) r7
            r3.t = r7
            boolean r7 = defpackage.awgy.c()
            if (r7 == 0) goto L_0x0171
            android.view.View r7 = r3.f
            goto L_0x0173
        L_0x0171:
            android.view.View r7 = r3.e
        L_0x0173:
            dbn r13 = new dbn
            r13.<init>(r3)
            defpackage.qb.a((android.view.View) r7, (defpackage.oz) r13)
            r7 = 2131427787(0x7f0b01cb, float:1.84772E38)
            android.view.View r7 = r5.findViewById(r7)
            r3.l = r7
            android.view.View r7 = r3.l
            r13 = 2131427447(0x7f0b0077, float:1.847651E38)
            android.view.View r7 = r7.findViewById(r13)
            com.google.android.material.chip.Chip r7 = (com.google.android.material.chip.Chip) r7
            r3.j = r7
            dbj r7 = new dbj
            r7.<init>(r3)
            r3.o = r7
            com.google.android.material.appbar.AppBarLayout r7 = r3.b
            ajsf r13 = r3.o
            r7.a((defpackage.ajsd) r13)
            com.google.android.material.appbar.AppBarLayout r7 = r3.b
            r11 = r11 ^ r8
            r7.a(r11, r9)
            android.view.View r7 = r3.f
            if (r7 == 0) goto L_0x01b2
            dbk r11 = new dbk
            r11.<init>(r3)
            r7.setOnClickListener(r11)
            goto L_0x01c6
        L_0x01b2:
            android.view.View r7 = r3.e
            dbl r11 = new dbl
            r11.<init>(r3)
            r7.setOnClickListener(r11)
            android.widget.TextView r7 = r3.h
            dbm r11 = new dbm
            r11.<init>(r3)
            r7.setOnClickListener(r11)
        L_0x01c6:
            r7 = 2131429705(0x7f0b0949, float:1.848109E38)
            android.view.View r7 = r5.findViewById(r7)
            android.support.v7.widget.Toolbar r7 = (android.support.v7.widget.Toolbar) r7
            r3.k = r7
            android.support.v7.widget.Toolbar r7 = r3.k
            r7.a((java.lang.CharSequence) r12)
            r3.a((android.view.View) r5)
            goto L_0x022d
        L_0x01db:
            dbo r5 = r3.m
            if (r5 != 0) goto L_0x01e0
            goto L_0x01e4
        L_0x01e0:
            boolean r5 = r5.e
            if (r5 == 0) goto L_0x022d
        L_0x01e4:
            ajsf r5 = r3.o
            if (r5 != 0) goto L_0x01e9
            goto L_0x01f1
        L_0x01e9:
            com.google.android.material.appbar.AppBarLayout r7 = r3.b
            r7.b((defpackage.ajsd) r5)
            r5 = 0
            r3.o = r5
        L_0x01f1:
            android.content.Context r5 = r3.a
            android.view.LayoutInflater r5 = android.view.LayoutInflater.from(r5)
            r7 = 2131624057(0x7f0e0079, float:1.8875283E38)
            com.google.android.material.appbar.AppBarLayout r11 = r3.b
            android.view.View r5 = r5.inflate(r7, r11, r9)
            android.view.View r7 = r5.findViewById(r15)
            com.google.android.libraries.material.productlockup.ProductLockupView r7 = (com.google.android.libraries.material.productlockup.ProductLockupView) r7
            r3.d = r7
            android.view.View r7 = r5.findViewById(r14)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r3.i = r7
            r3.c()
            defpackage.que.a((android.view.View) r5, (int) r6)
            r7 = 2131429705(0x7f0b0949, float:1.848109E38)
            android.view.View r7 = r5.findViewById(r7)
            android.support.v7.widget.Toolbar r7 = (android.support.v7.widget.Toolbar) r7
            r3.k = r7
            android.support.v7.widget.Toolbar r7 = r3.k
            r7.a((java.lang.CharSequence) r12)
            r3.a((android.view.View) r5)
            dbo r5 = defpackage.dbo.COMPACT
            r3.m = r5
        L_0x022d:
            aqtw r5 = r10.c
            r7 = 2131951769(0x7f130099, float:1.9539962E38)
            if (r5 != 0) goto L_0x025e
            aqro r5 = r10.d
            if (r5 != 0) goto L_0x0245
            android.content.Context r5 = r3.a
            defpackage.jix.g(r5)
            r3.v = r8
            r5 = 0
            r3.a((java.lang.String) r5)
            goto L_0x03af
        L_0x0245:
            android.content.Context r5 = r3.a
            defpackage.jix.g(r5)
            aqro r5 = r10.d
            int r10 = r5.a
            r10 = r10 & r8
            if (r10 == 0) goto L_0x0256
            java.lang.String r5 = r5.b
            r3.v = r6
            goto L_0x0259
        L_0x0256:
            r3.v = r8
            r5 = 0
        L_0x0259:
            r3.a((java.lang.String) r5)
            goto L_0x03af
        L_0x025e:
            android.content.Context r11 = r3.a
            defpackage.jix.g(r11)
            int r11 = r5.a
            r11 = r11 & 64
            if (r11 == 0) goto L_0x026e
            java.lang.String r11 = r5.g
            r3.v = r6
            goto L_0x027b
        L_0x026e:
            boolean r11 = r5.f
            if (r11 != 0) goto L_0x0278
            java.lang.String r11 = r5.b
            r12 = 2
            r3.v = r12
            goto L_0x027b
        L_0x0278:
            r3.v = r8
            r11 = 0
        L_0x027b:
            r3.a((java.lang.String) r11)
            boolean r11 = r3.b()
            if (r11 == 0) goto L_0x03af
            dih r11 = r10.e
            boolean r11 = defpackage.dio.a((defpackage.dih) r11)
            if (r11 != 0) goto L_0x02a7
            java.lang.String r11 = r5.b
            boolean r11 = defpackage.jlh.d(r11)
            if (r11 != 0) goto L_0x029b
            boolean r11 = defpackage.awgy.g()
            if (r11 == 0) goto L_0x029b
            goto L_0x02a7
        L_0x029b:
            android.widget.TextView r11 = r3.h
            r12 = 4
            r11.setVisibility(r12)
            android.widget.TextView r11 = r3.h
            defpackage.dbp.a(r11, r9)
            goto L_0x02b9
        L_0x02a7:
            android.widget.TextView r11 = r3.h
            r11.setVisibility(r9)
            android.widget.TextView r11 = r3.h
            java.lang.String r12 = r5.b
            r11.setText(r12)
            android.widget.TextView r11 = r3.h
            r12 = -2
            defpackage.dbp.a(r11, r12)
        L_0x02b9:
            dih r11 = r10.e
            boolean r11 = defpackage.dio.a((defpackage.dih) r11)
            if (r11 == 0) goto L_0x02ec
            android.widget.TextView r11 = r3.g
            dih r12 = r10.e
            java.lang.String r12 = r12.a
            r11.setText(r12)
            android.widget.TextView r11 = r3.g
            android.content.Context r12 = r3.a
            android.content.res.Resources r12 = r12.getResources()
            java.lang.Object[] r13 = new java.lang.Object[r8]
            dih r14 = r10.e
            java.lang.String r14 = r14.a
            r13[r9] = r14
            java.lang.String r12 = r12.getString(r7, r13)
            r11.setContentDescription(r12)
            android.view.View r11 = r3.e
            r11.setVisibility(r9)
            android.widget.TextView r11 = r3.g
            r11.requestLayout()
            goto L_0x02f3
        L_0x02ec:
            android.view.View r11 = r3.e
            r12 = 8
            r11.setVisibility(r12)
        L_0x02f3:
            int r11 = r5.a
            r11 = r11 & 16
            if (r11 == 0) goto L_0x03af
            com.google.android.material.chip.Chip r11 = r3.j
            aqpm r12 = r5.e
            if (r12 == 0) goto L_0x0300
            goto L_0x0302
        L_0x0300:
            aqpm r12 = defpackage.aqpm.e
        L_0x0302:
            java.lang.String r12 = r12.b
            r11.setText(r12)
            boolean r11 = defpackage.awgy.d()
            if (r11 != 0) goto L_0x0337
            com.google.android.material.chip.Chip r11 = r3.j
            android.content.Context r12 = r3.a
            aqpm r13 = r5.e
            if (r13 == 0) goto L_0x0316
            goto L_0x0318
        L_0x0316:
            aqpm r13 = defpackage.aqpm.e
        L_0x0318:
            aqrl r13 = r13.c
            if (r13 == 0) goto L_0x031d
            goto L_0x031f
        L_0x031d:
            aqrl r13 = defpackage.aqrl.g
        L_0x031f:
            int r13 = r13.b
            aqrk r13 = defpackage.aqrk.a(r13)
            int r12 = defpackage.cxz.a(r12, r13)
            ajuj r11 = r11.b
            if (r11 == 0) goto L_0x0356
            android.content.Context r13 = r11.n
            android.graphics.drawable.Drawable r12 = defpackage.uj.b(r13, r12)
            r11.b((android.graphics.drawable.Drawable) r12)
            goto L_0x0356
        L_0x0337:
            com.google.android.material.chip.Chip r11 = r3.j
            android.content.Context r12 = r3.a
            aqpm r13 = r5.e
            if (r13 == 0) goto L_0x0340
            goto L_0x0342
        L_0x0340:
            aqpm r13 = defpackage.aqpm.e
        L_0x0342:
            aqrl r13 = r13.c
            if (r13 == 0) goto L_0x0347
            goto L_0x0349
        L_0x0347:
            aqrl r13 = defpackage.aqrl.g
        L_0x0349:
            int r13 = r13.b
            aqrk r13 = defpackage.aqrk.a(r13)
            android.graphics.drawable.Drawable r12 = defpackage.cxz.b(r12, r13)
            r11.a((android.graphics.drawable.Drawable) r12)
        L_0x0356:
            boolean r11 = defpackage.qud.h()
            if (r11 == 0) goto L_0x037e
            com.google.android.material.chip.Chip r11 = r3.j
            int r12 = defpackage.que.b(r6)
            android.content.Context r13 = r3.a
            r14 = 16842801(0x1010031, float:2.3693695E-38)
            r15 = 2131100242(0x7f060252, float:1.781286E38)
            int r13 = defpackage.que.b(r13, r14, r15)
            int r12 = defpackage.lk.a(r12, r13)
            android.content.res.ColorStateList r12 = defpackage.que.a((int) r12)
            ajuj r11 = r11.b
            if (r11 != 0) goto L_0x037b
            goto L_0x037e
        L_0x037b:
            r11.a((android.content.res.ColorStateList) r12)
        L_0x037e:
            com.google.android.material.chip.Chip r11 = r3.j
            r11.setVisibility(r9)
            cyg r11 = r10.f
            if (r11 == 0) goto L_0x039b
            com.google.android.material.chip.Chip r11 = r3.j
            aqpm r5 = r5.e
            if (r5 == 0) goto L_0x038e
            goto L_0x0390
        L_0x038e:
            aqpm r5 = defpackage.aqpm.e
        L_0x0390:
            aqsr r5 = r5.d
            if (r5 != 0) goto L_0x0396
            aqsr r5 = defpackage.aqsr.d
        L_0x0396:
            cyg r10 = r10.f
            defpackage.cyd.a((android.view.View) r11, (defpackage.aqsr) r5, (defpackage.cyg) r10)
        L_0x039b:
            android.view.View r5 = r3.l
            if (r5 == 0) goto L_0x03af
            android.content.Context r3 = r3.a
            android.content.res.Resources r3 = r3.getResources()
            r10 = 2131165469(0x7f07011d, float:1.7945156E38)
            int r3 = r3.getDimensionPixelSize(r10)
            r5.setPadding(r9, r9, r9, r3)
        L_0x03af:
            dcg r3 = r1.e
            boolean r3 = r3.a
            if (r3 != 0) goto L_0x03b6
            goto L_0x03d6
        L_0x03b6:
            int r3 = r2.b
            r5 = 4
            if (r3 != r5) goto L_0x03c0
            java.lang.Object r2 = r2.c
            aqtw r2 = (defpackage.aqtw) r2
            goto L_0x03c2
        L_0x03c0:
            aqtw r2 = defpackage.aqtw.h
        L_0x03c2:
            int r3 = r2.a
            r3 = r3 & r5
            if (r3 == 0) goto L_0x03d2
            dce r3 = new dce
            r3.<init>(r1, r2)
            r1.h = r3
            java.lang.String r2 = r2.d
            r1.i = r2
        L_0x03d2:
            dcg r2 = r1.e
            r2.b = r8
        L_0x03d6:
            dbp r2 = r1.b
            android.support.v7.widget.Toolbar r2 = r2.k
            if (r2 == 0) goto L_0x03e9
            com.google.android.chimera.Activity r2 = r1.getActivity()
            bjs r2 = (defpackage.bjs) r2
            dbp r3 = r1.b
            android.support.v7.widget.Toolbar r3 = r3.k
            r2.a((android.support.v7.widget.Toolbar) r3)
        L_0x03e9:
            if (r4 != r6) goto L_0x03fd
            android.content.Context r2 = r1.getContext()
            defpackage.jix.g(r2)
            dbp r2 = r1.b
            r2.d()
            dbp r2 = r1.b
            r2.d()
            goto L_0x0465
        L_0x03fd:
            dgb r2 = r1.a
            dga r2 = r2.a
            dfg r2 = (defpackage.dfg) r2
            boolean r2 = r2.e
            if (r2 == 0) goto L_0x041d
            dbp r2 = r1.b
            r2.d()
            dbp r2 = r1.b
            dbr r3 = new dbr
            r3.<init>(r1)
            r5 = 2131231890(0x7f080492, float:1.8079874E38)
            r10 = 2131951620(0x7f130004, float:1.953966E38)
            r2.a(r3, r5, r10)
            goto L_0x0443
        L_0x041d:
            dbp r2 = r1.b
            r2.d()
            dbp r2 = r1.b
            dbs r3 = new dbs
            r3.<init>(r1)
            android.content.Context r5 = r2.a
            defpackage.jix.g(r5)
            android.content.Context r5 = r2.a
            boolean r5 = defpackage.cyd.a((android.content.Context) r5)
            if (r5 != 0) goto L_0x043a
            r5 = 2131231849(0x7f080469, float:1.807979E38)
            goto L_0x043d
        L_0x043a:
            r5 = 2131231853(0x7f08046d, float:1.8079799E38)
        L_0x043d:
            r10 = 2131951618(0x7f130002, float:1.9539656E38)
            r2.a(r3, r5, r10)
        L_0x0443:
            if (r4 == r6) goto L_0x0465
            android.content.Context r2 = r1.getContext()
            defpackage.jix.g(r2)
            dcg r2 = r1.e
            boolean r2 = r2.a
            if (r2 == 0) goto L_0x045f
            android.view.View r2 = r1.getView()
            dbt r3 = new dbt
            r3.<init>(r1)
            r2.post(r3)
            goto L_0x046b
        L_0x045f:
            com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc r2 = r1.f
            r2.setVisibility(r9)
            goto L_0x046b
        L_0x0465:
            com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc r2 = r1.f
            r3 = 4
            r2.setVisibility(r3)
        L_0x046b:
            android.view.View r2 = r1.getView()
            r3 = 2131427786(0x7f0b01ca, float:1.8477198E38)
            android.view.View r2 = r2.findViewById(r3)
            r1.d = r2
            java.lang.Object[] r2 = new java.lang.Object[r8]
            dgb r3 = r1.a
            dih r3 = r3.b()
            java.lang.String r3 = r3.a
            r2[r9] = r3
            java.lang.String r2 = r1.getString(r7, r2)
            android.view.View r3 = r1.d
            r3.setContentDescription(r2)
            android.view.View r2 = r1.d
            r2.setVisibility(r9)
            dcg r2 = r1.e
            boolean r2 = r2.a
            if (r2 != 0) goto L_0x04af
            android.view.View r2 = r1.d
            dbu r3 = new dbu
            r3.<init>(r1)
            r4 = 2131951770(0x7f13009a, float:1.9539964E38)
            java.lang.String r4 = r1.getString(r4)
            r1.a(r2, r3, r4)
            com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc r2 = r1.f
            r3 = 0
            r1.a(r2, r3, r3)
        L_0x04af:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dbq.a(java.lang.Object):void");
    }
}
