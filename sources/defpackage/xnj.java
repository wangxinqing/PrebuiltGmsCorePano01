package defpackage;

/* renamed from: xnj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xnj extends aucj implements audy {
    public static final xnj e;
    private static volatile auef f;
    public int a;
    public int b;
    public String c = "";
    public aucx d = auei.b;

    static {
        xnj xnj = new xnj();
        e = xnj;
        aucj.a(xnj.class, (aucj) xnj);
    }

    private xnj() {
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0004\u0000\u0002\b\u0001\u0003\u001b", new Object[]{"a", "b", "c", "d", xni.class});
        } else if (i2 == 3) {
            return new xnj();
        } else {
            if (i2 == 4) {
                return new aucd((float[][][]) null, (short[][][]) null);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (xnj.class) {
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
