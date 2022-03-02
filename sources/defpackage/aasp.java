package defpackage;

/* renamed from: aasp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aasp extends aucj implements audy {
    public static final aasp f;
    private static volatile auef g;
    public int a;
    public boolean b;
    public boolean c;
    public int d;
    public aucx e = auei.b;

    static {
        aasp aasp = new aasp();
        f = aasp;
        aucj.a(aasp.class, (aucj) aasp);
    }

    private aasp() {
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
            return aucj.a((audx) f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u0007\u0000\u0002\u0007\u0001\u0003\f\u0002\u0004\u001b", new Object[]{"a", "b", "c", "d", aaso.a, "e", aasm.class});
        } else if (i2 == 3) {
            return new aasp();
        } else {
            if (i2 == 4) {
                return new aucd((int[]) null, (short[]) null);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (aasp.class) {
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
}
