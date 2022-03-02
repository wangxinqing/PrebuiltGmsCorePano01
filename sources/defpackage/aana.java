package defpackage;

/* renamed from: aana  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aana extends aucj implements audy {
    public static final aana e;
    private static volatile auef g;
    public aucx a = auei.b;
    public long b;
    public boolean c;
    public int d;
    private int f;

    static {
        aana aana = new aana();
        e = aana;
        aucj.a(aana.class, (aucj) aana);
    }

    private aana() {
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
            return aucj.a((audx) e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001b\u0002\u0002\u0000\u0003\u0007\u0001\u0004\u0004\u0002", new Object[]{"f", "a", aamz.class, "b", "c", "d"});
        } else if (i2 == 3) {
            return new aana();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (aana.class) {
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
