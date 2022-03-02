package defpackage;

/* renamed from: avhc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avhc extends aucj implements audy {
    public static final avhc e;
    private static volatile auef f;
    public int a;
    public long b;
    public avop c;
    public String d = "";

    static {
        avhc avhc = new avhc();
        e = avhc;
        aucj.a(avhc.class, (aucj) avhc);
    }

    private avhc() {
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0000\u0000\u0002\u0002\u0001\u0003\b\u0003\u0005\t\u0002", new Object[]{"a", "b", "d", "c"});
        } else if (i2 == 3) {
            return new avhc();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (avhc.class) {
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
