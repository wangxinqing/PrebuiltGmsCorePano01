package defpackage;

/* renamed from: cd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class cd implements Runnable {
    final /* synthetic */ co a;
    final /* synthetic */ ce b;

    public cd(ce ceVar, co coVar) {
        this.b = ceVar;
        this.a = coVar;
    }

    public final void run() {
        ce ceVar = this.b;
        ceVar.b.a(ceVar.a, this.a);
    }
}
