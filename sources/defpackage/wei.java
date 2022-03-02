package defpackage;

import com.google.android.gms.nearby.sharing.ShareTarget;

/* renamed from: wei  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class wei implements wcw {
    private final wgu a;
    private final tfu b;
    private final ShareTarget c;

    public wei(wgu wgu, tfu tfu, ShareTarget shareTarget) {
        this.a = wgu;
        this.b = tfu;
        this.c = shareTarget;
    }

    public final void a() {
        wgu wgu = this.a;
        wgu.a((Runnable) new wew(wgu, this.b, this.c));
    }
}
