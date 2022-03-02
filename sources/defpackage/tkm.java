package defpackage;

/* renamed from: tkm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class tkm implements Runnable {
    private final tku a;
    private final tlh b;
    private final boolean c;

    public tkm(tku tku, tlh tlh, boolean z) {
        this.a = tku;
        this.b = tlh;
        this.c = z;
    }

    public final void run() {
        this.a.a(this.b, this.c);
    }
}
