package defpackage;

/* renamed from: ovc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ovc extends aucj implements audy {
    public static final ovc m;
    private static volatile auef n;
    public int a;
    public String b = "";
    public long c;
    public String d = "";
    public String e = "";
    public String f = "";
    public long g;
    public int h;
    public oqo i;
    public int j = -1;
    public boolean k;
    public int l;

    static {
        ovc ovc = new ovc();
        m = ovc;
        aucj.a(ovc.class, (aucj) ovc);
    }

    private ovc() {
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
            return aucj.a((audx) m, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001\b\u0000\u0002\u0003\u0001\u0003\b\u0002\u0004\b\u0003\u0005\b\u0004\u0006\u0003\u0005\u0007\f\u0006\b\t\u0007\t\u0004\b\n\u0007\t\u000b\f\n", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", ovg.b(), "i", "j", "k", "l", otk.b()});
        } else if (i3 == 3) {
            return new ovc();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) m);
            }
            if (i3 == 5) {
                return m;
            }
            auef auef = n;
            if (auef == null) {
                synchronized (ovc.class) {
                    auef = n;
                    if (auef == null) {
                        auef = new auce(m);
                        n = auef;
                    }
                }
            }
            return auef;
        }
    }
}
