package defpackage;

import android.view.View;
import com.google.android.gms.nearby.sharing.ShareSheetChimeraActivity;

/* renamed from: vqz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class vqz implements View.OnClickListener {
    private final ShareSheetChimeraActivity a;

    public vqz(ShareSheetChimeraActivity shareSheetChimeraActivity) {
        this.a = shareSheetChimeraActivity;
    }

    public void onClick(View view) {
        this.a.finish();
    }
}
