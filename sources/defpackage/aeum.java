package defpackage;

/* renamed from: aeum  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aeum implements aoqb {
    final /* synthetic */ aeun a;

    public aeum(aeun aeun) {
        this.a = aeun;
    }

    public final /* bridge */ /* synthetic */ aorr a(Object obj) {
        Exception exc = (Exception) obj;
        ((pia) this.a.b.a()).e("Sync execution exception", new Object[0]);
        aeri n = this.a.a.n();
        if (n.o()) {
            throw affv.a(exc, n);
        }
        throw exc;
    }
}
