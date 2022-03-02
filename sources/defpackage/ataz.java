package defpackage;

/* renamed from: ataz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ataz extends aucj implements audy {
    public static final ataz e;
    private static volatile auef f;
    public int a;
    public int b;
    public String c = "";
    public auay d = auay.b;

    static {
        ataz ataz = new ataz();
        e = ataz;
        aucj.a(ataz.class, (aucj) ataz);
    }

    private ataz() {
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0000\u0002\b\u0001\u0003\n\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new ataz();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (ataz.class) {
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
