package defpackage;

import com.google.android.gms.nearby.sharing.ShareTarget;

/* renamed from: wga  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class wga implements Runnable {
    private final wgb a;
    private final ShareTarget b;

    public wga(wgb wgb, ShareTarget shareTarget) {
        this.a = wgb;
        this.b = shareTarget;
    }

    public final void run() {
        wgb wgb = this.a;
        wgb.c.s(this.b);
    }
}
