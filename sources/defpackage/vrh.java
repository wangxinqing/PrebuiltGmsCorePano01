package defpackage;

import com.google.android.gms.nearby.sharing.ShareSheetChimeraActivity;
import com.google.android.gms.nearby.sharing.ShareTarget;

/* renamed from: vrh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class vrh implements Runnable {
    private final ShareSheetChimeraActivity a;
    private final ShareTarget b;

    public vrh(ShareSheetChimeraActivity shareSheetChimeraActivity, ShareTarget shareTarget) {
        this.a = shareSheetChimeraActivity;
        this.b = shareTarget;
    }

    public final void run() {
        this.a.f(this.b).setVisibility(8);
    }
}
