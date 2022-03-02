package defpackage;

/* renamed from: aqbl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aqbl implements Runnable {
    private final aqbq a;
    private final aqav b;
    private final aqbo c;

    public aqbl(aqbq aqbq, aqav aqav, aqbo aqbo) {
        this.a = aqbq;
        this.b = aqav;
        this.c = aqbo;
    }

    public final void run() {
        this.a.a(this.b, this.c);
    }
}
