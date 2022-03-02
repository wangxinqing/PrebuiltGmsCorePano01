package defpackage;

/* renamed from: aqof  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqof extends aucj implements audy {
    public static final aqof l;
    private static volatile auef m;
    public int a;
    public int b;
    public String c = "";
    public String d = "";
    public int e;
    public String f = "";
    public String g = "";
    public String h = "";
    public String i = "";
    public aucx j = auei.b;
    public auay k = auay.b;

    static {
        aqof aqof = new aqof();
        l = aqof;
        aucj.a(aqof.class, (aucj) aqof);
    }

    private aqof() {
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
            return aucj.a((audx) l, "\u0001\n\u0000\u0001\u0003\f\n\u0000\u0001\u0000\u0003\b\u0004\u0004\b\u0005\u0005\b\u0006\u0006\b\u0007\u0007\b\u0002\b\u0004\u0003\t\u0004\u0000\n\b\u0001\u000b\u001a\f\n\b", new Object[]{"a", "f", "g", "h", "i", "d", "e", "b", "c", "j", "k"});
        } else if (i3 == 3) {
            return new aqof();
        } else {
            if (i3 == 4) {
                return new aqoe();
            }
            if (i3 == 5) {
                return l;
            }
            auef auef = m;
            if (auef == null) {
                synchronized (aqof.class) {
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
