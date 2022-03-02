package defpackage;

/* renamed from: auyh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class auyh extends aucj implements audy {
    public static final auyh a;
    private static volatile auef g;
    private int b;
    private double c = 4.0d;
    private int d = 1;
    private int e;
    private int f = 500;

    static {
        auyh auyh = new auyh();
        a = auyh;
        aucj.a(auyh.class, (aucj) auyh);
    }

    private auyh() {
    }

    public static /* synthetic */ void a(auyh auyh) {
        auyh.b |= 1;
        auyh.c = 4.0d;
    }

    public static /* synthetic */ void b(auyh auyh) {
        auyh.b |= 2;
        auyh.d = 1;
    }

    public static /* synthetic */ void c(auyh auyh) {
        auyh.b |= 4;
        auyh.e = 0;
    }

    public static /* synthetic */ void d(auyh auyh) {
        auyh.b |= 8;
        auyh.f = 500;
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
            return aucj.a((audx) a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0000\u0000\u0002\u0004\u0001\u0003\u0004\u0002\u0004\u0004\u0003", new Object[]{"b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new auyh();
        } else {
            if (i2 == 4) {
                return new aucd((byte[]) null, (int[][][]) null);
            }
            if (i2 == 5) {
                return a;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (auyh.class) {
                    auef = g;
                    if (auef == null) {
                        auef = new auce(a);
                        g = auef;
                    }
                }
            }
            return auef;
        }
    }
}
