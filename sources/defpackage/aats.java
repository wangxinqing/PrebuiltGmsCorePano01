package defpackage;

/* renamed from: aats  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aats extends aucj implements audy {
    public static final aats e;
    private static volatile auef f;
    public int a;
    public boolean b;
    public long c;
    public aucx d = auei.b;

    static {
        aats aats = new aats();
        e = aats;
        aucj.a(aats.class, (aucj) aats);
    }

    private aats() {
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001\u0007\u0000\u0002\u0002\u0001\u0004\u001b", new Object[]{"a", "b", "c", "d", aatr.class});
        } else if (i2 == 3) {
            return new aats();
        } else {
            if (i2 == 4) {
                return new aucd((boolean[][][]) null, (char[][][]) null);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (aats.class) {
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
