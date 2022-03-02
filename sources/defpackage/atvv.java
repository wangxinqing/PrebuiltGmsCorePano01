package defpackage;

/* renamed from: atvv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atvv extends aucj implements audy {
    public static final atvv g;
    private static volatile auef h;
    public int a;
    public int b;
    public long c;
    public atvt d;
    public long e = -1;
    public aucx f = auei.b;

    static {
        atvv atvv = new atvv();
        g = atvv;
        aucj.a(atvv.class, (aucj) atvv);
    }

    private atvv() {
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
            return aucj.a((audx) g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u0004\u0000\u0002\u0002\u0001\u0003\t\u0002\u0004\u0002\u0003\u0005\u001b", new Object[]{"a", "b", "c", "d", "e", "f", atvu.class});
        } else if (i2 == 3) {
            return new atvv();
        } else {
            if (i2 == 4) {
                return new aucd((float[]) null, (byte[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return g;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (atvv.class) {
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
