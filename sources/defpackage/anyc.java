package defpackage;

/* renamed from: anyc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anyc extends aucj implements audy {
    public static final anyc j;
    private static volatile auef k;
    public int a;
    public String b = "";
    public int c;
    public int d;
    public String e = "";
    public int f;
    public int g;
    public int h;
    public int i;

    static {
        anyc anyc = new anyc();
        j = anyc;
        aucj.a(anyc.class, (aucj) anyc);
    }

    private anyc() {
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
            return aucj.a((audx) j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\b\u0000\u0002\u0004\u0001\u0003\u0004\u0002\u0004\b\u0003\u0005\u0004\u0004\u0006\f\u0005\u0007\f\u0006\b\f\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g", anxz.a, "h", anyb.a, "i", anya.a});
        } else if (i3 == 3) {
            return new anyc();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) j);
            }
            if (i3 == 5) {
                return j;
            }
            auef auef = k;
            if (auef == null) {
                synchronized (anyc.class) {
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
