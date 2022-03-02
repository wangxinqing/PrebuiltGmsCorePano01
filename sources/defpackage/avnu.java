package defpackage;

/* renamed from: avnu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avnu extends aucj implements audy {
    public static final avnu c;
    private static volatile auef d;
    public int a;
    public String b = "";

    static {
        avnu avnu = new avnu();
        c = avnu;
        aucj.a(avnu.class, (aucj) avnu);
    }

    private avnu() {
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
            return aucj.a((audx) c, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003\b\u0002", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new avnu();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) c);
            }
            if (i2 == 5) {
                return c;
            }
            auef auef = d;
            if (auef == null) {
                synchronized (avnu.class) {
                    auef = d;
                    if (auef == null) {
                        auef = new auce(c);
                        d = auef;
                    }
                }
            }
            return auef;
        }
    }
}
