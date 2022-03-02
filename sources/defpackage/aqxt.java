package defpackage;

/* renamed from: aqxt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqxt extends aucj implements audy {
    public static final aqxt m;
    private static volatile auef n;
    public long a;
    public String b = "";
    public String c = "";
    public String d = "";
    public String e = "";
    public boolean f;
    public boolean g;
    public boolean h;
    public String i = "";
    public String j = "";
    public boolean k;
    public String l = "";

    static {
        aqxt aqxt = new aqxt();
        m = aqxt;
        aucj.a(aqxt.class, (aucj) aqxt);
    }

    private aqxt() {
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
            return aucj.a((audx) m, "\u0000\f\u0000\u0000\u0001\f\f\u0000\u0000\u0000\u0001\u0002\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006\u0007\u0007\u0007\b\u0007\tȈ\nȈ\u000b\u0007\fȈ", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l"});
        } else if (i3 == 3) {
            return new aqxt();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) m);
            }
            if (i3 == 5) {
                return m;
            }
            auef auef = n;
            if (auef == null) {
                synchronized (aqxt.class) {
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
