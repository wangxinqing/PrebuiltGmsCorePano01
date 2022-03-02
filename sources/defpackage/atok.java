package defpackage;

/* renamed from: atok  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atok extends aucj implements audy {
    public static final atok e;
    private static volatile auef f;
    public int a;
    public String b = "";
    public String c = "";
    public aucx d = auei.b;

    static {
        atok atok = new atok();
        e = atok;
        aucj.a(atok.class, (aucj) atok);
    }

    private atok() {
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001\b\u0000\u0002\b\u0001\u0004\u001b", new Object[]{"a", "b", "c", "d", atoo.class});
        } else if (i2 == 3) {
            return new atok();
        } else {
            if (i2 == 4) {
                return new aucd((short[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (atok.class) {
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
