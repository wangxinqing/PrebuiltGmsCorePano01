package defpackage;

/* renamed from: aujq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aujq extends aucj implements audy {
    public static final aujq f;
    private static volatile auef g;
    public int a;
    public int b = 0;
    public Object c;
    public boolean d;
    public long e;

    static {
        aujq aujq = new aujq();
        f = aujq;
        aucj.a(aujq.class, (aucj) aujq);
    }

    private aujq() {
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
            return aucj.a((audx) f, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003\u0007\u0002\u0004\u0002\u0003", new Object[]{"c", "b", "a", aujp.class, aujo.class, "d", "e"});
        } else if (i2 == 3) {
            return new aujq();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) f);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (aujq.class) {
                    auef = g;
                    if (auef == null) {
                        auef = new auce(f);
                        g = auef;
                    }
                }
            }
            return auef;
        }
    }
}
