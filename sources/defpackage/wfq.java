package defpackage;

import com.google.android.gms.nearby.sharing.ShareTarget;

/* renamed from: wfq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class wfq implements wcw {
    private final wgu a;
    private final ShareTarget b;

    public wfq(wgu wgu, ShareTarget shareTarget) {
        this.a = wgu;
        this.b = shareTarget;
    }

    public final void a() {
        wgu wgu = this.a;
        wgu.a((Runnable) new wft(wgu, this.b));
    }
}
