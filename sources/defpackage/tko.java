package defpackage;

/* renamed from: tko  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class tko implements Runnable {
    private final tku a;
    private final tlh b;
    private final boolean c;

    public tko(tku tku, tlh tlh, boolean z) {
        this.a = tku;
        this.b = tlh;
        this.c = z;
    }

    public final void run() {
        this.a.b(this.b, this.c);
    }
}
