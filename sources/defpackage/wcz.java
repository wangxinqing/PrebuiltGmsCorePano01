package defpackage;

/* renamed from: wcz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class wcz implements Runnable {
    private final wdd a;
    private final String b;
    private final til c;

    public wcz(wdd wdd, String str, til til) {
        this.a = wdd;
        this.b = str;
        this.c = til;
    }

    public final void run() {
        wdd wdd = this.a;
        wdd.a.a(this.b, this.c);
    }
}
