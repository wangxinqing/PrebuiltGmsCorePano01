package defpackage;

/* renamed from: vhk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vhk extends aucj implements audy {
    public static final vhk l;
    private static volatile auef m;
    public int a;
    public auay b = auay.b;
    public String c = "";
    public auay d = auay.b;
    public long e;
    public long f;
    public aucs g = aucl.b;
    public auay h = auay.b;
    public String i = "";
    public String j = "";
    public String k = "";

    static {
        vhk vhk = new vhk();
        l = vhk;
        aucj.a(vhk.class, (aucj) vhk);
    }

    private vhk() {
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
            return aucj.a((audx) l, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0001\u0000\u0001\n\u0000\u0002\b\u0001\u0003\n\u0002\u0004\u0002\u0003\u0005\u0002\u0004\u0006\u0016\u0007\n\u0005\b\b\u0006\t\b\u0007\n\b\b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"});
        } else if (i3 == 3) {
            return new vhk();
        } else {
            if (i3 == 4) {
                return new aucd((float[][][]) null, (byte[]) null, (byte[]) null);
            }
            if (i3 == 5) {
                return l;
            }
            auef auef = m;
            if (auef == null) {
                synchronized (vhk.class) {
                    auef = m;
                    if (auef == null) {
                        auef = new auce(l);
                        m = auef;
                    }
                }
            }
            return auef;
        }
    }
}
