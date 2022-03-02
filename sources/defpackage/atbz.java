package defpackage;

/* renamed from: atbz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atbz extends aucj implements audy {
    public static final atbz r;
    private static volatile auef s;
    public int a;
    public String b = "";
    public int c;
    public int d;
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";
    public int i;
    public String j = "";
    public int k;
    public String l = "";
    public int m;
    public int n;
    public int o;
    public atba p;
    public int q;

    static {
        atbz atbz = new atbz();
        r = atbz;
        aucj.a(atbz.class, (aucj) atbz);
    }

    private atbz() {
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
            return aucj.a((audx) r, "\u0001\u0010\u0000\u0001\u0001\u0013\u0010\u0000\u0000\u0000\u0001\b\u0000\u0002\u0004\u0002\u0003\b\u0003\u0004\b\u0004\u0005\b\u0005\u0006\f\u000e\u0007\b\u0006\n\u0004\t\u000b\b\u000b\f\f\f\r\b\r\u000e\u0004\u000f\u0010\u0004\u0010\u0011\t\u0011\u0012\u0004\u0012\u0013\f\u0001", new Object[]{"a", "b", "d", "e", "f", "g", "m", atby.a, "h", "i", "j", "k", atbc.a, "l", "n", "o", "p", "q", "c", atbe.a});
        } else if (i3 == 3) {
            return new atbz();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) r);
            }
            if (i3 == 5) {
                return r;
            }
            auef auef = s;
            if (auef == null) {
                synchronized (atbz.class) {
                    auef = s;
                    if (auef == null) {
                        auef = new auce(r);
                        s = auef;
                    }
                }
            }
            return auef;
        }
    }
}
