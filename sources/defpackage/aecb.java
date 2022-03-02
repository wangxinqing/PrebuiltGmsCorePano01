package defpackage;

/* renamed from: aecb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aecb extends aucj implements audy {
    public static final aecb p;
    private static volatile auef r;
    public int a;
    public auay b = auay.b;
    public String c = "";
    public double d;
    public float e;
    public long f;
    public int g;
    public int h;
    public boolean i;
    public aucx j = auei.b;
    public aucx k = auei.b;
    public aucx l = auei.b;
    public aucv m = audl.b;
    public aucr n = aubz.b;
    public long o;
    private byte q = 2;

    static {
        aecb aecb = new aecb();
        p = aecb;
        aucj.a(aecb.class, (aucj) aecb);
    }

    private aecb() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.q);
        }
        byte b2 = 0;
        if (i3 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.q = b2;
            return null;
        } else if (i3 == 2) {
            return aucj.a((audx) p, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0005\u0002\u0001\n\u0000\u0002\b\u0001\u0003\u0000\u0002\u0004\u0001\u0003\u0005\u0002\u0004\u0006\u0004\u0005\u0007\u000f\u0006\b\u0007\u0007\tЛ\nЛ\u000b\u001a\f\u0014\r\u0002\b\u000e\u0013", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", aecd.class, "k", aecc.class, "l", "m", "o", "n"});
        } else if (i3 == 3) {
            return new aecb();
        } else {
            if (i3 == 4) {
                return new aucd((int[][][]) null, (char[]) null);
            }
            if (i3 == 5) {
                return p;
            }
            auef auef = r;
            if (auef == null) {
                synchronized (aecb.class) {
                    auef = r;
                    if (auef == null) {
                        auef = new auce(p);
                        r = auef;
                    }
                }
            }
            return auef;
        }
    }
}
