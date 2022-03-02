package defpackage;

/* renamed from: amfz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amfz extends aucj implements audy {
    public static final amfz o;
    private static volatile auef p;
    public int a;
    public amgl b;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";
    public String i = "";
    public String j = "";
    public String k = "";
    public String l = "";
    public String m = "";
    public String n = "";

    static {
        amfz amfz = new amfz();
        o = amfz;
        aucj.a(amfz.class, (aucj) amfz);
    }

    private amfz() {
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
            return aucj.a((audx) o, "\u0001\r\u0000\u0001\u0001\u0010\r\u0000\u0000\u0000\u0001\t\u0000\u0002\b\u0001\u0003\b\u000f\u0004\b\u0004\u0005\b\u0005\u0006\b\u0006\u0007\b\u0007\b\b\b\t\b\n\n\b\u000b\u000e\b\t\u000f\b\f\u0010\b\u0003", new Object[]{"a", "b", "c", "n", "e", "f", "g", "h", "i", "k", "l", "j", "m", "d"});
        } else if (i3 == 3) {
            return new amfz();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) o);
            }
            if (i3 == 5) {
                return o;
            }
            auef auef = p;
            if (auef == null) {
                synchronized (amfz.class) {
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
