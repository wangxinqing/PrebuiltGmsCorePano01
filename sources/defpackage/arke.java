package defpackage;

/* renamed from: arke  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arke extends aucj implements audy {
    public static final arke e;
    private static volatile auef f;
    public int a;
    public int b = 0;
    public Object c;
    public long d;

    static {
        arke arke = new arke();
        e = arke;
        aucj.a(arke.class, (aucj) arke);
    }

    private arke() {
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
            return aucj.a((audx) e, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0003\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"c", "b", "a", "d", arjy.class, arkc.class, arkb.class, arkd.class, arjx.class});
        } else if (i2 == 3) {
            return new arke();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (arke.class) {
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
