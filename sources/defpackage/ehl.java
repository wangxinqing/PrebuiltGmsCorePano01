package defpackage;

/* renamed from: ehl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ehl extends aucj implements audy {
    public static final ehl h;
    private static volatile auef i;
    public int a;
    public int b;
    public int c;
    public int d;
    public String e = "";
    public int f;
    public int g;

    static {
        ehl ehl = new ehl();
        h = ehl;
        aucj.a(ehl.class, (aucj) ehl);
    }

    private ehl() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 1) {
            return null;
        }
        if (i3 == 2) {
            return aucj.a((audx) h, "\u0001\u0006\u0000\u0001\u0002\u0007\u0006\u0000\u0000\u0000\u0002\f\u0000\u0003\f\u0001\u0004\f\u0002\u0005\b\u0003\u0006\u0004\u0004\u0007\u0004\u0005", new Object[]{"a", "b", ehj.a, "c", ehi.a, "d", ehk.a, "e", "f", "g"});
        } else if (i3 == 3) {
            return new ehl();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) h);
            }
            if (i3 == 5) {
                return h;
            }
            auef auef = i;
            if (auef == null) {
                synchronized (ehl.class) {
                    auef = i;
                    if (auef == null) {
                        auef = new auce(h);
                        i = auef;
                    }
                }
            }
            return auef;
        }
    }
}
