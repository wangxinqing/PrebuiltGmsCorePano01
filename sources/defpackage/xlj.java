package defpackage;

/* renamed from: xlj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xlj extends aucj implements audy {
    public static final xlj g;
    private static volatile auef h;
    public int a;
    public int b;
    public int c;
    public int d;
    public long e;
    public int f;

    static {
        xlj xlj = new xlj();
        g = xlj;
        aucj.a(xlj.class, (aucj) xlj);
    }

    private xlj() {
    }

    public final int a() {
        int a2 = xka.a(this.c);
        if (a2 == 0) {
            return 1;
        }
        return a2;
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 1) {
            return null;
        }
        if (i2 == 2) {
            return aucj.a((audx) g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001\u0003\f\u0002\u0004\u0002\u0003\u0005\u0004\u0004", new Object[]{"a", "b", xjx.a, "c", xjz.a, "d", xjw.a, "e", "f"});
        } else if (i2 == 3) {
            return new xlj();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) g);
            }
            if (i2 == 5) {
                return g;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (xlj.class) {
                    auef = h;
                    if (auef == null) {
                        auef = new auce(g);
                        h = auef;
                    }
                }
            }
            return auef;
        }
    }

    public final void a(int i) {
        this.c = 1;
        this.a |= 2;
    }

    public final void a(long j) {
        this.a |= 8;
        this.e = j;
    }
}
