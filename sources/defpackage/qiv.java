package defpackage;

/* renamed from: qiv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qiv extends aucj implements audy {
    public static final qiv g;
    private static volatile auef h;
    public int a = 0;
    public Object b;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";

    static {
        qiv qiv = new qiv();
        g = qiv;
        aucj.a(qiv.class, (aucj) qiv);
    }

    private qiv() {
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
            return aucj.a((audx) g, "\u0000\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȼ\u0000\u0004Ȼ\u0000\u0005Ȼ\u0000\u0006Ȉ\u0007Ȉ\bȻ\u0000", new Object[]{"b", "a", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new qiv();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) g);
            }
            if (i2 == 5) {
                return g;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (qiv.class) {
                    auef = h;
                    if (auef == null) {
                        auef = new auce(g);
                        h = auef;
                    }
                }
            }
            return auef;
        }
    }
}
