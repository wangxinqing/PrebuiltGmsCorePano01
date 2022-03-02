package defpackage;

/* renamed from: atku  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atku extends aucj implements audy {
    public static final atku j;
    private static volatile auef k;
    public int a;
    public int b;
    public int c;
    public long d;
    public int e;
    public int f;
    public double g;
    public double h;
    public long i;

    static {
        atku atku = new atku();
        j = atku;
        aucj.a(atku.class, (aucj) atku);
    }

    private atku() {
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
            return aucj.a((audx) j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001\u0003\u0002\u0002\u0004\u0004\u0003\u0005\u0004\u0004\u0006\u0000\u0005\u0007\u0000\u0006\b\u0002\u0007", new Object[]{"a", "b", atks.a, "c", atkr.a, "d", "e", "f", "g", "h", "i"});
        } else if (i3 == 3) {
            return new atku();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) j);
            }
            if (i3 == 5) {
                return j;
            }
            auef auef = k;
            if (auef == null) {
                synchronized (atku.class) {
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
