package defpackage;

/* renamed from: arfw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arfw extends aucj implements audy {
    public static final arfw g;
    private static volatile auef h;
    public int a;
    public int b;
    public String c = "";
    public aucx d = auei.b;
    public arfx e;
    public aufc f;

    static {
        arfw arfw = new arfw();
        g = arfw;
        aucj.a(arfw.class, (aucj) arfw);
    }

    private arfw() {
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
            return aucj.a((audx) g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\f\u0000\u0002\b\u0001\u0003\u001b\u0004\t\u0002\u0005\t\u0003", new Object[]{"a", "b", arfv.a, "c", "d", arfx.class, "e", "f"});
        } else if (i2 == 3) {
            return new arfw();
        } else {
            if (i2 == 4) {
                return new aucd((byte[]) null, (float[][][]) null);
            }
            if (i2 == 5) {
                return g;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (arfw.class) {
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
