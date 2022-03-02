package defpackage;

/* renamed from: aaty  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aaty extends aucj implements audy {
    public static final aaty r;
    private static volatile auef s;
    public int a;
    public int b;
    public int c;
    public long d;
    public boolean e;
    public int f;
    public long g;
    public String h = "";
    public boolean i;
    public aucx j = auei.b;
    public String k = "";
    public String l = "";
    public String m = "";
    public boolean n;
    public String o = "";
    public boolean p;
    public boolean q;

    static {
        aaty aaty = new aaty();
        r = aaty;
        aucj.a(aaty.class, (aucj) aaty);
    }

    private aaty() {
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
            return aucj.a((audx) r, "\u0001\u0010\u0000\u0001\u0001\u0011\u0010\u0000\u0001\u0000\u0001\u0004\u0001\u0002\u0002\u0002\u0003\u0007\u0003\u0004\u0002\u0005\u0005\u0007\b\u0006\u001a\u0007\b\t\t\b\n\n\b\u000b\u000b\b\u0007\f\u0007\f\r\u0007\u000e\u000e\u0007\u000f\u000f\f\u0000\u0010\b\r\u0011\f\u0004", new Object[]{"a", "c", "d", "e", "g", "i", "j", "k", "l", "m", "h", "n", "p", "q", "b", aatx.a, "o", "f", aawr.a});
        } else if (i3 == 3) {
            return new aaty();
        } else {
            if (i3 == 4) {
                return new aucd((short[]) null, (int[][][]) null);
            }
            if (i3 == 5) {
                return r;
            }
            auef auef = s;
            if (auef == null) {
                synchronized (aaty.class) {
                    auef = s;
                    if (auef == null) {
                        auef = new auce(r);
                        s = auef;
                    }
                }
            }
            return auef;
        }
    }
}
