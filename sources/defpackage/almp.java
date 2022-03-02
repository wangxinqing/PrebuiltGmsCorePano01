package defpackage;

/* renamed from: almp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class almp extends aucj implements audy {
    public static final almp l;
    private static volatile auef m;
    public int a;
    public String b = "";
    public String c = "";
    public String d = "";
    public String e = "";
    public String f;
    public String g;
    public aucs h;
    public boolean i;
    public aucx j;
    public String k;

    static {
        almp almp = new almp();
        l = almp;
        aucj.a(almp.class, (aucj) almp);
    }

    private almp() {
        auei auei = auei.b;
        this.f = "";
        this.g = "";
        this.h = aucl.b;
        this.j = auei.b;
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
            return aucj.a((audx) l, "\u0001\n\u0000\u0001\u0002\u0019\n\u0000\u0002\u0000\u0002\b\u0000\u0004\b\u0002\u0005\b\u0003\u0006\b\u0004\b\b\u0005\u0011\b\u000e\u0012\u001e\u0013\u0007\u000f\u0014\u001a\u0019\b\u0012", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", alnk.b(), "i", "j", "k"});
        } else if (i3 == 3) {
            return new almp();
        } else {
            if (i3 == 4) {
                return new aucd((byte[][]) null, (char[][]) null);
            }
            if (i3 == 5) {
                return l;
            }
            auef auef = m;
            if (auef == null) {
                synchronized (almp.class) {
                    auef = m;
                    if (auef == null) {
                        auef = new auce(l);
                        m = auef;
                    }
                }
            }
            return auef;
        }
    }
}
