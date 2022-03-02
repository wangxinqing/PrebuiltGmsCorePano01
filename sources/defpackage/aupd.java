package defpackage;

/* renamed from: aupd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aupd extends aucj implements audy {
    public static final aupd d;
    private static volatile auef e;
    public int a;
    public aucx b = auei.b;
    public int c;

    static {
        aupd aupd = new aupd();
        d = aupd;
        aucj.a(aupd.class, (aucj) aupd);
    }

    private aupd() {
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
            return aucj.a((audx) d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002\f\u0000", new Object[]{"a", "b", "c", aupb.a});
        } else if (i2 == 3) {
            return new aupd();
        } else {
            if (i2 == 4) {
                return new aucd((char[][][]) null, (char[]) null);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (aupd.class) {
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
