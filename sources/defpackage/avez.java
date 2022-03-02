package defpackage;

/* renamed from: avez  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avez extends aucj implements audy {
    public static final avez e;
    public static final auci f;
    private static volatile auef g;
    public int a;
    public avfe b;
    public avge c;
    public avgt d;

    static {
        avez avez = new avez();
        e = avez;
        aucj.a(avez.class, (aucj) avez);
        amdy amdy = amdy.a;
        avez avez2 = e;
        f = aucj.a((audx) amdy, (Object) avez2, (audx) avez2, 84453462, aufw.MESSAGE);
    }

    private avez() {
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001\t\u0000\u0004\t\u0002\u0005\t\u0003", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new avez();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (avez.class) {
                    auef = g;
                    if (auef == null) {
                        auef = new auce(e);
                        g = auef;
                    }
                }
            }
            return auef;
        }
    }
}
