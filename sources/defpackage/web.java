package defpackage;

import com.google.android.gms.nearby.sharing.ShareTarget;

/* renamed from: web  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class web implements wcw {
    private final wgu a;
    private final wgm b;
    private final vtx c;
    private final ShareTarget d;

    public web(wgu wgu, wgm wgm, vtx vtx, ShareTarget shareTarget) {
        this.a = wgu;
        this.b = wgm;
        this.c = vtx;
        this.d = shareTarget;
    }

    public final void a() {
        wgu wgu = this.a;
        wgu.a((Runnable) new wfh(wgu, this.b, this.c, this.d));
    }
}
