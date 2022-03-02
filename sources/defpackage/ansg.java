package defpackage;

/* renamed from: ansg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ansg extends aucj implements audy {
    public static final ansg l;
    private static volatile auef m;
    public int a;
    public int b;
    public long c;
    public String d = "";
    public String e = "";
    public anqx f;
    public anuv g;
    public int h;
    public String i = "";
    public String j = "";
    public int k;

    static {
        ansg ansg = new ansg();
        l = ansg;
        aucj.a(ansg.class, (aucj) ansg);
    }

    private ansg() {
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
            return aucj.a((audx) l, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0000\u0000\u0001\f\u0000\u0002\u0002\u0001\u0003\b\u0002\u0004\b\u0003\u0005\t\u0004\u0006\t\u0005\u0007\u0004\u0006\b\b\u0007\n\b\t\u000b\u0004\n", new Object[]{"a", "b", anse.a, "c", "d", "e", "f", "g", "h", "i", "j", "k"});
        } else if (i3 == 3) {
            return new ansg();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) l);
            }
            if (i3 == 5) {
                return l;
            }
            auef auef = m;
            if (auef == null) {
                synchronized (ansg.class) {
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
