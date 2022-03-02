package defpackage;

/* renamed from: atsc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atsc extends aucj implements audy {
    public static final atsc e;
    public static final auci f;
    private static volatile auef h;
    public int a;
    public atpr b;
    public auay c = auay.b;
    public int d;
    private int g;

    static {
        atsc atsc = new atsc();
        e = atsc;
        aucj.a(atsc.class, (aucj) atsc);
        atjm atjm = atjm.a;
        atsc atsc2 = e;
        f = aucj.a((audx) atjm, (Object) atsc2, (audx) atsc2, 111456957, aufw.MESSAGE);
    }

    private atsc() {
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
            return aucj.a((audx) e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0001\u0003\n\u0002\u0004\u0004\u0003", new Object[]{"g", "a", atjv.b(), "b", "c", "d"});
        } else if (i2 == 3) {
            return new atsc();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (atsc.class) {
                    auef = h;
                    if (auef == null) {
                        auef = new auce(e);
                        h = auef;
                    }
                }
            }
            return auef;
        }
    }
}
