package defpackage;

/* renamed from: amgl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amgl extends aucj implements audy {
    public static final amgl h;
    private static volatile auef i;
    public int a;
    public int b = 3;
    public int c;
    public String d = "";
    public boolean e;
    public aucx f = auei.b;
    public boolean g;

    static {
        amgl amgl = new amgl();
        h = amgl;
        aucj.a(amgl.class, (aucj) amgl);
    }

    private amgl() {
        aucl aucl = aucl.b;
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
            return aucj.a((audx) h, "\u0001\u0006\u0000\u0001\u0002\u000f\u0006\u0000\u0001\u0000\u0002\f\u0001\u0003\u0007\u0005\t\b\u0004\f\u0007\u000b\r\u001b\u000f\f\u0002", new Object[]{"a", "b", amgj.a, "e", "d", "g", "f", amfl.class, "c", amfe.a});
        } else if (i3 == 3) {
            return new amgl();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) h);
            }
            if (i3 == 5) {
                return h;
            }
            auef auef = i;
            if (auef == null) {
                synchronized (amgl.class) {
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
