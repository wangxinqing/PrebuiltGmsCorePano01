package defpackage;

/* renamed from: aviq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aviq extends aucj implements audy {
    public static final aviq k;
    private static volatile auef m;
    public String a = "";
    public String b = "";
    public String c = "";
    public String d = "";
    public boolean e;
    public String f = "";
    public String g = "";
    public String h = "";
    public String i = "";
    public String j = "";
    private int l;

    static {
        aviq aviq = new aviq();
        k = aviq;
        aucj.a(aviq.class, (aucj) aviq);
    }

    private aviq() {
        auei auei = auei.b;
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
            return aucj.a((audx) k, "\u0001\n\u0000\u0001\u0002\u0012\n\u0000\u0000\u0000\u0002\b\u0001\u0003\b\u0002\u0007\b\u0006\n\b\t\u000b\u0007\n\f\b\u000b\r\b\f\u000e\b\r\u000f\b\u000e\u0012\b\u0011", new Object[]{"l", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j"});
        } else if (i3 == 3) {
            return new aviq();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) k);
            }
            if (i3 == 5) {
                return k;
            }
            auef auef = m;
            if (auef == null) {
                synchronized (aviq.class) {
                    auef = m;
                    if (auef == null) {
                        auef = new auce(k);
                        m = auef;
                    }
                }
            }
            return auef;
        }
    }
}
