package defpackage;

/* renamed from: anyj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anyj extends aucj implements audy {
    public static final anyj d;
    private static volatile auef e;
    public int a;
    public aucx b = auei.b;
    public int c;

    static {
        anyj anyj = new anyj();
        d = anyj;
        aucj.a(anyj.class, (aucj) anyj);
    }

    private anyj() {
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
            return aucj.a((audx) d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0004\u0000", new Object[]{"a", "b", anyg.class, "c"});
        } else if (i2 == 3) {
            return new anyj();
        } else {
            if (i2 == 4) {
                return new aucd((float[][]) null, (short[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (anyj.class) {
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
