package defpackage;

/* renamed from: asuq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class asuq extends aucj implements audy {
    public static final asuq l;
    private static volatile auef m;
    public int a;
    public asuu b;
    public long c;
    public String d = "";
    public avoq e;
    public long f;
    public float g;
    public int h;
    public auay i = auay.b;
    public String j = "";
    public aucx k = auei.b;

    static {
        asuq asuq = new asuq();
        l = asuq;
        aucj.a(asuq.class, (aucj) asuq);
    }

    private asuq() {
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
            return aucj.a((audx) l, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0001\u0000\u0001\t\u0000\u0002\u0005\u0001\u0003\b\u0002\u0004\t\u0003\u0005\u0005\u0004\u0006\u0001\u0005\u0007\u0004\u0006\b\n\u0007\t\b\b\n\u001c", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"});
        } else if (i3 == 3) {
            return new asuq();
        } else {
            if (i3 == 4) {
                return new aucd((boolean[][]) null, (boolean[][]) null);
            }
            if (i3 == 5) {
                return l;
            }
            auef auef = m;
            if (auef == null) {
                synchronized (asuq.class) {
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
