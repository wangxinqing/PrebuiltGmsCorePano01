package defpackage;

/* renamed from: avrg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avrg extends aucj implements audy {
    public static final avrg e;
    private static volatile auef f;
    public int a;
    public long b;
    public long c;
    public boolean d;

    static {
        avrg avrg = new avrg();
        e = avrg;
        aucj.a(avrg.class, (aucj) avrg);
    }

    private avrg() {
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0002\u0001\u0002\u0007\u0002\u0003\u0002\u0000", new Object[]{"a", "c", "d", "b"});
        } else if (i2 == 3) {
            return new avrg();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (avrg.class) {
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
