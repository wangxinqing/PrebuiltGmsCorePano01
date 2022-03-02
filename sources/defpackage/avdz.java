package defpackage;

/* renamed from: avdz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avdz extends aucj implements audy {
    public static final avdz r;
    private static volatile auef s;
    public int a;
    public long b;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public int g;
    public long h;
    public long i;
    public avea j;
    public aucv k = audl.b;
    public boolean l;
    public boolean m;
    public boolean n;
    public aveb o;
    public String p = "";
    public boolean q;

    static {
        avdz avdz = new avdz();
        r = avdz;
        aucj.a(avdz.class, (aucj) avdz);
    }

    private avdz() {
        auei auei = auei.b;
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
            return aucj.a((audx) r, "\u0001\u0010\u0000\u0001\u0001\u0015\u0010\u0000\u0001\u0000\u0001\u0002\u0000\u0004\b\u0003\u0005\b\u0004\u0006\b\u0005\b\b\u0007\n\f\t\u000b\u0003\n\f\u0003\u000b\u000e\t\r\u000f\u0014\u0010\u0007\u000e\u0011\u0007\u000f\u0012\u0007\u0010\u0013\t\u0011\u0014\b\u0012\u0015\u0007\u0013", new Object[]{"a", "b", "c", "d", "e", "f", "g", avdy.a, "h", "i", "j", "k", "l", "m", "n", "o", "p", "q"});
        } else if (i3 == 3) {
            return new avdz();
        } else {
            if (i3 == 4) {
                return new aucd((short[][]) null, (int[]) null, (byte[]) null);
            }
            if (i3 == 5) {
                return r;
            }
            auef auef = s;
            if (auef == null) {
                synchronized (avdz.class) {
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
