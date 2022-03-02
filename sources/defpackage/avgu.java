package defpackage;

/* renamed from: avgu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avgu extends aucj implements audy {
    public static final avgu f;
    public static final auci g;
    private static volatile auef h;
    public int a;
    public avfe b;
    public aucx c = auei.b;
    public aucx d = auei.b;
    public avgt e;

    static {
        avgu avgu = new avgu();
        f = avgu;
        aucj.a(avgu.class, (aucj) avgu);
        amdy amdy = amdy.a;
        avgu avgu2 = f;
        g = aucj.a((audx) amdy, (Object) avgu2, (audx) avgu2, 96705961, aufw.MESSAGE);
    }

    private avgu() {
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
            return aucj.a((audx) f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001\t\u0000\u0002\u001b\u0003\u001b\u0004\t\u0001", new Object[]{"a", "b", "c", avge.class, "d", avge.class, "e"});
        } else if (i2 == 3) {
            return new avgu();
        } else {
            if (i2 == 4) {
                return new aucd((char[][]) null, (boolean[]) null);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (avgu.class) {
                    auef = h;
                    if (auef == null) {
                        auef = new auce(f);
                        h = auef;
                    }
                }
            }
            return auef;
        }
    }
}
