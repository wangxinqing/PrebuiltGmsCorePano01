package defpackage;

/* renamed from: alzn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alzn extends aucj implements audy {
    public static final alzn f;
    private static volatile auef h;
    public int a;
    public aucx b = auei.b;
    public alzs c;
    public alzu d;
    public alzq e;
    private byte g = 2;

    static {
        alzn alzn = new alzn();
        f = alzn;
        aucj.a(alzn.class, (aucj) alzn);
    }

    private alzn() {
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
            return aucj.a((audx) f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0001\u0001Л\u0002\t\u0000\u0003\t\u0001\u0004\t\u0002", new Object[]{"a", "b", alzm.class, "c", "d", "e"});
        } else if (i2 == 3) {
            return new alzn();
        } else {
            if (i2 == 4) {
                return new aucd((byte[][][]) null, (short[][]) null);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (alzn.class) {
                    auef = h;
                    if (auef == null) {
                        auef = new auce(f);
                        h = auef;
                    }
                }
            }
            return auef;
        }
    }
}
