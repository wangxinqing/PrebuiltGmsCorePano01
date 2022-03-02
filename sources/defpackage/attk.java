package defpackage;

/* renamed from: attk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class attk extends aucj implements audy {
    public static final attk c;
    public static final auci d;
    private static volatile auef e;
    public int a;
    public int b;

    static {
        attk attk = new attk();
        c = attk;
        aucj.a(attk.class, (aucj) attk);
        atjm atjm = atjm.a;
        attk attk2 = c;
        d = aucj.a((audx) atjm, (Object) attk2, (audx) attk2, 125695874, aufw.MESSAGE);
    }

    private attk() {
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
            return aucj.a((audx) c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f\u0000", new Object[]{"a", "b", atti.a});
        } else if (i2 == 3) {
            return new attk();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) c);
            }
            if (i2 == 5) {
                return c;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (attk.class) {
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
