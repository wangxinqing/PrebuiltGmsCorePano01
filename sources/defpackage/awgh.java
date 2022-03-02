package defpackage;

/* renamed from: awgh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awgh extends aucj implements audy {
    public static final awgh e;
    private static volatile auef f;
    public awgr a;
    public String b = "";
    public awgj c;
    public awgq d;

    static {
        awgh awgh = new awgh();
        e = awgh;
        aucj.a(awgh.class, (aucj) awgh);
    }

    private awgh() {
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
            return aucj.a((audx) e, "\u0000\u0004\u0000\u0000\u0001\u0005\u0004\u0000\u0000\u0000\u0001\t\u0002Ȉ\u0003\t\u0005\t", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new awgh();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (awgh.class) {
                    auef = f;
                    if (auef == null) {
                        auef = new auce(e);
                        f = auef;
                    }
                }
            }
            return auef;
        }
    }
}
