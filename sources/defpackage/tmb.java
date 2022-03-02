package defpackage;

/* renamed from: tmb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class tmb implements Runnable {
    private final tmz a;
    private final String b;
    private final tlh c;

    public tmb(tmz tmz, String str, tlh tlh) {
        this.a = tmz;
        this.b = str;
        this.c = tlh;
    }

    public final void run() {
        tmz tmz = this.a;
        String str = this.b;
        tlh tlh = this.c;
        ((anih) tky.a.d()).a("Closing the connection to endpoint %s after %d ms", (Object) str, aymi.K());
        tmz.b.a(tlh, str);
    }
}
