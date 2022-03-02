package defpackage;

import com.google.android.gms.nearby.sharing.ShareTarget;

/* renamed from: wfu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class wfu implements wcw {
    private final wgu a;
    private final vtx b;
    private final ShareTarget c;

    public wfu(wgu wgu, vtx vtx, ShareTarget shareTarget) {
        this.a = wgu;
        this.b = vtx;
        this.c = shareTarget;
    }

    public final void a() {
        wgu wgu = this.a;
        wgu.a((Runnable) new wfp(wgu, this.b, this.c));
    }
}
