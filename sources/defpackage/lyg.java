package defpackage;

/* renamed from: lyg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lyg extends aucj implements audy {
    public static final lyg j;
    private static volatile auef l;
    public int a;
    public auay b = auay.b;
    public auay c = auay.b;
    public auay d = auay.b;
    public int e;
    public boolean f;
    public int g;
    public int h;
    public auay i = auay.b;
    private String k = "";

    static {
        lyg lyg = new lyg();
        j = lyg;
        aucj.a(lyg.class, (aucj) lyg);
    }

    private lyg() {
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
            return aucj.a((audx) j, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001\n\u0000\u0002\b\u0001\u0003\n\u0002\u0004\u000b\u0004\u0005\n\u0003\u0006\u0007\u0005\u0007\u000b\u0006\b\u000b\u0007\t\n\b", new Object[]{"a", "b", "k", "c", "e", "d", "f", "g", "h", "i"});
        } else if (i3 == 3) {
            return new lyg();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) j);
            }
            if (i3 == 5) {
                return j;
            }
            auef auef = l;
            if (auef == null) {
                synchronized (lyg.class) {
                    auef = l;
                    if (auef == null) {
                        auef = new auce(j);
                        l = auef;
                    }
                }
            }
            return auef;
        }
    }
}
