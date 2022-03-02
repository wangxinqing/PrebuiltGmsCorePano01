package defpackage;

/* renamed from: afbh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class afbh implements aoqb {
    final /* synthetic */ afbi a;

    public afbh(afbi afbi) {
        this.a = afbi;
    }

    public final /* bridge */ /* synthetic */ aorr a(Object obj) {
        Exception exc = (Exception) obj;
        ((pia) this.a.b.a()).d("Registration execution exception", new Object[0]);
        aeri n = this.a.a.n();
        if (n.p()) {
            throw affv.a(exc, n);
        }
        throw exc;
    }
}
