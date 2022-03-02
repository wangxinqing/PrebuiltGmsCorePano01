package defpackage;

/* renamed from: pso  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class pso implements Runnable {
    private final psq a;

    public pso(psq psq) {
        this.a = psq;
    }

    public final void run() {
        this.a.b();
    }
}
