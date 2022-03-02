package defpackage;

/* renamed from: amet  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amet extends aucj implements audy {
    public static final amet h;
    private static volatile auef i;
    public int a;
    public int b;
    public String c = "";
    public int d;
    public float e;
    public String f = "";
    public aucx g = auei.b;

    static {
        amet amet = new amet();
        h = amet;
        aucj.a(amet.class, (aucj) amet);
    }

    private amet() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 1) {
            return null;
        }
        if (i3 == 2) {
            return aucj.a((audx) h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\f\u0000\u0002\b\u0001\u0003\u0004\u0002\u0004\u0001\u0003\u0005\b\u0004\u0006\u001b", new Object[]{"a", "b", ames.a, "c", "d", "e", "f", "g", ameg.class});
        } else if (i3 == 3) {
            return new amet();
        } else {
            if (i3 == 4) {
                return new aucd((char[][]) null, (short[]) null, (byte[]) null);
            }
            if (i3 == 5) {
                return h;
            }
            auef auef = i;
            if (auef == null) {
                synchronized (amet.class) {
                    auef = i;
                    if (auef == null) {
                        auef = new auce(h);
                        i = auef;
                    }
                }
            }
            return auef;
        }
    }
}
