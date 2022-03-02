package com.google.android.gms.plus.circlesbutton;

import android.content.Context;
import android.util.AttributeSet;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AddToCirclesButtonImpl$DynamiteHost extends yta {
    private ysm a;

    private final void a() {
        iva.b(this.a != null, "call initialize() first");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void configure(java.lang.String r2, java.lang.String r3, com.google.android.gms.common.people.data.AudienceMember r4, java.lang.String r5, defpackage.ytd r6) {
        /*
            r1 = this;
            r1.a()
            ysm r0 = r1.a
            r0.h = r2
            r0.i = r3
            r0.e = r4
            r0.m = r5
            boolean r2 = android.text.TextUtils.isEmpty(r5)
            r3 = 0
            if (r2 != 0) goto L_0x001a
            int r2 = java.lang.Integer.parseInt(r5)     // Catch:{ NumberFormatException -> 0x0019 }
            goto L_0x001b
        L_0x0019:
            r2 = move-exception
        L_0x001a:
            r2 = 0
        L_0x001b:
            r0.p = r3
            r0.q = r3
            java.lang.String r4 = "sg"
            r0.n = r4
            r0.o = r3
            r0.a()
            r0.v = r6
            icc r3 = r0.c
            if (r3 != 0) goto L_0x004b
            ibz r3 = new ibz
            android.content.Context r4 = r0.a
            r3.<init>(r4, r0, r0)
            ibq r4 = defpackage.wlt.a
            wlr r5 = new wlr
            r5.<init>()
            r5.a = r2
            wls r2 = r5.a()
            r3.a((defpackage.ibq) r4, (defpackage.ibj) r2)
            icc r2 = r3.b()
            r0.c = r2
        L_0x004b:
            ysr r2 = new ysr
            icc r3 = r0.c
            java.lang.String r4 = r0.h
            java.lang.String r5 = r0.i
            r2.<init>(r3, r4, r5, r0)
            r0.b = r2
            ibz r2 = new ibz
            android.content.Context r3 = r0.a
            r2.<init>(r3)
            ibq r3 = defpackage.ykq.a
            r2.a((defpackage.ibq) r3)
            java.lang.String r3 = r0.h
            r2.a((java.lang.String) r3)
            icc r2 = r2.b()
            r0.d = r2
            icc r2 = r0.d
            r2.e()
            ysj r2 = new ysj
            r2.<init>(r0)
            qvr r3 = new qvr
            r3.<init>()
            r4 = 500(0x1f4, double:2.47E-321)
            r3.postDelayed(r2, r4)
            boolean r2 = r0.j
            if (r2 == 0) goto L_0x009d
            icc r2 = r0.c
            boolean r2 = r2.i()
            if (r2 == 0) goto L_0x0098
            ysr r2 = r0.b
            r2.a()
            r0.c()
            return
        L_0x0098:
            icc r2 = r0.c
            r2.e()
        L_0x009d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.plus.circlesbutton.AddToCirclesButtonImpl$DynamiteHost.configure(java.lang.String, java.lang.String, com.google.android.gms.common.people.data.AudienceMember, java.lang.String, ytd):void");
    }

    public mby getView() {
        a();
        return mbz.a((Object) this.a);
    }

    public void initialize(mby mby, mby mby2, mby mby3) {
        this.a = new ysm((Context) mbz.a(mby), (Context) mbz.a(mby2), (AttributeSet) mbz.a(mby3));
    }

    public void refreshButton() {
        a();
        this.a.c();
    }

    public void setAnalyticsStartView(String str, int i) {
        a();
        ysm ysm = this.a;
        ysm.n = str;
        ysm.o = i;
        ysm.d();
    }

    public void setShowProgressIndicator(boolean z) {
        a();
        this.a.a(z);
    }

    public void setSize(int i) {
        a();
        this.a.a(i, true);
    }

    public void setType(int i) {
        a();
        ysm ysm = this.a;
        ysm.c(i);
        ysm.d();
    }
}
