package defpackage;

/* renamed from: aqbj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aqbj implements Runnable {
    private final aqbq a;
    private final Object b;

    public aqbj(aqbq aqbq, Object obj) {
        this.a = aqbq;
        this.b = obj;
    }

    public final void run() {
        aqbq aqbq = this.a;
        aqbq.b.add(new aqbo(aqbq, this.b));
        aqbq.a();
    }
}
