package defpackage;

/* renamed from: abrp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abrp implements Runnable {
    final /* synthetic */ abrq a;

    public abrp(abrq abrq) {
        this.a = abrq;
    }

    public final void run() {
        abrq abrq = this.a;
        absf absf = abrq.b;
        abxe abxe = abrq.a;
        iva.a(absf.c);
        absf.a.a("getBootstrappableAccounts called on package side.", new Object[0]);
        absf.b.e(3);
        acaj.a(absf.b, 10);
        absf.e.a(abxe);
    }
}
