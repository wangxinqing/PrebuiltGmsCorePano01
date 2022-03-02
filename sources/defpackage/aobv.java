package defpackage;

/* renamed from: aobv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aobv extends aucj implements audy {
    public static final aobv j;
    private static volatile auef k;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public aoch f;
    public aocg g;
    public int h;
    public int i;

    static {
        aobv aobv = new aobv();
        j = aobv;
        aucj.a(aobv.class, (aucj) aobv);
    }

    private aobv() {
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
            return aucj.a((audx) j, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001\u0003\u0004\u0002\u0004\f\u0003\u0005\t\u0004\u0007\t\u0006\b\f\u0007\t\f\b", new Object[]{"a", "b", aobs.a, "c", aobu.a, "d", "e", aobr.a, "f", "g", "h", aobq.a, "i", aobt.a});
        } else if (i3 == 3) {
            return new aobv();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) j);
            }
            if (i3 == 5) {
                return j;
            }
            auef auef = k;
            if (auef == null) {
                synchronized (aobv.class) {
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
