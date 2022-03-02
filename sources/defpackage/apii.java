package defpackage;

/* renamed from: apii  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apii extends aucj implements audy {
    public static final apii e;
    private static volatile auef f;
    public int a;
    public apgv b;
    public aucx c = auei.b;
    public String d = "";

    static {
        apii apii = new apii();
        e = apii;
        aucj.a(apii.class, (aucj) apii);
    }

    private apii() {
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\t\u0000\u0002\u001b\u0003\b\u0001", new Object[]{"a", "b", "c", apih.class, "d"});
        } else if (i2 == 3) {
            return new apii();
        } else {
            if (i2 == 4) {
                return new aucd((int[][]) null, (char[][]) null);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (apii.class) {
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
