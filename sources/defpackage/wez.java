package defpackage;

import com.google.android.gms.nearby.sharing.ShareTarget;

/* renamed from: wez  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class wez implements wcw {
    private final wgu a;
    private final tfu b;
    private final ShareTarget c;

    public wez(wgu wgu, tfu tfu, ShareTarget shareTarget) {
        this.a = wgu;
        this.b = tfu;
        this.c = shareTarget;
    }

    public final void a() {
        wgu wgu = this.a;
        wgu.a((Runnable) new wff(wgu, this.b, this.c));
    }
}
