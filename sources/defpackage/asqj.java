package defpackage;

/* renamed from: asqj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class asqj extends aucj implements audy {
    public static final auct n = new asqi();
    public static final asqj q;
    private static volatile auef r;
    public long a;
    public String b = "";
    public String c = "";
    public int d;
    public float e;
    public asqg f;
    public int g;
    public int h;
    public avan i;
    public boolean j;
    public boolean k;
    public String l = "";
    public aucs m = aucl.b;
    public int o;
    public asqh p;

    static {
        asqj asqj = new asqj();
        q = asqj;
        aucj.a(asqj.class, (aucj) asqj);
    }

    private asqj() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 1) {
            return null;
        }
        if (i3 == 2) {
            return aucj.a((audx) q, "\u0000\u000f\u0000\u0000\u0001\u0017\u000f\u0000\u0001\u0000\u0001\u0002\u0005Ȉ\u0006Ȉ\u0007\u0004\b\u0001\t\t\r\f\u000e\f\u000f\t\u0010\u0007\u0012\u0007\u0013Ȉ\u0014,\u0016\f\u0017\t", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "o", "p"});
        } else if (i3 == 3) {
            return new asqj();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) q);
            }
            if (i3 == 5) {
                return q;
            }
            auef auef = r;
            if (auef == null) {
                synchronized (asqj.class) {
                    auef = r;
                    if (auef == null) {
                        auef = new auce(q);
                        r = auef;
                    }
                }
            }
            return auef;
        }
    }
}
