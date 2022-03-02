package defpackage;

/* renamed from: oqe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oqe extends aucj implements audy {
    public static final oqe d;
    private static volatile auef e;
    public int a;
    public aucx b = auei.b;
    public int c;

    static {
        oqe oqe = new oqe();
        d = oqe;
        aucj.a(oqe.class, (aucj) oqe);
    }

    private oqe() {
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
            return aucj.a((audx) d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0004\u0000", new Object[]{"a", "b", oqk.class, "c"});
        } else if (i2 == 3) {
            return new oqe();
        } else {
            if (i2 == 4) {
                return new aucd((int[][][]) null, (boolean[][][]) null);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (oqe.class) {
                    auef = e;
                    if (auef == null) {
                        auef = new auce(d);
                        e = auef;
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
