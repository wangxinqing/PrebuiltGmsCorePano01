package defpackage;

/* renamed from: antt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class antt extends aucj implements audy {
    public static final antt f;
    private static volatile auef g;
    public int a;
    public int b;
    public int c;
    public int d;
    public String e = "";

    static {
        antt antt = new antt();
        f = antt;
        aucj.a(antt.class, (aucj) antt);
    }

    private antt() {
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
            return aucj.a((audx) f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0000\u0002\u0004\u0001\u0003\u0004\u0002\u0004\b\u0003", new Object[]{"a", "b", qbh.a, "c", "d", "e"});
        } else if (i2 == 3) {
            return new antt();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) f);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (antt.class) {
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
