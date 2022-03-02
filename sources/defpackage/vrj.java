package defpackage;

import com.google.android.gms.nearby.sharing.ShareSheetChimeraActivity;

/* renamed from: vrj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class vrj implements Runnable {
    private final ShareSheetChimeraActivity a;

    public vrj(ShareSheetChimeraActivity shareSheetChimeraActivity) {
        this.a = shareSheetChimeraActivity;
    }

    public final void run() {
        this.a.finish();
    }
}
