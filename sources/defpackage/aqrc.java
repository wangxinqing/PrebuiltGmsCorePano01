package defpackage;

/* renamed from: aqrc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqrc extends aucj implements audy {
    public static final aqrc c;
    private static volatile auef e;
    public String a = "";
    public boolean b;
    private int d;

    static {
        aqrc aqrc = new aqrc();
        c = aqrc;
        aucj.a(aqrc.class, (aucj) aqrc);
    }

    private aqrc() {
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
            return aucj.a((audx) c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\b\u0000\u0002\u0007\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new aqrc();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) c);
            }
            if (i2 == 5) {
                return c;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (aqrc.class) {
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
