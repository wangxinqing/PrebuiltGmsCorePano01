package defpackage;

/* renamed from: atoj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atoj extends aucj implements audy {
    public static final atoj e;
    private static volatile auef f;
    public int a;
    public String b = "";
    public String c = "";
    public atos d;

    static {
        atoj atoj = new atoj();
        e = atoj;
        aucj.a(atoj.class, (aucj) atoj);
    }

    private atoj() {
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001\u0004\t\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new atoj();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (atoj.class) {
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
