package defpackage;

/* renamed from: aoed  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aoed extends aucj implements audy {
    public static final aoed q;
    private static volatile auef r;
    public int a;
    public int b;
    public int c = 1;
    public boolean d;
    public boolean e;
    public boolean f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public boolean n;
    public int o;
    public int p;

    static {
        aoed aoed = new aoed();
        q = aoed;
        aucj.a(aoed.class, (aucj) aoed);
    }

    private aoed() {
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
            return aucj.a((audx) q, "\u0001\u000f\u0000\u0001\u0001\u0010\u000f\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001\u0003\u0007\u0002\u0004\u0007\u0003\u0005\u0007\u0004\u0006\u000b\u0005\u0007\u000b\u0006\b\u000b\u0007\n\u000b\t\u000b\u000b\n\f\u000b\u000b\r\u0007\f\u000e\u000b\r\u000f\u000b\b\u0010\u000b\u000e", new Object[]{"a", "b", aoec.b(), "c", aodz.a, "d", "e", "f", "g", "h", "i", "k", "l", "m", "n", "o", "j", "p"});
        } else if (i3 == 3) {
            return new aoed();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) q);
            }
            if (i3 == 5) {
                return q;
            }
            auef auef = r;
            if (auef == null) {
                synchronized (aoed.class) {
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
