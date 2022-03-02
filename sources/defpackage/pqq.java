package defpackage;

/* renamed from: pqq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pqq extends aucj implements audy {
    public static final pqq g;
    private static volatile auef i;
    public String a = "";
    public boolean b;
    public boolean c;
    public boolean d;
    public double e;
    public aucx f = auei.b;
    private int h;

    static {
        pqq pqq = new pqq();
        g = pqq;
        aucj.a(pqq.class, (aucj) pqq);
    }

    private pqq() {
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
            return aucj.a((audx) g, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0001\u0000\u0001\b\u0000\u0003\u0007\u0002\u0004\u0000\u0005\u0006\u0007\u0003\u0007\u001b\b\u0007\u0004", new Object[]{"h", "a", "b", "e", "c", "f", pqp.class, "d"});
        } else if (i3 == 3) {
            return new pqq();
        } else {
            if (i3 == 4) {
                return new aucd((boolean[][][]) null, (byte[][]) null);
            }
            if (i3 == 5) {
                return g;
            }
            auef auef = i;
            if (auef == null) {
                synchronized (pqq.class) {
                    auef = i;
                    if (auef == null) {
                        auef = new auce(g);
                        i = auef;
                    }
                }
            }
            return auef;
        }
    }
}
