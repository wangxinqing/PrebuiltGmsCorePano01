package defpackage;

/* renamed from: arjn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arjn extends aucj implements audy {
    public static final arjn d;
    private static volatile auef e;
    public int a;
    public boolean b = true;
    public long c = 8000;

    static {
        arjn arjn = new arjn();
        d = arjn;
        aucj.a(arjn.class, (aucj) arjn);
    }

    private arjn() {
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
            return aucj.a((audx) d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0000\u0002\u0003\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new arjn();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) d);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (arjn.class) {
                    auef = e;
                    if (auef == null) {
                        auef = new auce(d);
                        e = auef;
                    }
                }
            }
            return auef;
        }
    }
}
