package defpackage;

/* renamed from: anqx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anqx extends aucj implements audy {
    public static final anqx k;
    private static volatile auef l;
    public int a;
    public float b;
    public String c = "";
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;

    static {
        anqx anqx = new anqx();
        k = anqx;
        aucj.a(anqx.class, (aucj) anqx);
    }

    private anqx() {
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
            return aucj.a((audx) k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001\u0001\u0000\u0002\b\u0001\u0003\f\u0002\u0004\f\u0003\u0005\f\u0004\u0006\f\u0005\u0007\f\u0006\b\f\u0007\t\f\b", new Object[]{"a", "b", "c", "d", anqp.a, "e", anqr.a, "f", anqv.a, "g", anqt.a, "h", anql.a, "i", anqj.a, "j", anqn.a});
        } else if (i3 == 3) {
            return new anqx();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) k);
            }
            if (i3 == 5) {
                return k;
            }
            auef auef = l;
            if (auef == null) {
                synchronized (anqx.class) {
                    auef = l;
                    if (auef == null) {
                        auef = new auce(k);
                        l = auef;
                    }
                }
            }
            return auef;
        }
    }
}
