package defpackage;

import android.widget.Toast;
import com.google.android.gms.R;
import com.google.android.gms.nearby.sharing.ShareSheetChimeraActivity;

/* renamed from: vre  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vre implements acvs {
    private final ShareSheetChimeraActivity a;

    public vre(ShareSheetChimeraActivity shareSheetChimeraActivity) {
        this.a = shareSheetChimeraActivity;
    }

    public final void a(Exception exc) {
        ShareSheetChimeraActivity shareSheetChimeraActivity = this.a;
        if (ayni.O()) {
            Toast.makeText(shareSheetChimeraActivity, shareSheetChimeraActivity.getString(R.string.sharing_enable_failed_bluetooth), 0).show();
        } else {
            shareSheetChimeraActivity.a(shareSheetChimeraActivity.getString(R.string.sharing_required_service_bluetooth));
        }
        anih anih = (anih) vvj.a.c();
        anih.a((Throwable) exc);
        anih.a("Failed to turn on Bluetooth.");
    }
}
