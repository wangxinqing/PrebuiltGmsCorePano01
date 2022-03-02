package defpackage;

/* renamed from: aqll  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqll extends aucj implements audy {
    public static final aqll k;
    private static volatile auef l;
    public int a;
    public boolean b;
    public String c = "";
    public String d = "";
    public int e;
    public int f;
    public int g;
    public aqlj h;
    public int i;
    public String j = "";

    static {
        aqll aqll = new aqll();
        k = aqll;
        aucj.a(aqll.class, (aucj) aqll);
    }

    private aqll() {
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
            return aucj.a((audx) k, "\u0001\t\u0000\u0001\u0001\u000b\t\u0000\u0000\u0000\u0001\u0007\u0000\u0002\b\u0001\u0003\b\u0002\u0004\f\u0003\u0005\f\u0004\u0007\f\u0006\b\t\u0007\n\f\t\u000b\b\n", new Object[]{"a", "b", "c", "d", "e", aqlm.a, "f", aqlo.a, "g", aqlk.a, "h", "i", aqlg.a, "j"});
        } else if (i3 == 3) {
            return new aqll();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) k);
            }
            if (i3 == 5) {
                return k;
            }
            auef auef = l;
            if (auef == null) {
                synchronized (aqll.class) {
                    auef = l;
                    if (auef == null) {
                        auef = new auce(k);
                        l = auef;
                    }
                }
            }
            return auef;
        }
    }
}
