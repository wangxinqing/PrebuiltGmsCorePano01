package defpackage;

/* renamed from: atbm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atbm extends aucj implements audy {
    public static final atbm f;
    private static volatile auef g;
    public int a;
    public int b = 0;
    public Object c;
    public int d;
    public String e = "";

    static {
        atbm atbm = new atbm();
        f = atbm;
        aucj.a(atbm.class, (aucj) atbm);
    }

    private atbm() {
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
            return aucj.a((audx) f, "\u0001\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001\f\u0000\u0002\b\u0001\u00037\u0000\u00045\u0000\u00054\u0000\u00063\u0000\u0007;\u0000\b:\u0000", new Object[]{"c", "b", "a", "d", atbl.a, "e"});
        } else if (i2 == 3) {
            return new atbm();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) f);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (atbm.class) {
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
