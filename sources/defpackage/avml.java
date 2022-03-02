package defpackage;

/* renamed from: avml  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avml extends aucj implements audy {
    public static final avml n;
    private static volatile auef o;
    public int a;
    public String b = "";
    public String c = "";
    public int d;
    public aucx e = auei.b;
    public aucx f = auei.b;
    public String g = "";
    public String h = "";
    public String i = "";
    public int j;
    public String k = "";
    public int l;
    public olv m;

    static {
        avml avml = new avml();
        n = avml;
        aucj.a(avml.class, (aucj) avml);
    }

    private avml() {
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
            return aucj.a((audx) n, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0002\u0000\u0001\b\u0000\u0002\b\u0001\u0003\f\u0002\u0005\u001b\u0006\u001b\u0007\b\u0004\b\b\u0005\t\b\u0006\n\u0004\u0007\u000b\b\b\r\f\n\f\t\u000b", new Object[]{"a", "b", "c", "d", avmi.a, "e", avmk.class, "f", avmk.class, "g", "h", "i", "j", "k", "l", avmj.a, "m"});
        } else if (i3 == 3) {
            return new avml();
        } else {
            if (i3 == 4) {
                return new aucd((boolean[][][]) null, (char[]) null);
            }
            if (i3 == 5) {
                return n;
            }
            auef auef = o;
            if (auef == null) {
                synchronized (avml.class) {
                    auef = o;
                    if (auef == null) {
                        auef = new auce(n);
                        o = auef;
                    }
                }
            }
            return auef;
        }
    }
}
