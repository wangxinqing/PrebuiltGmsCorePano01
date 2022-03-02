package defpackage;

/* renamed from: auxl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class auxl extends aucj implements audy {
    public static final auxl d;
    private static volatile auef e;
    public int a;
    public int b;
    public aucx c = auei.b;

    static {
        auxl auxl = new auxl();
        d = auxl;
        aucj.a(auxl.class, (aucj) auxl);
    }

    private auxl() {
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
            return aucj.a((audx) d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0000\u0001\u0004\u0000\u0003\u001b", new Object[]{"a", "b", "c", auxz.class});
        } else if (i2 == 3) {
            return new auxl();
        } else {
            if (i2 == 4) {
                return new aucd((short[]) null, (char[][]) null);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (auxl.class) {
                    auef = e;
                    if (auef == null) {
                        auef = new auce(d);
                        e = auef;
                    }
                }
            }
            return auef;
        }
    }
}
