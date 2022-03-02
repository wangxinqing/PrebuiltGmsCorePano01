package defpackage;

/* renamed from: avtd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avtd extends aucj implements audy {
    public static final avtd h;
    private static volatile auef i;
    public int a;
    public int b;
    public int c;
    public String d = "";
    public aucx e = auei.b;
    public int f;
    public int g;

    static {
        avtd avtd = new avtd();
        h = avtd;
        aucj.a(avtd.class, (aucj) avtd);
    }

    private avtd() {
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
            return aucj.a((audx) h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0000\u0001\f\u0000\u0002\f\u0001\u0003\b\u0002\u0005\u001b\u0006\f\u0004\u0007\u0004\u0005", new Object[]{"a", "b", apfl.a, "c", apfm.a, "d", "e", avsz.class, "f", avtb.a, "g"});
        } else if (i3 == 3) {
            return new avtd();
        } else {
            if (i3 == 4) {
                return new avta();
            }
            if (i3 == 5) {
                return h;
            }
            auef auef = i;
            if (auef == null) {
                synchronized (avtd.class) {
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
