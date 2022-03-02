package defpackage;

/* renamed from: antk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class antk extends aucj implements audy {
    public static final antk i;
    private static volatile auef j;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public long g;
    public boolean h;

    static {
        antk antk = new antk();
        i = antk;
        aucj.a(antk.class, (aucj) antk);
    }

    private antk() {
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
            return aucj.a((audx) i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001\u0003\u0002\u0006\u0004\u0007\u0007\u0005\f\u0002\u0007\f\u0004\b\f\u0005", new Object[]{"a", "b", qbp.b(), "c", qbn.b(), "g", "h", "d", qcp.b(), "e", qcr.b(), "f", qct.b()});
        } else if (i3 == 3) {
            return new antk();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) i);
            }
            if (i3 == 5) {
                return i;
            }
            auef auef = j;
            if (auef == null) {
                synchronized (antk.class) {
                    auef = j;
                    if (auef == null) {
                        auef = new auce(i);
                        j = auef;
                    }
                }
            }
            return auef;
        }
    }
}
