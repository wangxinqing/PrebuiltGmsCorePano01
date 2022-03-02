package defpackage;

/* renamed from: atth  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atth extends aucj implements audy {
    public static final atth d;
    public static final auci e;
    private static volatile auef f;
    public int a;
    public int b;
    public int c;

    static {
        atth atth = new atth();
        d = atth;
        aucj.a(atth.class, (aucj) atth);
        atjm atjm = atjm.a;
        atth atth2 = d;
        e = aucj.a((audx) atjm, (Object) atth2, (audx) atth2, 95555291, aufw.MESSAGE);
    }

    private atth() {
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
            return aucj.a((audx) d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001", new Object[]{"a", "b", atte.b(), "c", attg.b()});
        } else if (i2 == 3) {
            return new atth();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) d);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (atth.class) {
                    auef = f;
                    if (auef == null) {
                        auef = new auce(d);
                        f = auef;
                    }
                }
            }
            return auef;
        }
    }
}
