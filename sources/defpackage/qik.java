package defpackage;

/* renamed from: qik  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qik extends aucj implements audy {
    public static final qik m;
    private static volatile auef n;
    public aucx a = auei.b;
    public aucx b = auei.b;
    public aucx c = auei.b;
    public int d;
    public auay e = auay.b;
    public String f = "";
    public long g;
    public auay h = auay.b;
    public int i;
    public int j;
    public aucx k = auei.b;
    public int l;

    static {
        qik qik = new qik();
        m = qik;
        aucj.a(qik.class, (aucj) qik);
    }

    private qik() {
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
            return aucj.a((audx) m, "\u0000\f\u0000\u0000\u0001\r\f\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u0004\u0004\n\u0005Ȉ\u0006\u0002\b\u001b\t\n\nȚ\u000b\u0004\f\u0004\r\u0004", new Object[]{"a", qiv.class, "b", qiq.class, "d", "e", "f", "g", "c", qiw.class, "h", "k", "l", "i", "j"});
        } else if (i3 == 3) {
            return new qik();
        } else {
            if (i3 == 4) {
                return new aucd((short[][][]) null, (short[][][]) null);
            }
            if (i3 == 5) {
                return m;
            }
            auef auef = n;
            if (auef == null) {
                synchronized (qik.class) {
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
