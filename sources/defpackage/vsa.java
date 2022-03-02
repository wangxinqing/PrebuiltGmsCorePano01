package defpackage;

import android.view.View;
import com.google.android.chimera.Activity;
import com.google.android.gms.nearby.sharing.ShareSheetChimeraActivity;

/* renamed from: vsa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class vsa implements View.OnClickListener {
    private final ShareSheetChimeraActivity a;

    public vsa(ShareSheetChimeraActivity shareSheetChimeraActivity) {
        this.a = shareSheetChimeraActivity;
    }

    public void onClick(View view) {
        ShareSheetChimeraActivity shareSheetChimeraActivity = this.a;
        shareSheetChimeraActivity.j.a(true);
        acwa a2 = wia.a((Activity) shareSheetChimeraActivity);
        acwa a3 = wht.a(shareSheetChimeraActivity.getApplicationContext());
        acwa a4 = win.a((Activity) shareSheetChimeraActivity);
        acws.a(a2, a3, shareSheetChimeraActivity.b.b(true), a4).a((acvp) new vrc(shareSheetChimeraActivity));
        a2.a((acvs) new vrd(shareSheetChimeraActivity));
        a3.a((acvs) new vre(shareSheetChimeraActivity));
        a4.a((acvs) new vrf(shareSheetChimeraActivity));
    }
}
