package defpackage;

/* renamed from: ogv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ogv implements ohb {
    final /* synthetic */ nzv a;
    final /* synthetic */ boolean b;
    final /* synthetic */ ohd c;

    public ogv(ohd ohd, nzv nzv, boolean z) {
        this.c = ohd;
        this.a = nzv;
        this.b = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r13 = this;
            ohd r0 = r13.c
            nzv r1 = r13.a
            boolean r2 = r13.b
            if (r2 == 0) goto L_0x0009
            goto L_0x0030
        L_0x0009:
            int r3 = r1.h
            r4 = 29
            if (r3 != r4) goto L_0x0026
            java.util.Deque r3 = r0.b
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x0030
            java.util.Deque r3 = r0.b
            java.lang.Object r3 = r3.peek()
            nzv r3 = (defpackage.nzv) r3
            float r4 = r0.d()
            r3.d = r4
            goto L_0x0030
        L_0x0026:
            com.google.android.chimera.WebView r3 = r0.a
            r3.clearHistory()
            java.util.Deque r3 = r0.b
            r3.clear()
        L_0x0030:
            nzu r3 = r0.c
            boolean r4 = r3 instanceof com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity
            if (r4 == 0) goto L_0x0045
            com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity r3 = (com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity) r3
            com.google.android.chimera.WebView r4 = r0.a
            int r5 = android.os.Build.VERSION.SDK_INT
            oot r5 = new oot
            r5.<init>(r3, r1)
            r4.setWebViewClient(r5)
            goto L_0x0055
        L_0x0045:
            com.google.android.chimera.WebView r4 = r0.a
            android.webkit.WebViewClient r5 = defpackage.opa.a((defpackage.nzu) r3)
            r4.setWebViewClient(r5)
            android.content.Context r3 = r3.k()
            defpackage.opa.a((android.content.Context) r3, (com.google.android.chimera.WebView) r4)
        L_0x0055:
            oab r3 = r1.a
            if (r3 == 0) goto L_0x014b
            int r4 = r3.c
            r5 = 2
            if (r4 != r5) goto L_0x005f
            goto L_0x006b
        L_0x005f:
            boolean r4 = r3.h()
            if (r4 != 0) goto L_0x006b
            int r4 = r3.c
            r6 = 14
            if (r4 != r6) goto L_0x014b
        L_0x006b:
            com.google.android.chimera.WebView r7 = r0.a
            boolean r4 = r1.b()
            r6 = 1
            if (r4 == 0) goto L_0x00d7
            java.lang.String r3 = ""
            if (r2 == 0) goto L_0x0079
            goto L_0x0098
        L_0x0079:
            axmj r4 = defpackage.axmj.a
            axmk r4 = r4.a()
            boolean r4 = r4.D()
            if (r4 == 0) goto L_0x0098
            nzu r4 = r0.c
            boolean r8 = r4 instanceof com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity
            if (r8 == 0) goto L_0x0098
            com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity r4 = (com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity) r4
            ogy r8 = new ogy
            r8.<init>(r4, r1)
            java.lang.String r4 = "gmhSearchResults"
            r7.addJavascriptInterface(r8, r4)
            goto L_0x0099
        L_0x0098:
            r4 = r3
        L_0x0099:
            nzu r8 = r0.c
            com.google.android.gms.googlehelp.common.HelpConfig r8 = r8.f()
            java.lang.String r8 = defpackage.omt.a(r8)
            boolean r9 = android.text.TextUtils.isEmpty(r4)
            if (r9 != 0) goto L_0x00bf
            axmj r3 = defpackage.axmj.a
            axmk r3 = r3.a()
            java.lang.String r3 = r3.aC()
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r9 = 0
            r5[r9] = r8
            r5[r6] = r4
            java.lang.String r3 = java.lang.String.format(r3, r5)
            goto L_0x00c0
        L_0x00bf:
        L_0x00c0:
            oab r4 = r1.a
            java.lang.String r5 = r4.d
            java.lang.String r4 = r4.r()
            java.lang.String r9 = defpackage.opa.a(r5, r4, r8, r3, r6)
            java.lang.String r8 = r1.e
            r12 = 0
            java.lang.String r10 = "text/html"
            java.lang.String r11 = "UTF-8"
            r7.loadDataWithBaseURL(r8, r9, r10, r11, r12)
            goto L_0x0141
        L_0x00d7:
            boolean r4 = defpackage.axpp.d()
            boolean r4 = defpackage.ofq.b(r4)
            if (r4 != 0) goto L_0x00e2
            goto L_0x012b
        L_0x00e2:
            boolean r4 = r1.c()
            if (r4 == 0) goto L_0x012b
            axpv r4 = defpackage.axpv.a
            axpw r4 = r4.a()
            boolean r4 = r4.c()
            boolean r4 = defpackage.ofq.b(r4)
            java.lang.String r5 = "activity"
            if (r4 == 0) goto L_0x010c
            nzu r4 = r0.c
            boolean r8 = r4 instanceof com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity
            if (r8 != 0) goto L_0x0101
            goto L_0x010c
        L_0x0101:
            ojz r8 = new ojz
            com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity r4 = (com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity) r4
            r8.<init>(r4)
            r7.addJavascriptInterface(r8, r5)
            goto L_0x0114
        L_0x010c:
            ogx r4 = new ogx
            r4.<init>(r0, r7)
            r7.addJavascriptInterface(r4, r5)
        L_0x0114:
            java.lang.String r8 = r1.e
            java.lang.String r9 = r3.d
            java.lang.String r10 = r3.r()
            nzu r3 = r0.c
            com.google.android.gms.googlehelp.common.HelpConfig r3 = r3.f()
            java.lang.String r11 = defpackage.omt.a(r3)
            r12 = 1
            defpackage.opa.b(r7, r8, r9, r10, r11, r12)
            goto L_0x0141
        L_0x012b:
            java.lang.String r8 = r1.e
            java.lang.String r9 = r3.d
            java.lang.String r10 = r3.r()
            nzu r3 = r0.c
            com.google.android.gms.googlehelp.common.HelpConfig r3 = r3.f()
            java.lang.String r11 = defpackage.omt.a(r3)
            r12 = 1
            defpackage.opa.a(r7, r8, r9, r10, r11, r12)
        L_0x0141:
            r0.d = r6
            if (r2 != 0) goto L_0x014a
            java.util.Deque r0 = r0.b
            r0.push(r1)
        L_0x014a:
            return
        L_0x014b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Unsupported leaf content."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ogv.a():void");
    }
}
