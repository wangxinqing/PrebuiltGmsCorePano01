package defpackage;

/* renamed from: avja  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avja extends aucj implements audy {
    public static final avja f;
    private static volatile auef g;
    public int a;
    public avjb b;
    public aucx c = auei.b;
    public aucx d = auei.b;
    public avjb e;

    static {
        avja avja = new avja();
        f = avja;
        aucj.a(avja.class, (aucj) avja);
    }

    private avja() {
        auei auei = auei.b;
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
            return aucj.a((audx) f, "\u0001\u0004\u0000\u0001\u0002\n\u0004\u0000\u0002\u0000\u0002\t\u0001\u0004\u001b\u0006\u001b\n\t\u0004", new Object[]{"a", "b", "c", avjb.class, "d", avjb.class, "e"});
        } else if (i2 == 3) {
            return new avja();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) f);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (avja.class) {
                    auef = g;
                    if (auef == null) {
                        auef = new auce(f);
                        g = auef;
                    }
                }
            }
            return auef;
        }
    }
}
