package defpackage;

/* renamed from: ajjm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajjm extends aucj implements audy {
    public static final ajjm x;
    private static volatile auef y;
    public int a;
    public String b = "";
    public String c = "";
    public boolean d;
    public long e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public long j;
    public int k;
    public boolean l;
    public boolean m;
    public ajjq n;
    public int o;
    public boolean p = true;
    public String q = "";
    public long r;
    public String s = "";
    public String t = "";
    public long u;
    public boolean v;
    public int w;

    static {
        ajjm ajjm = new ajjm();
        x = ajjm;
        aucj.a(ajjm.class, (aucj) ajjm);
    }

    private ajjm() {
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
            return aucj.a((audx) x, "\u0001\u0016\u0000\u0001\u0001\u0018\u0016\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001\u0003\u0007\u0002\u0004\u0002\u0003\u0005\u0007\u0004\u0006\u0007\u0005\u0007\u0007\u0006\b\u0007\u0007\t\u0002\b\n\u0004\t\u000b\u0007\n\f\u0007\u000b\r\t\f\u000e\u0004\r\u000f\u0007\u000e\u0011\b\u000f\u0012\u0002\u0010\u0014\b\u0012\u0015\b\u0013\u0016\u0002\u0014\u0017\u0007\u0015\u0018\u0004\u0016", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w"});
        } else if (i3 == 3) {
            return new ajjm();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) x);
            }
            if (i3 == 5) {
                return x;
            }
            auef auef = y;
            if (auef == null) {
                synchronized (ajjm.class) {
                    auef = y;
                    if (auef == null) {
                        auef = new auce(x);
                        y = auef;
                    }
                }
            }
            return auef;
        }
    }
}
