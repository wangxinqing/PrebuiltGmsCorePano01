package defpackage;

/* renamed from: atwz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atwz extends aucj implements audy {
    public static final atwz h;
    private static volatile auef i;
    public int a;
    public int b = 0;
    public Object c;
    public int d = 1;
    public atws e;
    public atwu f;
    public atwy g;

    static {
        atwz atwz = new atwz();
        h = atwz;
        aucj.a(atwz.class, (aucj) atwz);
    }

    private atwz() {
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
            return aucj.a((audx) h, "\u0001\n\u0001\u0001\u0001\n\n\u0000\u0000\u0000\u0001<\u0000\u0002\u0004\u0006\u0003<\u0000\u0004\t\u0007\u0005\t\b\u0006\t\t\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000", new Object[]{"c", "b", "a", atvi.class, "d", atvy.class, "e", "f", "g", atvo.class, atvs.class, atwd.class, atvk.class});
        } else if (i3 == 3) {
            return new atwz();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) h);
            }
            if (i3 == 5) {
                return h;
            }
            auef auef = i;
            if (auef == null) {
                synchronized (atwz.class) {
                    auef = i;
                    if (auef == null) {
                        auef = new auce(h);
                        i = auef;
                    }
                }
            }
            return auef;
        }
    }
}
