package defpackage;

/* renamed from: asgd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class asgd extends aucg implements audy {
    public static final asgd e;
    private static volatile auef g;
    public int a;
    public int b;
    public asff c;
    public asev d;
    private byte f = 2;

    static {
        asgd asgd = new asgd();
        e = asgd;
        aucj.a(asgd.class, (aucj) asgd);
    }

    private asgd() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        byte b2 = 0;
        if (i2 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.f = b2;
            return null;
        } else if (i2 == 2) {
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0001\u0001\f\u0000\u0004\t\u0001\u0005Љ\u0002", new Object[]{"a", "b", asge.a, "c", "d"});
        } else if (i2 == 3) {
            return new asgd();
        } else {
            if (i2 == 4) {
                return new aucf(e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (asgd.class) {
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
