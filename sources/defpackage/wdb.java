package defpackage;

/* renamed from: wdb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class wdb implements Runnable {
    private final wdd a;
    private final String b;

    public wdb(wdd wdd, String str) {
        this.a = wdd;
        this.b = str;
    }

    public final void run() {
        wdd wdd = this.a;
        wdd.a.c(this.b);
    }
}
