package defpackage;

/* renamed from: avst  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avst extends aucj implements audy {
    public static final avst m;
    private static volatile auef n;
    public int a;
    public String b = "";
    public int c;
    public aucx d = auei.b;
    public aucs e;
    public String f;
    public String g;
    public long h;
    public long i;
    public int j;
    public String k;
    public int l;

    static {
        avst avst = new avst();
        m = avst;
        aucj.a(avst.class, (aucj) avst);
    }

    private avst() {
        aucl aucl = aucl.b;
        this.e = aucl.b;
        this.f = "";
        this.g = "";
        this.k = "";
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
            return aucj.a((audx) m, "\u0001\u000b\u0000\u0001\u0001\f\u000b\u0000\u0002\u0000\u0001\b\u0000\u0002\u0004\u0001\u0003\u001a\u0005\u0016\u0006\b\u0002\u0007\b\u0003\b\u0002\u0004\t\u0004\u0006\n\b\u0007\u000b\u0004\b\f\u0002\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "j", "k", "l", "i"});
        } else if (i3 == 3) {
            return new avst();
        } else {
            if (i3 == 4) {
                return new avss();
            }
            if (i3 == 5) {
                return m;
            }
            auef auef = n;
            if (auef == null) {
                synchronized (avst.class) {
                    auef = n;
                    if (auef == null) {
                        auef = new auce(m);
                        n = auef;
                    }
                }
            }
            return auef;
        }
    }

    public final void c() {
        if (!this.d.a()) {
            this.d = aucj.a(this.d);
        }
    }
}
