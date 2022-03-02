package defpackage;

/* renamed from: tzk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tzk extends aucj implements audy {
    public static final tzk c;
    public static final auci d;
    private static volatile auef e;
    public int a = 0;
    public Object b;

    static {
        tzk tzk = new tzk();
        c = tzk;
        aucj.a(tzk.class, (aucj) tzk);
        aujv aujv = aujv.a;
        tzk tzk2 = c;
        d = aucj.a((audx) aujv, (Object) tzk2, (audx) tzk2, 190536965, aufw.MESSAGE);
    }

    private tzk() {
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
            return aucj.a((audx) c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001?\u0000\u0002<\u0000", new Object[]{"b", "a", tzl.a, tzj.class});
        } else if (i2 == 3) {
            return new tzk();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) c);
            }
            if (i2 == 5) {
                return c;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (tzk.class) {
                    auef = e;
                    if (auef == null) {
                        auef = new auce(c);
                        e = auef;
                    }
                }
            }
            return auef;
        }
    }
}
