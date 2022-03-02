package defpackage;

import com.google.android.gms.nearby.sharing.ShareTarget;

/* renamed from: wfd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class wfd implements Runnable {
    private final wgu a;
    private final tfu b;
    private final ShareTarget c;

    public wfd(wgu wgu, tfu tfu, ShareTarget shareTarget) {
        this.a = wgu;
        this.b = tfu;
        this.c = shareTarget;
    }

    public final void run() {
        wgu wgu = this.a;
        tfu tfu = this.b;
        ShareTarget shareTarget = this.c;
        tfu.b();
        wgu.s(shareTarget);
    }
}
