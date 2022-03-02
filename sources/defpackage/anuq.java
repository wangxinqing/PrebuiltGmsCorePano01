package defpackage;

/* renamed from: anuq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anuq extends aucj implements audy {
    public static final anuq d;
    private static volatile auef e;
    public int a;
    public anup b;
    public aucx c = auei.b;

    static {
        anuq anuq = new anuq();
        d = anuq;
        aucj.a(anuq.class, (aucj) anuq);
    }

    private anuq() {
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
            return aucj.a((audx) d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\t\u0000\u0002\u001b", new Object[]{"a", "b", "c", anun.class});
        } else if (i2 == 3) {
            return new anuq();
        } else {
            if (i2 == 4) {
                return new aucd((float[][]) null, (char[][]) null);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (anuq.class) {
                    auef = e;
                    if (auef == null) {
                        auef = new auce(d);
                        e = auef;
                    }
                }
            }
            return auef;
        }
    }
}
