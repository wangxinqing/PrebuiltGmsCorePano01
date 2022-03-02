package defpackage;

/* renamed from: aoyc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aoyc extends aucj implements audy {
    public static final aoyc e;
    private static volatile auef f;
    public int a;
    public aoya b;
    public auay c = auay.b;
    public auay d = auay.b;

    static {
        aoyc aoyc = new aoyc();
        e = aoyc;
        aucj.a(aoyc.class, (aucj) aoyc);
    }

    private aoyc() {
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
            return aucj.a((audx) e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new aoyc();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (aoyc.class) {
                    auef = f;
                    if (auef == null) {
                        auef = new auce(e);
                        f = auef;
                    }
                }
            }
            return auef;
        }
    }
}
