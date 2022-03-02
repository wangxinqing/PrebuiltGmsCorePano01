package defpackage;

/* renamed from: osz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class osz extends aucj implements audy {
    public static final osz s;
    private static volatile auef t;
    public int a;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public boolean g = true;
    public long h;
    public long i;
    public aucx j = auei.b;
    public aucx k = auei.b;
    public int l = 1;
    public boolean m;
    public long n;
    public String o = "";
    public String p = "";
    public String q = "";
    public int r;

    static {
        osz osz = new osz();
        s = osz;
        aucj.a(osz.class, (aucj) osz);
    }

    private osz() {
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
            return aucj.a((audx) s, "\u0001\u0011\u0000\u0001\u0001\u0015\u0011\u0000\u0002\u0000\u0001\b\u0001\u0002\b\u0003\u0004\b\u0004\u0006\u001b\u0007\u001b\b\u0004\u0000\t\b\u0002\n\u0007\u0005\u000b\u0003\u0006\f\u0004\b\r\u0007\t\u000e\u0002\n\u000f\u0003\u0007\u0010\b\u000b\u0011\b\f\u0013\b\r\u0015\u000b\u000e", new Object[]{"a", "c", "e", "f", "j", oqy.class, "k", ovb.class, "b", "d", "g", "h", "l", "m", "n", "i", "o", "p", "q", "r"});
        } else if (i3 == 3) {
            return new osz();
        } else {
            if (i3 == 4) {
                return new aucd((byte[]) null, (char[][][]) null);
            }
            if (i3 == 5) {
                return s;
            }
            auef auef = t;
            if (auef == null) {
                synchronized (osz.class) {
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

    public final void b() {
        if (!this.k.a()) {
            this.k = aucj.a(this.k);
        }
    }

    public final void a() {
        if (!this.j.a()) {
            this.j = aucj.a(this.j);
        }
    }
}
