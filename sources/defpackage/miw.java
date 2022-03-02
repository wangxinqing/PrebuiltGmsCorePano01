package defpackage;

import android.os.Bundle;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.family.v2.create.FamilyCreationChimeraActivity;

/* renamed from: miw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class miw implements LoaderManager.LoaderCallbacks {
    final /* synthetic */ FamilyCreationChimeraActivity a;

    public miw(FamilyCreationChimeraActivity familyCreationChimeraActivity) {
        this.a = familyCreationChimeraActivity;
    }

    private final void a() {
        mfu.a(this.a, new miu(this), new miv(this)).show();
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        FamilyCreationChimeraActivity familyCreationChimeraActivity = this.a;
        return new mlv(familyCreationChimeraActivity, familyCreationChimeraActivity.a, familyCreationChimeraActivity.s, familyCreationChimeraActivity.b, familyCreationChimeraActivity.d, familyCreationChimeraActivity.c);
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x014e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onLoadFinished(com.google.android.chimera.Loader r10, java.lang.Object r11) {
        /*
            r9 = this;
            mhg r11 = (defpackage.mhg) r11
            boolean r10 = r11.b
            r0 = 17
            r1 = 3
            if (r10 != 0) goto L_0x0014
            com.google.android.gms.family.v2.create.FamilyCreationChimeraActivity r10 = r9.a
            mhi r10 = r10.r
            r10.a((int) r1, (int) r0)
            r9.a()
            return
        L_0x0014:
            com.google.android.gms.family.v2.create.FamilyCreationChimeraActivity r10 = r9.a
            boolean r10 = r10.j
            r2 = 1
            r3 = 0
            if (r10 == 0) goto L_0x006e
            java.lang.Object r10 = r11.a
            apjl r10 = (defpackage.apjl) r10
            aucx r10 = r10.c
            int r4 = r10.size()
            r5 = 0
        L_0x0027:
            if (r5 >= r4) goto L_0x006e
            java.lang.Object r6 = r10.get(r5)
            apkp r6 = (defpackage.apkp) r6
            int r7 = r6.a
            int r7 = defpackage.apko.a(r7)
            if (r7 != 0) goto L_0x0038
            goto L_0x003b
        L_0x0038:
            if (r7 != r0) goto L_0x003b
            goto L_0x004b
        L_0x003b:
            int r7 = r6.a
            int r7 = defpackage.apko.a(r7)
            if (r7 == 0) goto L_0x0044
            goto L_0x0045
        L_0x0044:
            r7 = 1
        L_0x0045:
            int r5 = r5 + 1
            r8 = 23
            if (r7 != r8) goto L_0x0027
        L_0x004b:
            com.google.android.gms.family.v2.model.PageData r10 = new com.google.android.gms.family.v2.model.PageData
            r10.<init>((defpackage.apkp) r6)
            com.google.android.gms.family.v2.create.FamilyCreationChimeraActivity r11 = r9.a
            com.google.android.chimera.FragmentManager r11 = r11.getSupportFragmentManager()
            r0 = 2131428223(0x7f0b037f, float:1.8478084E38)
            com.google.android.chimera.Fragment r11 = r11.findFragmentById(r0)
            boolean r0 = r11 instanceof defpackage.mia
            if (r0 == 0) goto L_0x0066
            mia r11 = (defpackage.mia) r11
            r11.a(r10)
        L_0x0066:
            com.google.android.gms.family.v2.create.FamilyCreationChimeraActivity r10 = r9.a
            r10.j = r3
            r10.j()
            return
        L_0x006e:
            java.lang.Object r10 = r11.a
            apjl r10 = (defpackage.apjl) r10
            int r0 = r10.a
            r0 = r0 & 8
            if (r0 == 0) goto L_0x0099
            apgz r10 = r10.e
            if (r10 == 0) goto L_0x007d
            goto L_0x007f
        L_0x007d:
            apgz r10 = defpackage.apgz.b
        L_0x007f:
            int r10 = r10.a
            int r10 = defpackage.apgy.a(r10)
            if (r10 != 0) goto L_0x0088
            goto L_0x0099
        L_0x0088:
            if (r10 != r1) goto L_0x0099
            com.google.android.gms.family.v2.create.FamilyCreationChimeraActivity r10 = r9.a
            mit r11 = new mit
            r11.<init>(r9)
            android.app.Dialog r10 = defpackage.mfu.b(r10, r11)
            r10.show()
            return
        L_0x0099:
            com.google.android.gms.family.v2.create.FamilyCreationChimeraActivity r10 = r9.a
            java.lang.Object r0 = r11.a
            apjl r0 = (defpackage.apjl) r0
            int r4 = r0.a
            r4 = r4 & 2
            if (r4 == 0) goto L_0x00b2
            apjk r0 = r0.d
            if (r0 == 0) goto L_0x00aa
            goto L_0x00ac
        L_0x00aa:
            apjk r0 = defpackage.apjk.c
        L_0x00ac:
            boolean r0 = r0.a
            if (r0 == 0) goto L_0x00b2
            r0 = 1
            goto L_0x00b3
        L_0x00b2:
            r0 = 0
        L_0x00b3:
            r10.i = r0
            com.google.android.gms.family.v2.create.FamilyCreationChimeraActivity r10 = r9.a
            boolean r0 = r10.i
            if (r0 != 0) goto L_0x00bc
            goto L_0x00d3
        L_0x00bc:
            java.lang.Object r0 = r11.a
            apjl r0 = (defpackage.apjl) r0
            apjk r0 = r0.d
            if (r0 == 0) goto L_0x00c5
            goto L_0x00c7
        L_0x00c5:
            apjk r0 = defpackage.apjk.c
        L_0x00c7:
            int r0 = r0.b
            int r0 = defpackage.apiv.a(r0)
            if (r0 == 0) goto L_0x00d0
            goto L_0x00d1
        L_0x00d0:
            r0 = 1
        L_0x00d1:
            r10.t = r0
        L_0x00d3:
            com.google.android.gms.family.v2.create.FamilyCreationChimeraActivity r10 = r9.a
            java.lang.Object r0 = r11.a
            apjl r0 = (defpackage.apjl) r0
            boolean r4 = r0.f
            r10.k = r4
            aucs r0 = r0.g
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x00fc
            java.lang.Object r0 = r11.a
            apjl r0 = (defpackage.apjl) r0
            auct r4 = defpackage.apjl.h
            aucs r0 = r0.g
            int r0 = r0.c(r3)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r4.a(r0)
            apix r0 = (defpackage.apix) r0
            goto L_0x00fe
        L_0x00fc:
            apix r0 = defpackage.apix.MEMBER
        L_0x00fe:
            r10.e = r0
            java.lang.Object r10 = r11.a
            apjl r10 = (defpackage.apjl) r10
            aucx r10 = r10.c
            int r10 = r10.size()
            if (r10 <= 0) goto L_0x014e
            com.google.android.gms.family.v2.create.FamilyCreationChimeraActivity r10 = r9.a
            com.google.android.gms.family.v2.model.PageDataMap r0 = new com.google.android.gms.family.v2.model.PageDataMap
            r0.<init>()
            r10.l = r0
            java.lang.Object r10 = r11.a
            apjl r10 = (defpackage.apjl) r10
            aucx r10 = r10.c
            int r11 = r10.size()
        L_0x011f:
            if (r3 >= r11) goto L_0x0142
            java.lang.Object r0 = r10.get(r3)
            apkp r0 = (defpackage.apkp) r0
            com.google.android.gms.family.v2.create.FamilyCreationChimeraActivity r1 = r9.a
            com.google.android.gms.family.v2.model.PageDataMap r1 = r1.l
            int r4 = r0.a
            int r4 = defpackage.apko.a(r4)
            if (r4 == 0) goto L_0x0134
            goto L_0x0135
        L_0x0134:
            r4 = 1
        L_0x0135:
            com.google.android.gms.family.v2.model.PageData r5 = new com.google.android.gms.family.v2.model.PageData
            r5.<init>((defpackage.apkp) r0)
            int r4 = r4 + -1
            r1.a(r4, r5)
            int r3 = r3 + 1
            goto L_0x011f
        L_0x0142:
            com.google.android.gms.family.v2.create.FamilyCreationChimeraActivity r10 = r9.a
            r11 = 6
            r10.a((int) r11)
            com.google.android.gms.family.v2.create.FamilyCreationChimeraActivity r10 = r9.a
            r10.z()
            return
        L_0x014e:
            com.google.android.gms.family.v2.create.FamilyCreationChimeraActivity r10 = r9.a
            mhi r10 = r10.r
            r11 = 28
            r10.a((int) r1, (int) r11)
            r9.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.miw.onLoadFinished(com.google.android.chimera.Loader, java.lang.Object):void");
    }

    public final void onLoaderReset(Loader loader) {
    }
}
