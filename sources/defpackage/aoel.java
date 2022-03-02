package defpackage;

/* renamed from: aoel  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aoel extends aucj implements audy {
    public static final aoel b;
    private static volatile auef c;
    public aucs a = aucl.b;

    static {
        aoel aoel = new aoel();
        b = aoel;
        aucj.a(aoel.class, (aucj) aoel);
    }

    private aoel() {
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
            return aucj.a((audx) b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"a", aocr.b()});
        } else if (i2 == 3) {
            return new aoel();
        } else {
            if (i2 == 4) {
                return new aoek();
            }
            if (i2 == 5) {
                return b;
            }
            auef auef = c;
            if (auef == null) {
                synchronized (aoel.class) {
                    auef = c;
                    if (auef == null) {
                        auef = new auce(b);
                        c = auef;
                    }
                }
            }
            return auef;
        }
    }
}
