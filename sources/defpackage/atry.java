package defpackage;

/* renamed from: atry  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atry extends aucj implements audy {
    public static final atry e;
    public static final auci f;
    private static volatile auef g;
    public int a;
    public int b;
    public int c;
    public String d = "";

    static {
        atry atry = new atry();
        e = atry;
        aucj.a(atry.class, (aucj) atry);
        atjm atjm = atjm.a;
        atry atry2 = e;
        f = aucj.a((audx) atjm, (Object) atry2, (audx) atry2, 166262701, aufw.MESSAGE);
    }

    private atry() {
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0000\u0002\f\u0001\u0003\b\u0002", new Object[]{"a", "b", "c", atrz.a, "d"});
        } else if (i2 == 3) {
            return new atry();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (atry.class) {
                    auef = g;
                    if (auef == null) {
                        auef = new auce(e);
                        g = auef;
                    }
                }
            }
            return auef;
        }
    }
}
