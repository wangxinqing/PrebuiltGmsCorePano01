package defpackage;

/* renamed from: auho  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class auho extends aucj implements audy {
    public static final auho q;
    private static volatile auef r;
    public int a;
    public String b = "";
    public String c = "";
    public String d = "";
    public String e = "";
    public int f;
    public int g;
    public long h;
    public long i;
    public long j;
    public long k;
    public String l = "";
    public long m;
    public int n;
    public boolean o;
    public String p = "";

    static {
        auho auho = new auho();
        q = auho;
        aucj.a(auho.class, (aucj) auho);
    }

    private auho() {
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
            return aucj.a((audx) q, "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001\u0003\b\u0002\u0004\b\u0003\u0005\u0004\u0004\u0006\u0004\u0005\u0007\u0002\u0006\b\u0002\u0007\t\u0002\b\n\u0002\t\u000b\b\n\f\u0002\u000b\r\u0004\f\u000e\u0007\r\u000f\b\u000e", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p"});
        } else if (i3 == 3) {
            return new auho();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) q);
            }
            if (i3 == 5) {
                return q;
            }
            auef auef = r;
            if (auef == null) {
                synchronized (auho.class) {
                    auef = r;
                    if (auef == null) {
                        auef = new auce(q);
                        r = auef;
                    }
                }
            }
            return auef;
        }
    }
}
