package defpackage;

/* renamed from: aoht  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aoht extends aucj implements audy {
    public static final aoht h;
    private static volatile auef i;
    public int a;
    public int b;
    public String c = "";
    public auay d = auay.b;
    public int e;
    public int f;
    public int g;

    static {
        aoht aoht = new aoht();
        h = aoht;
        aucj.a(aoht.class, (aucj) aoht);
    }

    private aoht() {
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
            return aucj.a((audx) h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001\u0004\u0000\u0002\b\u0001\u0004\u0004\u0004\u0005\u0004\u0005\u0006\n\u0002\u0007\f\u0006", new Object[]{"a", "b", "c", "e", "f", "d", "g", iyc.b()});
        } else if (i3 == 3) {
            return new aoht();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) h);
            }
            if (i3 == 5) {
                return h;
            }
            auef auef = i;
            if (auef == null) {
                synchronized (aoht.class) {
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
