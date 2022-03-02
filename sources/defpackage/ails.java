package defpackage;

/* renamed from: ails  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ails extends aucj implements audy {
    public static final ails l;
    private static volatile auef m;
    public int a;
    public int b = 1;
    public double c;
    public double d;
    public float e;
    public long f;
    public String g = "";
    public int h;
    public int i;
    public int j = -1;
    public int k = 5;

    static {
        ails ails = new ails();
        l = ails;
        aucj.a(ails.class, (aucj) ails);
    }

    private ails() {
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
            return aucj.a((audx) l, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001\f\u0000\u0002\u0000\u0001\u0003\u0000\u0002\u0004\u0001\u0003\u0005\u0002\u0004\u0006\b\u0005\u0007\u0004\u0006\b\u0004\u0007\t\u0004\b\n\u0004\t", new Object[]{"a", "b", ailx.a, "c", "d", "e", "f", "g", "h", "i", "j", "k"});
        } else if (i3 == 3) {
            return new ails();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) l);
            }
            if (i3 == 5) {
                return l;
            }
            auef auef = m;
            if (auef == null) {
                synchronized (ails.class) {
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
