package defpackage;

/* renamed from: aqsr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqsr extends aucj implements audy {
    public static final aqsr d;
    private static volatile auef e;
    public int a;
    public int b;
    public audr c = audr.b;

    static {
        aqsr aqsr = new aqsr();
        d = aqsr;
        aucj.a(aqsr.class, (aucj) aqsr);
    }

    private aqsr() {
    }

    public final audr a() {
        audr audr = this.c;
        if (!audr.a) {
            this.c = audr.a();
        }
        return this.c;
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
            return aucj.a((audx) d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0004\u0000\u00022", new Object[]{"a", "b", "c", aqsq.a});
        } else if (i2 == 3) {
            return new aqsr();
        } else {
            if (i2 == 4) {
                return new aqsp();
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (aqsr.class) {
                    auef = e;
                    if (auef == null) {
                        auef = new auce(d);
                        e = auef;
                    }
                }
            }
            return auef;
        }
    }
}
