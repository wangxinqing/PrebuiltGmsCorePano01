package defpackage;

import com.google.android.gms.nearby.sharing.ShareSheetChimeraActivity;
import com.google.android.gms.nearby.sharing.ShareTarget;

/* renamed from: vrl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class vrl implements acvv {
    private final ShareSheetChimeraActivity a;
    private final boolean b;
    private final boolean c;
    private final boolean d;

    public vrl(ShareSheetChimeraActivity shareSheetChimeraActivity, boolean z, boolean z2, boolean z3) {
        this.a = shareSheetChimeraActivity;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public final void a(Object obj) {
        ShareSheetChimeraActivity shareSheetChimeraActivity = this.a;
        boolean z = this.b;
        boolean z2 = this.c;
        boolean z3 = this.d;
        if (((Boolean) obj).booleanValue() && z && z2 && z3) {
            int i = shareSheetChimeraActivity.u;
            if (i == 1 || i == 4) {
                shareSheetChimeraActivity.u = 1;
                if (!ayni.s()) {
                    shareSheetChimeraActivity.i();
                }
                shareSheetChimeraActivity.q.setVisibility(4);
                shareSheetChimeraActivity.r.a();
                if (ayni.m()) {
                    shareSheetChimeraActivity.t.a();
                }
                shareSheetChimeraActivity.l.setVisibility(8);
                ShareTarget shareTarget = shareSheetChimeraActivity.n;
                if (shareTarget != null) {
                    shareSheetChimeraActivity.a(shareTarget);
                    shareSheetChimeraActivity.k.setVisibility(8);
                    shareSheetChimeraActivity.q.setVisibility(0);
                } else if (shareSheetChimeraActivity.m != null) {
                    shareSheetChimeraActivity.k.setVisibility(8);
                    shareSheetChimeraActivity.q.setVisibility(0);
                } else {
                    shareSheetChimeraActivity.k.setVisibility(0);
                    shareSheetChimeraActivity.q.setVisibility(4);
                }
                shareSheetChimeraActivity.a(0, (String) null, shareSheetChimeraActivity.m);
            }
            shareSheetChimeraActivity.b.s().a((acvv) new vrm(shareSheetChimeraActivity));
            if (shareSheetChimeraActivity.u != 3) {
                shareSheetChimeraActivity.a(1);
            }
            ShareTarget shareTarget2 = shareSheetChimeraActivity.n;
            if (shareTarget2 != null) {
                shareSheetChimeraActivity.c(shareTarget2);
                shareSheetChimeraActivity.n = null;
                return;
            }
            return;
        }
        if (!ayni.c()) {
            shareSheetChimeraActivity.h();
        }
        if (shareSheetChimeraActivity.u == 2) {
            return;
        }
        if (!ayni.c() || shareSheetChimeraActivity.u != 3) {
            shareSheetChimeraActivity.u = 4;
            if (!ayni.s()) {
                shareSheetChimeraActivity.i();
            }
            shareSheetChimeraActivity.l.setVisibility(0);
            shareSheetChimeraActivity.k.setVisibility(4);
            shareSheetChimeraActivity.q.setVisibility(4);
            shareSheetChimeraActivity.a(0, (String) null, (ShareTarget) null);
            if (ayni.c()) {
                shareSheetChimeraActivity.h();
            }
        }
    }
}
