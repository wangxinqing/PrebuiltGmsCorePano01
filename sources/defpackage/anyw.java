package defpackage;

/* renamed from: anyw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anyw extends aucj implements audy {
    public static final anyw j;
    private static volatile auef k;
    public int a;
    public int b;
    public long c;
    public long d;
    public boolean e;
    public boolean f;
    public int g;
    public int h;
    public int i;

    static {
        anyw anyw = new anyw();
        j = anyw;
        aucj.a(anyw.class, (aucj) anyw);
    }

    private anyw() {
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
            return aucj.a((audx) j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0002\u0001\u0003\u0002\u0002\u0004\u0007\u0003\u0005\u0007\u0004\u0006\u0004\u0005\u0007\u0004\u0006\b\u0004\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i"});
        } else if (i3 == 3) {
            return new anyw();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) j);
            }
            if (i3 == 5) {
                return j;
            }
            auef auef = k;
            if (auef == null) {
                synchronized (anyw.class) {
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
