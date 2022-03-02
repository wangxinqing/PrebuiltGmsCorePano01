package defpackage;

/* renamed from: atsi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atsi extends aucj implements audy {
    public static final auct c = new atsh();
    public static final atsi d;
    private static volatile auef f;
    public int a;
    public aucs b = aucl.b;
    private int e;

    static {
        atsi atsi = new atsi();
        d = atsi;
        aucj.a(atsi.class, (aucj) atsi);
    }

    private atsi() {
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
            return aucj.a((audx) d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0000\u0002\u001e", new Object[]{"e", "a", atso.a, "b", atsr.b()});
        } else if (i2 == 3) {
            return new atsi();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) d);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (atsi.class) {
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
