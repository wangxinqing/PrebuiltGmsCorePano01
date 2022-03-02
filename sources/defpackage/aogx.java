package defpackage;

/* renamed from: aogx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aogx extends aucj implements audy {
    public static final aogx e;
    private static volatile auef f;
    public int a;
    public int b;
    public aogp c;
    public aucx d = auei.b;

    static {
        aogx aogx = new aogx();
        e = aogx;
        aucj.a(aogx.class, (aucj) aogx);
    }

    private aogx() {
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\f\u0000\u0002\t\u0001\u0003\u001b", new Object[]{"a", "b", aogr.b(), "c", "d", aogw.class});
        } else if (i2 == 3) {
            return new aogx();
        } else {
            if (i2 == 4) {
                return new aogo();
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (aogx.class) {
                    auef = f;
                    if (auef == null) {
                        auef = new auce(e);
                        f = auef;
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
