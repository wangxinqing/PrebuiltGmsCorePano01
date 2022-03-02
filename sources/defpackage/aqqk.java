package defpackage;

/* renamed from: aqqk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqqk extends aucj implements audy {
    public static final aqqk b;
    private static volatile auef c;
    public aucx a = auei.b;

    static {
        aqqk aqqk = new aqqk();
        b = aqqk;
        aucj.a(aqqk.class, (aucj) aqqk);
    }

    private aqqk() {
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
            return aucj.a((audx) b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", aqsr.class});
        } else if (i2 == 3) {
            return new aqqk();
        } else {
            if (i2 == 4) {
                return new aqqj();
            }
            if (i2 == 5) {
                return b;
            }
            auef auef = c;
            if (auef == null) {
                synchronized (aqqk.class) {
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
