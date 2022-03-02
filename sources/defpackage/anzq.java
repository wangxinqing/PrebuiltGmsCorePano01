package defpackage;

/* renamed from: anzq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anzq extends aucj implements audy {
    public static final anzq j;
    private static volatile auef k;
    public int a;
    public int b;
    public long c;
    public anzj d;
    public long e;
    public int f;
    public aucs g = aucl.b;
    public aucs h = aucl.b;
    public int i;

    static {
        anzq anzq = new anzq();
        j = anzq;
        aucj.a(anzq.class, (aucj) anzq);
    }

    private anzq() {
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
            return aucj.a((audx) j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0002\u0000\u0001\f\u0000\u0002\u0005\u0001\u0003\t\u0002\u0004\u0002\u0003\u0005\u0004\u0004\u0006\u0016\u0007\u0016\b\u0004\u0005", new Object[]{"a", "b", anzp.a, "c", "d", "e", "f", "g", "h", "i"});
        } else if (i3 == 3) {
            return new anzq();
        } else {
            if (i3 == 4) {
                return new aucd((int[][][]) null);
            }
            if (i3 == 5) {
                return j;
            }
            auef auef = k;
            if (auef == null) {
                synchronized (anzq.class) {
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
