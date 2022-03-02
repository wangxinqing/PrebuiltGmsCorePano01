package defpackage;

/* renamed from: atuh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atuh extends aucj implements audy {
    public static final atuh c;
    public static final auci d;
    private static volatile auef e;
    public int a;
    public int b;

    static {
        atuh atuh = new atuh();
        c = atuh;
        aucj.a(atuh.class, (aucj) atuh);
        atjm atjm = atjm.a;
        atuh atuh2 = c;
        d = aucj.a((audx) atjm, (Object) atuh2, (audx) atuh2, 198117910, aufw.MESSAGE);
    }

    private atuh() {
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
            return aucj.a((audx) c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f\u0000", new Object[]{"a", "b", atug.a});
        } else if (i2 == 3) {
            return new atuh();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) c);
            }
            if (i2 == 5) {
                return c;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (atuh.class) {
                    auef = e;
                    if (auef == null) {
                        auef = new auce(c);
                        e = auef;
                    }
                }
            }
            return auef;
        }
    }
}
