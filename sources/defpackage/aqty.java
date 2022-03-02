package defpackage;

/* renamed from: aqty  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqty extends aucj implements audy {
    public static final aqty a;
    private static volatile auef e;
    private int b;
    private aqsr c;
    private aqtx d;

    static {
        aqty aqty = new aqty();
        a = aqty;
        aucj.a(aqty.class, (aucj) aqty);
    }

    private aqty() {
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
            return aucj.a((audx) a, "\u0001\u0002\u0000\u0001\u0005\u0006\u0002\u0000\u0000\u0000\u0005\t\u0005\u0006\t\u0001", new Object[]{"b", "d", "c"});
        } else if (i2 == 3) {
            return new aqty();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) a);
            }
            if (i2 == 5) {
                return a;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (aqty.class) {
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
