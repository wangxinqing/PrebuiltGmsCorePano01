package defpackage;

/* renamed from: aske  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aske extends aucj implements audy {
    public static final aske e;
    private static volatile auef f;
    public int a;
    public long b;
    public aucs c = aucl.b;
    public aucx d = auei.b;

    static {
        aske aske = new aske();
        e = aske;
        aucj.a(aske.class, (aucj) aske);
    }

    private aske() {
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u0002\u0000\u0002\u001e\u0003\u001b", new Object[]{"a", "b", "c", asoe.b(), "d", aski.class});
        } else if (i2 == 3) {
            return new aske();
        } else {
            if (i2 == 4) {
                return new aucd((byte[][][]) null, (byte[][]) null);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (aske.class) {
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
