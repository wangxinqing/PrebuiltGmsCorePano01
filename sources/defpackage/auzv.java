package defpackage;

/* renamed from: auzv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class auzv extends aucg implements audy {
    public static final auzv x;
    private static volatile auef z;
    public int a;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public auay g = auay.b;
    public String h = "";
    public String i = "";
    public int j;
    public aucx k = auei.b;
    public String l = "";
    public String n = "";
    public auzw o;
    public long p;
    public int q;
    public float r;
    public String s = "";
    public String t = "";
    public String u = "";
    public auay v = auay.b;
    public auzo w;
    private byte y = 2;

    static {
        auzv auzv = new auzv();
        x = auzv;
        aucj.a(auzv.class, (aucj) auzv);
    }

    private auzv() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.y);
        }
        byte b2 = 0;
        if (i3 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.y = b2;
            return null;
        } else if (i3 == 2) {
            return aucj.a((audx) x, "\u0001\u0015\u0000\u0001\u0001\u001c\u0015\u0000\u0001\u0000\u0001\f\u0000\u0002\b\u0001\u0003\b\u0002\u0004\b\u0003\u0005\b\u0004\u0006\n\u0005\u0007\b\u0006\t\b\u0007\u000b\f\t\u000f\b\n\u0010\b\u000b\u0011\t\f\u0012\u0002\r\u0013\f\u000e\u0014\u0001\u000f\u0015\b\u0010\u0017\b\u0012\u0018\u001b\u001a\b\u0014\u001b\n\u0015\u001c\t\u0016", new Object[]{"a", "b", avbx.b(), "c", "d", "e", "f", "g", "h", "i", "j", avca.a, "l", "n", "o", "p", "q", avbe.b(), "r", "s", "t", "k", auzz.class, "u", "v", "w"});
        } else if (i3 == 3) {
            return new auzv();
        } else {
            if (i3 == 4) {
                return new aucf(x);
            }
            if (i3 == 5) {
                return x;
            }
            auef auef = z;
            if (auef == null) {
                synchronized (auzv.class) {
                    auef = z;
                    if (auef == null) {
                        auef = new auce(x);
                        z = auef;
                    }
                }
            }
            return auef;
        }
    }
}
