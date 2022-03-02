package defpackage;

/* renamed from: hmj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hmj extends aucj implements audy {
    public static final hmj m;
    private static volatile auef n;
    public int a;
    public String b = "";
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public long h;
    public boolean i;
    public String j = "";
    public String k = "";
    public String l = "";

    static {
        hmj hmj = new hmj();
        m = hmj;
        aucj.a(hmj.class, (aucj) hmj);
    }

    private hmj() {
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
            return aucj.a((audx) m, "\u0001\u000b\u0000\u0001\u0002\u0011\u000b\u0000\u0000\u0000\u0002\b\u0001\u0003\b\u0002\u0005\b\u0004\u0006\b\u0005\u0007\b\u0006\b\b\u0007\u000b\u0002\n\f\u0007\u000b\u000f\b\u000e\u0010\b\u000f\u0011\b\u0010", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l"});
        } else if (i3 == 3) {
            return new hmj();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) m);
            }
            if (i3 == 5) {
                return m;
            }
            auef auef = n;
            if (auef == null) {
                synchronized (hmj.class) {
                    auef = n;
                    if (auef == null) {
                        auef = new auce(m);
                        n = auef;
                    }
                }
            }
            return auef;
        }
    }
}
