package defpackage;

/* renamed from: atix  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atix extends aucj implements audy {
    public static final atix e;
    private static volatile auef i;
    public int a;
    public int b;
    public int c;
    public aujv d;
    private aogc f;
    private aogc g;
    private byte h = 2;

    static {
        atix atix = new atix();
        e = atix;
        aucj.a(atix.class, (aucj) atix);
    }

    private atix() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.h);
        }
        byte b2 = 0;
        if (i3 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.h = b2;
            return null;
        } else if (i3 == 2) {
            return aucj.a((audx) e, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0003\u0001Љ\u0005\u0002Љ\u0003\u0003\u0004\u0000\u0004\u0004\u0001\u0005Љ\u0004", new Object[]{"a", "d", "f", "b", "c", "g"});
        } else if (i3 == 3) {
            return new atix();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) e);
            }
            if (i3 == 5) {
                return e;
            }
            auef auef = i;
            if (auef == null) {
                synchronized (atix.class) {
                    auef = i;
                    if (auef == null) {
                        auef = new auce(e);
                        i = auef;
                    }
                }
            }
            return auef;
        }
    }
}
