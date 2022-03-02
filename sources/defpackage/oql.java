package defpackage;

/* renamed from: oql  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oql extends aucj implements audy {
    public static final oql f;
    private static volatile auef g;
    public int a;
    public aucx b = auei.b;
    public aucx c = auei.b;
    public aucx d = auei.b;
    public int e;

    static {
        oql oql = new oql();
        f = oql;
        aucj.a(oql.class, (aucj) oql);
    }

    private oql() {
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
            return aucj.a((audx) f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0003\u0000\u0001\u001a\u0002\u001a\u0003\u001a\u0004\f\u0000", new Object[]{"a", "b", "c", "d", "e", oqm.a});
        } else if (i2 == 3) {
            return new oql();
        } else {
            if (i2 == 4) {
                return new aucd((boolean[][][]) null, (int[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (oql.class) {
                    auef = g;
                    if (auef == null) {
                        auef = new auce(f);
                        g = auef;
                    }
                }
            }
            return auef;
        }
    }

    public final void a() {
        if (!this.b.a()) {
            this.b = aucj.a(this.b);
        }
    }
}
