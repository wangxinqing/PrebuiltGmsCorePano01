package defpackage;

/* renamed from: qjn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qjn extends aucj implements audy {
    public static final qjn f;
    private static volatile auef g;
    public String a = "";
    public String b = "";
    public int c;
    public int d;
    public boolean e;

    static {
        qjn qjn = new qjn();
        f = qjn;
        aucj.a(qjn.class, (aucj) qjn);
    }

    private qjn() {
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
            return aucj.a((audx) f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0004\u0004\u0007\u0005\u0004", new Object[]{"a", "b", "c", "e", "d"});
        } else if (i2 == 3) {
            return new qjn();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) f);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (qjn.class) {
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
