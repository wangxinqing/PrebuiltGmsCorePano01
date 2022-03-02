package defpackage;

/* renamed from: aokz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aokz extends aucj implements audy {
    public static final aokz f;
    private static volatile auef g;
    public int a;
    public aucs b = aucl.b;
    public int c;
    public int d;
    public long e;

    static {
        aokz aokz = new aokz();
        f = aokz;
        aucj.a(aokz.class, (aucj) aokz);
    }

    private aokz() {
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
            return aucj.a((audx) f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001e\u0002\u0004\u0000\u0003\u0004\u0001\u0004\u0002\u0002", new Object[]{"a", "b", aonh.b(), "c", "d", "e"});
        } else if (i2 == 3) {
            return new aokz();
        } else {
            if (i2 == 4) {
                return new aucd((char[][]) null, (char[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (aokz.class) {
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
