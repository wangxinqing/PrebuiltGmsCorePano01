package defpackage;

/* renamed from: auwe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class auwe extends aucj implements audy {
    public static final auwe f;
    private static volatile auef g;
    public int a;
    public int b;
    public auxc c;
    public aucs d = aucl.b;
    public aucx e = auei.b;

    static {
        auwe auwe = new auwe();
        f = auwe;
        aucj.a(auwe.class, (aucj) auwe);
    }

    private auwe() {
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
            return aucj.a((audx) f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001\f\u0000\u0002\t\u0001\u0003\u001e\u0004\u001a", new Object[]{"a", "b", auwd.a, "c", "d", avch.b(), "e"});
        } else if (i2 == 3) {
            return new auwe();
        } else {
            if (i2 == 4) {
                return new aucd((char[][]) null, (float[][][]) null);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (auwe.class) {
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
