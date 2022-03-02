package defpackage;

/* renamed from: vnl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vnl extends aucj implements audy {
    public static final vnl f;
    private static volatile auef g;
    public int a;
    public aucx b = auei.b;
    public aucx c = auei.b;
    public String d = "";
    public aucx e = auei.b;

    static {
        vnl vnl = new vnl();
        f = vnl;
        aucj.a(vnl.class, (aucj) vnl);
    }

    private vnl() {
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
            return aucj.a((audx) f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0003\u0000\u0001\u001b\u0002\u001b\u0003\b\u0000\u0004\u001b", new Object[]{"a", "b", vnh.class, "c", vnt.class, "d", "e", voa.class});
        } else if (i2 == 3) {
            return new vnl();
        } else {
            if (i2 == 4) {
                return new aucd((int[]) null, (int[]) null);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (vnl.class) {
                    auef = g;
                    if (auef == null) {
                        auef = new auce(f);
                        g = auef;
                    }
                }
            }
            return auef;
        }
    }
}
