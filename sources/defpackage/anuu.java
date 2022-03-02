package defpackage;

/* renamed from: anuu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anuu extends aucj implements audy {
    public static final anuu e;
    private static volatile auef f;
    public int a;
    public aucx b = auei.b;
    public aucx c = auei.b;
    public int d;

    static {
        anuu anuu = new anuu();
        e = anuu;
        aucj.a(anuu.class, (aucj) anuu);
    }

    private anuu() {
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0003\u0005\u0003\u0000\u0002\u0000\u0003\u001b\u0004\u001b\u0005\f\u0002", new Object[]{"a", "b", anuq.class, "c", anuq.class, "d", anut.a});
        } else if (i2 == 3) {
            return new anuu();
        } else {
            if (i2 == 4) {
                return new aucd((short[][]) null, (short[]) null);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (anuu.class) {
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
