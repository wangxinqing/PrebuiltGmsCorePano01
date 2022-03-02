package defpackage;

import android.app.ActivityOptions;
import android.content.Context;
import android.util.Pair;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.nearby.sharing.SetupChimeraActivity;
import com.google.android.gms.nearby.sharing.ShareSheetChimeraActivity;

/* renamed from: vsb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class vsb implements vhf {
    private final ShareSheetChimeraActivity a;

    public vsb(ShareSheetChimeraActivity shareSheetChimeraActivity) {
        this.a = shareSheetChimeraActivity;
    }

    public final void a() {
        ShareSheetChimeraActivity shareSheetChimeraActivity = this.a;
        shareSheetChimeraActivity.startActivityForResult(SetupChimeraActivity.a((Context) shareSheetChimeraActivity), ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS, ActivityOptions.makeSceneTransitionAnimation(shareSheetChimeraActivity.getContainerActivity(), new Pair[]{new Pair(shareSheetChimeraActivity.d, "card")}).toBundle());
    }
}
