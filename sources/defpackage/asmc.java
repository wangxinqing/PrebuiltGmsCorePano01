package defpackage;

/* renamed from: asmc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class asmc extends aucj implements audy {
    public static final asmc B;
    private static volatile auef D;
    public String A = "";
    private byte C = 2;
    public int a;
    public int b;
    public askz c;
    public aslg d;
    public asly e;
    public asle f;
    public aslr g;
    public aslq h;
    public aslc i;
    public aslb j;
    public aslu k;
    public asln l;
    public aslf m;
    public aslv n;
    public aslo o;
    public aslp p;
    public aslt q;
    public asls r;
    public aslm s;
    public asll t;
    public aslk u;
    public int v;
    public aslh w;
    public aslw x;
    public asla y;
    public aslx z;

    static {
        asmc asmc = new asmc();
        B = asmc;
        aucj.a(asmc.class, (aucj) asmc);
    }

    private asmc() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.C);
        }
        byte b2 = 0;
        if (i3 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.C = b2;
            return null;
        } else if (i3 == 2) {
            return aucj.a((audx) B, "\u0001\u001a\u0000\u0001\u0001 \u001a\u0000\u0000\u0001\u0001Ԍ\u0000\u0003\t\u0002\u0004\t\u0003\u0005\t\u0004\u0006\t\u0005\u0007\t\u0006\b\t\u0007\t\t\b\n\t\t\u000b\t\n\f\t\u000b\r\t\f\u000e\t\r\u000f\t\u000e\u0010\t\u000f\u0011\t\u0010\u0012\t\u0011\u0013\t\u0012\u0014\t\u0013\u0017\t\u0016\u001b\f\u001a\u001c\t\u001b\u001d\t\u001c\u001e\t\u001d\u001f\t\u001e \b\u001f", new Object[]{"a", "b", asph.a, "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", aspj.a, "w", "x", "y", "z", "A"});
        } else if (i3 == 3) {
            return new asmc();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) B);
            }
            if (i3 == 5) {
                return B;
            }
            auef auef = D;
            if (auef == null) {
                synchronized (asmc.class) {
                    auef = D;
                    if (auef == null) {
                        auef = new auce(B);
                        D = auef;
                    }
                }
            }
            return auef;
        }
    }
}
