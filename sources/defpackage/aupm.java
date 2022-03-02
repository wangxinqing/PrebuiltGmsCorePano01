package defpackage;

/* renamed from: aupm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aupm extends aucj implements audy {
    public static final aupm c;
    private static volatile auef e;
    public avvt a;
    public int b;
    private int d;

    static {
        aupm aupm = new aupm();
        c = aupm;
        aucj.a(aupm.class, (aucj) aupm);
    }

    private aupm() {
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
            return aucj.a((audx) c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0000\u0002\f\u0001", new Object[]{"d", "a", "b", aups.b()});
        } else if (i2 == 3) {
            return new aupm();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) c);
            }
            if (i2 == 5) {
                return c;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (aupm.class) {
                    auef = e;
                    if (auef == null) {
                        auef = new auce(c);
                        e = auef;
                    }
                }
            }
            return auef;
        }
    }
}
