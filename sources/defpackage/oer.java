package defpackage;

/* renamed from: oer  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class oer implements Runnable {
    private final oeu a;
    private final long b;

    public oer(oeu oeu, long j) {
        this.a = oeu;
        this.b = j;
    }

    public final void run() {
        oeu oeu = this.a;
        if (oeu.b() == this.b) {
            oeu.d.g();
        }
    }
}
