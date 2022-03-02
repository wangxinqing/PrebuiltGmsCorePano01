package defpackage;

import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;

/* renamed from: oiv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oiv implements oat {
    final /* synthetic */ HelpChimeraActivity a;

    public oiv(HelpChimeraActivity helpChimeraActivity) {
        this.a = helpChimeraActivity;
    }

    public final void a(nzj nzj) {
        if ((nzj instanceof omb) && nzj.b()) {
            this.a.f.c();
            this.a.c(nzj);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r6 = (defpackage.omb) r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(defpackage.nzj r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.omb
            if (r0 == 0) goto L_0x00ee
            omb r6 = (defpackage.omb) r6
            omf r0 = r6.e
            if (r0 == 0) goto L_0x00ee
            com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity r1 = r5.a
            boolean r6 = r6.b()
            boolean r2 = com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity.P()
            if (r2 == 0) goto L_0x0022
            r2 = 2131428504(0x7f0b0498, float:1.8478654E38)
            android.view.View r2 = r1.findViewById(r2)
            r3 = 8
            r2.setVisibility(r3)
        L_0x0022:
            r2 = 1
            r3 = 0
            if (r6 != 0) goto L_0x0036
            boolean r4 = r0.e()
            if (r4 == 0) goto L_0x0036
            com.google.android.gms.googlehelp.common.HelpConfig r4 = r1.x
            boolean r4 = r4.w()
            if (r4 == 0) goto L_0x0036
            r3 = 1
            goto L_0x0037
        L_0x0036:
        L_0x0037:
            if (r3 == 0) goto L_0x0044
            com.google.android.gms.googlehelp.common.HelpConfig r0 = r1.x
            java.util.List r0 = r0.x()
            omf r0 = defpackage.omf.a((java.util.List) r0)
            goto L_0x0045
        L_0x0044:
        L_0x0045:
            boolean r4 = r0.d()
            if (r4 != 0) goto L_0x00ee
            boolean r4 = r1.L()
            r2 = r2 ^ r4
            if (r6 == 0) goto L_0x0077
            boolean r6 = com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity.P()
            if (r6 == 0) goto L_0x0063
            com.google.android.libraries.material.opensearchbar.OpenSearchView r6 = r1.s
            android.text.Editable r6 = r6.c()
            java.lang.String r6 = r6.toString()
            goto L_0x0071
        L_0x0063:
            ong r6 = r1.q
            one r2 = r6.a()
            java.lang.CharSequence r2 = r2.b()
            r6.b = r2
            java.lang.CharSequence r6 = r6.b
        L_0x0071:
            myp r2 = r1.f
            r1.a((defpackage.omf) r0, (java.lang.CharSequence) r6, (defpackage.myp) r2)
            goto L_0x00b3
        L_0x0077:
            if (r2 != 0) goto L_0x007a
            goto L_0x007f
        L_0x007a:
            ogs r6 = r1.i
            r6.a(r0)
        L_0x007f:
            com.google.android.gms.googlehelp.common.HelpConfig r6 = r1.x
            boolean r6 = r6.z()
            if (r6 == 0) goto L_0x008d
            ogs r6 = r1.i
            r6.e()
            goto L_0x00b3
        L_0x008d:
            if (r2 == 0) goto L_0x00b3
            ogs r6 = r1.i
            r6.a()
            boolean r6 = r1.o
            if (r6 != 0) goto L_0x00a0
            com.google.android.gms.googlehelp.common.HelpConfig r6 = r1.x
            boolean r6 = r6.g()
            if (r6 != 0) goto L_0x00b3
        L_0x00a0:
            ogs r6 = r1.i
            r6.c()
            r1.K()
            com.google.android.gms.googlehelp.common.HelpConfig r6 = r1.x
            boolean r6 = r6.A()
            if (r6 == 0) goto L_0x00b3
            r1.N()
        L_0x00b3:
            boolean r6 = r0.e()
            if (r6 == 0) goto L_0x00ba
            goto L_0x00ea
        L_0x00ba:
            if (r3 != 0) goto L_0x00ea
            aoru r6 = r1.c
            ofn r2 = r1.k
            com.google.android.gms.googlehelp.common.HelpConfig r3 = r1.x
            java.lang.String r3 = r3.b
            oml r4 = new oml
            r4.<init>(r2, r0, r3)
            omk r2 = new omk
            r2.<init>(r4)
            r6.execute(r2)
            axmj r6 = defpackage.axmj.a
            axmk r6 = r6.a()
            boolean r6 = r6.C()
            if (r6 == 0) goto L_0x00ea
            aoru r6 = r1.c
            ofn r2 = r1.k
            java.util.Map r0 = r0.b
            java.util.Collection r0 = r0.values()
            defpackage.ook.a(r6, r1, r2, r0)
        L_0x00ea:
            r1.supportInvalidateOptionsMenu()
            return
        L_0x00ee:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oiv.b(nzj):void");
    }
}
