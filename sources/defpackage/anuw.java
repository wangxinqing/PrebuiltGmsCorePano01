package defpackage;

/* renamed from: anuw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anuw extends aucj implements audy {
    public static final anuw f;
    private static volatile auef g;
    public int a;
    public long b;
    public String c = "";
    public String d = "";
    public long e;

    static {
        anuw anuw = new anuw();
        f = anuw;
        aucj.a(anuw.class, (aucj) anuw);
    }

    private anuw() {
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
            return aucj.a((audx) f, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0000\u0002\u0002\u0001\u0003\b\u0002\u0004\b\u0003\u0005\u0002\u0004", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new anuw();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) f);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (anuw.class) {
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
}
