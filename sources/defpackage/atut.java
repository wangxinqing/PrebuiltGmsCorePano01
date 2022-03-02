package defpackage;

/* renamed from: atut  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atut extends aucj implements audy {
    public static final atut f;
    public static final auci g;
    private static volatile auef h;
    public int a;
    public double b;
    public double c;
    public double d;
    public double e;

    static {
        atut atut = new atut();
        f = atut;
        aucj.a(atut.class, (aucj) atut);
        atjm atjm = atjm.a;
        atut atut2 = f;
        g = aucj.a((audx) atjm, (Object) atut2, (audx) atut2, 148135292, aufw.MESSAGE);
    }

    private atut() {
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
            return aucj.a((audx) f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0000\u0000\u0002\u0000\u0001\u0003\u0000\u0002\u0004\u0000\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new atut();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) f);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (atut.class) {
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
