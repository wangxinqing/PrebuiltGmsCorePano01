package defpackage;

/* renamed from: aqdh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqdh extends aucj implements audy {
    public static final aqdh e;
    private static volatile auef f;
    public int a;
    public long b;
    public aucv c = audl.b;
    public aucx d = auei.b;

    static {
        aqdh aqdh = new aqdh();
        e = aqdh;
        aucj.a(aqdh.class, (aucj) aqdh);
    }

    private aqdh() {
        auei auei = auei.b;
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0004\u0006\u0003\u0000\u0002\u0000\u0004\u001b\u0005\u0005\u0001\u0006\u0017", new Object[]{"a", "d", aqdg.class, "b", "c"});
        } else if (i2 == 3) {
            return new aqdh();
        } else {
            if (i2 == 4) {
                return new aucd((short[][]) null, (float[][]) null);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (aqdh.class) {
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
