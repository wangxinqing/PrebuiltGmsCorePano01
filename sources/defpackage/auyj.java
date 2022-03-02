package defpackage;

/* renamed from: auyj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class auyj extends aucj implements audy {
    public static final auyj a;
    private static volatile auef f;
    private int b;
    private int c;
    private int d = 150;
    private double e = 1.5d;

    static {
        auyj auyj = new auyj();
        a = auyj;
        aucj.a(auyj.class, (aucj) auyj);
    }

    private auyj() {
    }

    public static /* synthetic */ void a(auyj auyj) {
        auyj.b |= 1;
        auyj.c = 0;
    }

    public static /* synthetic */ void b(auyj auyj) {
        auyj.b |= 2;
        auyj.d = 150;
    }

    public static /* synthetic */ void c(auyj auyj) {
        auyj.b |= 4;
        auyj.e = 1.5d;
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
            return aucj.a((audx) a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0004\u0001\u0003\u0000\u0002", new Object[]{"b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new auyj();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) a);
            }
            if (i2 == 5) {
                return a;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (auyj.class) {
                    auef = f;
                    if (auef == null) {
                        auef = new auce(a);
                        f = auef;
                    }
                }
            }
            return auef;
        }
    }
}
