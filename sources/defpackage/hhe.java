package defpackage;

/* renamed from: hhe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hhe extends aucj implements audy {
    public static final hhe m;
    private static volatile auef n;
    public int a;
    public long b;
    public String c = "";
    public String d = "";
    public int e;
    public boolean f;
    public int g;
    public long h;
    public boolean i;
    public long j;
    public int k;
    public boolean l;

    static {
        hhe hhe = new hhe();
        m = hhe;
        aucj.a(hhe.class, (aucj) hhe);
    }

    private hhe() {
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
            return aucj.a((audx) m, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001\u0002\u0000\u0002\b\u0001\u0003\b\u0002\u0004\u0004\u0003\u0005\u0007\u0004\u0006\u0004\u0005\u0007\u0002\u0006\b\u0007\u0007\t\u0002\b\n\u0004\t\u000b\u0007\n", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l"});
        } else if (i3 == 3) {
            return new hhe();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) m);
            }
            if (i3 == 5) {
                return m;
            }
            auef auef = n;
            if (auef == null) {
                synchronized (hhe.class) {
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
