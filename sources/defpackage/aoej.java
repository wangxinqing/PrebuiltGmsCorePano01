package defpackage;

/* renamed from: aoej  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aoej extends aucj implements audy {
    public static final aoej g;
    private static volatile auef h;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;

    static {
        aoej aoej = new aoej();
        g = aoej;
        aucj.a(aoej.class, (aucj) aoej);
    }

    private aoej() {
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
            return aucj.a((audx) g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u000b\u0000\u0002\u000b\u0001\u0003\u000b\u0002\u0004\u000b\u0003\u0005\f\u0004", new Object[]{"a", "b", "c", "d", "e", "f", aocv.a});
        } else if (i2 == 3) {
            return new aoej();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) g);
            }
            if (i2 == 5) {
                return g;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (aoej.class) {
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
