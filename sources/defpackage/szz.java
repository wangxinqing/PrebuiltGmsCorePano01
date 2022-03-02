package defpackage;

/* renamed from: szz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class szz extends aucj implements audy {
    public static final szz g;
    private static volatile auef h;
    public int a;
    public aucx b = auei.b;
    public String c = "";
    public long d;
    public long e;
    public int f;

    static {
        szz szz = new szz();
        g = szz;
        aucj.a(szz.class, (aucj) szz);
    }

    private szz() {
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
            return aucj.a((audx) g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002\b\u0000\u0003\u0002\u0001\u0004\u0002\u0002\u0005\u0004\u0003", new Object[]{"a", "b", tab.class, "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new szz();
        } else {
            if (i2 == 4) {
                return new aucd((char[]) null, (short[]) null);
            }
            if (i2 == 5) {
                return g;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (szz.class) {
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
        if (!this.b.a()) {
            this.b = aucj.a(this.b);
        }
    }
}
