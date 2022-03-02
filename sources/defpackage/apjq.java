package defpackage;

/* renamed from: apjq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apjq extends aucj implements audy {
    public static final apjq f;
    private static volatile auef g;
    public int a;
    public apgv b;
    public int c;
    public String d = "";
    public String e = "";

    static {
        apjq apjq = new apjq();
        f = apjq;
        aucj.a(apjq.class, (aucj) apjq);
    }

    private apjq() {
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
            return aucj.a((audx) f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0000\u0002\f\u0001\u0003\b\u0002\u0004\b\u0003", new Object[]{"a", "b", "c", apiu.a, "d", "e"});
        } else if (i2 == 3) {
            return new apjq();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) f);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (apjq.class) {
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
