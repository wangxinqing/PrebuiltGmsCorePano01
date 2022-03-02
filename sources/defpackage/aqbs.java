package defpackage;

/* renamed from: aqbs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aqbs implements Runnable {
    private final aqbv a;
    private final Object b;

    public aqbs(aqbv aqbv, Object obj) {
        this.a = aqbv;
        this.b = obj;
    }

    public final void run() {
        aqbv aqbv = this.a;
        aqbv.b.add(new aqbu(this.b, aqbv.a.size()));
        aqbv.b();
    }
}
