package defpackage;

/* renamed from: qhb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qhb extends aucj implements audy {
    public static final qhb j;
    private static volatile auef k;
    public aucx a = auei.b;
    public aucx b = auei.b;
    public qhi c;
    public qha d;
    public aucx e = auei.b;
    public aucx f = auei.b;
    public aucx g = auei.b;
    public int h;
    public String i = "";

    static {
        qhb qhb = new qhb();
        j = qhb;
        aucj.a(qhb.class, (aucj) qhb);
    }

    private qhb() {
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
            return aucj.a((audx) j, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0005\u0000\u0001\u001b\u0002\u001b\u0003\t\u0004\t\u0005\u001b\u0006\u001b\u0007\u0004\bȈ\t\u001b", new Object[]{"a", qhh.class, "b", qhg.class, "c", "d", "e", qgz.class, "f", qhf.class, "h", "i", "g", qhc.class});
        } else if (i3 == 3) {
            return new qhb();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) j);
            }
            if (i3 == 5) {
                return j;
            }
            auef auef = k;
            if (auef == null) {
                synchronized (qhb.class) {
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
