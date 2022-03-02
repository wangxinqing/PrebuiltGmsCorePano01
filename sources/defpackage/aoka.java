package defpackage;

/* renamed from: aoka  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aoka extends aucj implements audy {
    public static final aoka e;
    private static volatile auef f;
    public int a;
    public aucx b = auei.b;
    public long c;
    public long d;

    static {
        aoka aoka = new aoka();
        e = aoka;
        aucj.a(aoka.class, (aucj) aoka);
    }

    private aoka() {
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002\u0003\u0000\u0003\u0003\u0001", new Object[]{"a", "b", aojz.class, "c", "d"});
        } else if (i2 == 3) {
            return new aoka();
        } else {
            if (i2 == 4) {
                return new aucd((float[][][]) null, (byte[][][]) null);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (aoka.class) {
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
