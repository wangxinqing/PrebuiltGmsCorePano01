package defpackage;

/* renamed from: aiva  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aiva implements Runnable {
    private final aivb a;
    private final int b;
    private final aqek c;

    public aiva(aivb aivb, int i, aqek aqek) {
        this.a = aivb;
        this.b = i;
        this.c = aqek;
    }

    public final void run() {
        aivb aivb = this.a;
        aivb.a.a(this.b, this.c);
    }
}
