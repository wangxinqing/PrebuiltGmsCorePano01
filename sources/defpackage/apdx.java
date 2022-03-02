package defpackage;

/* renamed from: apdx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apdx {
    public byte[] a;
    public byte[] b;
    public byte[] c;
    public byte[] d;
    private Integer e;
    private Integer f;
    private Integer g;
    private Integer h;
    private Integer i;
    private Integer j;
    private Integer k;
    private Integer l;
    private Integer m;
    private Integer n;
    private Integer o;
    private Integer p;
    private Integer q;
    private Integer r;
    private Integer s;
    private Integer t;
    private Integer u;
    private Integer v;
    private Integer w;
    private Integer x;
    private byte[] y;

    public final apdz a() {
        String str = this.e == null ? " size" : "";
        if (this.f == null) {
            str = str.concat(" mcc");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" mnc");
        }
        if (this.a == null) {
            str = String.valueOf(str).concat(" language");
        }
        if (this.b == null) {
            str = String.valueOf(str).concat(" region");
        }
        if (this.h == null) {
            str = String.valueOf(str).concat(" orientation");
        }
        if (this.i == null) {
            str = String.valueOf(str).concat(" touchscreen");
        }
        if (this.j == null) {
            str = String.valueOf(str).concat(" density");
        }
        if (this.k == null) {
            str = String.valueOf(str).concat(" keyboard");
        }
        if (this.l == null) {
            str = String.valueOf(str).concat(" navigation");
        }
        if (this.m == null) {
            str = String.valueOf(str).concat(" inputFlags");
        }
        if (this.n == null) {
            str = String.valueOf(str).concat(" screenWidth");
        }
        if (this.o == null) {
            str = String.valueOf(str).concat(" screenHeight");
        }
        if (this.p == null) {
            str = String.valueOf(str).concat(" sdkVersion");
        }
        if (this.q == null) {
            str = String.valueOf(str).concat(" minorVersion");
        }
        if (this.r == null) {
            str = String.valueOf(str).concat(" screenLayout");
        }
        if (this.s == null) {
            str = String.valueOf(str).concat(" uiMode");
        }
        if (this.t == null) {
            str = String.valueOf(str).concat(" smallestScreenWidthDp");
        }
        if (this.u == null) {
            str = String.valueOf(str).concat(" screenWidthDp");
        }
        if (this.v == null) {
            str = String.valueOf(str).concat(" screenHeightDp");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" localeScript");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" localeVariant");
        }
        if (this.w == null) {
            str = String.valueOf(str).concat(" screenLayout2");
        }
        if (this.x == null) {
            str = String.valueOf(str).concat(" colorMode");
        }
        if (this.y == null) {
            str = String.valueOf(str).concat(" unknown");
        }
        if (str.isEmpty()) {
            return new apdf(this.e.intValue(), this.f.intValue(), this.g.intValue(), this.a, this.b, this.h.intValue(), this.i.intValue(), this.j.intValue(), this.k.intValue(), this.l.intValue(), this.m.intValue(), this.n.intValue(), this.o.intValue(), this.p.intValue(), this.q.intValue(), this.r.intValue(), this.s.intValue(), this.t.intValue(), this.u.intValue(), this.v.intValue(), this.c, this.d, this.w.intValue(), this.x.intValue(), this.y);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    public final void b(int i2) {
        this.j = Integer.valueOf(i2);
    }

    public final void c(int i2) {
        this.m = Integer.valueOf(i2);
    }

    public final void d(int i2) {
        this.k = Integer.valueOf(i2);
    }

    public final void e(int i2) {
        this.f = Integer.valueOf(i2);
    }

    public final void f(int i2) {
        this.q = Integer.valueOf(i2);
    }

    public final void g(int i2) {
        this.g = Integer.valueOf(i2);
    }

    public final void h(int i2) {
        this.l = Integer.valueOf(i2);
    }

    public final void i(int i2) {
        this.h = Integer.valueOf(i2);
    }

    public final void j(int i2) {
        this.o = Integer.valueOf(i2);
    }

    public final void k(int i2) {
        this.v = Integer.valueOf(i2);
    }

    public final void l(int i2) {
        this.r = Integer.valueOf(i2);
    }

    public final void m(int i2) {
        this.w = Integer.valueOf(i2);
    }

    public final void n(int i2) {
        this.n = Integer.valueOf(i2);
    }

    public final void o(int i2) {
        this.u = Integer.valueOf(i2);
    }

    public final void p(int i2) {
        this.p = Integer.valueOf(i2);
    }

    public final void q(int i2) {
        this.e = Integer.valueOf(i2);
    }

    public final void r(int i2) {
        this.t = Integer.valueOf(i2);
    }

    public final void s(int i2) {
        this.i = Integer.valueOf(i2);
    }

    public final void t(int i2) {
        this.s = Integer.valueOf(i2);
    }

    public final void a(int i2) {
        this.x = Integer.valueOf(i2);
    }

    /* access modifiers changed from: package-private */
    public final void a(byte[] bArr) {
        if (bArr != null) {
            this.y = bArr;
            return;
        }
        throw new NullPointerException("Null unknown");
    }
}
