package defpackage;

/* renamed from: nya  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nya extends aucj implements audy {
    public static final nya k;
    private static volatile auef l;
    public int a;
    public int b = 0;
    public Object c;
    public String d = "";
    public String e = "";
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;

    static {
        nya nya = new nya();
        k = nya;
        aucj.a(nya.class, (aucj) nya);
    }

    private nya() {
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
            return aucj.a((audx) k, "\u0001\r\u0001\u0001\u0001\r\r\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001\u0003\u0004\u0002\u0004<\u0000\u0005?\u0000\u0006?\u0000\u0007?\u0000\b?\u0000\t\u0004\u0003\n\u0004\u0004\u000b\u0004\u0005\f\f\u0006\r:\u0000", new Object[]{"c", "b", "a", "d", "e", "f", nye.class, nxy.b(), nxz.a, nxw.b(), nxt.b(), "g", "h", "i", "j", nxu.a});
        } else if (i3 == 3) {
            return new nya();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) k);
            }
            if (i3 == 5) {
                return k;
            }
            auef auef = l;
            if (auef == null) {
                synchronized (nya.class) {
                    auef = l;
                    if (auef == null) {
                        auef = new auce(k);
                        l = auef;
                    }
                }
            }
            return auef;
        }
    }
}
