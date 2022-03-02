package defpackage;

/* renamed from: jyk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jyk extends aucj implements audy {
    public static final jyk g;
    private static volatile auef h;
    public int a;
    public long b;
    public long c;
    public aucx d = auei.b;
    public aucx e = auei.b;
    public aucx f = auei.b;

    static {
        jyk jyk = new jyk();
        g = jyk;
        aucj.a(jyk.class, (aucj) jyk);
    }

    private jyk() {
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
            return aucj.a((audx) g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0003\u0000\u0001\u0002\u0000\u0002\u0002\u0001\u0003\u001b\u0004\u001b\u0005\u001b", new Object[]{"a", "b", "c", "d", jyj.class, "e", jyi.class, "f", jyd.class});
        } else if (i2 == 3) {
            return new jyk();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) g);
            }
            if (i2 == 5) {
                return g;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (jyk.class) {
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
