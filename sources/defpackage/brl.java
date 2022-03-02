package defpackage;

/* renamed from: brl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class brl extends aucj implements audy {
    public static final brl v;
    private static volatile auef w;
    public int a;
    public String b = "";
    public aucx c = auei.b;
    public int d;
    public String e = "";
    public aucx f = auei.b;
    public aucx g = auei.b;
    public aucx h = auei.b;
    public aucx i = auei.b;
    public aucx j = auei.b;
    public aucx k = auei.b;
    public aucx l = auei.b;
    public aucx m = auei.b;
    public aucx n = auei.b;
    public String o = "";
    public aucx p = auei.b;
    public aucx q = auei.b;
    public aucx r = auei.b;
    public aucx s = auei.b;
    public aucx t = auei.b;
    public bra u;

    static {
        brl brl = new brl();
        v = brl;
        aucj.a(brl.class, (aucj) brl);
    }

    private brl() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 1) {
            return null;
        }
        if (i3 == 2) {
            return aucj.a((audx) v, "\u0001\u0014\u0000\u0001\u0001\u0015\u0014\u0000\u000f\u0000\u0001\b\u0000\u0002\u0004\u0001\u0003\b\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007\u001b\b\u001b\t\u001b\n\u001b\u000b\u001b\f\b\u0003\r\u001b\u000e\u001a\u000f\u001b\u0010\u001b\u0011\u001b\u0012\u001b\u0013\t\u0004\u0015\u001b", new Object[]{"a", "b", "d", "e", "f", brp.class, "h", brm.class, "i", brq.class, "j", bro.class, "k", brn.class, "l", brd.class, "m", bqz.class, "n", brg.class, "o", "p", brb.class, "c", "q", boc.class, "r", brk.class, "s", brc.class, "t", brr.class, "u", "g", brp.class});
        } else if (i3 == 3) {
            return new brl();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) v);
            }
            if (i3 == 5) {
                return v;
            }
            auef auef = w;
            if (auef == null) {
                synchronized (brl.class) {
                    auef = w;
                    if (auef == null) {
                        auef = new auce(v);
                        w = auef;
                    }
                }
            }
            return auef;
        }
    }

    public final void b() {
        if (!this.j.a()) {
            this.j = aucj.a(this.j);
        }
    }

    public final void c() {
        if (!this.k.a()) {
            this.k = aucj.a(this.k);
        }
    }

    public final void d() {
        if (!this.m.a()) {
            this.m = aucj.a(this.m);
        }
    }

    public final void e() {
        if (!this.n.a()) {
            this.n = aucj.a(this.n);
        }
    }

    public final void f() {
        if (!this.p.a()) {
            this.p = aucj.a(this.p);
        }
    }

    public final void g() {
        if (!this.r.a()) {
            this.r = aucj.a(this.r);
        }
    }

    public final void h() {
        if (!this.s.a()) {
            this.s = aucj.a(this.s);
        }
    }

    public final void i() {
        if (!this.t.a()) {
            this.t = aucj.a(this.t);
        }
    }

    public final void a() {
        if (!this.i.a()) {
            this.i = aucj.a(this.i);
        }
    }
}
