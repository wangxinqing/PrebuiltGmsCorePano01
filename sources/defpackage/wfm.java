package defpackage;

/* renamed from: wfm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class wfm implements Runnable {
    private final wgu a;

    public wfm(wgu wgu) {
        this.a = wgu;
    }

    public final void run() {
        wgu wgu = this.a;
        if (wgu.i()) {
            ((anih) ((anih) vvj.a.d()).a("wgu", "k", 1206, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Ignoring start background caching timeout because we're still scanning");
        } else {
            wgu.q.c();
        }
    }
}
