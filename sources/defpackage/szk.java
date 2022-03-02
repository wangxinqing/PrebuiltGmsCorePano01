package defpackage;

/* renamed from: szk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class szk extends aucj implements audy {
    public static final szk e;
    private static volatile auef f;
    public int a;
    public int b;
    public aucx c = auei.b;
    public aucx d = auei.b;

    static {
        szk szk = new szk();
        e = szk;
        aucj.a(szk.class, (aucj) szk);
    }

    private szk() {
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u0004\u0000\u0002\u001b\u0003\u001b", new Object[]{"a", "b", "c", szq.class, "d", szl.class});
        } else if (i2 == 3) {
            return new szk();
        } else {
            if (i2 == 4) {
                return new aucd((boolean[][]) null, (boolean[]) null);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (szk.class) {
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
