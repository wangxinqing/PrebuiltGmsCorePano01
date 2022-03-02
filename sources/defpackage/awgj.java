package defpackage;

/* renamed from: awgj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awgj extends aucj implements audy {
    public static final awgj e;
    private static volatile auef f;
    public awgo a;
    public String b = "";
    public String c;
    public String d;

    static {
        awgj awgj = new awgj();
        e = awgj;
        aucj.a(awgj.class, (aucj) awgj);
    }

    private awgj() {
        auay auay = auay.b;
        this.c = "";
        this.d = "";
        aucl aucl = aucl.b;
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
            return aucj.a((audx) e, "\u0000\u0004\u0000\u0000\u0001\b\u0004\u0000\u0000\u0000\u0001\t\u0003Ȉ\u0007Ȉ\bȈ", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new awgj();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (awgj.class) {
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
}
