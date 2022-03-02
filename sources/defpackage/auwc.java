package defpackage;

/* renamed from: auwc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class auwc extends aucj implements audy {
    public static final auwc n;
    private static volatile auef o;
    public int a;
    public String b = "";
    public int c;
    public String d = "";
    public int e;
    public int f;
    public int g;
    public String h = "";
    public int i;
    public double j;
    public long k;
    public String l = "";
    public int m;

    static {
        auwc auwc = new auwc();
        n = auwc;
        aucj.a(auwc.class, (aucj) auwc);
    }

    private auwc() {
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
            return aucj.a((audx) n, "\u0001\f\u0000\u0001\u0001\u000e\f\u0000\u0000\u0000\u0001\b\u0000\u0002\f\u0001\u0004\b\u0003\u0006\f\u0004\u0007\u0004\u0005\b\u0004\u0006\t\b\u0007\n\f\b\u000b\u0000\t\f\u0002\n\r\b\u000b\u000e\f\f", new Object[]{"a", "b", "c", avbx.b(), "d", "e", asok.a, "f", "g", "h", "i", avbe.b(), "j", "k", "l", "m", asoz.a});
        } else if (i3 == 3) {
            return new auwc();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) n);
            }
            if (i3 == 5) {
                return n;
            }
            auef auef = o;
            if (auef == null) {
                synchronized (auwc.class) {
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
