package defpackage;

/* renamed from: hag  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hag extends aucj implements audy {
    public static final hag g;
    private static volatile auef h;
    public int a;
    public int b;
    public int c;
    public String d = "";
    public String e = "";
    public boolean f;

    static {
        hag hag = new hag();
        g = hag;
        aucj.a(hag.class, (aucj) hag);
    }

    private hag() {
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
            return aucj.a((audx) g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0000\u0002\u0004\u0001\u0003\b\u0002\u0004\b\u0003\u0005\u0007\u0004", new Object[]{"a", "b", hae.a, "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new hag();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) g);
            }
            if (i2 == 5) {
                return g;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (hag.class) {
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
