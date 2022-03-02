package defpackage;

/* renamed from: aelb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aelb extends aucj implements audy {
    public static final aelb a;
    private static volatile auef d;
    private int b;
    private int c;

    static {
        aelb aelb = new aelb();
        a = aelb;
        aucj.a(aelb.class, (aucj) aelb);
    }

    private aelb() {
    }

    public static /* synthetic */ void a(aelb aelb) {
        aelb.b |= 1;
        aelb.c = 300746767;
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
            return aucj.a((audx) a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004\u0000", new Object[]{"b", "c"});
        } else if (i2 == 3) {
            return new aelb();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) a);
            }
            if (i2 == 5) {
                return a;
            }
            auef auef = d;
            if (auef == null) {
                synchronized (aelb.class) {
                    auef = d;
                    if (auef == null) {
                        auef = new auce(a);
                        d = auef;
                    }
                }
            }
            return auef;
        }
    }
}
