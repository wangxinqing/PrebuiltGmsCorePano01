package defpackage;

/* renamed from: avrb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avrb extends aucg implements audy {
    public static final avrb C;
    private static volatile auef E;
    public String A = "";
    public int B;
    private byte D = 2;
    public int a;
    public long b;
    public String c = "";
    public int d;
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";
    public String i = "";
    public String j = "";
    public String k = "";
    public String l = "";
    public String n = "";
    public String o = "";
    public String p = "";
    public String q = "";
    public String r = "";
    public String s = "";
    public int t;
    public aedz u;
    public boolean v;
    public int w;
    public avrc x;
    public anoc y;
    public String z = "";

    static {
        avrb avrb = new avrb();
        C = avrb;
        aucj.a(avrb.class, (aucj) avrb);
    }

    private avrb() {
        auei auei = auei.b;
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.D);
        }
        byte b2 = 0;
        if (i3 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.D = b2;
            return null;
        } else if (i3 == 2) {
            return aucj.a((audx) C, "\u0001\u001a\u0000\u0001\u0001!\u001a\u0000\u0000\u0000\u0001\u0002\u0000\u0002\b\u0001\u0003\u0004\u0003\u0004\b\u0004\u0005\b\u0005\u0006\b\b\u0007\b\t\b\b\u0006\t\b\u0007\n\b\n\u000b\b\u000b\f\b\f\r\b\r\u000e\b\u000e\u000f\b\u000f\u0010\b\u0010\u0011\b\u0011\u0013\u0004\u0012\u0014\u0007\u0014\u0017\f\u0016\u0018\t\u0017\u0019\t\u0018\u001a\b\u0019\u001b\b\u001a \t\u0013!\u0004\u001c", new Object[]{"a", "b", "c", "d", "e", "f", "i", "j", "g", "h", "k", "l", "n", "o", "p", "q", "r", "s", "t", "v", "w", avsj.a, "x", "y", "z", "A", "u", "B"});
        } else if (i3 == 3) {
            return new avrb();
        } else {
            if (i3 == 4) {
                return new aucf(C);
            }
            if (i3 == 5) {
                return C;
            }
            auef auef = E;
            if (auef == null) {
                synchronized (avrb.class) {
                    auef = E;
                    if (auef == null) {
                        auef = new auce(C);
                        E = auef;
                    }
                }
            }
            return auef;
        }
    }
}
