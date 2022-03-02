package defpackage;

/* renamed from: atwh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atwh extends aucj implements audy {
    public static final atwh d;
    private static volatile auef e;
    public int a;
    public aucx b = auei.b;
    public atvp c;

    static {
        atwh atwh = new atwh();
        d = atwh;
        aucj.a(atwh.class, (aucj) atwh);
    }

    private atwh() {
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
            return aucj.a((audx) d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\t\u0000", new Object[]{"a", "b", atwg.class, "c"});
        } else if (i2 == 3) {
            return new atwh();
        } else {
            if (i2 == 4) {
                return new aucd((int[]) null, (boolean[]) null);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (atwh.class) {
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
