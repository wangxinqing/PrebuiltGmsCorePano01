package defpackage;

/* renamed from: aask  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aask extends aucj implements audy {
    public static final aask e;
    private static volatile auef f;
    public int a;
    public auay b = auay.b;
    public aucx c = auei.b;
    public int d;

    static {
        aask aask = new aask();
        e = aask;
        aucj.a(aask.class, (aucj) aask);
    }

    private aask() {
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0001\u0000\u0002\u001b\u0003\n\u0000\u0004\f\u0001", new Object[]{"a", "c", aasn.class, "b", "d", aasj.a});
        } else if (i2 == 3) {
            return new aask();
        } else {
            if (i2 == 4) {
                return new aucd((char[][]) null, (int[]) null);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (aask.class) {
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
