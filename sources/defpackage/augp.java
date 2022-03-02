package defpackage;

/* renamed from: augp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class augp extends aucj implements audy {
    public static final augp j;
    private static volatile auef k;
    public int a;
    public aucs b = aucl.b;
    public int c;
    public int d;
    public String e = "";
    public int f;
    public int g;
    public String h = "";
    public int i;

    static {
        augp augp = new augp();
        j = augp;
        aucj.a(augp.class, (aucj) augp);
    }

    private augp() {
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
            return aucj.a((audx) j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001e\u0002\u0004\u0000\u0003\f\u0001\u0004\b\u0002\u0005\u0004\u0003\u0006\f\u0004\u0007\b\u0005\b\u0004\u0006", new Object[]{"a", "b", augm.b(), "c", "d", augn.a, "e", "f", "g", augn.a, "h", "i"});
        } else if (i3 == 3) {
            return new augp();
        } else {
            if (i3 == 4) {
                return new aucd((char[][]) null, (char[][][]) null);
            }
            if (i3 == 5) {
                return j;
            }
            auef auef = k;
            if (auef == null) {
                synchronized (augp.class) {
                    auef = k;
                    if (auef == null) {
                        auef = new auce(j);
                        k = auef;
                    }
                }
            }
            return auef;
        }
    }
}
