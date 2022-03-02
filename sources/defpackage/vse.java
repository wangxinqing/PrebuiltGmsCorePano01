package defpackage;

import com.google.android.gms.nearby.sharing.ShareSheetChimeraActivity;
import com.google.android.gms.nearby.sharing.ShareTarget;
import java.util.Iterator;

/* renamed from: vse  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vse implements vsh {
    final /* synthetic */ ShareSheetChimeraActivity a;

    public vse(ShareSheetChimeraActivity shareSheetChimeraActivity) {
        this.a = shareSheetChimeraActivity;
    }

    public final void a(ShareTarget shareTarget) {
        ShareSheetChimeraActivity shareSheetChimeraActivity = this.a;
        for (ShareTarget shareTarget2 : shareSheetChimeraActivity.o.keySet()) {
            if (ShareSheetChimeraActivity.a(shareTarget2, shareTarget)) {
                shareSheetChimeraActivity.a.removeCallbacks((Runnable) shareSheetChimeraActivity.o.get(shareTarget2));
                shareSheetChimeraActivity.o.remove(shareTarget2);
                jjg jjg = vvj.a;
                if (shareTarget2.a != shareTarget.a && !shareSheetChimeraActivity.g(shareTarget).a(shareTarget2, shareTarget)) {
                    ((anih) vvj.a.d()).a("Failed to replace shareTarget.");
                    return;
                }
                return;
            }
        }
        Iterator it = shareSheetChimeraActivity.g(shareTarget).iterator();
        while (it.hasNext()) {
            ShareTarget shareTarget3 = (ShareTarget) it.next();
            if (shareTarget.a == shareTarget3.a) {
                jjg jjg2 = vvj.a;
                return;
            } else if (ShareSheetChimeraActivity.a(shareTarget, shareTarget3)) {
                if (!shareSheetChimeraActivity.g(shareTarget).a(shareTarget3, shareTarget)) {
                    ((anih) vvj.a.d()).a("Failed to replace shareTarget.");
                    return;
                } else {
                    ((anih) vvj.a.d()).a("Discovered lost device %s again. Replacing the previous one", (Object) shareTarget.b);
                    return;
                }
            }
        }
        shareSheetChimeraActivity.a(shareTarget);
    }

    public final void b(ShareTarget shareTarget) {
        ShareSheetChimeraActivity shareSheetChimeraActivity = this.a;
        if (shareSheetChimeraActivity.g(shareTarget).b((Object) shareTarget) != -1) {
            vrn vrn = new vrn(shareSheetChimeraActivity, shareTarget);
            shareSheetChimeraActivity.o.put(shareTarget, vrn);
            shareSheetChimeraActivity.a.postDelayed(vrn, 50);
        }
    }

    public final void a(ShareTarget shareTarget, int i) {
        this.a.a(shareTarget, i);
    }
}
