package defpackage;

/* renamed from: nor  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class nor implements acvs {
    private final nou a;

    public nor(nou nou) {
        this.a = nou;
    }

    public final void a(Exception exc) {
        nou nou = this.a;
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        nou.b.a(2025, -1, exc);
    }
}
