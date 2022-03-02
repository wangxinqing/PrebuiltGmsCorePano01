package defpackage;

/* renamed from: atow  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atow extends aucj implements audy {
    public static final atow f;
    private static volatile auef g;
    public int a;
    public atoy b;
    public aucx c = auei.b;
    public atqv d;
    public atql e;

    static {
        atow atow = new atow();
        f = atow;
        aucj.a(atow.class, (aucj) atow);
    }

    private atow() {
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
            return aucj.a((audx) f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\t\u0000\u0002\u001b\u0003\t\u0001\u0004\t\u0002", new Object[]{"a", "b", "c", atnf.class, "d", "e"});
        } else if (i2 == 3) {
            return new atow();
        } else {
            if (i2 == 4) {
                return new aucd((byte[][][]) null, (short[]) null);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (atow.class) {
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
