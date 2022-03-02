package defpackage;

/* renamed from: astv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class astv extends aucj implements audy {
    public static final astv f;
    private static volatile auef g;
    public int a;
    public long b;
    public aucx c = auei.b;
    public aucx d = auei.b;
    public astj e;

    static {
        astv astv = new astv();
        f = astv;
        aucj.a(astv.class, (aucj) astv);
    }

    private astv() {
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
            return aucj.a((audx) f, "\u0001\u0004\u0000\u0001\u0003\u0006\u0004\u0000\u0002\u0000\u0003\u0005\u0002\u0004\u001b\u0005\u001b\u0006\t\u0003", new Object[]{"a", "b", "c", astu.class, "d", astm.class, "e"});
        } else if (i2 == 3) {
            return new astv();
        } else {
            if (i2 == 4) {
                return new aucd((boolean[]) null, (char[][][]) null);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (astv.class) {
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
