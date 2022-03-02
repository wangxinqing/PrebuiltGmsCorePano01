package defpackage;

/* renamed from: aqeb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqeb extends aucj implements audy {
    public static final aqeb f;
    private static volatile auef h;
    public String a = "";
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";
    private int g;

    static {
        aqeb aqeb = new aqeb();
        f = aqeb;
        aucj.a(aqeb.class, (aucj) aqeb);
    }

    private aqeb() {
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
            return aucj.a((audx) f, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\b\u0000\u0002\u0004\u0001\u0003\b\u0002\u0004\b\u0004\u0005\b\u0005", new Object[]{"g", "a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new aqeb();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) f);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (aqeb.class) {
                    auef = h;
                    if (auef == null) {
                        auef = new auce(f);
                        h = auef;
                    }
                }
            }
            return auef;
        }
    }
}
