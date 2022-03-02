package defpackage;

/* renamed from: tjy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class tjy implements Runnable {
    private final tka a;
    private final long b;

    public tjy(tka tka, long j) {
        this.a = tka;
        this.b = j;
    }

    public final void run() {
        tka tka = this.a;
        ((anih) ((anih) tky.a.d()).a("tka", "f", 174, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Timing out advertising for client %s after %d ms", tka.b.b(), this.b);
        tku tku = tka.a;
        tlh tlh = tka.b;
        new uix();
        tku.c(tlh, true);
    }
}
