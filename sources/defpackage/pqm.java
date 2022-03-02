package defpackage;

/* renamed from: pqm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pqm extends aucj implements audy {
    public static final pqm q;
    private static volatile auef r;
    public int a;
    public long b;
    public String c = "";
    public String d = "";
    public int e;
    public int f;
    public String g = "";
    public String h = "";
    public String i = "";
    public String j = "";
    public String k = "";
    public String l = "";
    public String m = "";
    public aucx n = auei.b;
    public int o = -1;
    public int p;

    static {
        pqm pqm = new pqm();
        q = pqm;
        aucj.a(pqm.class, (aucj) pqm);
    }

    private pqm() {
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
            return aucj.a((audx) q, "\u0001\u000f\u0000\u0001\u0001\u0015\u000f\u0000\u0001\u0000\u0001\u0002\u0000\u0002\b\u0001\u0003\u0004\u0004\u0004\f\u0005\u0005\b\b\u0006\b\n\u0007\b\u000b\b\b\r\u000b\b\u0006\f\u001b\r\b\u0002\u000f\b\f\u0010\u0004\u000f\u0014\b\t\u0015\f\u0010", new Object[]{"a", "b", "c", "e", "f", pqi.a, "h", "j", "k", "m", "g", "n", baza.class, "d", "l", "o", "i", "p", pqk.a});
        } else if (i3 == 3) {
            return new pqm();
        } else {
            if (i3 == 4) {
                return new aucd((short[][][]) null, (char[]) null);
            }
            if (i3 == 5) {
                return q;
            }
            auef auef = r;
            if (auef == null) {
                synchronized (pqm.class) {
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
