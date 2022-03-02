package defpackage;

/* renamed from: asur  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class asur extends aucj implements audy {
    public static final asur c;
    private static volatile auef e;
    public asuv a;
    public aucx b = auei.b;
    private int d;

    static {
        asur asur = new asur();
        c = asur;
        aucj.a(asur.class, (aucj) asur);
    }

    private asur() {
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
            return aucj.a((audx) c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\t\u0000\u0002\u001c", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new asur();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) c);
            }
            if (i2 == 5) {
                return c;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (asur.class) {
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
