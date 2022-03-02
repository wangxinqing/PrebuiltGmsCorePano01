package defpackage;

/* renamed from: aqnv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqnv extends aucj implements audy {
    public static final aqnv f;
    private static volatile auef g;
    public int a;
    public aqne b;
    public aqnh c;
    public aqno d;
    public aqnx e;

    static {
        aqnv aqnv = new aqnv();
        f = aqnv;
        aucj.a(aqnv.class, (aucj) aqnv);
    }

    private aqnv() {
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
            return aucj.a((audx) f, "\u0001\u0004\u0000\u0001\u0004/\u0004\u0000\u0000\u0000\u0004\t\u0001\f\t\u0002\r\t\n/\t\u0005", new Object[]{"a", "b", "c", "e", "d"});
        } else if (i2 == 3) {
            return new aqnv();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) f);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (aqnv.class) {
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
