package defpackage;

/* renamed from: aqlf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqlf extends aucj implements audy {
    public static final aqlf g;
    private static volatile auef i;
    public anmd a;
    public aucx b = auei.b;
    public aucx c = auei.b;
    public aucx d = auei.b;
    public String e = "";
    public String f = "";
    private int h;

    static {
        aqlf aqlf = new aqlf();
        g = aqlf;
        aucj.a(aqlf.class, (aucj) aqlf);
    }

    private aqlf() {
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
            return aucj.a((audx) g, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0003\u0000\u0001\t\u0000\u0002\u001b\u0003\u001b\u0004\u001b\u0005\b\u0001\u0006\b\u0002", new Object[]{"h", "a", "b", anmd.class, "c", anmd.class, "d", anmd.class, "e", "f"});
        } else if (i3 == 3) {
            return new aqlf();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) g);
            }
            if (i3 == 5) {
                return g;
            }
            auef auef = i;
            if (auef == null) {
                synchronized (aqlf.class) {
                    auef = i;
                    if (auef == null) {
                        auef = new auce(g);
                        i = auef;
                    }
                }
            }
            return auef;
        }
    }
}
