package defpackage;

/* renamed from: akhi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akhi implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ hoi b;
    final /* synthetic */ akhj c;

    public akhi(akhj akhj, int i, hoi hoi) {
        this.c = akhj;
        this.a = i;
        this.b = hoi;
    }

    public final void run() {
        String a2 = akif.a(this.c.a).a();
        if (a2 == null || a2.hashCode() % this.a == 0) {
            hoi hoi = this.b;
            hoi.g = a2;
            hoi.b();
        }
    }
}
