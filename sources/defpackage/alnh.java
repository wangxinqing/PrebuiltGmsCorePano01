package defpackage;

/* renamed from: alnh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alnh extends aucj implements audy {
    public static final alnh h;
    private static volatile auef j;
    public int a = 0;
    public Object b;
    public int c = 0;
    public Object d;
    public String e = "";
    public String f = "";
    public aufc g;
    private int i;

    static {
        alnh alnh = new alnh();
        h = alnh;
        aucj.a(alnh.class, (aucj) alnh);
    }

    private alnh() {
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
            return aucj.a((audx) h, "\u0001\u0005\u0002\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001;\u0000\u0002\b\u0001\u0003\b\u0002\u0004\t\u0003\u0005;\u0001", new Object[]{"b", "a", "d", "c", "i", "e", "f", "g"});
        } else if (i3 == 3) {
            return new alnh();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) h);
            }
            if (i3 == 5) {
                return h;
            }
            auef auef = j;
            if (auef == null) {
                synchronized (alnh.class) {
                    auef = j;
                    if (auef == null) {
                        auef = new auce(h);
                        j = auef;
                    }
                }
            }
            return auef;
        }
    }
}
