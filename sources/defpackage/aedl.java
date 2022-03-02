package defpackage;

/* renamed from: aedl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aedl extends aucj implements audy {
    public static final aedl d;
    private static volatile auef f;
    public String a = "";
    public long b;
    public int c;
    private int e;

    static {
        aedl aedl = new aedl();
        d = aedl;
        aucj.a(aedl.class, (aucj) aedl);
    }

    private aedl() {
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
            return aucj.a((audx) d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\b\u0000\u0002\u0002\u0001\u0003\f\u0002", new Object[]{"e", "a", "b", "c", aedr.a});
        } else if (i2 == 3) {
            return new aedl();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) d);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (aedl.class) {
                    auef = f;
                    if (auef == null) {
                        auef = new auce(d);
                        f = auef;
                    }
                }
            }
            return auef;
        }
    }
}
