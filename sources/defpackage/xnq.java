package defpackage;

/* renamed from: xnq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xnq extends aucj implements audy {
    public static final xnq h;
    private static volatile auef i;
    public int a;
    public int b;
    public long c;
    public int d;
    public int e;
    public xno f;
    public aucx g = auei.b;

    static {
        xnq xnq = new xnq();
        h = xnq;
        aucj.a(xnq.class, (aucj) xnq);
    }

    private xnq() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 1) {
            return null;
        }
        if (i3 == 2) {
            return aucj.a((audx) h, "\u0001\u0005\u0000\u0002\n#\u0005\u0000\u0001\u0000\n\u0002\u0001\u0012\u0004\u0011\u0013\u0004\u0012\"\t!#\u001b", new Object[]{"a", "b", "c", "d", "e", "f", "g", xnp.class});
        } else if (i3 == 3) {
            return new xnq();
        } else {
            if (i3 == 4) {
                return new aucd((byte[]) null, (float[][]) null);
            }
            if (i3 == 5) {
                return h;
            }
            auef auef = i;
            if (auef == null) {
                synchronized (xnq.class) {
                    auef = i;
                    if (auef == null) {
                        auef = new auce(h);
                        i = auef;
                    }
                }
            }
            return auef;
        }
    }
}
