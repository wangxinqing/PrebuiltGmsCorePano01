package defpackage;

/* renamed from: aqtj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqtj extends aucj implements audy {
    public static final aqtj a;
    private static volatile auef e;
    private int b;
    private aqsr c;
    private aqst d;

    static {
        aqtj aqtj = new aqtj();
        a = aqtj;
        aucj.a(aqtj.class, (aucj) aqtj);
    }

    private aqtj() {
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
            return aucj.a((audx) a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001", new Object[]{"b", "c", "d"});
        } else if (i2 == 3) {
            return new aqtj();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) a);
            }
            if (i2 == 5) {
                return a;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (aqtj.class) {
                    auef = e;
                    if (auef == null) {
                        auef = new auce(a);
                        e = auef;
                    }
                }
            }
            return auef;
        }
    }
}
