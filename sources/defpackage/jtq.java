package defpackage;

/* renamed from: jtq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jtq extends aucj implements audy {
    public static final jtq d;
    private static volatile auef e;
    public aucx a = auei.b;
    public aucx b = auei.b;
    public aucx c = auei.b;

    static {
        jtq jtq = new jtq();
        d = jtq;
        aucj.a(jtq.class, (aucj) jtq);
    }

    private jtq() {
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
            return aucj.a((audx) d, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0000\u0001\u001a\u0002\u001a\u0003\u001a", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new jtq();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) d);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (jtq.class) {
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
