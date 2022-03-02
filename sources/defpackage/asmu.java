package defpackage;

/* renamed from: asmu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class asmu extends aucj implements audy {
    public static final asmu f;
    private static volatile auef g;
    public int a;
    public int b = 0;
    public Object c;
    public asmq d;
    public int e;

    static {
        asmu asmu = new asmu();
        f = asmu;
        aucj.a(asmu.class, (aucj) asmu);
    }

    private asmu() {
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
            return aucj.a((audx) f, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\t\u0000\u0002\f\u0001\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"c", "b", "a", "d", "e", asmt.a, asmp.class, asmm.class, asmo.class, asmr.class});
        } else if (i2 == 3) {
            return new asmu();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) f);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (asmu.class) {
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
