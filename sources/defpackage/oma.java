package defpackage;

/* renamed from: oma  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oma extends aucj implements audy {
    public static final oma q;
    private static volatile auef r;
    public int a;
    public String b = "";
    public String c = "";
    public String d = "";
    public aucx e = auei.b;
    public olu f;
    public ols g;
    public olr h;
    public olt i;
    public int j;
    public String k = "";
    public olp l;
    public olq m;
    public String n = "";
    public String o = "";
    public String p = "";

    static {
        oma oma = new oma();
        q = oma;
        aucj.a(oma.class, (aucj) oma);
    }

    private oma() {
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
            return aucj.a((audx) q, "\u0001\u000f\u0000\u0001\u0001\u0016\u000f\u0000\u0001\u0000\u0001\b\u0000\u0003\b\u0002\u0004\b\u0003\u0005\u001b\u0006\t\u0004\u0007\t\u0005\n\t\b\u000b\t\t\f\u0004\n\r\b\u000b\u000e\t\f\u000f\t\r\u0010\b\u000e\u0015\b\u0013\u0016\b\u0014", new Object[]{"a", "b", "c", "d", "e", olz.class, "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p"});
        } else if (i3 == 3) {
            return new oma();
        } else {
            if (i3 == 4) {
                return new aucd((float[]) null, (boolean[][]) null);
            }
            if (i3 == 5) {
                return q;
            }
            auef auef = r;
            if (auef == null) {
                synchronized (oma.class) {
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
