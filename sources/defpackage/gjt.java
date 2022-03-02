package defpackage;

/* renamed from: gjt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gjt extends aucj implements audy {
    public static final gjt c;
    private static volatile auef e;
    public int a;
    public String b = "";
    private int d;

    static {
        gjt gjt = new gjt();
        c = gjt;
        aucj.a(gjt.class, (aucj) gjt);
    }

    private gjt() {
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
            return aucj.a((audx) c, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\f\u0001\u0003\b\u0002", new Object[]{"d", "a", gjr.a, "b"});
        } else if (i2 == 3) {
            return new gjt();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) c);
            }
            if (i2 == 5) {
                return c;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (gjt.class) {
                    auef = e;
                    if (auef == null) {
                        auef = new auce(c);
                        e = auef;
                    }
                }
            }
            return auef;
        }
    }
}
