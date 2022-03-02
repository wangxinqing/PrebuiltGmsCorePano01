package defpackage;

/* renamed from: anrm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anrm extends aucj implements audy {
    public static final anrm g;
    private static volatile auef h;
    public int a;
    public String b = "";
    public String c = "";
    public int d;
    public String e = "";
    public String f = "";

    static {
        anrm anrm = new anrm();
        g = anrm;
        aucj.a(anrm.class, (aucj) anrm);
    }

    private anrm() {
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
            return aucj.a((audx) g, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001\u0003\f\u0002\u0005\b\u0004\u0007\b\u0006", new Object[]{"a", "b", "c", "d", anrl.a, "e", "f"});
        } else if (i2 == 3) {
            return new anrm();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) g);
            }
            if (i2 == 5) {
                return g;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (anrm.class) {
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
