package defpackage;

/* renamed from: cma  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cma extends aucj implements audy {
    public static final cma h;
    private static volatile auef i;
    public int a = 0;
    public Object b;
    public long c;
    public long d;
    public cly e;
    public aucx f = auei.b;
    public int g;

    static {
        cma cma = new cma();
        h = cma;
        aucj.a(cma.class, (aucj) cma);
    }

    private cma() {
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
            return aucj.a((audx) h, "\u0000\u0007\u0001\u0000\u0001\t\u0007\u0000\u0001\u0000\u0001\t\u00027\u0000\u0003\u001b\u0004\u0002\u0006Ȼ\u0000\b\u0002\t\f", new Object[]{"b", "a", "e", "f", clz.class, "c", "d", "g"});
        } else if (i3 == 3) {
            return new cma();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) h);
            }
            if (i3 == 5) {
                return h;
            }
            auef auef = i;
            if (auef == null) {
                synchronized (cma.class) {
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
