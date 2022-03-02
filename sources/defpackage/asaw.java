package defpackage;

/* renamed from: asaw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class asaw extends aucj implements audy {
    public static final asaw j;
    private static volatile auef k;
    public int a;
    public int b;
    public asab c;
    public asac d;
    public asat e;
    public arzx f;
    public asae g;
    public asad h;
    public asaj i;

    static {
        asaw asaw = new asaw();
        j = asaw;
        aucj.a(asaw.class, (aucj) asaw);
    }

    private asaw() {
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
            return aucj.a((audx) j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0001\u0003\t\u0002\u0004\t\u0003\u0005\t\u0004\u0006\t\u0005\u0007\t\u0006\b\t\u0007", new Object[]{"a", "b", asav.b(), "c", "d", "e", "f", "g", "h", "i"});
        } else if (i3 == 3) {
            return new asaw();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) j);
            }
            if (i3 == 5) {
                return j;
            }
            auef auef = k;
            if (auef == null) {
                synchronized (asaw.class) {
                    auef = k;
                    if (auef == null) {
                        auef = new auce(j);
                        k = auef;
                    }
                }
            }
            return auef;
        }
    }
}
