package defpackage;

/* renamed from: ambe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ambe extends aucj implements audy {
    public static final ambe l;
    private static volatile auef m;
    public int a;
    public int b;
    public long c;
    public int d;
    public int e;
    public int f;
    public long g;
    public int h;
    public int i;
    public int j;
    public int k;

    static {
        ambe ambe = new ambe();
        l = ambe;
        aucj.a(ambe.class, (aucj) ambe);
    }

    private ambe() {
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
            return aucj.a((audx) l, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001\f\u0000\u0002\u0003\u0001\u0003\u000b\u0002\u0004\u000b\u0003\u0005\f\u0004\u0006\u0003\u0005\u0007\u000b\u0006\b\u000b\u0007\t\u000b\b\n\u000b\t", new Object[]{"a", "b", amcr.a, "c", "d", "e", "f", amcq.a, "g", "h", "i", "j", "k"});
        } else if (i3 == 3) {
            return new ambe();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) l);
            }
            if (i3 == 5) {
                return l;
            }
            auef auef = m;
            if (auef == null) {
                synchronized (ambe.class) {
                    auef = m;
                    if (auef == null) {
                        auef = new auce(l);
                        m = auef;
                    }
                }
            }
            return auef;
        }
    }
}
