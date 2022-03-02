package defpackage;

/* renamed from: aofe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aofe extends aucj implements audy {
    public static final aofe s;
    private static volatile auef v;
    public int a;
    public int b;
    public String c = "";
    public String d = "";
    public aodr e;
    public aofj f;
    public aodx g;
    public aoem h;
    public aody i;
    public aoel j;
    public aofk k;
    public aoeo l;
    public aoee m;
    public aoff n;
    public aofg o;
    public aoex p;
    public aoes q;
    public aofh r;
    private aoen t;
    private byte u = 2;

    static {
        aofe aofe = new aofe();
        s = aofe;
        aucj.a(aofe.class, (aucj) aofe);
    }

    private aofe() {
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
            return aucj.a((audx) s, "\u0001\u0012\u0000\u0001\u0001\u0013\u0012\u0000\u0000\u0004\u0001\f\u0000\u0002\b\u0001\u0003\b\u0002\u0004\t\u0003\u0005Љ\u0004\u0006Љ\u0005\u0007Љ\u0006\b\t\u0007\tЉ\b\n\t\t\f\t\n\r\t\f\u000e\t\r\u000f\t\u000e\u0010\t\u000f\u0011\t\u0010\u0012\t\u0011\u0013\t\u0012", new Object[]{"a", "b", aofc.a, "c", "d", "e", "f", "t", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r"});
        } else if (i3 == 3) {
            return new aofe();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) s);
            }
            if (i3 == 5) {
                return s;
            }
            auef auef = v;
            if (auef == null) {
                synchronized (aofe.class) {
                    auef = v;
                    if (auef == null) {
                        auef = new auce(s);
                        v = auef;
                    }
                }
            }
            return auef;
        }
    }
}
