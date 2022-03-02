package defpackage;

/* renamed from: arij  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arij extends aucj implements audy {
    public static final arij g;
    private static volatile auef h;
    public int a;
    public int b;
    public int c;
    public aucx d = auei.b;
    public arig e;
    public arje f;

    static {
        arij arij = new arij();
        g = arij;
        aucj.a(arij.class, (aucj) arij);
    }

    private arij() {
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
            return aucj.a((audx) g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\f\u0000\u0002\u000b\u0001\u0003\u001b\u0004\t\u0002\u0005\t\u0003", new Object[]{"a", "b", arii.b(), "c", "d", arir.class, "e", "f"});
        } else if (i2 == 3) {
            return new arij();
        } else {
            if (i2 == 4) {
                return new aucd((int[][]) null, (char[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return g;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (arij.class) {
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
