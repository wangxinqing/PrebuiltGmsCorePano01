package defpackage;

/* renamed from: aatd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aatd extends aucj implements audy {
    public static final aatd m;
    private static volatile auef n;
    public int a;
    public String b = "";
    public boolean c;
    public auay d = auay.b;
    public long e;
    public int f;
    public int g;
    public int h;
    public String i = "";
    public boolean j;
    public boolean k;
    public String l = "";

    static {
        aatd aatd = new aatd();
        m = aatd;
        aucj.a(aatd.class, (aucj) aatd);
    }

    private aatd() {
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
            return aucj.a((audx) m, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001\b\u0000\u0002\u0007\u0001\u0003\n\u0002\u0004\u0002\u0003\u0005\u0004\u0004\u0006\u0004\u0005\u0007\u0004\u0006\b\b\u0007\t\u0007\b\n\u0007\t\u000b\b\n", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l"});
        } else if (i3 == 3) {
            return new aatd();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) m);
            }
            if (i3 == 5) {
                return m;
            }
            auef auef = n;
            if (auef == null) {
                synchronized (aatd.class) {
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
