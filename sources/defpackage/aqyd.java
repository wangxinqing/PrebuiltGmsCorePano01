package defpackage;

/* renamed from: aqyd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqyd extends aucj implements audy {
    public static final aqyd l;
    private static volatile auef m;
    public String a = "";
    public String b = "";
    public String c = "";
    public String d = "";
    public int e;
    public String f = "";
    public String g = "";
    public String h = "";
    public String i = "";
    public String j = "";
    public int k;

    static {
        aqyd aqyd = new aqyd();
        l = aqyd;
        aucj.a(aqyd.class, (aucj) aqyd);
    }

    private aqyd() {
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
            return aucj.a((audx) l, "\u0000\u000b\u0000\u0000\u0001\u000b\u000b\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\u0004\u0006Ȉ\u0007Ȉ\bȈ\tȈ\nȈ\u000b\u0004", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"});
        } else if (i3 == 3) {
            return new aqyd();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) l);
            }
            if (i3 == 5) {
                return l;
            }
            auef auef = m;
            if (auef == null) {
                synchronized (aqyd.class) {
                    auef = m;
                    if (auef == null) {
                        auef = new auce(l);
                        m = auef;
                    }
                }
            }
            return auef;
        }
    }
}
