package defpackage;

/* renamed from: ardb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ardb extends aucj implements audy {
    public static final ardb a;
    private static volatile auef b;

    static {
        ardb ardb = new ardb();
        a = ardb;
        aucj.a(ardb.class, (aucj) ardb);
    }

    private ardb() {
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
            return aucj.a((audx) a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new ardb();
        }
        if (i2 == 4) {
            return new aucd((aucj) a);
        }
        if (i2 == 5) {
            return a;
        }
        auef auef = b;
        if (auef == null) {
            synchronized (ardb.class) {
                auef = b;
                if (auef == null) {
                    auef = new auce(a);
                    b = auef;
                }
            }
        }
        return auef;
    }
}
