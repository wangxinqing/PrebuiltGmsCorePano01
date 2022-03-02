package defpackage;

/* renamed from: atuj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atuj extends aucj implements audy {
    public static final atuj e;
    private static volatile auef g;
    public atui a;
    public atul b;
    public int c;
    public aucx d = auei.b;
    private int f;

    static {
        atuj atuj = new atuj();
        e = atuj;
        aucj.a(atuj.class, (aucj) atuj);
    }

    private atuj() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj) {
        Class<atuj> cls = atuj.class;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 1) {
            return null;
        }
        if (i2 == 2) {
            return aucj.a((audx) e, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0001\u0000\u0001\t\u0000\u0002\t\u0001\u0004\u0004\u0003\u0006\u001b", new Object[]{"f", "a", "b", "c", "d", cls});
        } else if (i2 == 3) {
            return new atuj();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (cls) {
                    auef = g;
                    if (auef == null) {
                        auef = new auce(e);
                        g = auef;
                    }
                }
            }
            return auef;
        }
    }
}
