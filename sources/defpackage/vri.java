package defpackage;

import com.google.android.gms.nearby.sharing.ShareSheetChimeraActivity;

/* renamed from: vri  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class vri implements Runnable {
    private final ShareSheetChimeraActivity a;

    public vri(ShareSheetChimeraActivity shareSheetChimeraActivity) {
        this.a = shareSheetChimeraActivity;
    }

    public final void run() {
        ShareSheetChimeraActivity shareSheetChimeraActivity = this.a;
        shareSheetChimeraActivity.invalidateOptionsMenu();
        shareSheetChimeraActivity.i.animate().alpha(1.0f).setDuration(250);
    }
}
