package defpackage;

/* renamed from: atuq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atuq extends aucj implements audy {
    public static final atuq c;
    public static final auci d;
    private static volatile auef e;
    public int a;
    public String b = "";

    static {
        atuq atuq = new atuq();
        c = atuq;
        aucj.a(atuq.class, (aucj) atuq);
        atjm atjm = atjm.a;
        atuq atuq2 = c;
        d = aucj.a((audx) atjm, (Object) atuq2, (audx) atuq2, 144125551, aufw.MESSAGE);
    }

    private atuq() {
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
            return aucj.a((audx) c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\b\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new atuq();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) c);
            }
            if (i2 == 5) {
                return c;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (atuq.class) {
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
