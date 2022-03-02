package defpackage;

/* renamed from: aull  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aull extends aucj implements audy {
    public static final aull e;
    private static volatile auef g;
    public aucx a = auei.b;
    public aumr b;
    public int c;
    public long d;
    private int f;

    static {
        aull aull = new aull();
        e = aull;
        aucj.a(aull.class, (aucj) aull);
    }

    private aull() {
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
            return aucj.a((audx) e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001b\u0002\t\u0000\u0003\f\u0001\u0004\u0002\u0002", new Object[]{"f", "a", aukc.class, "b", "c", aulj.a, "d"});
        } else if (i2 == 3) {
            return new aull();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (aull.class) {
                    auef = g;
                    if (auef == null) {
                        auef = new auce(e);
                        g = auef;
                    }
                }
            }
            return auef;
        }
    }
}
