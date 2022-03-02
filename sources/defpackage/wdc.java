package defpackage;

/* renamed from: wdc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class wdc implements Runnable {
    private final wdd a;
    private final String b;
    private final tij c;

    public wdc(wdd wdd, String str, tij tij) {
        this.a = wdd;
        this.b = str;
        this.c = tij;
    }

    public final void run() {
        wdd wdd = this.a;
        wdd.a.a(this.b, this.c);
    }
}
