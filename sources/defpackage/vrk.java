package defpackage;

import android.view.View;
import com.google.android.gms.nearby.sharing.ShareSheetChimeraActivity;

/* renamed from: vrk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class vrk implements View.OnClickListener {
    private final ShareSheetChimeraActivity a;

    public vrk(ShareSheetChimeraActivity shareSheetChimeraActivity) {
        this.a = shareSheetChimeraActivity;
    }

    public void onClick(View view) {
        ShareSheetChimeraActivity shareSheetChimeraActivity = this.a;
        shareSheetChimeraActivity.b.a(shareSheetChimeraActivity.m);
    }
}
