package defpackage;

/* renamed from: antv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class antv extends aucj implements audy {
    public static final antv h;
    private static volatile auef i;
    public int a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;

    static {
        antv antv = new antv();
        h = antv;
        aucj.a(antv.class, (aucj) antv);
    }

    private antv() {
        auei auei = auei.b;
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
            return aucj.a((audx) h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001\u0007\u0000\u0002\u0007\u0001\u0003\u0007\u0002\u0005\u0007\u0003\u0006\u0007\u0004\u0007\u0007\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        } else if (i3 == 3) {
            return new antv();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) h);
            }
            if (i3 == 5) {
                return h;
            }
            auef auef = i;
            if (auef == null) {
                synchronized (antv.class) {
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
