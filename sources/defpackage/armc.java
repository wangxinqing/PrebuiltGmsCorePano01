package defpackage;

/* renamed from: armc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class armc extends aucj implements audy {
    public static final armc f;
    private static volatile auef g;
    public int a;
    public int b;
    public int c;
    public aucx d = auei.b;
    public aucx e = auei.b;

    static {
        armc armc = new armc();
        f = armc;
        aucj.a(armc.class, (aucj) armc);
    }

    private armc() {
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
            return aucj.a((audx) f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001\f\u0000\u0002\f\u0001\u0003\u001b\u0004\u001b", new Object[]{"a", "b", armb.a, "c", arlz.a, "d", arme.class, "e", arly.class});
        } else if (i2 == 3) {
            return new armc();
        } else {
            if (i2 == 4) {
                return new aucd((char[]) null, (boolean[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (armc.class) {
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
