package defpackage;

/* renamed from: apxr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apxr extends aucj implements audy {
    public static final apxr d;
    public static final auci e;
    private static volatile auef f;
    public int a;
    public long b;
    public aucx c = auei.b;

    static {
        apxr apxr = new apxr();
        d = apxr;
        aucj.a(apxr.class, (aucj) apxr);
        aujv aujv = aujv.a;
        apxr apxr2 = d;
        e = aucj.a((audx) aujv, (Object) apxr2, (audx) apxr2, 182135729, aufw.MESSAGE);
    }

    private apxr() {
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
            return aucj.a((audx) d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0002\u0000\u0002\u001a", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new apxr();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) d);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (apxr.class) {
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
