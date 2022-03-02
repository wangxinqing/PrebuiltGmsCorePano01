package defpackage;

/* renamed from: antc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class antc extends aucj implements audy {
    public static final antc f;
    private static volatile auef g;
    public int a;
    public int b;
    public antb c;
    public aucx d = auei.b;
    public long e;

    static {
        antc antc = new antc();
        f = antc;
        aucj.a(antc.class, (aucj) antc);
    }

    private antc() {
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
            return aucj.a((audx) f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001\f\u0002\f\u0003\t\u0004\u001b\u0005\u0002", new Object[]{"a", "b", "c", "d", antd.class, "e"});
        } else if (i2 == 3) {
            return new antc();
        } else {
            if (i2 == 4) {
                return new aucd((char[]) null, (float[]) null);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (antc.class) {
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
