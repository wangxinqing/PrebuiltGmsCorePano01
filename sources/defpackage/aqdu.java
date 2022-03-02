package defpackage;

/* renamed from: aqdu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqdu extends aucj implements audy {
    public static final aqdu f;
    private static volatile auef g;
    public int a;
    public aucx b = auei.b;
    public int c = 1;
    public aqdz d;
    public aurq e;

    static {
        aqdu aqdu = new aqdu();
        f = aqdu;
        aucj.a(aqdu.class, (aucj) aqdu);
    }

    private aqdu() {
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
            return aucj.a((audx) f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001b\u0002\f\u0000\u0003\t\u0001\u0004\t\u0002", new Object[]{"a", "b", aqdn.class, "c", aqdl.a, "d", "e"});
        } else if (i2 == 3) {
            return new aqdu();
        } else {
            if (i2 == 4) {
                return new aucd((short[]) null, (boolean[][]) null);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (aqdu.class) {
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
