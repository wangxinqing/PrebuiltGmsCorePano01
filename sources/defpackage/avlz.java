package defpackage;

/* renamed from: avlz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avlz extends aucj implements audy {
    public static final avlz i;
    private static volatile auef j;
    public int a;
    public int b;
    public avmf c;
    public avmd d;
    public avmc e;
    public String f = "";
    public String g = "";
    public String h = "";

    static {
        avlz avlz = new avlz();
        i = avlz;
        aucj.a(avlz.class, (aucj) avlz);
    }

    private avlz() {
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
            return aucj.a((audx) i, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0000\u0000\u0001\f\u0000\u0003\t\u0001\u0005\t\u0003\u0006\b\u0005\u0007\b\u0006\b\b\u0007\t\t\u0004", new Object[]{"a", "b", avlx.a, "c", "d", "f", "g", "h", "e"});
        } else if (i3 == 3) {
            return new avlz();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) i);
            }
            if (i3 == 5) {
                return i;
            }
            auef auef = j;
            if (auef == null) {
                synchronized (avlz.class) {
                    auef = j;
                    if (auef == null) {
                        auef = new auce(i);
                        j = auef;
                    }
                }
            }
            return auef;
        }
    }
}
