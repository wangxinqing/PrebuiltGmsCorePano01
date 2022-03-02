package defpackage;

/* renamed from: aodn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aodn extends aucj implements audy {
    public static final aodn q;
    private static volatile auef r;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public aodd g;
    public aocz h;
    public aocu i;
    public aofm j;
    public aoda k;
    public aodc l;
    public aofo m;
    public aofs n;
    public aofq o;
    public int p;

    static {
        aodn aodn = new aodn();
        q = aodn;
        aucj.a(aodn.class, (aucj) aodn);
    }

    private aodn() {
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
            return aucj.a((audx) q, "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001\u0003\u0004\u0002\u0004\f\u0003\u0005\f\u0004\u0006\t\u0005\u0007\t\u0006\b\t\u0007\t\t\b\n\t\t\u000b\t\n\f\t\u000b\r\t\f\u000e\t\r\u000f\f\u000e", new Object[]{"a", "b", aodj.a, "c", aodl.a, "d", "e", aodi.a, "f", aodh.a, "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", aodk.a});
        } else if (i3 == 3) {
            return new aodn();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) q);
            }
            if (i3 == 5) {
                return q;
            }
            auef auef = r;
            if (auef == null) {
                synchronized (aodn.class) {
                    auef = r;
                    if (auef == null) {
                        auef = new auce(q);
                        r = auef;
                    }
                }
            }
            return auef;
        }
    }
}
