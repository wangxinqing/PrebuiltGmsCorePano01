package defpackage;

/* renamed from: aavm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aavm extends aucj implements audy {
    public static final aavm d;
    private static volatile auef e;
    public int a;
    public aavg b;
    public aucx c = auei.b;

    static {
        aavm aavm = new aavm();
        d = aavm;
        aucj.a(aavm.class, (aucj) aavm);
    }

    private aavm() {
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
            return aucj.a((audx) d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0000\u0001\t\u0000\u0003\u001b", new Object[]{"a", "b", "c", aavl.class});
        } else if (i2 == 3) {
            return new aavm();
        } else {
            if (i2 == 4) {
                return new aucd((boolean[][]) null, (int[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (aavm.class) {
                    auef = e;
                    if (auef == null) {
                        auef = new auce(d);
                        e = auef;
                    }
                }
            }
            return auef;
        }
    }
}
