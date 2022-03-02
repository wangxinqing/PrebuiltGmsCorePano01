package defpackage;

/* renamed from: askg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class askg extends aucj implements audy {
    public static final askg d;
    private static volatile auef e;
    public int a;
    public long b;
    public aucx c = auei.b;

    static {
        askg askg = new askg();
        d = askg;
        aucj.a(askg.class, (aucj) askg);
    }

    private askg() {
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
            return aucj.a((audx) d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0002\u0000\u0002\u001b", new Object[]{"a", "b", "c", askp.class});
        } else if (i2 == 3) {
            return new askg();
        } else {
            if (i2 == 4) {
                return new aucd((short[][][]) null, (short[]) null);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (askg.class) {
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
