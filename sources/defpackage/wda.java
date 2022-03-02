package defpackage;

/* renamed from: wda  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class wda implements Runnable {
    private final wdd a;
    private final String b;
    private final tip c;

    public wda(wdd wdd, String str, tip tip) {
        this.a = wdd;
        this.b = str;
        this.c = tip;
    }

    public final void run() {
        wdd wdd = this.a;
        wdd.a.a(this.b, this.c);
    }
}
