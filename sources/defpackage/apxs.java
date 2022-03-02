package defpackage;

/* renamed from: apxs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apxs extends aucj implements audy {
    public static final apxs a;
    public static final auci b;
    private static volatile auef c;

    static {
        apxs apxs = new apxs();
        a = apxs;
        aucj.a(apxs.class, (aucj) apxs);
        aujv aujv = aujv.a;
        apxs apxs2 = a;
        b = aucj.a((audx) aujv, (Object) apxs2, (audx) apxs2, 203522521, aufw.MESSAGE);
    }

    private apxs() {
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
            return aucj.a((audx) a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new apxs();
        }
        if (i2 == 4) {
            return new aucd((aucj) a);
        }
        if (i2 == 5) {
            return a;
        }
        auef auef = c;
        if (auef == null) {
            synchronized (apxs.class) {
                auef = c;
                if (auef == null) {
                    auef = new auce(a);
                    c = auef;
                }
            }
        }
        return auef;
    }
}
