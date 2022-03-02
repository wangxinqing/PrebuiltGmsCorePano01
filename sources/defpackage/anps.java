package defpackage;

/* renamed from: anps  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anps extends aucj implements audy {
    public static final anps j;
    private static volatile auef k;
    public int a;
    public long b;
    public String c = "";
    public String d = "";
    public int e;
    public String f = "";
    public boolean g;
    public boolean h;
    public int i;

    static {
        anps anps = new anps();
        j = anps;
        aucj.a(anps.class, (aucj) anps);
    }

    private anps() {
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
            return aucj.a((audx) j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\u0002\u0000\u0002\b\u0001\u0003\b\u0002\u0004\u0004\u0003\u0005\b\u0004\u0006\u0007\u0005\u0007\u0007\u0006\b\f\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", anpr.a});
        } else if (i3 == 3) {
            return new anps();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) j);
            }
            if (i3 == 5) {
                return j;
            }
            auef auef = k;
            if (auef == null) {
                synchronized (anps.class) {
                    auef = k;
                    if (auef == null) {
                        auef = new auce(j);
                        k = auef;
                    }
                }
            }
            return auef;
        }
    }
}
