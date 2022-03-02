package defpackage;

/* renamed from: atwj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atwj extends aucj implements audy {
    public static final atwj g;
    private static volatile auef i;
    public int a;
    public atwr b;
    public auay c = auay.b;
    public aucx d = auei.b;
    public aucx e = auei.b;
    public int f;
    private byte h = 2;

    static {
        atwj atwj = new atwj();
        g = atwj;
        aucj.a(atwj.class, (aucj) atwj);
    }

    private atwj() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.h);
        }
        byte b2 = 0;
        if (i3 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.h = b2;
            return null;
        } else if (i3 == 2) {
            return aucj.a((audx) g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0002\u0001\u0001Љ\u0000\u0002\n\u0001\u0003\u001c\u0004\u001b\u0006\f\u0002", new Object[]{"a", "b", "c", "d", "e", atwi.class, "f", atxf.b()});
        } else if (i3 == 3) {
            return new atwj();
        } else {
            if (i3 == 4) {
                return new aucd((boolean[][][]) null, (short[]) null);
            }
            if (i3 == 5) {
                return g;
            }
            auef auef = i;
            if (auef == null) {
                synchronized (atwj.class) {
                    auef = i;
                    if (auef == null) {
                        auef = new auce(g);
                        i = auef;
                    }
                }
            }
            return auef;
        }
    }
}
