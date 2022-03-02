package defpackage;

/* renamed from: akpk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akpk implements Runnable {
    final /* synthetic */ long a;
    final /* synthetic */ akpl b;

    public akpk(akpl akpl, long j) {
        this.b = akpl;
        this.a = j;
    }

    public final void run() {
        this.b.a.a();
        akpm akpm = this.b.a;
        new akpm(akpm.f, akpm.a, akpm.b, akpm.c, this.a).b();
    }
}
