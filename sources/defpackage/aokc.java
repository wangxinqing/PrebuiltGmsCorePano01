package defpackage;

/* renamed from: aokc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aokc extends aucj implements audy {
    public static final aokc g;
    private static volatile auef h;
    public int a;
    public aucx b = auei.b;
    public aucv c = audl.b;
    public aucv d = audl.b;
    public long e;
    public long f;

    static {
        aokc aokc = new aokc();
        g = aokc;
        aucj.a(aokc.class, (aucj) aokc);
    }

    private aokc() {
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
            return aucj.a((audx) g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0003\u0000\u0001\u001b\u0002\u0015\u0003\u0015\u0004\u0003\u0000\u0005\u0003\u0001", new Object[]{"a", "b", aojg.class, "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new aokc();
        } else {
            if (i2 == 4) {
                return new aucd((char[][][]) null, (float[][]) null);
            }
            if (i2 == 5) {
                return g;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (aokc.class) {
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
