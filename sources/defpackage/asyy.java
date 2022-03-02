package defpackage;

/* renamed from: asyy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class asyy extends aucj implements audy {
    public static final asyy h;
    private static volatile auef i;
    public int a;
    public int b;
    public long c;
    public int d;
    public int e;
    public int f;
    public int g;

    static {
        asyy asyy = new asyy();
        h = asyy;
        aucj.a(asyy.class, (aucj) asyy);
    }

    private asyy() {
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
            return aucj.a((audx) h, "\u0001\u0006\u0000\u0001\u000b\u0014\u0006\u0000\u0000\u0000\u000b\f\u0010\f\u0004\u0011\u0011\u0004\u0004\u0012\u0003\u0005\u0013\f\u0012\u0014\f\u0013", new Object[]{"a", "d", atfd.a, "e", "b", "c", "f", atey.a, "g", atfa.a});
        } else if (i3 == 3) {
            return new asyy();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) h);
            }
            if (i3 == 5) {
                return h;
            }
            auef auef = i;
            if (auef == null) {
                synchronized (asyy.class) {
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
