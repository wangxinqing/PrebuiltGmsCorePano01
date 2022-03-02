package defpackage;

/* renamed from: avfp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avfp extends aucj implements audy {
    public static final avfp d;
    public static final auci e;
    private static volatile auef f;
    public int a;
    public avfe b;
    public avgt c;

    static {
        avfp avfp = new avfp();
        d = avfp;
        aucj.a(avfp.class, (aucj) avfp);
        amdv amdv = amdv.a;
        avfp avfp2 = d;
        e = aucj.a((audx) amdv, (Object) avfp2, (audx) avfp2, 71464407, aufw.MESSAGE);
    }

    private avfp() {
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
            return aucj.a((audx) d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new avfp();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) d);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (avfp.class) {
                    auef = f;
                    if (auef == null) {
                        auef = new auce(d);
                        f = auef;
                    }
                }
            }
            return auef;
        }
    }
}
