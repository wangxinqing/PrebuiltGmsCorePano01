package defpackage;

/* renamed from: xsg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xsg extends aucj implements audy {
    public static final xsg f;
    private static volatile auef g;
    public int a;
    public boolean b;
    public String c = "";
    public aucs d = aucl.b;
    public xsf e;

    static {
        xsg xsg = new xsg();
        f = xsg;
        aucj.a(xsg.class, (aucj) xsg);
    }

    private xsg() {
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
            return aucj.a((audx) f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\b\u0001\u0002\u0016\u0003\u0007\u0000\u0004\t\u0002", new Object[]{"a", "c", "d", "b", "e"});
        } else if (i2 == 3) {
            return new xsg();
        } else {
            if (i2 == 4) {
                return new aucd((char[][]) null, (int[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (xsg.class) {
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
