package defpackage;

/* renamed from: aolh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aolh extends aucj implements audy {
    public static final aolh f;
    private static volatile auef g;
    public int a;
    public aucx b = auei.b;
    public aucx c = auei.b;
    public aucx d = auei.b;
    public long e;

    static {
        aolh aolh = new aolh();
        f = aolh;
        aucj.a(aolh.class, (aucj) aolh);
    }

    private aolh() {
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
            return aucj.a((audx) f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0003\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004\u0002\u0000", new Object[]{"a", "b", aolf.class, "c", aole.class, "d", aold.class, "e"});
        } else if (i2 == 3) {
            return new aolh();
        } else {
            if (i2 == 4) {
                return new aucd((float[][][]) null, (int[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (aolh.class) {
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
