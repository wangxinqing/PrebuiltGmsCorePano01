package defpackage;

/* renamed from: aupl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aupl extends aucj implements audy {
    public static final aupl c;
    private static volatile auef e;
    public boolean a;
    public boolean b;
    private int d;

    static {
        aupl aupl = new aupl();
        c = aupl;
        aucj.a(aupl.class, (aucj) aupl);
    }

    private aupl() {
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
            return aucj.a((audx) c, "\u0001\u0002\u0000\u0001\u000f\u0010\u0002\u0000\u0000\u0000\u000f\u0007\u0003\u0010\u0007\u0004", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new aupl();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) c);
            }
            if (i2 == 5) {
                return c;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (aupl.class) {
                    auef = e;
                    if (auef == null) {
                        auef = new auce(c);
                        e = auef;
                    }
                }
            }
            return auef;
        }
    }
}
