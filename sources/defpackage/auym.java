package defpackage;

/* renamed from: auym  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class auym extends aucj implements audy {
    public static final auym e;
    private static volatile auef g;
    public int a;
    public int b;
    public int c;
    public int d;
    private long f;

    static {
        auym auym = new auym();
        e = auym;
        aucj.a(auym.class, (aucj) auym);
    }

    private auym() {
    }

    public static /* synthetic */ void a(auym auym) {
        auym.a |= 1;
        auym.f = 3000;
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
            return aucj.a((audx) e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0002\u0000\u0002\f\u0001\u0003\f\u0002\u0004\f\u0003", new Object[]{"a", "f", "b", avax.a, "c", avax.a, "d", avax.a});
        } else if (i2 == 3) {
            return new auym();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (auym.class) {
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
