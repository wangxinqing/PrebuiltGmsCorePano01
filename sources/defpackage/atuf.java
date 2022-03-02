package defpackage;

/* renamed from: atuf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atuf extends aucj implements audy {
    public static final atuf c;
    public static final auci d;
    private static volatile auef e;
    public int a;
    public int b;

    static {
        atuf atuf = new atuf();
        c = atuf;
        aucj.a(atuf.class, (aucj) atuf);
        atjm atjm = atjm.a;
        atuf atuf2 = c;
        d = aucj.a((audx) atjm, (Object) atuf2, (audx) atuf2, 79284926, aufw.MESSAGE);
    }

    private atuf() {
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
            return aucj.a((audx) c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f\u0000", new Object[]{"a", "b", atud.a});
        } else if (i2 == 3) {
            return new atuf();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) c);
            }
            if (i2 == 5) {
                return c;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (atuf.class) {
                    auef = e;
                    if (auef == null) {
                        auef = new auce(c);
                        e = auef;
                    }
                }
            }
            return auef;
        }
    }
}
