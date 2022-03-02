package defpackage;

/* renamed from: araz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class araz extends aucj implements audy {
    public static final araz c;
    private static volatile auef d;
    public aucx a = auei.b;
    public audr b = audr.b;

    static {
        araz araz = new araz();
        c = araz;
        aucj.a(araz.class, (aucj) araz);
    }

    private araz() {
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
            return aucj.a((audx) c, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0001\u0001\u0000\u0002\u001b\u00032", new Object[]{"a", aran.class, "b", aray.a});
        } else if (i2 == 3) {
            return new araz();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) c);
            }
            if (i2 == 5) {
                return c;
            }
            auef auef = d;
            if (auef == null) {
                synchronized (araz.class) {
                    auef = d;
                    if (auef == null) {
                        auef = new auce(c);
                        d = auef;
                    }
                }
            }
            return auef;
        }
    }
}
