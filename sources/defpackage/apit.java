package defpackage;

/* renamed from: apit  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apit extends aucj implements audy {
    public static final apit g;
    private static volatile auef h;
    public int a;
    public String b = "";
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";

    static {
        apit apit = new apit();
        g = apit;
        aucj.a(apit.class, (aucj) apit);
    }

    private apit() {
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
            return aucj.a((audx) g, "\u0001\u0005\u0000\u0001\u0001\t\u0005\u0000\u0000\u0000\u0001\b\u0000\u0003\b\u0004\u0004\b\u0006\u0006\b\u0002\t\b\u0005", new Object[]{"a", "b", "d", "f", "c", "e"});
        } else if (i2 == 3) {
            return new apit();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) g);
            }
            if (i2 == 5) {
                return g;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (apit.class) {
                    auef = h;
                    if (auef == null) {
                        auef = new auce(g);
                        h = auef;
                    }
                }
            }
            return auef;
        }
    }
}
