package defpackage;

/* renamed from: avfk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avfk extends aucj implements audy {
    public static final avfk c;
    public static final auci d;
    private static volatile auef f;
    public aucx a = auei.b;
    public avga b;
    private int e;

    static {
        avfk avfk = new avfk();
        c = avfk;
        aucj.a(avfk.class, (aucj) avfk);
        amdz amdz = amdz.a;
        avfk avfk2 = c;
        d = aucj.a((audx) amdz, (Object) avfk2, (audx) avfk2, 71464408, aufw.MESSAGE);
    }

    private avfk() {
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
            return aucj.a((audx) c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\t\u0000", new Object[]{"e", "a", avfy.class, "b"});
        } else if (i2 == 3) {
            return new avfk();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) c);
            }
            if (i2 == 5) {
                return c;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (avfk.class) {
                    auef = f;
                    if (auef == null) {
                        auef = new auce(c);
                        f = auef;
                    }
                }
            }
            return auef;
        }
    }
}
