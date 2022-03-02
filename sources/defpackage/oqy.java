package defpackage;

/* renamed from: oqy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oqy extends aucj implements audy {
    public static final auct i = new oqp();
    public static final oqy r;
    private static volatile auef s;
    public int a;
    public String b = "";
    public boolean c = true;
    public int d;
    public int e = 1;
    public boolean f;
    public String g = "";
    public aucs h = aucl.b;
    public aucx j = auei.b;
    public int k;
    public int l;
    public String m = "";
    public int n = -1;
    public int o;
    public int p;
    public boolean q;

    static {
        oqy oqy = new oqy();
        r = oqy;
        aucj.a(oqy.class, (aucj) oqy);
    }

    private oqy() {
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
            return aucj.a((audx) r, "\u0001\u000f\u0000\u0001\u0001\u0011\u000f\u0000\u0002\u0000\u0001\b\u0000\u0002\u0007\u0001\u0003\f\u0002\u0004\u000b\u0003\u0005\u0007\u0004\u0006\b\u0005\u0007\u001e\b\u0004\u0006\t\u0004\u0007\u000b\b\b\f\u0004\t\r\f\n\u000f\f\u000b\u0010\u001a\u0011\u0007\f", new Object[]{"a", "b", "c", "d", oqv.b(), "e", "f", "g", "h", oqx.b(), "k", "l", "m", "n", "o", oqq.a, "p", oqs.a, "j", "q"});
        } else if (i3 == 3) {
            return new oqy();
        } else {
            if (i3 == 4) {
                return new aucd((boolean[][][]) null, (boolean[]) null);
            }
            if (i3 == 5) {
                return r;
            }
            auef auef = s;
            if (auef == null) {
                synchronized (oqy.class) {
                    auef = s;
                    if (auef == null) {
                        auef = new auce(r);
                        s = auef;
                    }
                }
            }
            return auef;
        }
    }
}
