package defpackage;

import android.content.Context;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;
import com.google.android.gms.googlehelp.service.GoogleHelpChimeraService;

/* renamed from: ome  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ome extends nzj {
    private final Context e;
    private final String f;
    private final omd g;
    private final HelpConfig h;
    private final ofn i;
    private boolean j;

    public ome(HelpChimeraActivity helpChimeraActivity, String str, omd omd) {
        super(helpChimeraActivity);
        this.e = helpChimeraActivity;
        this.f = str;
        this.g = omd;
        this.h = helpChimeraActivity.x;
        this.i = helpChimeraActivity.k;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0106  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void b(java.lang.Object r8) {
        /*
            r7 = this;
            omf r8 = (defpackage.omf) r8
            omd r0 = r7.g
            boolean r1 = r7.j
            ogs r0 = (defpackage.ogs) r0
            com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity r2 = r0.b
            r3 = 1
            r2.p = r3
            boolean r2 = r8.d()
            if (r2 != 0) goto L_0x014d
            com.google.android.gms.googlehelp.common.HelpConfig r2 = r0.c
            boolean r2 = r2.B()
            if (r2 == 0) goto L_0x0034
            com.google.android.gms.googlehelp.common.HelpConfig r1 = r0.c
            long r1 = r1.S
            myp r3 = new myp
            r3.<init>(r1)
            r3.c()
            com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity r1 = r0.b
            com.google.android.gms.googlehelp.common.HelpConfig r2 = r0.c
            java.lang.String r2 = r2.U
            r1.a((defpackage.omf) r8, (java.lang.CharSequence) r2, (defpackage.myp) r3)
            r0.b(r8)
            return
        L_0x0034:
            com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity r2 = r0.b
            boolean r2 = defpackage.jkf.a(r2)
            r4 = 0
            if (r2 == 0) goto L_0x00ca
            boolean r2 = r8.e()
            if (r2 != 0) goto L_0x0044
            goto L_0x0048
        L_0x0044:
            if (r1 == 0) goto L_0x0048
            goto L_0x00ca
        L_0x0048:
            boolean r2 = r8.e()
            if (r2 != 0) goto L_0x00bb
            r0.b(r8)
            r0.c(r8)
            com.google.android.gms.googlehelp.common.HelpConfig r8 = r0.c
            boolean r8 = r8.z()
            if (r8 != 0) goto L_0x00b6
            com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity r8 = r0.b
            boolean r8 = r8.o
            if (r8 == 0) goto L_0x014d
            r0.c()
            com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity r8 = r0.b
            r8.K()
            com.google.android.gms.googlehelp.common.HelpConfig r8 = r0.c
            boolean r8 = r8.A()
            if (r8 != 0) goto L_0x0073
            goto L_0x00af
        L_0x0073:
            if (r1 != 0) goto L_0x0092
            com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity r8 = r0.b
            com.google.android.gms.googlehelp.common.HelpConfig r1 = r0.c
            boolean r2 = r1.T
            if (r2 != 0) goto L_0x007f
            r2 = 5
            goto L_0x0080
        L_0x007f:
            r2 = 4
        L_0x0080:
            myp r3 = new myp
            long r4 = r1.S
            r3.<init>(r4)
            r3.c()
            long r3 = r3.a()
            r0.a((com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity) r8, (int) r2, (long) r3)
            goto L_0x00af
        L_0x0092:
            com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity r8 = r0.b
            com.google.android.gms.googlehelp.common.HelpConfig r1 = r0.c
            boolean r2 = r1.T
            if (r2 != 0) goto L_0x009d
            r2 = 3
            goto L_0x009e
        L_0x009d:
            r2 = 2
        L_0x009e:
            myp r3 = new myp
            long r4 = r1.S
            r3.<init>(r4)
            r3.c()
            long r3 = r3.a()
            r0.a((com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity) r8, (int) r2, (long) r3)
        L_0x00af:
            com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity r8 = r0.b
            r8.supportInvalidateOptionsMenu()
            return
        L_0x00b6:
            r0.e()
            return
        L_0x00bb:
            com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity r8 = r0.b
            boolean r1 = r8.n
            if (r1 == 0) goto L_0x00c2
            goto L_0x00c5
        L_0x00c2:
            r8.a((boolean) r3, (boolean) r3)
        L_0x00c5:
            com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity r8 = r0.b
            r8.p = r4
            return
        L_0x00ca:
            boolean r1 = r8.e()
            if (r1 == 0) goto L_0x00e9
            com.google.android.gms.googlehelp.common.HelpConfig r1 = r0.c
            boolean r1 = r1.w()
            if (r1 == 0) goto L_0x00e3
            com.google.android.gms.googlehelp.common.HelpConfig r8 = r0.c
            java.util.List r8 = r8.x()
            omf r8 = defpackage.omf.a((java.util.List) r8)
            goto L_0x00eb
        L_0x00e3:
            com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity r1 = r0.b
            defpackage.okg.d(r1)
            goto L_0x00ea
        L_0x00e9:
        L_0x00ea:
            r3 = 0
        L_0x00eb:
            r0.c(r8)
            com.google.android.gms.googlehelp.common.HelpConfig r1 = r0.c
            boolean r1 = r1.z()
            if (r1 != 0) goto L_0x0106
            com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity r8 = r0.b
            boolean r8 = r8.o
            if (r8 == 0) goto L_0x0147
            r0.c()
            com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity r8 = r0.b
            r8.K()
            goto L_0x0147
        L_0x0106:
            r1 = 0
            if (r3 == 0) goto L_0x0118
            com.google.android.gms.googlehelp.common.HelpConfig r2 = r0.c
            java.lang.String r2 = r2.O
            java.lang.String r3 = defpackage.oal.a()
            com.google.android.gms.googlehelp.common.HelpConfig r5 = r0.c
            oab r2 = defpackage.oab.a((java.lang.String) r2, (java.lang.String) r3, (com.google.android.gms.googlehelp.common.HelpConfig) r5)
            goto L_0x0119
        L_0x0118:
            r2 = r1
        L_0x0119:
            if (r2 == 0) goto L_0x0143
            java.util.Map r3 = r8.b
            java.lang.String r5 = r2.b
            boolean r3 = r3.containsKey(r5)
            if (r3 == 0) goto L_0x0143
            java.util.Map r8 = r8.b
            java.lang.String r2 = r2.b
            java.lang.Object r8 = r8.get(r2)
            oab r8 = (defpackage.oab) r8
            com.google.android.gms.googlehelp.common.HelpConfig r2 = r0.c
            int r3 = r2.Y
            int r5 = r2.P
            java.lang.String r6 = r2.Q
            float r2 = r2.R
            nzv r8 = defpackage.nzv.a(r8, r3, r5, r6, r2)
            com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity r2 = r0.b
            r2.a((defpackage.oab) r1, (defpackage.nzv) r8, (boolean) r4)
            goto L_0x0147
        L_0x0143:
            r0.f()
        L_0x0147:
            com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity r8 = r0.b
            r8.supportInvalidateOptionsMenu()
            return
        L_0x014d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ome.b(java.lang.Object):void");
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        nzz b = GoogleHelpChimeraService.b(GoogleHelpChimeraService.c(this.h));
        boolean z = true;
        if (b != null && !b.d) {
            z = false;
        }
        this.j = z;
        omf a = this.i.a(this.e, omj.a(this.f, this.h.U), 16, this.h.b);
        if (axnl.b() && this.j && a.e()) {
            a = this.i.a(this.e, oab.y(), 154, this.h.b);
        }
        if (this.h.B()) {
            HelpConfig helpConfig = this.h;
            this.i.a(omj.a(helpConfig.c, helpConfig.U), this.h.b);
        }
        return a;
    }
}
