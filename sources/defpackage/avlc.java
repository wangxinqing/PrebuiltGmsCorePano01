package defpackage;

/* renamed from: avlc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avlc extends aucj implements audy {
    public static final avlc g;
    private static volatile auef h;
    public int a;
    public avkx b;
    public String c = "";
    public avkw d;
    public String e = "";
    public int f = 1;

    static {
        avlc avlc = new avlc();
        g = avlc;
        aucj.a(avlc.class, (aucj) avlc);
    }

    private avlc() {
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
            return aucj.a((audx) g, "\u0001\u0005\u0000\u0001\u0002\u0006\u0005\u0000\u0000\u0000\u0002\b\u0002\u0003\t\u0003\u0004\t\u0001\u0005\b\u0004\u0006\f\u0005", new Object[]{"a", "c", "d", "b", "e", "f", avla.a});
        } else if (i2 == 3) {
            return new avlc();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) g);
            }
            if (i2 == 5) {
                return g;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (avlc.class) {
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
