package defpackage;

/* renamed from: ahjn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahjn {
    public aizx a;
    public aizx b;
    public aizx c;
    public long d = Long.MAX_VALUE;
    public long e = Long.MAX_VALUE;

    public ahjn(ajbg ajbg) {
        this.a = ajbg.a();
        this.b = ajbg.a();
        this.c = ajbg.a();
    }

    public final void a(ajbg ajbg) {
        double d2 = (double) this.e;
        double d3 = (double) this.d;
        Double.isNaN(d2);
        if (d2 * 1.5d >= d3) {
            Double.isNaN(d3);
            if (d3 * 1.5d >= d2) {
                aizx a2 = ajbg.a();
                this.c = a2;
                a2.a(this.a);
                this.c.a(this.b);
                return;
            }
            this.c = this.a;
            return;
        }
        this.c = this.b;
    }
}
