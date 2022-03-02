package defpackage;

/* renamed from: annm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class annm extends annn {
    public annm(int i, double d, int i2) {
        super(i, d, i2);
    }

    public final String toString() {
        amrg amrg = new amrg("exponentialBackoff");
        amrg.a("firstDelayMs", this.b);
        amrg.a("multiplier", this.c);
        amrg.a("tries", this.a);
        return amrg.toString();
    }
}
