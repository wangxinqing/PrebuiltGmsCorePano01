package defpackage;

/* renamed from: aohk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aohk extends aucj implements audy {
    public static final aohk f;
    private static volatile auef g;
    public int a;
    public int b;
    public String c = "";
    public int d = -1;
    public String e = "";

    static {
        aohk aohk = new aohk();
        f = aohk;
        aucj.a(aohk.class, (aucj) aohk);
    }

    private aohk() {
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
            return aucj.a((audx) f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0000\u0002\b\u0001\u0003\u0004\u0002\u0004\b\u0003", new Object[]{"a", "b", aohj.a, "c", "d", "e"});
        } else if (i2 == 3) {
            return new aohk();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) f);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (aohk.class) {
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
