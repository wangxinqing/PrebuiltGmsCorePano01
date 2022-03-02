package defpackage;

/* renamed from: atyz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atyz extends aucj implements audy {
    public static final atyz g;
    private static volatile auef h;
    public int a;
    public atyh b;
    public String c = "";
    public aucs d = aucl.b;
    public atzv e;
    public aucx f = auei.b;

    static {
        atyz atyz = new atyz();
        g = atyz;
        aucj.a(atyz.class, (aucj) atyz);
    }

    private atyz() {
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
            return aucj.a((audx) g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0002\u0000\u0001\u0016\u0002\t\u0003\u0004\t\u0000\u0005\b\u0001\u0006\u001b", new Object[]{"a", "d", "e", "b", "c", "f", atyt.class});
        } else if (i2 == 3) {
            return new atyz();
        } else {
            if (i2 == 4) {
                return new atyy();
            }
            if (i2 == 5) {
                return g;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (atyz.class) {
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
