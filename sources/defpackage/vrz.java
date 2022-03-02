package defpackage;

import android.view.View;
import com.google.android.gms.nearby.sharing.ShareSheetChimeraActivity;
import com.google.android.gms.nearby.sharing.ShareTarget;

/* renamed from: vrz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class vrz implements View.OnClickListener {
    private final ShareSheetChimeraActivity a;

    public vrz(ShareSheetChimeraActivity shareSheetChimeraActivity) {
        this.a = shareSheetChimeraActivity;
    }

    public void onClick(View view) {
        ShareSheetChimeraActivity shareSheetChimeraActivity = this.a;
        ShareTarget shareTarget = shareSheetChimeraActivity.m;
        shareSheetChimeraActivity.u = 1;
        shareSheetChimeraActivity.a(3);
        shareSheetChimeraActivity.c(shareTarget);
        shareSheetChimeraActivity.p = true;
        jjg jjg = vvj.a;
    }
}
