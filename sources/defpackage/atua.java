package defpackage;

/* renamed from: atua  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atua extends aucj implements audy {
    public static final atua b;
    public static final auci c;
    private static volatile auef e;
    public int a;
    private int d;

    static {
        atua atua = new atua();
        b = atua;
        aucj.a(atua.class, (aucj) atua);
        atjm atjm = atjm.a;
        atua atua2 = b;
        c = aucj.a((audx) atjm, (Object) atua2, (audx) atua2, 125695875, aufw.MESSAGE);
    }

    private atua() {
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
            return aucj.a((audx) b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f\u0000", new Object[]{"d", "a", atty.a});
        } else if (i2 == 3) {
            return new atua();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) b);
            }
            if (i2 == 5) {
                return b;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (atua.class) {
                    auef = e;
                    if (auef == null) {
                        auef = new auce(b);
                        e = auef;
                    }
                }
            }
            return auef;
        }
    }
}
