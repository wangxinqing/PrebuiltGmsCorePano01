package defpackage;

/* renamed from: atoz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atoz extends aucj implements audy {
    public static final atoz g;
    private static volatile auef h;
    public int a;
    public String b = "";
    public String c = "";
    public int d;
    public String e = "";
    public int f;

    static {
        atoz atoz = new atoz();
        g = atoz;
        aucj.a(atoz.class, (aucj) atoz);
    }

    private atoz() {
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
            return aucj.a((audx) g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001\u0003\f\u0002\u0004\b\u0003\u0005\u0004\u0004", new Object[]{"a", "b", "c", "d", atqa.a, "e", "f"});
        } else if (i2 == 3) {
            return new atoz();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) g);
            }
            if (i2 == 5) {
                return g;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (atoz.class) {
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
