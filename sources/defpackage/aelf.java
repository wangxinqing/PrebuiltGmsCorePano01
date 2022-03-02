package defpackage;

/* renamed from: aelf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aelf extends aucj implements audy {
    public static final aelf c;
    private static volatile auef d;
    public int a;
    public auay b = auay.b;

    static {
        aelf aelf = new aelf();
        c = aelf;
        aucj.a(aelf.class, (aucj) aelf);
    }

    private aelf() {
        auay auay = auay.b;
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
            return aucj.a((audx) c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\n\u0001", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new aelf();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) c);
            }
            if (i2 == 5) {
                return c;
            }
            auef auef = d;
            if (auef == null) {
                synchronized (aelf.class) {
                    auef = d;
                    if (auef == null) {
                        auef = new auce(c);
                        d = auef;
                    }
                }
            }
            return auef;
        }
    }
}
