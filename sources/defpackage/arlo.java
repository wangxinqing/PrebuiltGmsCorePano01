package defpackage;

/* renamed from: arlo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arlo extends aucj implements audy {
    public static final arlo e;
    private static volatile auef f;
    public int a;
    public int b;
    public aucx c = auei.b;
    public aucs d = aucl.b;

    static {
        arlo arlo = new arlo();
        e = arlo;
        aucj.a(arlo.class, (aucj) arlo);
    }

    private arlo() {
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\f\u0000\u0002\u001b\u0003\u001d", new Object[]{"a", "b", arln.a, "c", arli.class, "d"});
        } else if (i2 == 3) {
            return new arlo();
        } else {
            if (i2 == 4) {
                return new arlm();
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (arlo.class) {
                    auef = f;
                    if (auef == null) {
                        auef = new auce(e);
                        f = auef;
                    }
                }
            }
            return auef;
        }
    }
}
