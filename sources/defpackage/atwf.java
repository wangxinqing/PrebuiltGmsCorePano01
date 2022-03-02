package defpackage;

/* renamed from: atwf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atwf extends aucj implements audy {
    public static final atwf g;
    private static volatile auef h;
    public int a;
    public String b = "";
    public atwe c;
    public aucs d = aucl.b;
    public atvp e;
    public boolean f;

    static {
        atwf atwf = new atwf();
        g = atwf;
        aucj.a(atwf.class, (aucj) atwf);
    }

    private atwf() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 1) {
            return null;
        }
        if (i2 == 2) {
            return aucj.a((audx) g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\b\u0000\u0002\t\u0001\u0003\u001e\u0004\t\u0002\u0005\u0007\u0003", new Object[]{"a", "b", "c", "d", atxf.b(), "e", "f"});
        } else if (i2 == 3) {
            return new atwf();
        } else {
            if (i2 == 4) {
                return new aucd((byte[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return g;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (atwf.class) {
                    auef = h;
                    if (auef == null) {
                        auef = new auce(g);
                        h = auef;
                    }
                }
            }
            return auef;
        }
    }

    public final void a() {
        if (!this.d.a()) {
            this.d = aucj.a(this.d);
        }
    }
}
