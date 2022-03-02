package defpackage;

/* renamed from: aqps  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqps extends aucj implements audy {
    public static final aqps j;
    private static volatile auef k;
    public int a;
    public String b = "";
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public audr g = audr.b;
    public aucx h = auei.b;
    public boolean i;

    static {
        aqps aqps = new aqps();
        j = aqps;
        aucj.a(aqps.class, (aucj) aqps);
    }

    private aqps() {
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
            return aucj.a((audx) j, "\u0001\b\u0000\u0001\u0001\b\b\u0001\u0001\u0000\u0001\b\u0000\u0002\b\u0002\u0003\b\u0001\u0004\b\u0003\u0005\b\u0004\u00062\u0007\u001a\b\u0007\u0005", new Object[]{"a", "b", "d", "c", "e", "f", "g", aqpr.a, "h", "i"});
        } else if (i3 == 3) {
            return new aqps();
        } else {
            if (i3 == 4) {
                return new aqpq();
            }
            if (i3 == 5) {
                return j;
            }
            auef auef = k;
            if (auef == null) {
                synchronized (aqps.class) {
                    auef = k;
                    if (auef == null) {
                        auef = new auce(j);
                        k = auef;
                    }
                }
            }
            return auef;
        }
    }
}
