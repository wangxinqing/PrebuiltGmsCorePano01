package defpackage;

import com.google.android.gms.nearby.sharing.ShareTarget;

/* renamed from: wfi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class wfi implements Runnable {
    private final wgu a;
    private final vtx b;
    private final ShareTarget c;
    private final Exception d;

    public wfi(wgu wgu, vtx vtx, ShareTarget shareTarget, Exception exc) {
        this.a = wgu;
        this.b = vtx;
        this.c = shareTarget;
        this.d = exc;
    }

    public final void run() {
        wgu wgu = this.a;
        vtx vtx = this.b;
        ShareTarget shareTarget = this.c;
        Exception exc = this.d;
        vtx.a(shareTarget, new vtv(7).a());
        wgu.q.a(shareTarget);
        anih anih = (anih) vvj.a.d();
        anih.a((Throwable) exc);
        ((anih) anih.a("wgu", "a", 1599, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).m();
    }
}
