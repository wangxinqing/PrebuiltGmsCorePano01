package defpackage;

/* renamed from: avwi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avwi extends aucj implements audy {
    public static final avwi n;
    private static volatile auef o;
    public int a;
    public String b = "";
    public String c = "";
    public String d = "";
    public long e;
    public String f = "";
    public int g;
    public String h = "";
    public String i = "";
    public String j = "";
    public String k = "";
    public aucx l = auei.b;
    public String m = "";

    static {
        avwi avwi = new avwi();
        n = avwi;
        aucj.a(avwi.class, (aucj) avwi);
    }

    private avwi() {
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
            return aucj.a((audx) n, "\u0001\f\u0000\u0001\u0001\r\f\u0000\u0001\u0000\u0001\b\u0000\u0002\b\u0001\u0003\b\u0002\u0004\u0002\u0003\u0006\b\u0007\u0007\b\b\b\b\t\t\b\n\n\u001b\u000b\u0004\u0006\f\b\u0005\r\b\u000b", new Object[]{"a", "b", "c", "d", "e", "h", "i", "j", "k", "l", avwh.class, "g", "f", "m"});
        } else if (i3 == 3) {
            return new avwi();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) n);
            }
            if (i3 == 5) {
                return n;
            }
            auef auef = o;
            if (auef == null) {
                synchronized (avwi.class) {
                    auef = o;
                    if (auef == null) {
                        auef = new auce(n);
                        o = auef;
                    }
                }
            }
            return auef;
        }
    }
}
