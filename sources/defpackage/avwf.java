package defpackage;

/* renamed from: avwf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avwf extends aucj implements audy {
    public static final avwf e;
    private static volatile auef f;
    public int a;
    public String b = "";
    public long c;
    public String d = "";

    static {
        avwf avwf = new avwf();
        e = avwf;
        aucj.a(avwf.class, (aucj) avwf);
    }

    private avwf() {
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001\b\u0000\u0002\u0002\u0001\u0004\b\u0003", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new avwf();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (avwf.class) {
                    auef = f;
                    if (auef == null) {
                        auef = new auce(e);
                        f = auef;
                    }
                }
            }
            return auef;
        }
    }
}
