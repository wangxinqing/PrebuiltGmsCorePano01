package defpackage;

import com.google.android.gms.nearby.sharing.ShareTarget;

/* renamed from: wfh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class wfh implements Runnable {
    private final wgu a;
    private final wgm b;
    private final vtx c;
    private final ShareTarget d;

    public wfh(wgu wgu, wgm wgm, vtx vtx, ShareTarget shareTarget) {
        this.a = wgu;
        this.b = wgm;
        this.c = vtx;
        this.d = shareTarget;
    }

    public final void run() {
        wgu wgu = this.a;
        wgm wgm = this.b;
        vtx vtx = this.c;
        ShareTarget shareTarget = this.d;
        wgm.g = false;
        vtx.a(shareTarget, new vtv(4).a());
        wgu.s(shareTarget);
    }
}
