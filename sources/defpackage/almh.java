package defpackage;

/* renamed from: almh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class almh extends aucj implements audy {
    public static final almh o;
    private static volatile auef p;
    public int a;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";
    public String i = "";
    public boolean j;
    public String k = "";
    public boolean l;
    public String m = "";
    public String n = "";

    static {
        almh almh = new almh();
        o = almh;
        aucj.a(almh.class, (aucj) almh);
    }

    private almh() {
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
            return aucj.a((audx) o, "\u0001\r\u0000\u0001\u0001\u0012\r\u0000\u0000\u0000\u0001\f\u0000\u0002\b\u0001\u0006\b\u0005\u0007\b\u0006\b\b\u0007\t\b\b\n\b\t\u000b\b\n\f\u0007\u000b\r\b\f\u000e\u0007\r\u000f\b\u000e\u0012\b\u000f", new Object[]{"a", "b", aqkx.b(), "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n"});
        } else if (i3 == 3) {
            return new almh();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) o);
            }
            if (i3 == 5) {
                return o;
            }
            auef auef = p;
            if (auef == null) {
                synchronized (almh.class) {
                    auef = p;
                    if (auef == null) {
                        auef = new auce(o);
                        p = auef;
                    }
                }
            }
            return auef;
        }
    }
}
