package defpackage;

/* renamed from: aohi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aohi extends aucj implements audy {
    public static final aohi k;
    private static volatile auef l;
    public int a;
    public long b;
    public int c;
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";
    public long i;
    public long j;

    static {
        aohi aohi = new aohi();
        k = aohi;
        aucj.a(aohi.class, (aucj) aohi);
    }

    private aohi() {
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
            return aucj.a((audx) k, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0000\u0000\u0001\u0002\u0000\u0002\f\u0001\u0003\b\u0002\u0004\b\u0003\u0005\b\u0004\u0006\b\u0005\u0007\b\u0006\b\u0002\u0007\n\u0002\b", new Object[]{"a", "b", "c", aohh.a, "d", "e", "f", "g", "h", "i", "j"});
        } else if (i3 == 3) {
            return new aohi();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) k);
            }
            if (i3 == 5) {
                return k;
            }
            auef auef = l;
            if (auef == null) {
                synchronized (aohi.class) {
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
