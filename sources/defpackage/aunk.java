package defpackage;

/* renamed from: aunk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aunk extends aucj implements audy {
    public static final aunk e;
    private static volatile auef f;
    public int a;
    public aumr b;
    public aukl c;
    public aucx d = auei.b;

    static {
        aunk aunk = new aunk();
        e = aunk;
        aucj.a(aunk.class, (aucj) aunk);
    }

    private aunk() {
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0001\u0000\u0001\t\u0000\u0004\t\u0002\u0005\u001b", new Object[]{"a", "b", "c", "d", aunj.class});
        } else if (i2 == 3) {
            return new aunk();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (aunk.class) {
                    auef = f;
                    if (auef == null) {
                        auef = new auce(e);
                        f = auef;
                    }
                }
            }
            return auef;
        }
    }
}
