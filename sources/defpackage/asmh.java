package defpackage;

/* renamed from: asmh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class asmh extends aucj implements audy {
    public static final asmh e;
    private static volatile auef f;
    public int a;
    public int b;
    public asme c;
    public asmd d;

    static {
        asmh asmh = new asmh();
        e = asmh;
        aucj.a(asmh.class, (aucj) asmh);
    }

    private asmh() {
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0001\u0003\t\u0002", new Object[]{"a", "b", asmf.a, "c", "d"});
        } else if (i2 == 3) {
            return new asmh();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (asmh.class) {
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
