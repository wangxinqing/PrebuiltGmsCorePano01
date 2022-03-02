package defpackage;

/* renamed from: amnc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amnc extends aucj implements audy {
    public static final amnc r;
    private static volatile auef t;
    public int a;
    public String b = "";
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public aucx g = auei.b;
    public String h = "";
    public int i;
    public String j = "";
    public long k;
    public int l;
    public long m;
    public long n;
    public auay o = auay.b;
    public boolean p;
    public int q;
    private byte s = 2;

    static {
        amnc amnc = new amnc();
        r = amnc;
        aucj.a(amnc.class, (aucj) amnc);
    }

    private amnc() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.s);
        }
        byte b2 = 0;
        if (i3 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.s = b2;
            return null;
        } else if (i3 == 2) {
            return aucj.a((audx) r, "\u0001\u0010\u0000\u0001\u0002\u001d\u0010\u0000\u0001\u0003\u0002\b\u0001\u0003Ԉ\u0002\u0004\b\u0003\u0005Ԉ\u0004\u0006\b\u0005\u0007Л\t\b\u0007\u000b\u0004\t\r\b\u000b\u0010\u0002\u000e\u0011\u0004\u000f\u0012\u0002\u0010\u0014\u0002\u0012\u0015\n\u0013\u0018\u0007\u0016\u001d\u0004\u001b", new Object[]{"a", "b", "c", "d", "e", "f", "g", ammv.class, "h", "i", "j", "k", "l", "m", "n", "o", "p", "q"});
        } else if (i3 == 3) {
            return new amnc();
        } else {
            if (i3 == 4) {
                return new amnb();
            }
            if (i3 == 5) {
                return r;
            }
            auef auef = t;
            if (auef == null) {
                synchronized (amnc.class) {
                    auef = t;
                    if (auef == null) {
                        auef = new auce(r);
                        t = auef;
                    }
                }
            }
            return auef;
        }
    }
}
