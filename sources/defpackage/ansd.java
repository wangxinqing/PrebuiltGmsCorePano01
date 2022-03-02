package defpackage;

/* renamed from: ansd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ansd extends aucj implements audy {
    public static final ansd m;
    private static volatile auef n;
    public int a;
    public anuv b;
    public long c;
    public int d;
    public ansc e;
    public String f = "";
    public int g;
    public int h;
    public int i;
    public ansc j;
    public int k;
    public String l = "";

    static {
        ansd ansd = new ansd();
        m = ansd;
        aucj.a(ansd.class, (aucj) ansd);
    }

    private ansd() {
        auei auei = auei.b;
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
            return aucj.a((audx) m, "\u0001\u000b\u0000\u0001\u0001\u000e\u000b\u0000\u0000\u0000\u0001\u0002\u0002\u0004\u0004\u0005\u0005\t\u0006\u0006\b\u0007\u0007\u0004\b\b\u0004\t\t\u0004\n\n\t\u000b\u000b\t\u0000\r\u0004\r\u000e\b\u000e", new Object[]{"a", "c", "d", "e", "f", "g", "h", "i", "j", "b", "k", "l"});
        } else if (i3 == 3) {
            return new ansd();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) m);
            }
            if (i3 == 5) {
                return m;
            }
            auef auef = n;
            if (auef == null) {
                synchronized (ansd.class) {
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
