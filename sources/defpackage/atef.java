package defpackage;

/* renamed from: atef  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atef extends aucj implements audy {
    public static final atef g;
    private static volatile auef h;
    public int a;
    public int b;
    public atbz c;
    public long d;
    public atbr e;
    public long f;

    static {
        atef atef = new atef();
        g = atef;
        aucj.a(atef.class, (aucj) atef);
    }

    private atef() {
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
            return aucj.a((audx) g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001\u0004\u0000\u0003\t\u0001\u0004\u0002\u0002\u0005\t\u0003\u0006\u0002\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new atef();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) g);
            }
            if (i2 == 5) {
                return g;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (atef.class) {
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
