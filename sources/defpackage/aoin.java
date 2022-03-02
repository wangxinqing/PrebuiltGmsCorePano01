package defpackage;

/* renamed from: aoin  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aoin extends aucj implements audy {
    public static final aoin r;
    private static volatile auef s;
    public int a;
    public boolean b;
    public int c;
    public boolean d;
    public boolean e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public boolean o;
    public boolean p;
    public boolean q;

    static {
        aoin aoin = new aoin();
        r = aoin;
        aucj.a(aoin.class, (aucj) aoin);
    }

    private aoin() {
        aucl aucl = aucl.b;
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
            return aucj.a((audx) r, "\u0001\u0010\u0000\u0001\u0001\u0011\u0010\u0000\u0000\u0000\u0001\u0007\u0000\u0002\f\u0001\u0003\u0007\u0002\u0004\u0004\u0004\u0005\u0004\u0005\u0006\u0004\u0007\u0007\u0004\u000b\b\u0007\u000e\n\u0004\t\u000b\u0007\r\f\u0004\n\r\u0004\u0006\u000e\u0004\b\u000f\u0007\u0003\u0010\u0004\f\u0011\u0007\u000f", new Object[]{"a", "b", "c", aoil.a, "d", "f", "g", "i", "m", "p", "k", "o", "l", "h", "j", "e", "n", "q"});
        } else if (i3 == 3) {
            return new aoin();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) r);
            }
            if (i3 == 5) {
                return r;
            }
            auef auef = s;
            if (auef == null) {
                synchronized (aoin.class) {
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
