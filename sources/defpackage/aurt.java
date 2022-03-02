package defpackage;

/* renamed from: aurt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aurt extends aucj implements audy {
    public static final aurt g;
    private static volatile auef h;
    public int a;
    public boolean b;
    public int c;
    public long d;
    public long e;
    public boolean f;

    static {
        aurt aurt = new aurt();
        g = aurt;
        aucj.a(aurt.class, (aucj) aurt);
    }

    private aurt() {
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
            return aucj.a((audx) g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0007\u0000\u0002\f\u0001\u0003\u0002\u0002\u0004\u0002\u0005\u0005\u0007\u0006", new Object[]{"a", "b", "c", auru.a, "d", "e", "f"});
        } else if (i2 == 3) {
            return new aurt();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) g);
            }
            if (i2 == 5) {
                return g;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (aurt.class) {
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
}
