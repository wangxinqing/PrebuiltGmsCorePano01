package defpackage;

/* renamed from: bask  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bask extends aucj implements audy {
    public static final bask h;
    private static volatile auef i;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public aucx f = auei.b;
    public int g;

    static {
        bask bask = new bask();
        h = bask;
        aucj.a(bask.class, (aucj) bask);
    }

    private bask() {
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
            return aucj.a((audx) h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u0004\u0000\u0002\u0004\u0001\u0003\u0004\u0002\u0004\u0004\u0003\u0005\u001b\u0006\u0004\u0004", new Object[]{"a", "b", "c", "d", "e", "f", basj.class, "g"});
        } else if (i3 == 3) {
            return new bask();
        } else {
            if (i3 == 4) {
                return new aucd((int[][][]) null, (char[][][]) null);
            }
            if (i3 == 5) {
                return h;
            }
            auef auef = i;
            if (auef == null) {
                synchronized (bask.class) {
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
