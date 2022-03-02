package defpackage;

/* renamed from: brn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class brn extends aucj implements audy {
    public static final brn f;
    private static volatile auef g;
    public int a;
    public String b = "";
    public String c = "";
    public boolean d;
    public int e;

    static {
        brn brn = new brn();
        f = brn;
        aucj.a(brn.class, (aucj) brn);
    }

    private brn() {
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
            return aucj.a((audx) f, "\u0001\u0004\u0000\u0001\u0001d\u0004\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001\u0003\u0007\u0002d\u0004\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new brn();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) f);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (brn.class) {
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
