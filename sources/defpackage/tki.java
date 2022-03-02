package defpackage;

/* renamed from: tki  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class tki implements Runnable {
    private final tku a;
    private final tlh b;

    public tki(tku tku, tlh tlh) {
        this.a = tku;
        this.b = tlh;
    }

    public final void run() {
        tku tku = this.a;
        tlh tlh = this.b;
        tku.a(tlh);
        tlh.a();
    }
}
