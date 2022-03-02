package defpackage;

/* renamed from: atnj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atnj extends aucj implements audy {
    public static final atnj o;
    private static volatile auef p;
    public int a;
    public atot b;
    public int c;
    public int d;
    public atnx e;
    public atoi f;
    public atnp g;
    public atnq h;
    public atny i;
    public atnz j;
    public atod k;
    public atnw l;
    public atnn m;
    public atoh n;

    static {
        atnj atnj = new atnj();
        o = atnj;
        aucj.a(atnj.class, (aucj) atnj);
    }

    private atnj() {
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
            return aucj.a((audx) o, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0000\u0000\u0001\t\u0000\u0002\f\u0001\u0003\u0004\u0002\u0004\t\u0003\u0005\t\u0004\u0006\t\u0005\u0007\t\u0006\b\t\u0007\t\t\b\n\t\t\u000b\t\n\f\t\u000b\r\t\f", new Object[]{"a", "b", "c", atni.a, "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n"});
        } else if (i3 == 3) {
            return new atnj();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) o);
            }
            if (i3 == 5) {
                return o;
            }
            auef auef = p;
            if (auef == null) {
                synchronized (atnj.class) {
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
