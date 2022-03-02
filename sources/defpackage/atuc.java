package defpackage;

/* renamed from: atuc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atuc extends aucj implements audy {
    public static final atuc f;
    public static final auci g;
    private static volatile auef h;
    public int a;
    public String b = "";
    public String c = "";
    public int d;
    public String e = "";

    static {
        atuc atuc = new atuc();
        f = atuc;
        aucj.a(atuc.class, (aucj) atuc);
        atjm atjm = atjm.a;
        atuc atuc2 = f;
        g = aucj.a((audx) atjm, (Object) atuc2, (audx) atuc2, 86288836, aufw.MESSAGE);
    }

    private atuc() {
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
            return aucj.a((audx) f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001\u0003\f\u0002\u0004\b\u0003", new Object[]{"a", "b", "c", "d", atub.a, "e"});
        } else if (i2 == 3) {
            return new atuc();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) f);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (atuc.class) {
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
