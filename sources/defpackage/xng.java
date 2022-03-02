package defpackage;

/* renamed from: xng  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xng extends aucj implements audy {
    public static final xng l;
    private static volatile auef m;
    public int a;
    public int b;
    public int c;
    public boolean d;
    public int e;
    public int f;
    public int g;
    public int h;
    public aucx i = auei.b;
    public int j;
    public int k;

    static {
        xng xng = new xng();
        l = xng;
        aucj.a(xng.class, (aucj) xng);
    }

    private xng() {
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
            return aucj.a((audx) l, "\u0001\n\u0000\u0001\u0001\f\n\u0000\u0001\u0000\u0001\f\u0000\u0002\f\u0001\u0003\u0007\u0002\u0004\u0004\u0003\u0005\u0004\u0004\u0006\u0004\u0005\u0007\u0004\u0006\n\u001b\u000b\u0004\t\f\u0004\n", new Object[]{"a", "b", xnd.b(), "c", xjo.b(), "d", "e", "f", "g", "h", "i", xnf.class, "j", "k"});
        } else if (i3 == 3) {
            return new xng();
        } else {
            if (i3 == 4) {
                return new aucd((char[][][]) null, (int[][]) null);
            }
            if (i3 == 5) {
                return l;
            }
            auef auef = m;
            if (auef == null) {
                synchronized (xng.class) {
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
