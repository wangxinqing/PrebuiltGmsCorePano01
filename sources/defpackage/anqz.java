package defpackage;

/* renamed from: anqz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anqz extends aucj implements audy {
    public static final anqz j;
    private static volatile auef k;
    public int a;
    public anrr b;
    public int c;
    public int d;
    public boolean e;
    public anrm f;
    public int g;
    public long h;
    public int i;

    static {
        anqz anqz = new anqz();
        j = anqz;
        aucj.a(anqz.class, (aucj) anqz);
    }

    private anqz() {
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
            return aucj.a((audx) j, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\u0000\u0001\t\u0000\u0002\f\u0001\u0004\f\u0003\u0005\u0007\u0004\u0006\t\u0005\u0007\f\u0006\b\u0002\u0007\t\f\b", new Object[]{"a", "b", "c", anrp.a, "d", anrb.a, "e", "f", "g", anro.a, "h", "i", anqy.a});
        } else if (i3 == 3) {
            return new anqz();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) j);
            }
            if (i3 == 5) {
                return j;
            }
            auef auef = k;
            if (auef == null) {
                synchronized (anqz.class) {
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
