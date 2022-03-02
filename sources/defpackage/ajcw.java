package defpackage;

/* renamed from: ajcw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ajcw implements Runnable {
    private final ajdb a;

    public ajcw(ajdb ajdb) {
        this.a = ajdb;
    }

    public final void run() {
        ajdb ajdb = this.a;
        ajdb.c = new ajcz(ajdb.b);
    }
}
