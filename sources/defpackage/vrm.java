package defpackage;

import com.google.android.gms.R;
import com.google.android.gms.nearby.sharing.ShareSheetChimeraActivity;

/* renamed from: vrm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vrm implements acvv {
    private final ShareSheetChimeraActivity a;

    public vrm(ShareSheetChimeraActivity shareSheetChimeraActivity) {
        this.a = shareSheetChimeraActivity;
    }

    public final void a(Object obj) {
        ShareSheetChimeraActivity shareSheetChimeraActivity = this.a;
        shareSheetChimeraActivity.s.setText(shareSheetChimeraActivity.getString(R.string.sharing_share_sheet_subtitle, new Object[]{(String) obj}));
    }
}
