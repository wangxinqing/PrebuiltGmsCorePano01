package defpackage;

/* renamed from: ovo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ovo extends aucj implements audy {
    public static final ovo f;
    private static volatile auef g;
    public int a;
    public String b = "";
    public int c = Integer.MAX_VALUE;
    public aucx d = auei.b;
    public int e;

    static {
        ovo ovo = new ovo();
        f = ovo;
        aucj.a(ovo.class, (aucj) ovo);
    }

    private ovo() {
    }

    public static aucd a() {
        return f.o();
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
            return aucj.a((audx) f, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0001\u0000\u0001\b\u0000\u0002\u0004\u0001\u0003\u001b\u0006\u000b\u0002", new Object[]{"a", "b", "c", "d", ovn.class, "e"});
        } else if (i2 == 3) {
            return new ovo();
        } else {
            if (i2 == 4) {
                return new aucd((byte[][]) null, (float[][][]) null);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (ovo.class) {
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
