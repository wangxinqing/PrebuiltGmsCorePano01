package defpackage;

/* renamed from: aarg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aarg extends aucj implements audy {
    public static final aarg k;
    private static volatile auef l;
    public int a;
    public auay b = auay.b;
    public String c = "";
    public aucx d = auei.b;
    public auay e = auay.b;
    public int f;
    public aucx g = auei.b;
    public aark h;
    public long i;
    public boolean j;

    static {
        aarg aarg = new aarg();
        k = aarg;
        aucj.a(aarg.class, (aucj) aarg);
    }

    private aarg() {
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
            return aucj.a((audx) k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0000\u0001\n\u0000\u0002\b\u0001\u0003\u001c\u0004\n\u0002\u0005\u0004\u0003\u0006\u001b\u0007\t\u0004\b\u0003\u0005\t\u0007\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", aarl.class, "h", "i", "j"});
        } else if (i3 == 3) {
            return new aarg();
        } else {
            if (i3 == 4) {
                return new aucd((int[][][]) null, (byte[]) null);
            }
            if (i3 == 5) {
                return k;
            }
            auef auef = l;
            if (auef == null) {
                synchronized (aarg.class) {
                    auef = l;
                    if (auef == null) {
                        auef = new auce(k);
                        l = auef;
                    }
                }
            }
            return auef;
        }
    }
}
