package defpackage;

/* renamed from: asrj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class asrj extends aucj implements audy {
    public static final asrj f;
    private static volatile auef g;
    public int a;
    public asuv b;
    public aucx c = auei.b;
    public String d = "";
    public aucx e = auei.b;

    static {
        asrj asrj = new asrj();
        f = asrj;
        aucj.a(asrj.class, (aucj) asrj);
    }

    private asrj() {
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
            return aucj.a((audx) f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001\t\u0000\u0002\u001b\u0003\b\u0001\u0004\u001b", new Object[]{"a", "b", "c", asuf.class, "d", "e", asri.class});
        } else if (i2 == 3) {
            return new asrj();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) f);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (asrj.class) {
                    auef = g;
                    if (auef == null) {
                        auef = new auce(f);
                        g = auef;
                    }
                }
            }
            return auef;
        }
    }
}
