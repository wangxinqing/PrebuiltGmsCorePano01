package defpackage;

/* renamed from: aocn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aocn extends aucj implements audy {
    public static final aocn h;
    private static volatile auef i;
    public int a;
    public int b;
    public aock c;
    public aock d;
    public int e;
    public aoco f;
    public aobw g;

    static {
        aocn aocn = new aocn();
        h = aocn;
        aucj.a(aocn.class, (aucj) aocn);
    }

    private aocn() {
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
            return aucj.a((audx) h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0001\u0003\t\u0002\u0004\f\u0003\u0005\t\u0004\u0006\t\u0005", new Object[]{"a", "b", aocl.a, "c", "d", "e", aocm.a, "f", "g"});
        } else if (i3 == 3) {
            return new aocn();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) h);
            }
            if (i3 == 5) {
                return h;
            }
            auef auef = i;
            if (auef == null) {
                synchronized (aocn.class) {
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
