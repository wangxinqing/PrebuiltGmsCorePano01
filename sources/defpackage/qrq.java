package defpackage;

/* renamed from: qrq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class qrq implements acvs {
    final /* synthetic */ qri a;
    final /* synthetic */ aosh b;

    public qrq(qri qri, aosh aosh) {
        this.a = qri;
        this.b = aosh;
    }

    public final void a(Exception exc) {
        this.a.d();
        qoi.c("icing.Indexer", exc, "Mediastore indexing task failed");
        this.b.b((Object) false);
    }
}
