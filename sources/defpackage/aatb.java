package defpackage;

/* renamed from: aatb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aatb extends aucj implements audy {
    public static final aatb n;
    private static volatile auef o;
    public int a;
    public String b = "";
    public String c = "";
    public int d;
    public int e;
    public String f = "";
    public aucx g = auei.b;
    public String h = "";
    public String i = "";
    public String j = "";
    public aucx k = auei.b;
    public aatg l;
    public aucx m = auei.b;

    static {
        aatb aatb = new aatb();
        n = aatb;
        aucj.a(aatb.class, (aucj) aatb);
    }

    private aatb() {
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
            return aucj.a((audx) n, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0003\u0000\u0001\b\u0000\u0002\b\u0001\u0003\u0004\u0002\u0004\u0004\u0003\u0005\b\u0004\u0006\u001b\u0007\b\u0005\b\b\u0006\t\b\u0007\n\u001b\u000b\t\b\f\u001b", new Object[]{"a", "b", "c", "d", "e", "f", "g", aasw.class, "h", "i", "j", "k", aatu.class, "l", "m", aatq.class});
        } else if (i3 == 3) {
            return new aatb();
        } else {
            if (i3 == 4) {
                return new aucd((float[][]) null, (short[][]) null);
            }
            if (i3 == 5) {
                return n;
            }
            auef auef = o;
            if (auef == null) {
                synchronized (aatb.class) {
                    auef = o;
                    if (auef == null) {
                        auef = new auce(n);
                        o = auef;
                    }
                }
            }
            return auef;
        }
    }
}
