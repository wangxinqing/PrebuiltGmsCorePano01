package defpackage;

/* renamed from: auwg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class auwg extends aucj implements audy {
    public static final auwg i;
    private static volatile auef j;
    public int a;
    public int b;
    public int c;
    public int d;
    public double e;
    public long f;
    public int g;
    public int h;

    static {
        auwg auwg = new auwg();
        i = auwg;
        aucj.a(auwg.class, (aucj) auwg);
    }

    private auwg() {
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
            return aucj.a((audx) i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0004\u0001\u0003\u0004\u0002\u0004\u0000\u0003\u0005\u0002\u0004\u0006\f\u0005\u0007\f\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", avax.a, "h", asoz.a});
        } else if (i3 == 3) {
            return new auwg();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) i);
            }
            if (i3 == 5) {
                return i;
            }
            auef auef = j;
            if (auef == null) {
                synchronized (auwg.class) {
                    auef = j;
                    if (auef == null) {
                        auef = new auce(i);
                        j = auef;
                    }
                }
            }
            return auef;
        }
    }
}
