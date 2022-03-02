package defpackage;

/* renamed from: apxn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apxn extends aucj implements audy {
    public static final apxn f;
    private static volatile auef g;
    public int a;
    public int b;
    public String c = "";
    public aucx d;
    public int e;

    static {
        apxn apxn = new apxn();
        f = apxn;
        aucj.a(apxn.class, (aucj) apxn);
    }

    private apxn() {
        auei auei = auei.b;
        this.d = auei.b;
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
            return aucj.a((audx) f, "\u0001\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0001\u0000\u0001\f\u0000\u0002\b\u0001\u0005\u001b\u0007\u0004\u0002", new Object[]{"a", "b", apxm.a, "c", "d", apxp.class, "e"});
        } else if (i2 == 3) {
            return new apxn();
        } else {
            if (i2 == 4) {
                return new apxl();
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (apxn.class) {
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
