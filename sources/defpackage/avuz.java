package defpackage;

/* renamed from: avuz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avuz extends aucj implements audy {
    public static final avuz g;
    private static volatile auef h;
    public int a;
    public String b = "";
    public int c;
    public String d = "";
    public int e;
    public int f;

    static {
        avuz avuz = new avuz();
        g = avuz;
        aucj.a(avuz.class, (aucj) avuz);
    }

    private avuz() {
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
            return aucj.a((audx) g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001\b\u0000\u0002\u0004\u0001\u0003\b\u0002\u0005\u0004\u0004\u0006\u0004\u0005", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new avuz();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) g);
            }
            if (i2 == 5) {
                return g;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (avuz.class) {
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
