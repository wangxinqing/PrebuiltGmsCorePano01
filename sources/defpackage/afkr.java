package defpackage;

/* renamed from: afkr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afkr extends aucj implements audy {
    public static final afkr m;
    private static volatile auef n;
    public int a;
    public afko b;
    public String c = "";
    public String d = "";
    public int e;
    public int f;
    public long g;
    public long h;
    public aflb i;
    public aucx j = auei.b;
    public int k;
    public aucx l = auei.b;

    static {
        afkr afkr = new afkr();
        m = afkr;
        aucj.a(afkr.class, (aucj) afkr);
    }

    private afkr() {
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
            return aucj.a((audx) m, "\u0001\u000b\u0000\u0001\u0001年皤\u000b\u0000\u0002\u0000\u0001\b\u0001\u0002\u001b\u0003\u0002\u0005\u0006\b\u0002\n\u0004\u0003\u000b\u0002\u0006\f\f\u0004\r\t\u0007\u0010\u0004\b\u0011\u001b年皤\t\u0000", new Object[]{"a", "c", "j", afkn.class, "g", "d", "e", "h", "f", afkp.a, "i", "k", "l", aflc.class, "b"});
        } else if (i3 == 3) {
            return new afkr();
        } else {
            if (i3 == 4) {
                return new aucd((float[]) null, (byte[][][]) null);
            }
            if (i3 == 5) {
                return m;
            }
            auef auef = n;
            if (auef == null) {
                synchronized (afkr.class) {
                    auef = n;
                    if (auef == null) {
                        auef = new auce(m);
                        n = auef;
                    }
                }
            }
            return auef;
        }
    }
}
