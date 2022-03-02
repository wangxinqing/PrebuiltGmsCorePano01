package defpackage;

/* renamed from: atus  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atus extends aucj implements audy {
    public static final atus i;
    public static final auci j;
    private static volatile auef k;
    public int a;
    public int b;
    public int c;
    public float d;
    public float e;
    public double f;
    public float g;
    public int h;

    static {
        atus atus = new atus();
        i = atus;
        aucj.a(atus.class, (aucj) atus);
        atjm atjm = atjm.a;
        atus atus2 = i;
        j = aucj.a((audx) atjm, (Object) atus2, (audx) atus2, 76736864, aufw.MESSAGE);
    }

    private atus() {
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
            return aucj.a((audx) i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0004\u0001\u0004\u0001\u0002\u0005\u0001\u0003\u0006\u0000\u0004\u0007\u0001\u0005\b\f\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", atur.a});
        } else if (i3 == 3) {
            return new atus();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) i);
            }
            if (i3 == 5) {
                return i;
            }
            auef auef = k;
            if (auef == null) {
                synchronized (atus.class) {
                    auef = k;
                    if (auef == null) {
                        auef = new auce(i);
                        k = auef;
                    }
                }
            }
            return auef;
        }
    }
}
