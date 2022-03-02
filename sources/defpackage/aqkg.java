package defpackage;

/* renamed from: aqkg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqkg extends aucj implements audy {
    public static final aqkg d;
    private static volatile auef e;
    public aqki a;
    public aqkh b;
    public aqkf c;

    static {
        aqkg aqkg = new aqkg();
        d = aqkg;
        aucj.a(aqkg.class, (aucj) aqkg);
    }

    private aqkg() {
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
            return aucj.a((audx) d, "\u0000\u0003\u0000\u0000\u0001\u0005\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0005\t", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new aqkg();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) d);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (aqkg.class) {
                    auef = e;
                    if (auef == null) {
                        auef = new auce(d);
                        e = auef;
                    }
                }
            }
            return auef;
        }
    }
}
