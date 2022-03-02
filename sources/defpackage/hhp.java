package defpackage;

/* renamed from: hhp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hhp extends aucj implements audy {
    public static final hhp f;
    private static volatile auef g;
    public int a;
    public String b = "";
    public long c;
    public aucx d = auei.b;
    public long e;

    static {
        hhp hhp = new hhp();
        f = hhp;
        aucj.a(hhp.class, (aucj) hhp);
    }

    private hhp() {
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
            return aucj.a((audx) f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0000\u0001\b\u0000\u0002\u0002\u0001\u0004\u0002\u0002\u0005\u001b", new Object[]{"a", "b", "c", "e", "d", hho.class});
        } else if (i2 == 3) {
            return new hhp();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) f);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (hhp.class) {
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

    public final void a() {
        if (!this.d.a()) {
            this.d = aucj.a(this.d);
        }
    }
}
