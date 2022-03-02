package defpackage;

/* renamed from: akph  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akph implements Runnable {
    final /* synthetic */ long a;
    final /* synthetic */ akpj b;

    public akph(akpj akpj, long j) {
        this.b = akpj;
        this.a = j;
    }

    public final void run() {
        this.b.a();
        akpj akpj = this.b;
        new akpj(akpj.d, akpj.a, akpj.b, akpj.c, this.a).b();
    }
}
