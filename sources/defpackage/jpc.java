package defpackage;

/* renamed from: jpc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jpc extends aucj implements audy {
    public static final jpc q;
    private static volatile auef r;
    public int a;
    public String b = "";
    public String c = "";
    public String d = "";
    public aucx e = auei.b;
    public aucx f = auei.b;
    public int g;
    public String h = "";
    public String i = "";
    public String j = "";
    public aucx k = auei.b;
    public int l;
    public aucx m = auei.b;
    public int n;
    public int o;
    public int p;

    static {
        jpc jpc = new jpc();
        q = jpc;
        aucj.a(jpc.class, (aucj) jpc);
    }

    private jpc() {
        auay auay = auay.b;
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
            return aucj.a((audx) q, "\u0001\u000f\u0000\u0001\u0001\u0014\u000f\u0000\u0004\u0000\u0001\b\u0004\u0006\b\u0005\u0007\b\u0006\b\u001b\t\u001b\u000b\u0004\b\f\b\n\r\b\t\u000e\b\u000b\u000f\u001a\u0010\u0004\f\u0011\u001b\u0012\u0004\r\u0013\u0004\u000e\u0014\u0004\u000f", new Object[]{"a", "b", "c", "d", "e", jpb.class, "f", jpb.class, "g", "i", "h", "j", "k", "l", "m", jpb.class, "n", "o", "p"});
        } else if (i3 == 3) {
            return new jpc();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) q);
            }
            if (i3 == 5) {
                return q;
            }
            auef auef = r;
            if (auef == null) {
                synchronized (jpc.class) {
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
