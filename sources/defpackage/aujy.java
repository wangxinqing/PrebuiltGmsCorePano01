package defpackage;

/* renamed from: aujy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aujy extends aucj implements audy {
    public static final aujy f;
    private static volatile auef h;
    public int a = 0;
    public Object b;
    public int c;
    public aumt d;
    public int e = 30;
    private int g;

    static {
        aujy aujy = new aujy();
        f = aujy;
        aucj.a(aujy.class, (aucj) aujy);
    }

    private aujy() {
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
            return aucj.a((audx) f, "\u0001\u0007\u0001\u0001\u0001\b\u0007\u0000\u0000\u0000\u0001;\u0000\u0002;\u0000\u0003\f\u0004\u0004<\u0000\u0005<\u0000\u0007\t\u0005\b\u000b\u0006", new Object[]{"b", "a", "g", "c", aujx.b(), aulw.class, aulw.class, "d", "e"});
        } else if (i2 == 3) {
            return new aujy();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) f);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (aujy.class) {
                    auef = h;
                    if (auef == null) {
                        auef = new auce(f);
                        h = auef;
                    }
                }
            }
            return auef;
        }
    }
}
