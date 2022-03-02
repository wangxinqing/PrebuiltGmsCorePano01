package defpackage;

/* renamed from: aloj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aloj implements alpi {
    final /* synthetic */ alok a;

    public aloj(alok alok) {
        this.a = alok;
    }

    public final void a(alpj alpj) {
        synchronized (this.a) {
            this.a.r = false;
            this.a.d();
        }
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        alrn alrn = (alrn) obj;
        synchronized (this.a) {
            this.a.r = false;
            this.a.a(alrn.a, true);
        }
    }
}
