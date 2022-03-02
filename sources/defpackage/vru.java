package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.MenuItem;
import com.google.android.gms.nearby.sharing.ShareSheetChimeraActivity;

/* renamed from: vru  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vru implements acvv {
    private final ShareSheetChimeraActivity a;
    private final MenuItem b;

    public vru(ShareSheetChimeraActivity shareSheetChimeraActivity, MenuItem menuItem) {
        this.a = shareSheetChimeraActivity;
        this.b = menuItem;
    }

    public final void a(Object obj) {
        ShareSheetChimeraActivity shareSheetChimeraActivity = this.a;
        this.b.setIcon(whr.a((Context) shareSheetChimeraActivity, (Bitmap) obj));
        shareSheetChimeraActivity.a(false);
    }
}
