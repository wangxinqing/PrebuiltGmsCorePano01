package defpackage;

import android.view.View;
import com.google.android.gms.nearby.sharing.ShareSheetChimeraActivity;

/* renamed from: vry  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class vry implements View.OnClickListener {
    private final ShareSheetChimeraActivity a;

    public vry(ShareSheetChimeraActivity shareSheetChimeraActivity) {
        this.a = shareSheetChimeraActivity;
    }

    public void onClick(View view) {
        this.a.finish();
    }
}
