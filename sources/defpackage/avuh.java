package defpackage;

/* renamed from: avuh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avuh extends aucj implements audy {
    public static final avuh m;
    private static volatile auef n;
    public int a;
    public int b;
    public String c = "";
    public auay d = auay.b;
    public boolean e;
    public String f = "";
    public String g = "";
    public String h = "";
    public boolean i;
    public boolean j;
    public boolean k;
    public auay l = auay.b;

    static {
        avuh avuh = new avuh();
        m = avuh;
        aucj.a(avuh.class, (aucj) avuh);
    }

    private avuh() {
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
            return aucj.a((audx) m, "\u0001\u000b\u0000\u0001\u0001\r\u000b\u0000\u0000\u0000\u0001\f\u0000\u0002\b\u0001\u0003\n\u0002\u0004\u0007\u0003\u0005\b\u0004\u0006\b\u0005\u0007\u0007\u0007\b\u0007\b\t\b\u0006\n\u0007\t\r\n\u000b", new Object[]{"a", "b", avug.b(), "c", "d", "e", "f", "g", "i", "j", "h", "k", "l"});
        } else if (i3 == 3) {
            return new avuh();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) m);
            }
            if (i3 == 5) {
                return m;
            }
            auef auef = n;
            if (auef == null) {
                synchronized (avuh.class) {
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
