package defpackage;

/* renamed from: aman  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aman extends aucj implements audy {
    public static final aman i;
    private static volatile auef j;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;

    static {
        aman aman = new aman();
        i = aman;
        aucj.a(aman.class, (aucj) aman);
    }

    private aman() {
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
            return aucj.a((audx) i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\f\u0000\u0002\u000b\u0001\u0003\u000b\u0002\u0004\f\u0003\u0005\u000b\u0004\u0006\f\u0005\u0007\f\u0006", new Object[]{"a", "b", amaa.a, "c", "d", "e", ambq.a, "f", "g", amcl.a, "h", amcj.a});
        } else if (i3 == 3) {
            return new aman();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) i);
            }
            if (i3 == 5) {
                return i;
            }
            auef auef = j;
            if (auef == null) {
                synchronized (aman.class) {
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
