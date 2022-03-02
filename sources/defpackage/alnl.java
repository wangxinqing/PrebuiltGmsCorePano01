package defpackage;

/* renamed from: alnl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alnl extends aucj implements audy {
    public static final alnl l;
    private static volatile auef n;
    public String a = "";
    public String b = "";
    public String c = "";
    public String d;
    public boolean e;
    public aucx f;
    public long g;
    public long h;
    public String i;
    public String j;
    public aucx k;
    private int m;

    static {
        alnl alnl = new alnl();
        l = alnl;
        aucj.a(alnl.class, (aucj) alnl);
    }

    private alnl() {
        auei auei = auei.b;
        this.d = "";
        auay auay = auay.b;
        this.f = auei.b;
        this.i = "";
        this.j = "";
        this.k = auei.b;
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
            return aucj.a((audx) l, "\u0001\u000b\u0000\u0001\u0001\u001a\u000b\u0000\u0002\u0000\u0001\b\u0000\u0002\b\u0001\u0003\b\u0002\u0006\b\u0004\f\u0007\n\u000e\u001b\u0011\u0002\u000e\u0012\u0002\u000f\u0015\b\u0012\u0016\b\u0013\u001a\u001b", new Object[]{"m", "a", "b", "c", "d", "e", "f", alni.class, "g", "h", "i", "j", "k", alnh.class});
        } else if (i3 == 3) {
            return new alnl();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) l);
            }
            if (i3 == 5) {
                return l;
            }
            auef auef = n;
            if (auef == null) {
                synchronized (alnl.class) {
                    auef = n;
                    if (auef == null) {
                        auef = new auce(l);
                        n = auef;
                    }
                }
            }
            return auef;
        }
    }
}
