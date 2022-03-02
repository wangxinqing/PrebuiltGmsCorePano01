package defpackage;

/* renamed from: otu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class otu extends aucj implements audy {
    public static final otu k;
    private static volatile auef l;
    public int a;
    public String b = "en";
    public aucx c = auei.b;
    public int d;
    public ott e;
    public String f = "";
    public String g = "";
    public oqe h;
    public long i;
    public int j;

    static {
        otu otu = new otu();
        k = otu;
        aucj.a(otu.class, (aucj) otu);
    }

    private otu() {
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
            return aucj.a((audx) k, "\u0001\t\u0000\u0001\u0002\u001b\t\u0000\u0001\u0000\u0002\b\u0001\t\u0004\u0002\u0012\u001b\u0013\t\u0003\u0014\b\u0004\u0015\b\u0005\u0016\t\u0006\u0019\u0003\u0007\u001b\u000b\t", new Object[]{"a", "b", "d", "c", opz.class, "e", "f", "g", "h", "i", "j"});
        } else if (i3 == 3) {
            return new otu();
        } else {
            if (i3 == 4) {
                return new aucd((char[][]) null, (float[][]) null);
            }
            if (i3 == 5) {
                return k;
            }
            auef auef = l;
            if (auef == null) {
                synchronized (otu.class) {
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
