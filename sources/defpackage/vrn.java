package defpackage;

import com.google.android.gms.nearby.sharing.ShareSheetChimeraActivity;
import com.google.android.gms.nearby.sharing.ShareTarget;

/* renamed from: vrn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vrn implements Runnable {
    private final ShareSheetChimeraActivity a;
    private final ShareTarget b;

    public vrn(ShareSheetChimeraActivity shareSheetChimeraActivity, ShareTarget shareTarget) {
        this.a = shareSheetChimeraActivity;
        this.b = shareTarget;
    }

    public final void run() {
        ShareSheetChimeraActivity shareSheetChimeraActivity = this.a;
        ShareTarget shareTarget = this.b;
        if (shareSheetChimeraActivity.g(shareTarget).b((Object) shareTarget) != -1) {
            vuq g = shareSheetChimeraActivity.g(shareTarget);
            int indexOf = g.e.indexOf(shareTarget);
            if (indexOf != -1) {
                g.e.remove(shareTarget);
                g.M(indexOf);
            }
            shareSheetChimeraActivity.o.remove(shareTarget);
            if (shareSheetChimeraActivity.g(shareTarget).a() == 0) {
                shareSheetChimeraActivity.b(shareTarget);
            }
            ((anih) vvj.a.d()).a("Lost sight of %s, removed from recyclerView", (Object) shareTarget.b);
        }
    }
}
