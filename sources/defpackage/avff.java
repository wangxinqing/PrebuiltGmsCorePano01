package defpackage;

/* renamed from: avff  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avff extends aucj implements audy {
    public static final avff e;
    public static final auci f;
    private static volatile auef g;
    public int a;
    public avfe b;
    public avge c;
    public avgt d;

    static {
        avff avff = new avff();
        e = avff;
        aucj.a(avff.class, (aucj) avff);
        amdy amdy = amdy.a;
        avff avff2 = e;
        f = aucj.a((audx) amdy, (Object) avff2, (audx) avff2, 90015708, aufw.MESSAGE);
    }

    private avff() {
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001\u0003\t\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new avff();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (avff.class) {
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
