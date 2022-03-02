package defpackage;

/* renamed from: alni  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alni extends aucj implements audy {
    public static final alni g;
    private static volatile auef i;
    public String a = "";
    public String b = "";
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    private int h;

    static {
        alni alni = new alni();
        g = alni;
        aucj.a(alni.class, (aucj) alni);
    }

    private alni() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 1) {
            return null;
        }
        if (i3 == 2) {
            return aucj.a((audx) g, "\u0001\u0006\u0000\u0001\u0001\t\u0006\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001\u0003\b\u0002\u0004\b\u0003\u0005\b\u0004\t\b\u0007", new Object[]{"h", "a", "b", "c", "d", "e", "f"});
        } else if (i3 == 3) {
            return new alni();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) g);
            }
            if (i3 == 5) {
                return g;
            }
            auef auef = i;
            if (auef == null) {
                synchronized (alni.class) {
                    auef = i;
                    if (auef == null) {
                        auef = new auce(g);
                        i = auef;
                    }
                }
            }
            return auef;
        }
    }
}
