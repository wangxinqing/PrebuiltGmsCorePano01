package defpackage;

/* renamed from: akpi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akpi implements Runnable {
    final /* synthetic */ akpd a;
    final /* synthetic */ long b;
    final /* synthetic */ akpj c;

    public akpi(akpj akpj, akpd akpd, long j) {
        this.c = akpj;
        this.a = akpd;
        this.b = j;
    }

    public final void run() {
        akpj akpj = this.c;
        new akps(akpj.d, this.a, akpj.c, this.b).b();
    }
}
