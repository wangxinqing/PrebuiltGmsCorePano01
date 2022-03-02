package defpackage;

/* renamed from: aumw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aumw extends aucj implements audy {
    public static final aumw b;
    private static volatile auef c;
    public aucx a = auei.b;

    static {
        aumw aumw = new aumw();
        b = aumw;
        aucj.a(aumw.class, (aucj) aumw);
    }

    private aumw() {
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
            return aucj.a((audx) b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", aukk.class});
        } else if (i2 == 3) {
            return new aumw();
        } else {
            if (i2 == 4) {
                return new aucd((boolean[]) null, (boolean[]) null);
            }
            if (i2 == 5) {
                return b;
            }
            auef auef = c;
            if (auef == null) {
                synchronized (aumw.class) {
                    auef = c;
                    if (auef == null) {
                        auef = new auce(b);
                        c = auef;
                    }
                }
            }
            return auef;
        }
    }
}
