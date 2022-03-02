package defpackage;

/* renamed from: asab  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class asab extends aucj implements audy {
    public static final auct g = new arzy();
    public static final asab j;
    private static volatile auef k;
    public int a;
    public String b = "";
    public String c = "";
    public auay d = auay.b;
    public int e;
    public aucs f = aucl.b;
    public auay h = auay.b;
    public asaf i;

    static {
        asab asab = new asab();
        j = asab;
        aucj.a(asab.class, (aucj) asab);
    }

    private asab() {
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
            return aucj.a((audx) j, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001\b\u0000\u0002\b\u0001\u0003\n\u0002\u0004\u0004\u0003\u0005\u001e\u0006\n\u0004\u0007\t\u0005", new Object[]{"a", "b", "c", "d", "e", "f", asaa.b(), "h", "i"});
        } else if (i3 == 3) {
            return new asab();
        } else {
            if (i3 == 4) {
                return new aucd((char[][]) null, (float[]) null);
            }
            if (i3 == 5) {
                return j;
            }
            auef auef = k;
            if (auef == null) {
                synchronized (asab.class) {
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
