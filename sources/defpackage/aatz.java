package defpackage;

/* renamed from: aatz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aatz extends aucj implements audy {
    public static final aatz l;
    private static volatile auef m;
    public int a;
    public int b;
    public long c;
    public String d = "";
    public boolean e;
    public String f = "";
    public aucx g = auei.b;
    public String h;
    public boolean i;
    public String j;
    public aaud k;

    static {
        aatz aatz = new aatz();
        l = aatz;
        aucj.a(aatz.class, (aucj) aatz);
    }

    private aatz() {
        auay auay = auay.b;
        this.h = "";
        this.j = "";
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
            return aucj.a((audx) l, "\u0001\t\u0000\u0002\u0001,\t\u0000\u0001\u0000\u0001\u0002\u0000\u0002\u001a\u000f\b\u0001\u0010\u0007\u0002\u0018\b\u0005\u001f\b \"\b\u0003%\u0007\b,\t\"", new Object[]{"a", "b", "c", "g", "d", "e", "h", "j", "f", "i", "k"});
        } else if (i3 == 3) {
            return new aatz();
        } else {
            if (i3 == 4) {
                return new aucd((char[][]) null, (boolean[][][]) null);
            }
            if (i3 == 5) {
                return l;
            }
            auef auef = m;
            if (auef == null) {
                synchronized (aatz.class) {
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
