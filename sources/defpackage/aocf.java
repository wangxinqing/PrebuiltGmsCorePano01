package defpackage;

/* renamed from: aocf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aocf extends aucj implements audy {
    public static final aocf s;
    private static volatile auef t;
    public int a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public aucs f = aucl.b;
    public int g;
    public aobv h;
    public aocd i;
    public aobb j;
    public aoca k;
    public aobz l;
    public aocb m;
    public aobd n;
    public aobh o;
    public aocn p;
    public aobn q;
    public aobk r;

    static {
        aocf aocf = new aocf();
        s = aocf;
        aucj.a(aocf.class, (aucj) aocf);
    }

    private aocf() {
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
            return aucj.a((audx) s, "\u0001\u0011\u0000\u0001\u0001\u0013\u0011\u0000\u0001\u0000\u0001\f\u0001\u0003\u0004\u0003\u0004\t\u0006\u0005\t\u0007\u0006\t\b\u0007\t\t\b\u0007\u0004\t\t\n\n\t\u000b\u000b\u0016\f\u0004\u0005\r\t\f\u000e\t\r\u0010\t\u000f\u0011\u0004\u0000\u0012\t\u0010\u0013\t\u0011", new Object[]{"a", "c", aoce.a, "d", "h", "i", "j", "k", "e", "l", "m", "f", "g", "n", "o", "p", "b", "q", "r"});
        } else if (i3 == 3) {
            return new aocf();
        } else {
            if (i3 == 4) {
                return new aucd((int[][][]) null, (byte[][][]) null);
            }
            if (i3 == 5) {
                return s;
            }
            auef auef = t;
            if (auef == null) {
                synchronized (aocf.class) {
                    auef = t;
                    if (auef == null) {
                        auef = new auce(s);
                        t = auef;
                    }
                }
            }
            return auef;
        }
    }
}
