package defpackage;

/* renamed from: aodr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aodr extends aucj implements audy {
    public static final aodr d;
    private static volatile auef e;
    public int a;
    public aucx b = auei.b;
    public boolean c;

    static {
        aodr aodr = new aodr();
        d = aodr;
        aucj.a(aodr.class, (aucj) aodr);
    }

    private aodr() {
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
            return aucj.a((audx) d, "\u0001\u0002\u0000\u0001\u0002\u0005\u0002\u0000\u0001\u0000\u0002\u001a\u0005\u0007\u0003", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new aodr();
        } else {
            if (i2 == 4) {
                return new aodq();
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (aodr.class) {
                    auef = e;
                    if (auef == null) {
                        auef = new auce(d);
                        e = auef;
                    }
                }
            }
            return auef;
        }
    }
}
