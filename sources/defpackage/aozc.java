package defpackage;

/* renamed from: aozc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aozc extends aucj implements audy {
    public static final aozc c;
    private static volatile auef d;
    public int a;
    public aucx b = auei.b;

    static {
        aozc aozc = new aozc();
        c = aozc;
        aucj.a(aozc.class, (aucj) aozc);
    }

    private aozc() {
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
            return aucj.a((audx) c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"a", "b", aozb.class});
        } else if (i2 == 3) {
            return new aozc();
        } else {
            if (i2 == 4) {
                return new aucd((short[][][]) null);
            }
            if (i2 == 5) {
                return c;
            }
            auef auef = d;
            if (auef == null) {
                synchronized (aozc.class) {
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
