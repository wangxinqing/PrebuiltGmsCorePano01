package defpackage;

/* renamed from: aqsg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqsg extends aucj implements audy {
    public static final aqsg g;
    private static volatile auef h;
    public int a;
    public float b;
    public avoo c;
    public avoo d;
    public String e = "";
    public String f = "";

    static {
        aqsg aqsg = new aqsg();
        g = aqsg;
        aucj.a(aqsg.class, (aucj) aqsg);
    }

    private aqsg() {
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
            return aucj.a((audx) g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0001\u0000\u0002\t\u0001\u0003\t\u0002\u0004\b\u0003\u0005\b\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new aqsg();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) g);
            }
            if (i2 == 5) {
                return g;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (aqsg.class) {
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
