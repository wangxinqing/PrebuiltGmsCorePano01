package defpackage;

/* renamed from: asfa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class asfa extends aucj implements audy {
    public static final auct e = new asez();
    public static final asfa f;
    private static volatile auef g;
    public int a;
    public int b;
    public int c;
    public aucs d = aucl.b;

    static {
        asfa asfa = new asfa();
        f = asfa;
        aucj.a(asfa.class, (aucj) asfa);
    }

    private asfa() {
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
            return aucj.a((audx) f, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\f\u0000\u0002\f\u0001\u0003\u001e", new Object[]{"a", "b", asfd.a, "c", aseu.b(), "d", asey.b()});
        } else if (i2 == 3) {
            return new asfa();
        } else {
            if (i2 == 4) {
                return new aucd((char[]) null, (boolean[]) null);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (asfa.class) {
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
