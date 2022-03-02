package defpackage;

/* renamed from: aott  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aott extends aucj implements audy {
    public static final aott i;
    private static volatile auef j;
    public int a;
    public int b = 0;
    public Object c;
    public auay d = auay.b;
    public auay e = auay.b;
    public long f;
    public aotw g;
    public String h = "";

    static {
        aott aott = new aott();
        i = aott;
        aucj.a(aott.class, (aucj) aott);
    }

    private aott() {
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
            return aucj.a((audx) i, "\u0001\t\u0001\u0001\u0001\n\t\u0000\u0000\u0000\u0001\n\u0000\u0002\u0002\u0002\u0003<\u0000\u0004\t\u0007\u0006\b\t\u0007<\u0000\b\n\u0001\t<\u0000\n<\u0000", new Object[]{"c", "b", "a", "d", "f", aotn.class, "g", "h", aotv.class, "e", aotu.class, aoto.class});
        } else if (i3 == 3) {
            return new aott();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) i);
            }
            if (i3 == 5) {
                return i;
            }
            auef auef = j;
            if (auef == null) {
                synchronized (aott.class) {
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
