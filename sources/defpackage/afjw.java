package defpackage;

/* renamed from: afjw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afjw extends aucj implements audy {
    public static final afjw f;
    private static volatile auef h;
    public int a;
    public String b = "";
    public String c = "";
    public int d;
    public String e = "";
    private int g;

    static {
        afjw afjw = new afjw();
        f = afjw;
        aucj.a(afjw.class, (aucj) afjw);
    }

    private afjw() {
        auei auei = auei.b;
    }

    public static /* synthetic */ void a(afjw afjw) {
        afjw.a |= 4;
        afjw.g = 0;
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
            return aucj.a((audx) f, "\u0001\u0005\u0000\u0001\u0002\u000f\u0005\u0000\u0000\u0000\u0002\b\u0001\u0004\u0004\u0002\u0005\b\u0004\u0007\b\u0000\u000f\f\u0003", new Object[]{"a", "c", "g", "e", "b", "d", afjv.a});
        } else if (i2 == 3) {
            return new afjw();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) f);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (afjw.class) {
                    auef = h;
                    if (auef == null) {
                        auef = new auce(f);
                        h = auef;
                    }
                }
            }
            return auef;
        }
    }
}
