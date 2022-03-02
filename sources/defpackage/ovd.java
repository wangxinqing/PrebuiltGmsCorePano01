package defpackage;

/* renamed from: ovd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ovd extends aucj implements audy {
    public static final ovd f;
    private static volatile auef h;
    public int a;
    public int b;
    public int c;
    public long d;
    public long e;
    private int g;

    static {
        ovd ovd = new ovd();
        f = ovd;
        aucj.a(ovd.class, (aucj) ovd);
    }

    private ovd() {
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
            return aucj.a((audx) f, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001\u0004\u0000\u0003\u000b\u0001\u0004\u000b\u0002\u0005\u0003\u0003\u0006\u0003\u0004", new Object[]{"g", "a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new ovd();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) f);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (ovd.class) {
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
