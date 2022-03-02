package defpackage;

/* renamed from: avty  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avty extends aucj implements audy {
    public static final avty g;
    private static volatile auef h;
    public int a;
    public boolean b;
    public String c = "";
    public int d;
    public int e;
    public String f = "";

    static {
        avty avty = new avty();
        g = avty;
        aucj.a(avty.class, (aucj) avty);
    }

    private avty() {
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
            return aucj.a((audx) g, "\u0001\u0005\u0000\u0001\u0003\u0007\u0005\u0000\u0000\u0000\u0003\u0007\u0002\u0004\b\u0003\u0005\u0004\u0004\u0006\u0004\u0005\u0007\b\u0006", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new avty();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) g);
            }
            if (i2 == 5) {
                return g;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (avty.class) {
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
