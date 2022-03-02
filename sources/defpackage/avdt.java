package defpackage;

/* renamed from: avdt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avdt extends aucj implements audy {
    public static final avdt n;
    private static volatile auef o;
    public int a;
    public long b;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public boolean g;
    public boolean h;
    public boolean i;
    public String j = "";
    public String k = "";
    public boolean l;
    public String m = "";

    static {
        avdt avdt = new avdt();
        n = avdt;
        aucj.a(avdt.class, (aucj) avdt);
    }

    private avdt() {
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
            return aucj.a((audx) n, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001\u0002\u0000\u0002\b\u0001\u0003\b\u0002\u0004\b\u0003\u0005\b\u0004\u0006\u0007\u0005\u0007\u0007\u0006\b\u0007\u0007\t\b\b\n\b\t\u000b\u0007\n\f\b\u000b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m"});
        } else if (i3 == 3) {
            return new avdt();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) n);
            }
            if (i3 == 5) {
                return n;
            }
            auef auef = o;
            if (auef == null) {
                synchronized (avdt.class) {
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
