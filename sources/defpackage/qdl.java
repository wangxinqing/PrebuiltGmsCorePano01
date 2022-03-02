package defpackage;

/* renamed from: qdl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class qdl implements Runnable {
    private final qdm a;
    private final qdo b;

    public qdl(qdm qdm, qdo qdo) {
        this.a = qdm;
        this.b = qdo;
    }

    public final void run() {
        this.a.a(this.b.a);
    }
}
