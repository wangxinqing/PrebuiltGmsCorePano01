package defpackage;

/* renamed from: atup  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atup extends aucj implements audy {
    public static final atup e;
    public static final auci f;
    private static volatile auef g;
    public int a;
    public aucx b = auei.b;
    public int c;
    public int d;

    static {
        atup atup = new atup();
        e = atup;
        aucj.a(atup.class, (aucj) atup);
        atjm atjm = atjm.a;
        atup atup2 = e;
        f = aucj.a((audx) atjm, (Object) atup2, (audx) atup2, 136068878, aufw.MESSAGE);
    }

    private atup() {
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002\u0004\u0000\u0003\u0004\u0001", new Object[]{"a", "b", atuo.class, "c", "d"});
        } else if (i2 == 3) {
            return new atup();
        } else {
            if (i2 == 4) {
                return new aucd((int[][][]) null, (short[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (atup.class) {
                    auef = g;
                    if (auef == null) {
                        auef = new auce(e);
                        g = auef;
                    }
                }
            }
            return auef;
        }
    }
}
