package defpackage;

/* renamed from: aogc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aogc extends aucj implements audy {
    public static final aogc e;
    private static volatile auef g;
    public int a;
    public long b;
    public int c;
    public int d;
    private byte f = 2;

    static {
        aogc aogc = new aogc();
        e = aogc;
        aucj.a(aogc.class, (aucj) aogc);
    }

    private aogc() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        byte b2 = 0;
        if (i2 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.f = b2;
            return null;
        } else if (i2 == 2) {
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001Ԃ\u0000\u0002Ԇ\u0001\u0003Ԇ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new aogc();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (aogc.class) {
                    auef = g;
                    if (auef == null) {
                        auef = new auce(e);
                        g = auef;
                    }
                }
            }
            return auef;
        }
    }
}
