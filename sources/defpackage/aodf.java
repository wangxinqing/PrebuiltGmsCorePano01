package defpackage;

/* renamed from: aodf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aodf extends aucj implements audy {
    public static final aodf f;
    private static volatile auef g;
    public int a;
    public aucs b = aucl.b;
    public String c;
    public boolean d;
    public int e;

    static {
        aodf aodf = new aodf();
        f = aodf;
        aucj.a(aodf.class, (aucj) aodf);
    }

    private aodf() {
        auei auei = auei.b;
        this.c = "";
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
            return aucj.a((audx) f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0000\u0001\u0016\u0003\b\u0000\u0004\u0007\u0001\u0005\u000b\u0002", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new aodf();
        } else {
            if (i2 == 4) {
                return new aucd((int[][]) null, (float[][]) null);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (aodf.class) {
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
