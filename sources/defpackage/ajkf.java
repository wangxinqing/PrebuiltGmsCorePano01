package defpackage;

/* renamed from: ajkf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajkf extends aucj implements audy {
    public static final ajkf m;
    private static volatile auef n;
    public int a;
    public long b;
    public int c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public String l = "";

    static {
        ajkf ajkf = new ajkf();
        m = ajkf;
        aucj.a(ajkf.class, (aucj) ajkf);
    }

    private ajkf() {
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
            return aucj.a((audx) m, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001\u0002\u0000\u0002\u000f\u0001\u0003\f\u0002\u0004\u0007\u0003\u0005\u0004\u0004\u0006\u0004\u0005\u0007\u0004\u0006\b\u0004\u0007\t\u0004\b\n\u0004\t\u000b\b\n", new Object[]{"a", "b", "c", "d", ajkd.a, "e", "f", "g", "h", "i", "j", "k", "l"});
        } else if (i3 == 3) {
            return new ajkf();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) m);
            }
            if (i3 == 5) {
                return m;
            }
            auef auef = n;
            if (auef == null) {
                synchronized (ajkf.class) {
                    auef = n;
                    if (auef == null) {
                        auef = new auce(m);
                        n = auef;
                    }
                }
            }
            return auef;
        }
    }
}
