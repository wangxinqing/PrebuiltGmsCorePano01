package defpackage;

/* renamed from: auxc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class auxc extends aucj implements audy {
    public static final auxc h;
    private static volatile auef i;
    public int a;
    public int b;
    public int c;
    public long d;
    public auxs e;
    public auxu f;
    public aucv g = audl.b;

    static {
        auxc auxc = new auxc();
        h = auxc;
        aucj.a(auxc.class, (aucj) auxc);
    }

    private auxc() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 1) {
            return null;
        }
        if (i3 == 2) {
            return aucj.a((audx) h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\f\u0000\u0002\u0004\u0001\u0003\u0002\u0002\u0004\t\u0003\u0005\t\u0004\u0006\u0014", new Object[]{"a", "b", auxb.a, "c", "d", "e", "f", "g"});
        } else if (i3 == 3) {
            return new auxc();
        } else {
            if (i3 == 4) {
                return new aucd((int[][]) null, (boolean[]) null);
            }
            if (i3 == 5) {
                return h;
            }
            auef auef = i;
            if (auef == null) {
                synchronized (auxc.class) {
                    auef = i;
                    if (auef == null) {
                        auef = new auce(h);
                        i = auef;
                    }
                }
            }
            return auef;
        }
    }
}
