package defpackage;

/* renamed from: avis  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avis extends aucj implements audy {
    public static final avis f;
    private static volatile auef g;
    public int a;
    public avjc b;
    public aviu c;
    public aviz d;
    public avjf e;

    static {
        avis avis = new avis();
        f = avis;
        aucj.a(avis.class, (aucj) avis);
    }

    private avis() {
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
            return aucj.a((audx) f, "\u0001\u0004\u0000\u0001\u0003\u0006\u0004\u0000\u0000\u0000\u0003\t\u0002\u0004\t\u0003\u0005\t\u0004\u0006\t\u0005", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new avis();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) f);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (avis.class) {
                    auef = g;
                    if (auef == null) {
                        auef = new auce(f);
                        g = auef;
                    }
                }
            }
            return auef;
        }
    }
}
