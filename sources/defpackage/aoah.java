package defpackage;

/* renamed from: aoah  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aoah extends aucj implements audy {
    public static final aoah h;
    private static volatile auef i;
    public int a;
    public String b = "";
    public int c;
    public int d;
    public float e;
    public float f;
    public float g;

    static {
        aoah aoah = new aoah();
        h = aoah;
        aucj.a(aoah.class, (aucj) aoah);
    }

    private aoah() {
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
            return aucj.a((audx) h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\b\u0000\u0002\f\u0001\u0003\u0004\u0002\u0004\u0001\u0003\u0005\u0001\u0004\u0006\u0001\u0005", new Object[]{"a", "b", "c", aoaq.b(), "d", "e", "f", "g"});
        } else if (i3 == 3) {
            return new aoah();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) h);
            }
            if (i3 == 5) {
                return h;
            }
            auef auef = i;
            if (auef == null) {
                synchronized (aoah.class) {
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
