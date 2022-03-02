package defpackage;

/* renamed from: plg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class plg extends aucj implements audy {
    public static final plg l;
    private static volatile auef m;
    public String a = "";
    public int b;
    public String c = "";
    public int d;
    public boolean e;
    public boolean f;
    public boolean g;
    public int h;
    public plh i;
    public int j;
    public aucx k = auei.b;

    static {
        plg plg = new plg();
        l = plg;
        aucj.a(plg.class, (aucj) plg);
    }

    private plg() {
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
            return aucj.a((audx) l, "\u0000\u000b\u0000\u0000\u0001\u000f\u000b\u0000\u0001\u0000\u0001Ȉ\u0002\u0004\u0003Ȉ\u0004\f\b\u0007\n\u0007\u000b\u0007\f\u0004\r\t\u000e\f\u000fȚ", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"});
        } else if (i3 == 3) {
            return new plg();
        } else {
            if (i3 == 4) {
                return new aucd((byte[]) null, (int[]) null);
            }
            if (i3 == 5) {
                return l;
            }
            auef auef = m;
            if (auef == null) {
                synchronized (plg.class) {
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
