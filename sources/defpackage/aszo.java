package defpackage;

/* renamed from: aszo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aszo extends aucj implements audy {
    public static final aszo e;
    private static volatile auef f;
    public int a;
    public aucx b = auei.b;
    public String c = "";
    public aucx d = auei.b;

    static {
        aszo aszo = new aszo();
        e = aszo;
        aucj.a(aszo.class, (aucj) aszo);
    }

    private aszo() {
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0002\u0000\u0002\u001b\u0003\b\u0000\u0004\u001b", new Object[]{"a", "b", atak.class, "c", "d", aszn.class});
        } else if (i2 == 3) {
            return new aszo();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (aszo.class) {
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
