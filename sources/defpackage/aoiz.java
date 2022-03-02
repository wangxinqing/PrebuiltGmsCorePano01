package defpackage;

/* renamed from: aoiz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aoiz extends aucj implements audy {
    public static final aoiz h;
    private static volatile auef i;
    public int a;
    public int b;
    public aoiy c;
    public double d;
    public double e;
    public boolean f;
    public boolean g;

    static {
        aoiz aoiz = new aoiz();
        h = aoiz;
        aucj.a(aoiz.class, (aucj) aoiz);
    }

    private aoiz() {
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
            return aucj.a((audx) h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0001\u0003\u0000\u0002\u0004\u0000\u0003\u0005\u0007\u0004\u0006\u0007\u0005", new Object[]{"a", "b", aoli.a, "c", "d", "e", "f", "g"});
        } else if (i3 == 3) {
            return new aoiz();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) h);
            }
            if (i3 == 5) {
                return h;
            }
            auef auef = i;
            if (auef == null) {
                synchronized (aoiz.class) {
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
