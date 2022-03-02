package defpackage;

/* renamed from: aojd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aojd extends aucj implements audy {
    public static final aojd b;
    private static volatile auef c;
    public aucx a = auei.b;

    static {
        aojd aojd = new aojd();
        b = aojd;
        aucj.a(aojd.class, (aucj) aojd);
    }

    private aojd() {
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
            return aucj.a((audx) b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", aoks.class});
        } else if (i2 == 3) {
            return new aojd();
        } else {
            if (i2 == 4) {
                return new aojc();
            }
            if (i2 == 5) {
                return b;
            }
            auef auef = c;
            if (auef == null) {
                synchronized (aojd.class) {
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
