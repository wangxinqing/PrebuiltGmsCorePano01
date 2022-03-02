package defpackage;

/* renamed from: avdf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avdf extends aucj implements audy {
    public static final avdf q;
    private static volatile auef t;
    public int a;
    public long b;
    public String c = "";
    public aucx d = auei.b;
    public double e;
    public aucx f = auei.b;
    public aucx g = auei.b;
    public aucx h = auei.b;
    public long i;
    public long j;
    public aucx k = auei.b;
    public String l = "";
    public int m;
    public int n;
    public long o;
    public int p;
    private boolean r;
    private boolean s;

    static {
        avdf avdf = new avdf();
        q = avdf;
        aucj.a(avdf.class, (aucj) avdf);
    }

    private avdf() {
    }

    public static /* synthetic */ void a(avdf avdf) {
        avdf.a |= 512;
        avdf.r = true;
    }

    public static /* synthetic */ void b(avdf avdf) {
        avdf.a |= 1024;
        avdf.s = true;
    }

    public final void c() {
        if (!this.f.a()) {
            this.f = aucj.a(this.f);
        }
    }

    public final void e() {
        if (!this.g.a()) {
            this.g = aucj.a(this.g);
        }
    }

    public final void f() {
        if (!this.h.a()) {
            this.h = aucj.a(this.h);
        }
    }

    public final void g() {
        if (!this.k.a()) {
            this.k = aucj.a(this.k);
        }
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
            return aucj.a((audx) q, "\u0001\u0011\u0000\u0001\u0001\u0017\u0011\u0000\u0005\u0000\u0001\u0002\u0000\u0002\b\u0002\u0003\u001a\u0005\u001b\u0006\u001b\u0007\u001b\b\u0000\u0004\t\u0003\u0005\n\u0003\u0006\f\u001b\u000e\u0007\t\u000f\u0007\n\u0012\b\f\u0014\u0004\u000e\u0015\u0004\u000f\u0016\u0002\u0010\u0017\f\u0011", new Object[]{"a", "b", "c", "d", "f", avdv.class, "g", avds.class, "h", avdx.class, "e", "i", "j", "k", avdz.class, "r", "s", "l", "m", "n", "o", "p", avde.a});
        } else if (i3 == 3) {
            return new avdf();
        } else {
            if (i3 == 4) {
                return new avdd();
            }
            if (i3 == 5) {
                return q;
            }
            auef auef = t;
            if (auef == null) {
                synchronized (avdf.class) {
                    auef = t;
                    if (auef == null) {
                        auef = new auce(q);
                        t = auef;
                    }
                }
            }
            return auef;
        }
    }
}
