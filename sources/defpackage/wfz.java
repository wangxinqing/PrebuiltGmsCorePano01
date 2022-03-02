package defpackage;

import com.google.android.gms.nearby.sharing.ShareTarget;

/* renamed from: wfz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class wfz implements wcw {
    private final wgb a;
    private final ShareTarget b;

    public wfz(wgb wgb, ShareTarget shareTarget) {
        this.a = wgb;
        this.b = shareTarget;
    }

    public final void a() {
        wgb wgb = this.a;
        wgb.c.a((Runnable) new wga(wgb, this.b));
    }
}
