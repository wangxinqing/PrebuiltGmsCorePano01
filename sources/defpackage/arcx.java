package defpackage;

/* renamed from: arcx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arcx extends aucj implements audy {
    public static final arcx a;
    private static volatile auef b;

    static {
        arcx arcx = new arcx();
        a = arcx;
        aucj.a(arcx.class, (aucj) arcx);
    }

    private arcx() {
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
            return aucj.a((audx) a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new arcx();
        }
        if (i2 == 4) {
            return new aucd((aucj) a);
        }
        if (i2 == 5) {
            return a;
        }
        auef auef = b;
        if (auef == null) {
            synchronized (arcx.class) {
                auef = b;
                if (auef == null) {
                    auef = new auce(a);
                    b = auef;
                }
            }
        }
        return auef;
    }
}
