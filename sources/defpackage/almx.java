package defpackage;

/* renamed from: almx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class almx extends aucj implements audy {
    public static final almx k;
    private static volatile auef l;
    public int a;
    public String b = "";
    public String c = "";
    public String d = "";
    public String e = "";
    public boolean f;
    public boolean g;
    public boolean h = true;
    public String i = "";
    public String j = "";

    static {
        almx almx = new almx();
        k = almx;
        aucj.a(almx.class, (aucj) almx);
    }

    private almx() {
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
            return aucj.a((audx) k, "\u0001\t\u0000\u0001\u0001\u000f\t\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001\u0005\b\u0004\b\b\u0007\t\u0007\b\n\u0007\t\u000b\u0007\n\r\b\u000b\u000f\b\f", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"});
        } else if (i3 == 3) {
            return new almx();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) k);
            }
            if (i3 == 5) {
                return k;
            }
            auef auef = l;
            if (auef == null) {
                synchronized (almx.class) {
                    auef = l;
                    if (auef == null) {
                        auef = new auce(k);
                        l = auef;
                    }
                }
            }
            return auef;
        }
    }
}
