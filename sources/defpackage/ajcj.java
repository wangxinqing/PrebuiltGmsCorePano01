package defpackage;

/* renamed from: ajcj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajcj extends aucj implements audy {
    public static final ajcj m;
    private static volatile auef n;
    public double a;
    public double b;
    public double c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public long j;
    public long k;
    public double l;

    static {
        ajcj ajcj = new ajcj();
        m = ajcj;
        aucj.a(ajcj.class, (aucj) ajcj);
    }

    private ajcj() {
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
            return aucj.a((audx) m, "\u0000\f\u0000\u0000\u0001\f\f\u0000\u0000\u0000\u0001\u0000\u0002\u0000\u0003\u0000\u0004\u0001\u0005\u0001\u0006\u0001\u0007\u0001\b\u0001\t\u0001\n\u0002\u000b\u0002\f\u0000", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l"});
        } else if (i3 == 3) {
            return new ajcj();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) m);
            }
            if (i3 == 5) {
                return m;
            }
            auef auef = n;
            if (auef == null) {
                synchronized (ajcj.class) {
                    auef = n;
                    if (auef == null) {
                        auef = new auce(m);
                        n = auef;
                    }
                }
            }
            return auef;
        }
    }
}
