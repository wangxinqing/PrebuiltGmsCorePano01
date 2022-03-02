package defpackage;

/* renamed from: uaj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uaj extends aucj implements audy {
    public static final uaj K;
    private static volatile auef L;
    public String A = "";
    public int B;
    public aucx C = auei.b;
    public long D;
    public int E;
    public auay F = auay.b;
    public String G = "";
    public auay H = auay.b;
    public auzo I;
    public asqh J;
    public int a;
    public int b;
    public String c = "";
    public int d;
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";
    public String i = "";
    public String j = "";
    public long k;
    public long l;
    public int m;
    public int n;
    public long o;
    public int p;
    public int q;
    public String r = "";
    public String s = "";
    public long t;
    public int u;
    public String v = "";
    public float w;
    public String x = "";
    public String y = "";
    public auay z = auay.b;

    static {
        uaj uaj = new uaj();
        K = uaj;
        aucj.a(uaj.class, (aucj) uaj);
    }

    private uaj() {
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
            return aucj.a((audx) K, "\u0001\"\u0000\u0002\u0001/\"\u0000\u0001\u0000\u0001\b\u0000\u0002\f\u0001\u0004\b\u0002\u0005\b\u0003\u0006\b\u0004\u0007\b\u0005\b\b\u0006\t\b\u0007\n\u0002\b\u000b\u0002\t\u0011\f\n\u0013\f\u000b\u0014\u0002\f\u0016\u0004\r\u0017\u0004\u000e\u0019\b\u000f\u001a\b\u0010\u001c\u0002\u0011\u001d\f\u0012\u001e\b\u0013\u001f\u0001\u0014 \b\u0015\"\b\u0016$\n\u0017%\b\u0018&\f\u0019(\u001b)\u0002\u001a*\f\u001b+\n\u001c,\b\u001d-\n\u001e.\t\u001f/\t ", new Object[]{"a", "b", "c", "d", avbx.b(), "e", "f", "g", "h", "i", "j", "k", "l", "m", uah.a, "n", avca.a, "o", "p", "q", "r", "s", "t", "u", avbe.b(), "v", "w", "x", "y", "z", "A", "B", uad.a, "C", uak.class, "D", "E", uaf.a, "F", "G", "H", "I", "J"});
        } else if (i3 == 3) {
            return new uaj();
        } else {
            if (i3 == 4) {
                return new aucd((float[]) null, (short[]) null, (byte[]) null);
            }
            if (i3 == 5) {
                return K;
            }
            auef auef = L;
            if (auef == null) {
                synchronized (uaj.class) {
                    auef = L;
                    if (auef == null) {
                        auef = new auce(K);
                        L = auef;
                    }
                }
            }
            return auef;
        }
    }

    public final void a() {
        if (!this.C.a()) {
            this.C = aucj.a(this.C);
        }
    }
}
