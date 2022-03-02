package defpackage;

/* renamed from: arlf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arlf extends aucj implements audy {
    public static final arlf f;
    private static volatile auef h;
    public int a;
    public float b;
    public float c;
    public int d;
    public int e;
    private int g;

    static {
        arlf arlf = new arlf();
        f = arlf;
        aucj.a(arlf.class, (aucj) arlf);
    }

    private arlf() {
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
            return aucj.a((audx) f, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0000\u0002\u0001\u0001\u0003\u0001\u0002\u0004\u000b\u0003\u0005\u000b\u0004", new Object[]{"g", "a", arld.a, "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new arlf();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) f);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (arlf.class) {
                    auef = h;
                    if (auef == null) {
                        auef = new auce(f);
                        h = auef;
                    }
                }
            }
            return auef;
        }
    }
}
