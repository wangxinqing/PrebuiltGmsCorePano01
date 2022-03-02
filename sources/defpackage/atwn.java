package defpackage;

/* renamed from: atwn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atwn extends aucj implements audy {
    public static final atwn d;
    private static volatile auef f;
    public int a;
    public String b = "";
    public atvj c;
    private int e;

    static {
        atwn atwn = new atwn();
        d = atwn;
        aucj.a(atwn.class, (aucj) atwn);
    }

    private atwn() {
    }

    public static /* synthetic */ void a(atwn atwn) {
        atwn.a |= 1;
        atwn.e = 10;
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
            return aucj.a((audx) d, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001\u0004\u0000\u0003\b\u0002\u0004\t\u0003", new Object[]{"a", "e", "b", "c"});
        } else if (i2 == 3) {
            return new atwn();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) d);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (atwn.class) {
                    auef = f;
                    if (auef == null) {
                        auef = new auce(d);
                        f = auef;
                    }
                }
            }
            return auef;
        }
    }
}
