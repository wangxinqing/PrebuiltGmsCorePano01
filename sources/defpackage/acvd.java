package defpackage;

/* renamed from: acvd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acvd extends aucj implements audy {
    public static final acvd g;
    private static volatile auef i;
    public String a = "";
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    private int h;

    static {
        acvd acvd = new acvd();
        g = acvd;
        aucj.a(acvd.class, (aucj) acvd);
    }

    private acvd() {
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
            return aucj.a((audx) g, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\b\u0000\u0002\u0004\u0001\u0003\u0004\u0002\u0004\u0004\u0003\u0005\u0004\u0004\u0006\u0004\u0005", new Object[]{"h", "a", "b", "c", "d", "e", "f"});
        } else if (i3 == 3) {
            return new acvd();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) g);
            }
            if (i3 == 5) {
                return g;
            }
            auef auef = i;
            if (auef == null) {
                synchronized (acvd.class) {
                    auef = i;
                    if (auef == null) {
                        auef = new auce(g);
                        i = auef;
                    }
                }
            }
            return auef;
        }
    }
}
