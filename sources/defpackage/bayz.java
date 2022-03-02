package defpackage;

/* renamed from: bayz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bayz extends aucj implements audy {
    public static final bayz e;
    private static volatile auef h;
    public int a;
    public String b = "";
    public int c;
    public auuy d;
    private avln f;
    private byte g = 2;

    static {
        bayz bayz = new bayz();
        e = bayz;
        aucj.a(bayz.class, (aucj) bayz);
    }

    private bayz() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        byte b2 = 0;
        if (i2 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.g = b2;
            return null;
        } else if (i2 == 2) {
            return aucj.a((audx) e, "\u0001\u0004\u0000\u0001\u0005\u000e\u0004\u0000\u0000\u0001\u0005Љ\u0004\t\b\b\n\u0004\t\u000e\t\r", new Object[]{"a", "f", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bayz();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (bayz.class) {
                    auef = h;
                    if (auef == null) {
                        auef = new auce(e);
                        h = auef;
                    }
                }
            }
            return auef;
        }
    }
}
