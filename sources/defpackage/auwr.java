package defpackage;

/* renamed from: auwr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class auwr extends aucj implements audy {
    public static final auwr e;
    private static volatile auef f;
    public int a;
    public aucx b = auei.b;
    public auxd c;
    public boolean d;

    static {
        auwr auwr = new auwr();
        e = auwr;
        aucj.a(auwr.class, (aucj) auwr);
    }

    private auwr() {
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002\t\u0000\u0003\u0007\u0001", new Object[]{"a", "b", auxo.class, "c", "d"});
        } else if (i2 == 3) {
            return new auwr();
        } else {
            if (i2 == 4) {
                return new aucd((short[][]) null);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (auwr.class) {
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
