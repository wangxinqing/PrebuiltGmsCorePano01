package defpackage;

/* renamed from: atvj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atvj extends aucj implements audy {
    public static final atvj e;
    private static volatile auef g;
    public int a;
    public int b;
    public String c = "";
    public String d = "";
    private int f;

    static {
        atvj atvj = new atvj();
        e = atvj;
        aucj.a(atvj.class, (aucj) atvj);
    }

    private atvj() {
    }

    public static /* synthetic */ void a(atvj atvj) {
        atvj.a |= 8;
        atvj.f = 0;
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
            return aucj.a((audx) e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0000\u0002\b\u0001\u0003\b\u0002\u0004\u0004\u0003", new Object[]{"a", "b", atxg.a, "c", "d", "f"});
        } else if (i2 == 3) {
            return new atvj();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (atvj.class) {
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
