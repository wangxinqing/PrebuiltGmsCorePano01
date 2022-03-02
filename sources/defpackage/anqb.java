package defpackage;

/* renamed from: anqb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anqb extends aucj implements audy {
    public static final anqb l;
    private static volatile auef m;
    public int a;
    public int b;
    public String c = "";
    public int d;
    public anqd e;
    public anqh f;
    public anqi g;
    public anqc h;
    public anqe i;
    public anqf j;
    public anqg k;

    static {
        anqb anqb = new anqb();
        l = anqb;
        aucj.a(anqb.class, (aucj) anqb);
    }

    private anqb() {
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
            return aucj.a((audx) l, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0000\u0000\u0001\f\u0000\u0002\b\u0001\u0003\t\u0003\u0004\t\u0004\u0005\t\u0005\u0006\t\u0006\u0007\t\u0007\b\u0004\u0002\n\t\t\u000b\t\n", new Object[]{"a", "b", anpz.a, "c", "e", "f", "g", "h", "i", "d", "j", "k"});
        } else if (i3 == 3) {
            return new anqb();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) l);
            }
            if (i3 == 5) {
                return l;
            }
            auef auef = m;
            if (auef == null) {
                synchronized (anqb.class) {
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
