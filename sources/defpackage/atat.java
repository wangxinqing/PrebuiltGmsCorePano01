package defpackage;

/* renamed from: atat  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atat extends aucj implements audy {
    public static final atat e;
    private static volatile auef f;
    public int a;
    public auip b;
    public aucx c = auei.b;
    public String d = "";

    static {
        atat atat = new atat();
        e = atat;
        aucj.a(atat.class, (aucj) atat);
    }

    private atat() {
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\t\u0000\u0002\u001a\u0003\b\u0001", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new atat();
        } else {
            if (i2 == 4) {
                return new aucd((boolean[][]) null, (char[]) null);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (atat.class) {
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
