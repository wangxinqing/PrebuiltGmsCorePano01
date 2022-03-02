package defpackage;

/* renamed from: xme  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xme extends aucj implements audy {
    public static final xme l;
    private static volatile auef m;
    public int a;
    public int b;
    public int c;
    public String d = "";
    public xlx e;
    public aucx f = auei.b;
    public int g;
    public xlp h;
    public int i;
    public xma j;
    public String k = "";

    static {
        xme xme = new xme();
        l = xme;
        aucj.a(xme.class, (aucj) xme);
    }

    private xme() {
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
            return aucj.a((audx) l, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0001\u0000\u0001\f\u0000\u0002\u0004\u0001\u0003\b\u0002\u0004\t\u0003\u0005\u001b\u0006\f\u0004\u0007\t\u0005\b\f\u0006\t\t\u0007\n\b\b", new Object[]{"a", "b", xlr.a, "c", "d", "e", "f", xmc.class, "g", xlq.a, "h", "i", xmd.a, "j", "k"});
        } else if (i3 == 3) {
            return new xme();
        } else {
            if (i3 == 4) {
                return new aucd((char[]) null, (char[][]) null);
            }
            if (i3 == 5) {
                return l;
            }
            auef auef = m;
            if (auef == null) {
                synchronized (xme.class) {
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
