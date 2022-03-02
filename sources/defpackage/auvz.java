package defpackage;

/* renamed from: auvz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class auvz extends aucj implements audy {
    public static final auvz k;
    private static volatile auef l;
    public int a;
    public auwe b;
    public String c = "";
    public String d = "";
    public int e;
    public auxa f;
    public auwz g;
    public auwx h;
    public auwy i;
    public auwa j;

    static {
        auvz auvz = new auvz();
        k = auvz;
        aucj.a(auvz.class, (aucj) auvz);
    }

    private auvz() {
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
            return aucj.a((audx) k, "\u0001\t\u0000\u0001\u0001\u000b\t\u0000\u0000\u0000\u0001\t\u0000\u0003\b\u0002\u0004\b\u0003\u0005\f\u0004\u0006\t\u0005\b\t\u0007\t\t\b\n\t\t\u000b\t\n", new Object[]{"a", "b", "c", "d", "e", avbn.a, "f", "g", "h", "i", "j"});
        } else if (i3 == 3) {
            return new auvz();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) k);
            }
            if (i3 == 5) {
                return k;
            }
            auef auef = l;
            if (auef == null) {
                synchronized (auvz.class) {
                    auef = l;
                    if (auef == null) {
                        auef = new auce(k);
                        l = auef;
                    }
                }
            }
            return auef;
        }
    }
}
