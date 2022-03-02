package defpackage;

/* renamed from: atta  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atta extends aucj implements audy {
    public static final atta c;
    public static final auci d;
    public static final auci e;
    private static volatile auef g;
    public aucx a = auei.b;
    public aucx b = auei.b;
    private byte f = 2;

    static {
        atta atta = new atta();
        c = atta;
        aucj.a(atta.class, (aucj) atta);
        atjm atjm = atjm.a;
        atta atta2 = c;
        d = aucj.a((audx) atjm, (Object) atta2, (audx) atta2, 108026902, aufw.MESSAGE);
        aujv aujv = aujv.a;
        atta atta3 = c;
        e = aucj.a((audx) aujv, (Object) atta3, (audx) atta3, 108026902, aufw.MESSAGE);
    }

    private atta() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        byte b2 = 0;
        if (i2 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.f = b2;
            return null;
        } else if (i2 == 2) {
            return aucj.a((audx) c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0001\u0001\u001b\u0002Л", new Object[]{"a", astv.class, "b", astz.class});
        } else if (i2 == 3) {
            return new atta();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) c);
            }
            if (i2 == 5) {
                return c;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (atta.class) {
                    auef = g;
                    if (auef == null) {
                        auef = new auce(c);
                        g = auef;
                    }
                }
            }
            return auef;
        }
    }
}
