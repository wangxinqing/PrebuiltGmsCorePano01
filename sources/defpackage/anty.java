package defpackage;

/* renamed from: anty  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anty extends aucj implements audy {
    public static final anty n;
    private static volatile auef o;
    public int a;
    public int b;
    public String c = "";
    public antu d;
    public antz e;
    public antw f;
    public antk g;
    public antt h;
    public ants i;
    public antp j;
    public antq k;
    public antl l;
    public antm m;

    static {
        anty anty = new anty();
        n = anty;
        aucj.a(anty.class, (aucj) anty);
    }

    private anty() {
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
            return aucj.a((audx) n, "\u0001\f\u0000\u0001\u0001\u000f\f\u0000\u0000\u0000\u0001\f\u0000\u0002\b\u0001\u0003\t\u0002\u0004\t\u0003\u0006\t\u0004\u0007\t\u0005\b\t\u0006\n\t\u0007\u000b\t\b\f\t\t\u000e\t\u000b\u000f\t\f", new Object[]{"a", "b", antx.a, "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m"});
        } else if (i3 == 3) {
            return new anty();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) n);
            }
            if (i3 == 5) {
                return n;
            }
            auef auef = o;
            if (auef == null) {
                synchronized (anty.class) {
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
