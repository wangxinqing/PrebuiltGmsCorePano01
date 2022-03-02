package defpackage;

/* renamed from: aqsw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqsw extends aucj implements audy {
    public static final aqsw f;
    private static volatile auef g;
    public int a;
    public aqsr b;
    public aqsr c;
    public aqsx d;
    public aqsr e;

    static {
        aqsw aqsw = new aqsw();
        f = aqsw;
        aucj.a(aqsw.class, (aucj) aqsw);
    }

    private aqsw() {
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
            return aucj.a((audx) f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0002\u0003\t\u0003\u0004\t\u0001", new Object[]{"a", "b", "d", "e", "c"});
        } else if (i2 == 3) {
            return new aqsw();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) f);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (aqsw.class) {
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
