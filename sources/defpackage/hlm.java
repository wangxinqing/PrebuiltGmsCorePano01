package defpackage;

/* renamed from: hlm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hlm {
    public String a;
    public auay b;
    public auay c;
    public boolean d;
    public boolean e;
    private Integer f;

    public hlm() {
        this.f = -1;
        this.a = "";
        this.b = auay.b;
        this.c = auay.b;
        this.d = false;
        this.e = false;
    }

    public final hln a() {
        boolean z;
        if (this.f.intValue() != -1) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z);
        iva.c(this.a);
        iva.b(!this.b.j());
        return new hln(this.f.intValue(), this.a, this.b, this.c, this.d, this.e);
    }

    public final void a(int i) {
        this.f = Integer.valueOf(i);
    }

    public hlm(hln hln) {
        anax anax = hln.a;
        this.f = Integer.valueOf(hln.b);
        this.a = hln.c;
        this.b = hln.d;
        this.c = hln.e;
        this.d = hln.f;
        this.e = hln.g;
    }
}
