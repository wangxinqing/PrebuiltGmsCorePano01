package defpackage;

/* renamed from: apkf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apkf extends aucj implements audy {
    public static final auct b = new apjy();
    public static final apkf d;
    private static volatile auef e;
    public aucs a = aucl.b;
    public aucx c = auei.b;

    static {
        apkf apkf = new apkf();
        d = apkf;
        aucj.a(apkf.class, (aucj) apkf);
    }

    private apkf() {
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
            return aucj.a((audx) d, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001e\u0002\u001b", new Object[]{"a", apka.b(), "c", apke.class});
        } else if (i2 == 3) {
            return new apkf();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) d);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (apkf.class) {
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
