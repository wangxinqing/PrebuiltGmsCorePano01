package defpackage;

/* renamed from: atdd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atdd extends aucj implements audy {
    public static final atdd g;
    private static volatile auef h;
    public int a;
    public int b;
    public int c;
    public boolean d;
    public atbt e;
    public aucx f = auei.b;

    static {
        atdd atdd = new atdd();
        g = atdd;
        aucj.a(atdd.class, (aucj) atdd);
    }

    private atdd() {
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
            return aucj.a((audx) g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\f\u0000\u0002\u0004\u0001\u0003\u0007\u0002\u0004\u001b\u0005\t\u0003", new Object[]{"a", "b", atdb.a, "c", "d", "f", aten.class, "e"});
        } else if (i2 == 3) {
            return new atdd();
        } else {
            if (i2 == 4) {
                return new aucd((boolean[][]) null, (short[][][]) null);
            }
            if (i2 == 5) {
                return g;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (atdd.class) {
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

    public final void a() {
        if (!this.f.a()) {
            this.f = aucj.a(this.f);
        }
    }
}
