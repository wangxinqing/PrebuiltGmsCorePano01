package defpackage;

/* renamed from: aqhd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqhd {
    public double a;
    public final aqhh b = new aqhh();

    public aqhd() {
        aqhh aqhh = aqhh.a;
        a(aqhh, 0.0d);
    }

    public final void a(aqhh aqhh, double d) {
        if (aqhh.a() < 1.0E-6d || Math.abs(d) < 1.0E-6d) {
            this.a = 0.0d;
            aqhh.a.a(this.b);
            return;
        }
        aqhh.a(this.b);
        this.b.c();
        this.a = d;
    }
}
