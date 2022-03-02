package defpackage;

import com.google.android.gms.nearby.sharing.ShareTarget;

/* renamed from: wfs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class wfs implements Runnable {
    private final wgu a;
    private final vtx b;
    private final ShareTarget c;

    public wfs(wgu wgu, vtx vtx, ShareTarget shareTarget) {
        this.a = wgu;
        this.b = vtx;
        this.c = shareTarget;
    }

    public final void run() {
        wgu wgu = this.a;
        vtx vtx = this.b;
        ShareTarget shareTarget = this.c;
        vtx.a(shareTarget, new vtv(4).a());
        wgu.s(shareTarget);
    }
}
