package defpackage;

/* renamed from: aoew  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aoew extends aucj implements audy {
    public static final aoew i;
    private static volatile auef j;
    public int a;
    public aodf b;
    public int c;
    public boolean d;
    public long e;
    public int f;
    public int g;
    public int h;

    static {
        aoew aoew = new aoew();
        i = aoew;
        aucj.a(aoew.class, (aucj) aoew);
    }

    private aoew() {
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
            return aucj.a((audx) i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0000\u0001\t\u0000\u0003\f\u0002\u0004\u0007\u0003\u0005\u0002\u0004\u0006\f\u0005\u0007\u0004\u0006\b\f\u0007", new Object[]{"a", "b", "c", aoev.a, "d", "e", "f", aoeu.a, "g", "h", aocp.a});
        } else if (i3 == 3) {
            return new aoew();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) i);
            }
            if (i3 == 5) {
                return i;
            }
            auef auef = j;
            if (auef == null) {
                synchronized (aoew.class) {
                    auef = j;
                    if (auef == null) {
                        auef = new auce(i);
                        j = auef;
                    }
                }
            }
            return auef;
        }
    }
}
