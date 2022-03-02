package defpackage;

/* renamed from: asvj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class asvj extends aucj implements audy {
    public static final asvj f;
    private static volatile auef g;
    public int a;
    public asuu b;
    public int c;
    public String d = "";
    public String e = "";

    static {
        asvj asvj = new asvj();
        f = asvj;
        aucj.a(asvj.class, (aucj) asvj);
    }

    private asvj() {
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
            return aucj.a((audx) f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0000\u0002\f\u0001\u0003\b\u0002\u0004\b\u0003", new Object[]{"a", "b", "c", asqy.b(), "d", "e"});
        } else if (i2 == 3) {
            return new asvj();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) f);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (asvj.class) {
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
