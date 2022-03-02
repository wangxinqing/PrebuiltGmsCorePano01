package defpackage;

/* renamed from: aqpe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqpe extends aucj implements audy {
    public static final aqpe f;
    private static volatile auef g;
    public String a = "";
    public String b = "";
    public auay c = auay.b;
    public hme d;
    public aqpf e;

    static {
        aqpe aqpe = new aqpe();
        f = aqpe;
        aucj.a(aqpe.class, (aucj) aqpe);
    }

    private aqpe() {
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
            return aucj.a((audx) f, "\u0000\u0005\u0000\u0000\u0001\b\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0005\n\u0006\t\b\t", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new aqpe();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) f);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (aqpe.class) {
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
