package defpackage;

/* renamed from: wcy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class wcy implements Runnable {
    private final wdq a;
    private final String b;
    private final tjc c;
    private final wdn d;

    public wcy(wdq wdq, String str, tjc tjc, wdn wdn) {
        this.a = wdq;
        this.b = str;
        this.c = tjc;
        this.d = wdn;
    }

    public final void run() {
        this.a.b(this.b, this.c, this.d);
    }
}
