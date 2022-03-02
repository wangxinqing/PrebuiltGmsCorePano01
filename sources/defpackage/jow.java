package defpackage;

/* renamed from: jow  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jow extends aucj implements audy {
    public static final jow o;
    private static volatile auef p;
    public int a;
    public long b;
    public aucx c = auei.b;
    public String d = "";
    public long e;
    public int f;
    public int g;
    public int h;
    public String i = "";
    public String j = "";
    public int k;
    public int l;
    public String m = "";
    public String n = "";

    static {
        jow jow = new jow();
        o = jow;
        aucj.a(jow.class, (aucj) jow);
    }

    private jow() {
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
            return aucj.a((audx) o, "\u0001\r\u0000\u0001\u0001\u000e\r\u0000\u0001\u0000\u0001\u0005\u0001\u0002\u001b\u0003\b\u0002\u0004\u0005\u0003\u0006\u0004\u0004\u0007\u0004\u0005\b\u0004\u0006\t\b\u0007\n\b\b\u000b\u0004\t\f\u0004\n\r\b\u000b\u000e\b\f", new Object[]{"a", "b", "c", jpc.class, "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n"});
        } else if (i3 == 3) {
            return new jow();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) o);
            }
            if (i3 == 5) {
                return o;
            }
            auef auef = p;
            if (auef == null) {
                synchronized (jow.class) {
                    auef = p;
                    if (auef == null) {
                        auef = new auce(o);
                        p = auef;
                    }
                }
            }
            return auef;
        }
    }
}
