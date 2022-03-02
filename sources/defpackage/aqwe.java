package defpackage;

/* renamed from: aqwe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqwe extends aucj implements audy {
    public static final aqwe g;
    private static volatile auef h;
    public int a;
    public String b = "";
    public String c = "";
    public aucs d = aucl.b;
    public aqvx e;
    public aqwp f;

    static {
        aqwe aqwe = new aqwe();
        g = aqwe;
        aucj.a(aqwe.class, (aucj) aqwe);
    }

    private aqwe() {
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
            return aucj.a((audx) g, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001Ȉ\u0002,\u0003\t\u0004\u0004\u0005Ȉ\u0006\t", new Object[]{"c", "d", "e", "a", "b", "f"});
        } else if (i2 == 3) {
            return new aqwe();
        } else {
            if (i2 == 4) {
                return new aucd((char[][][]) null, (short[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return g;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (aqwe.class) {
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
