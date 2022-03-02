package defpackage;

/* renamed from: baey  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class baey implements Runnable {
    final /* synthetic */ baez a;
    final /* synthetic */ baei b;

    public baey(baez baez, baei baei) {
        this.a = baez;
        this.b = baei;
    }

    /* JADX INFO: finally extract failed */
    public final void run() {
        baez baez = this.a;
        baei baei = this.b;
        azyd b2 = baez.b.b();
        try {
            azzi azzi = baez.a;
            baef a2 = baei.a(((bakh) azzi).c, ((bakh) azzi).b, ((bakh) azzi).a);
            baez.b.a(b2);
            baez.a(a2);
        } catch (Throwable th) {
            baez.b.a(b2);
            throw th;
        }
    }
}
