package defpackage;

/* renamed from: aoju  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aoju extends aucj implements audy {
    public static final aoju g;
    private static volatile auef h;
    public int a;
    public int b;
    public aoiv c;
    public int d;
    public int e;
    public int f;

    static {
        aoju aoju = new aoju();
        g = aoju;
        aucj.a(aoju.class, (aucj) aoju);
    }

    private aoju() {
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
            return aucj.a((audx) g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001\f\u0000\u0003\f\u0003\u0004\t\u0002\u0005\u0004\u0004\u0006\u0004\u0005", new Object[]{"a", "b", aome.a, "d", aomf.a, "c", "e", "f"});
        } else if (i2 == 3) {
            return new aoju();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) g);
            }
            if (i2 == 5) {
                return g;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (aoju.class) {
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
