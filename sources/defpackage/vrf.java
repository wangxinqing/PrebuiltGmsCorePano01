package defpackage;

import android.widget.Toast;
import com.google.android.gms.R;
import com.google.android.gms.nearby.sharing.ShareSheetChimeraActivity;

/* renamed from: vrf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vrf implements acvs {
    private final ShareSheetChimeraActivity a;

    public vrf(ShareSheetChimeraActivity shareSheetChimeraActivity) {
        this.a = shareSheetChimeraActivity;
    }

    public final void a(Exception exc) {
        ShareSheetChimeraActivity shareSheetChimeraActivity = this.a;
        Toast.makeText(shareSheetChimeraActivity, shareSheetChimeraActivity.getString(R.string.sharing_enable_failed_wifi), 0).show();
        anih anih = (anih) vvj.a.c();
        anih.a((Throwable) exc);
        anih.a("Failed to turn on Wifi.");
    }
}
