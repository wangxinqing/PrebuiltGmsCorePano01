package defpackage;

/* renamed from: aoet  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aoet extends aucj implements audy {
    public static final aoet h;
    private static volatile auef i;
    public int a;
    public int b;
    public int c;
    public int d;
    public long e;
    public String f = "";
    public boolean g;

    static {
        aoet aoet = new aoet();
        h = aoet;
        aucj.a(aoet.class, (aucj) aoet);
    }

    private aoet() {
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
            return aucj.a((audx) h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001\f\u0000\u0003\u0004\u0001\u0004\f\u0002\u0005\u0002\u0003\u0006\b\u0004\u0007\u0007\u0005", new Object[]{"a", "b", aodg.a, "c", "d", aoev.a, "e", "f", "g"});
        } else if (i3 == 3) {
            return new aoet();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) h);
            }
            if (i3 == 5) {
                return h;
            }
            auef auef = i;
            if (auef == null) {
                synchronized (aoet.class) {
                    auef = i;
                    if (auef == null) {
                        auef = new auce(h);
                        i = auef;
                    }
                }
            }
            return auef;
        }
    }
}
