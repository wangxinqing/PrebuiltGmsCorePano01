package defpackage;

/* renamed from: atah  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atah extends aucj implements audy {
    public static final atah d;
    private static volatile auef e;
    public int a;
    public aucv b = audl.b;
    public astx c;

    static {
        atah atah = new atah();
        d = atah;
        aucj.a(atah.class, (aucj) atah);
    }

    private atah() {
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
            return aucj.a((audx) d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0017\u0002\t\u0000", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new atah();
        } else {
            if (i2 == 4) {
                return new aucd((byte[][]) null, (byte[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (atah.class) {
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
