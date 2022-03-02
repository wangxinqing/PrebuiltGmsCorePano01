package defpackage;

/* renamed from: oqn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oqn extends aucj implements audy {
    public static final oqn e;
    private static volatile auef f;
    public int a;
    public int b;
    public auay c = auay.b;
    public oqy d;

    static {
        oqn oqn = new oqn();
        e = oqn;
        aucj.a(oqn.class, (aucj) oqn);
    }

    private oqn() {
        audl audl = audl.b;
        auei auei = auei.b;
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001\u000b\u0000\u0003\n\u0002\u0005\t\u0005", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new oqn();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (oqn.class) {
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
