package defpackage;

/* renamed from: aqxv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqxv extends aucj implements audy {
    public static final aqxv f;
    private static volatile auef g;
    public String a = "";
    public String b = "";
    public int c;
    public boolean d;
    public boolean e;

    static {
        aqxv aqxv = new aqxv();
        f = aqxv;
        aucj.a(aqxv.class, (aucj) aqxv);
    }

    private aqxv() {
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
            return aucj.a((audx) f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0004\u0004\u0007\u0005\u0007", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new aqxv();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) f);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (aqxv.class) {
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
