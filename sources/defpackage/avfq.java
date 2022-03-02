package defpackage;

/* renamed from: avfq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avfq extends aucj implements audy {
    public static final avfq b;
    public static final auci c;
    private static volatile auef d;
    public aucx a = auei.b;

    static {
        avfq avfq = new avfq();
        b = avfq;
        aucj.a(avfq.class, (aucj) avfq);
        amdw amdw = amdw.b;
        avfq avfq2 = b;
        c = aucj.a((audx) amdw, (Object) avfq2, (audx) avfq2, 71464407, aufw.MESSAGE);
    }

    private avfq() {
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
            return aucj.a((audx) b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", avgx.class});
        } else if (i2 == 3) {
            return new avfq();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) b);
            }
            if (i2 == 5) {
                return b;
            }
            auef auef = d;
            if (auef == null) {
                synchronized (avfq.class) {
                    auef = d;
                    if (auef == null) {
                        auef = new auce(b);
                        d = auef;
                    }
                }
            }
            return auef;
        }
    }
}
