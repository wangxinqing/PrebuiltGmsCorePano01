package defpackage;

/* renamed from: aril  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aril extends aucj implements audy {
    public static final auct c = new arik();
    public static final aril f;
    private static volatile auef g;
    public int a;
    public aucs b = aucl.b;
    public long d;
    public int e;

    static {
        aril aril = new aril();
        f = aril;
        aucj.a(aril.class, (aucj) aril);
    }

    private aril() {
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
            return aucj.a((audx) f, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001e\u0002\u0003\u0000\u0003\f\u0001", new Object[]{"a", "b", ariu.b(), "d", "e", arjg.b()});
        } else if (i2 == 3) {
            return new aril();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) f);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (aril.class) {
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
