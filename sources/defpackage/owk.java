package defpackage;

/* renamed from: owk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class owk implements ows {
    private final amzt a = new amzt();
    private int b = 0;
    private int c = 0;
    private final apms d;

    public owk(owm owm) {
        iva.a(apms.a(owm));
        this.d = owm.b;
        a(owm);
    }

    private final void a(owm owm) {
        this.a.c(owm);
        this.b++;
        this.c += owm.a.a();
    }

    public final owt a() {
        apms apms = this.d;
        apms.getClass();
        return new owl(apms, this.a.a());
    }

    public final /* bridge */ /* synthetic */ boolean a(owt owt) {
        owm owm = (owm) owt;
        if (!apms.a(owm) || this.b >= ((Integer) ozx.cg.c()).intValue() || owm.b != this.d) {
            return false;
        }
        if (this.c + owm.a.a() > ((Integer) ozx.ch.c()).intValue()) {
            return false;
        }
        a(owm);
        return true;
    }
}
