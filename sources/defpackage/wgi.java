package defpackage;

import com.google.android.gms.nearby.sharing.ShareTarget;

/* renamed from: wgi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class wgi implements Runnable {
    private final wgj a;
    private final long b;
    private final vtx c;
    private final ShareTarget d;
    private final wcx e;

    public wgi(wgj wgj, long j, vtx vtx, ShareTarget shareTarget, wcx wcx) {
        this.a = wgj;
        this.b = j;
        this.c = vtx;
        this.d = shareTarget;
        this.e = wcx;
    }

    public final void run() {
        wgj wgj = this.a;
        long j = this.b;
        vtx vtx = this.c;
        ShareTarget shareTarget = this.d;
        wcx wcx = this.e;
        ((anih) ((anih) vvj.a.d()).a("wgj", "a", 4501, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s alarm timed out after %d ms. Closing connection.", (Object) wgj.a, j);
        vtx.a(shareTarget, new vtv(10).a());
        wcx.b();
    }
}
