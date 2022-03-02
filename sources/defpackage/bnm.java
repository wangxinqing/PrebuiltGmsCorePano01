package defpackage;

/* renamed from: bnm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bnm extends aucj implements audy {
    public static final bnm r;
    private static volatile auef s;
    public int a;
    public int b;
    public String c = "";
    public long d;
    public String e = "";
    public String f = "";
    public String g = "";
    public int h;
    public int i;
    public aucx j = auei.b;
    public int k;
    public int l;
    public int m;
    public String n = "";
    public String o = "";
    public String p = "";
    public String q = "";

    static {
        bnm bnm = new bnm();
        r = bnm;
        aucj.a(bnm.class, (aucj) bnm);
    }

    private bnm() {
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
            return aucj.a((audx) r, "\u0001\u0010\u0000\u0001\u0001\u0010\u0010\u0000\u0001\u0000\u0001\f\u0000\u0002\b\u0001\u0003\u0002\u0002\u0004\b\u0003\u0005\b\u0004\u0006\b\u0005\u0007\u0004\u0006\b\f\u0007\t\u001b\n\f\b\u000b\u0004\t\f\u0004\n\r\b\u000b\u000e\b\f\u000f\b\r\u0010\b\u000e", new Object[]{"a", "b", bni.a, "c", "d", "e", "f", "g", "h", "i", bpb.a, "j", bnp.class, "k", bnk.a, "l", "m", "n", "o", "p", "q"});
        } else if (i3 == 3) {
            return new bnm();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) r);
            }
            if (i3 == 5) {
                return r;
            }
            auef auef = s;
            if (auef == null) {
                synchronized (bnm.class) {
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
