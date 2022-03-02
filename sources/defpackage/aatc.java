package defpackage;

/* renamed from: aatc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aatc extends aucj implements audy {
    public static final aatc g;
    private static volatile auef h;
    public int a;
    public int b;
    public String c = "";
    public long d;
    public aucx e = auei.b;
    public String f = "";

    static {
        aatc aatc = new aatc();
        g = aatc;
        aucj.a(aatc.class, (aucj) aatc);
    }

    private aatc() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 1) {
            return null;
        }
        if (i2 == 2) {
            return aucj.a((audx) g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u0004\u0000\u0002\b\u0001\u0003\u0002\u0002\u0004\u001b\u0005\b\u0003", new Object[]{"a", "b", "c", "d", "e", aasm.class, "f"});
        } else if (i2 == 3) {
            return new aatc();
        } else {
            if (i2 == 4) {
                return new aucd((float[][]) null, (byte[][][]) null);
            }
            if (i2 == 5) {
                return g;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (aatc.class) {
                    auef = h;
                    if (auef == null) {
                        auef = new auce(g);
                        h = auef;
                    }
                }
            }
            return auef;
        }
    }
}
