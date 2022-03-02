package defpackage;

/* renamed from: avwr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avwr extends aucj implements audy {
    public static final avwr e;
    private static volatile auef f;
    public int a = 0;
    public Object b;
    public String c = "";
    public String d = "";

    static {
        avwr avwr = new avwr();
        e = avwr;
        aucj.a(avwr.class, (aucj) avwr);
    }

    private avwr() {
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
            return aucj.a((audx) e, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȼ\u0000\u0004Ȼ\u0000\u0005Ȼ\u0000\u0006:\u0000\u0007Ȼ\u0000", new Object[]{"b", "a", "c", "d"});
        } else if (i2 == 3) {
            return new avwr();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (avwr.class) {
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
