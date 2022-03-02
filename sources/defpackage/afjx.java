package defpackage;

/* renamed from: afjx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afjx extends aucj implements audy {
    public static final afjx e;
    private static volatile auef f;
    public int a;
    public String b = "";
    public String c = "";
    public aucx d = auei.b;

    static {
        afjx afjx = new afjx();
        e = afjx;
        aucj.a(afjx.class, (aucj) afjx);
    }

    private afjx() {
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0001\u0000\u0001\b\u0000\u0002\u001b\u0006\b\u0001", new Object[]{"a", "b", "d", afjw.class, "c"});
        } else if (i2 == 3) {
            return new afjx();
        } else {
            if (i2 == 4) {
                return new aucd((boolean[]) null, (short[][]) null);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (afjx.class) {
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
