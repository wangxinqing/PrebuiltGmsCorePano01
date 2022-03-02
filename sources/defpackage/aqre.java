package defpackage;

/* renamed from: aqre  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqre extends aucj implements audy {
    public static final aqre e;
    private static volatile auef f;
    public int a;
    public aqsn b;
    public aqsr c;
    public aucx d = auei.b;

    static {
        aqre aqre = new aqre();
        e = aqre;
        aucj.a(aqre.class, (aucj) aqre);
    }

    private aqre() {
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\t\u0000\u0002\t\u0001\u0003\u001b", new Object[]{"a", "b", "c", "d", aqss.class});
        } else if (i2 == 3) {
            return new aqre();
        } else {
            if (i2 == 4) {
                return new aucd((boolean[]) null, (char[]) null);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (aqre.class) {
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
