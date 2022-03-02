package defpackage;

/* renamed from: aqbf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aqbf implements Runnable {
    private final aqbq a;
    private final baaf b;

    public aqbf(aqbq aqbq, baaf baaf) {
        this.a = aqbq;
        this.b = baaf;
    }

    public final void run() {
        this.a.a(this.b);
    }
}
