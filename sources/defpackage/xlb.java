package defpackage;

/* renamed from: xlb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xlb extends aucj implements audy {
    public static final xlb n;
    private static volatile auef o;
    public int a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public int f;
    public int g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public xla l;
    public int m;

    static {
        xlb xlb = new xlb();
        n = xlb;
        aucj.a(xlb.class, (aucj) xlb);
    }

    private xlb() {
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
            return aucj.a((audx) n, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001\u0007\u0000\u0002\u0007\u0001\u0003\u0007\u0002\u0004\u0007\u0003\u0005\u0004\u0004\u0006\u0004\u0005\u0007\u0004\u0006\b\u0004\u0007\t\u0007\b\n\u0007\t\u000b\t\n\f\u0004\u000b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m"});
        } else if (i3 == 3) {
            return new xlb();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) n);
            }
            if (i3 == 5) {
                return n;
            }
            auef auef = o;
            if (auef == null) {
                synchronized (xlb.class) {
                    auef = o;
                    if (auef == null) {
                        auef = new auce(n);
                        o = auef;
                    }
                }
            }
            return auef;
        }
    }
}
