package defpackage;

/* renamed from: avwk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avwk extends aucj implements audy {
    public static final avwk b;
    private static volatile auef c;
    public auay a = auay.b;

    static {
        avwk avwk = new avwk();
        b = avwk;
        aucj.a(avwk.class, (aucj) avwk);
    }

    private avwk() {
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
            return aucj.a((audx) b, "\u0000\u0001\u0000\u0000\t\t\u0001\u0000\u0000\u0000\t\n", new Object[]{"a"});
        } else if (i2 == 3) {
            return new avwk();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) b);
            }
            if (i2 == 5) {
                return b;
            }
            auef auef = c;
            if (auef == null) {
                synchronized (avwk.class) {
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
