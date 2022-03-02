package defpackage;

/* renamed from: aizj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aizj extends aucj implements audy {
    public static final aizj d;
    private static volatile auef e;
    public aucx a = auei.b;
    public aucs b = aucl.b;
    public aucx c = auei.b;

    static {
        aizj aizj = new aizj();
        d = aizj;
        aucj.a(aizj.class, (aucj) aizj);
    }

    private aizj() {
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
            return aucj.a((audx) d, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0000\u0001\u001a\u0002\u0016\u0003\u001c", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new aizj();
        } else {
            if (i2 == 4) {
                return new aucd((byte[][][]) null);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (aizj.class) {
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
