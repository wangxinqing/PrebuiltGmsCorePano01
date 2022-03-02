package defpackage;

/* renamed from: anuf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anuf extends aucj implements audy {
    public static final anuf e;
    private static volatile auef f;
    public int a;
    public aucx b = auei.b;
    public boolean c;
    public boolean d;

    static {
        anuf anuf = new anuf();
        e = anuf;
        aucj.a(anuf.class, (aucj) anuf);
    }

    private anuf() {
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001\u001b\u0003\u0007\u0000\u0004\u0007\u0001", new Object[]{"a", "b", anud.class, "c", "d"});
        } else if (i2 == 3) {
            return new anuf();
        } else {
            if (i2 == 4) {
                return new anue();
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (anuf.class) {
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
