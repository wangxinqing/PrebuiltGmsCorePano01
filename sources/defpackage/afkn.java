package defpackage;

/* renamed from: afkn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afkn extends aucj implements audy {
    public static final afkn l;
    private static volatile auef m;
    public int a;
    public String b = "";
    public String c = "";
    public int d;
    public int e;
    public String f = "";
    public avlu g;
    public String h = "";
    public int i;
    public avlu j;
    public aucx k = auei.b;

    static {
        afkn afkn = new afkn();
        l = afkn;
        aucj.a(afkn.class, (aucj) afkn);
    }

    private afkn() {
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
            return aucj.a((audx) l, "\u0001\n\u0000\u0001\u0002\u0010\n\u0000\u0001\u0000\u0002\b\u0001\u0004\u0004\u0002\u0005\b\u0004\u0007\b\u0000\u000b\t\u0005\f\t\b\r\u001b\u000e\b\u0006\u000f\f\u0003\u0010\u0004\u0007", new Object[]{"a", "c", "d", "f", "b", "g", "j", "k", afku.class, "h", "e", afkl.a, "i"});
        } else if (i3 == 3) {
            return new afkn();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) l);
            }
            if (i3 == 5) {
                return l;
            }
            auef auef = m;
            if (auef == null) {
                synchronized (afkn.class) {
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
