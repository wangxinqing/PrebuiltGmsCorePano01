package defpackage;

/* renamed from: aoio  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aoio extends aucj implements audy {
    public static final aoio f;
    private static volatile auef g;
    public int a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;

    static {
        aoio aoio = new aoio();
        f = aoio;
        aucj.a(aoio.class, (aucj) aoio);
    }

    private aoio() {
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
            return aucj.a((audx) f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0007\u0000\u0002\u0007\u0001\u0003\u0007\u0002\u0004\u0007\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new aoio();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) f);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (aoio.class) {
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
