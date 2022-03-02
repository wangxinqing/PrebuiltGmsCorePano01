package defpackage;

/* renamed from: aohg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aohg extends aucj implements audy {
    public static final aohg q;
    private static volatile auef r;
    public int a;
    public String b = "";
    public long c;
    public int d;
    public int e;
    public int f;
    public aohx g;
    public int h;
    public int i;
    public int j;
    public int k;
    public long l;
    public boolean m;
    public String n = "";
    public String o = "";
    public String p = "";

    static {
        aohg aohg = new aohg();
        q = aohg;
        aucj.a(aohg.class, (aucj) aohg);
    }

    private aohg() {
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
            return aucj.a((audx) q, "\u0001\u000f\u0000\u0001\u0001\u0014\u000f\u0000\u0000\u0000\u0001\b\u0000\u0002\u0002\u0001\u0003\f\u0002\u0004\f\u0003\u0005\f\u0004\u0006\t\u0005\u0007\u0004\u0006\b\f\u0007\t\u0004\b\n\f\t\u000e\u0002\r\u000f\u0007\u000e\u0012\b\u0011\u0013\b\u0012\u0014\b\u0013", new Object[]{"a", "b", "c", "d", aogy.a, "e", aohe.a, "f", aohb.a, "g", "h", "i", aohd.a, "j", "k", aoha.a, "l", "m", "n", "o", "p"});
        } else if (i3 == 3) {
            return new aohg();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) q);
            }
            if (i3 == 5) {
                return q;
            }
            auef auef = r;
            if (auef == null) {
                synchronized (aohg.class) {
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
