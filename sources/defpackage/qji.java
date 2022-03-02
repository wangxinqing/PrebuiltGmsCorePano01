package defpackage;

/* renamed from: qji  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qji extends aucj implements audy {
    public static final qji b;
    private static volatile auef c;
    public aucx a = auei.b;

    static {
        qji qji = new qji();
        b = qji;
        aucj.a(qji.class, (aucj) qji);
    }

    private qji() {
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
            return aucj.a((audx) b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"a"});
        } else if (i2 == 3) {
            return new qji();
        } else {
            if (i2 == 4) {
                return new aucd((int[][]) null);
            }
            if (i2 == 5) {
                return b;
            }
            auef auef = c;
            if (auef == null) {
                synchronized (qji.class) {
                    auef = c;
                    if (auef == null) {
                        auef = new auce(b);
                        c = auef;
                    }
                }
            }
            return auef;
        }
    }
}
