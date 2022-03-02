package defpackage;

/* renamed from: avvq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avvq extends aucj implements audy {
    public static final avvq e;
    private static volatile auef f;
    public int a;
    public avvt b;
    public aucs c = aucl.b;
    public int d;

    static {
        avvq avvq = new avvq();
        e = avvq;
        aucj.a(avvq.class, (aucj) avvq);
    }

    private avvq() {
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0001\u000f\u0003\u0000\u0001\u0000\u0001\t\u0000\u0002\u001e\u000f\u0004\u0001", new Object[]{"a", "b", "c", aups.b(), "d"});
        } else if (i2 == 3) {
            return new avvq();
        } else {
            if (i2 == 4) {
                return new aucd((boolean[]) null, (char[][]) null);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (avvq.class) {
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
