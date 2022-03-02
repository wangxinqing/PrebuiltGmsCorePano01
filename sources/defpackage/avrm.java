package defpackage;

/* renamed from: avrm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avrm extends aucg implements audy {
    public static final avrm t;
    private static volatile auef v;
    public int a;
    public long b;
    public long c;
    public long d;
    public String e = "";
    public int f;
    public String g = "";
    public long h;
    public aucx i = auei.b;
    public auay j;
    public long k;
    public apez l;
    public int n;
    public aucs o;
    public aucs p;
    public long q;
    public avsb r;
    public boolean s;
    private byte u = 2;

    static {
        avrm avrm = new avrm();
        t = avrm;
        aucj.a(avrm.class, (aucj) avrm);
    }

    private avrm() {
        auay auay = auay.b;
        this.j = auay.b;
        this.k = 180000;
        this.o = aucl.b;
        this.p = aucl.b;
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.u);
        }
        byte b2 = 0;
        if (i3 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.u = b2;
            return null;
        } else if (i3 == 2) {
            return aucj.a((audx) t, "\u0001\u0011\u0000\u0001\u0001\u001b\u0011\u0000\u0003\u0000\u0001\u0002\u0000\u0002\b\u0003\u0003\u001b\u0006\n\n\u000b\u0004\u0004\f\u0002\u0006\u000f\u0010\u0010\u0010\t\u0011\u0011\u0002\u0001\u0013\f\u0014\u0014\u0016\u0015\u0002\u0002\u0016\u0002\u0015\u0017\t\u0016\u0019\u0007\u0017\u001a\b\u0005\u001b'", new Object[]{"a", "b", "e", "i", avrn.class, "j", "f", "h", "k", "l", "c", "n", avrk.a, "o", "d", "q", "r", "s", "g", "p"});
        } else if (i3 == 3) {
            return new avrm();
        } else {
            if (i3 == 4) {
                return new aucf(t);
            }
            if (i3 == 5) {
                return t;
            }
            auef auef = v;
            if (auef == null) {
                synchronized (avrm.class) {
                    auef = v;
                    if (auef == null) {
                        auef = new auce(t);
                        v = auef;
                    }
                }
            }
            return auef;
        }
    }
}
