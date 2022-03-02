package defpackage;

/* renamed from: areu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class areu extends aucj implements audy {
    public static final areu f;
    private static volatile auef g;
    public int a;
    public aucx b = auei.b;
    public long c;
    public long d;
    public int e;

    static {
        areu areu = new areu();
        f = areu;
        aucj.a(areu.class, (aucj) areu);
    }

    private areu() {
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
            return aucj.a((audx) f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001b\u0002\u0002\u0000\u0003\u0002\u0001\u0004\u0004\u0002", new Object[]{"a", "b", aret.class, "c", "d", "e"});
        } else if (i2 == 3) {
            return new areu();
        } else {
            if (i2 == 4) {
                return new aucd((int[][][]) null, (float[][]) null);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (areu.class) {
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
