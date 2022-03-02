package defpackage;

/* renamed from: otg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class otg extends aucj implements audy {
    public static final otg h;
    private static volatile auef i;
    public int a;
    public aucx b = auei.b;
    public int c;
    public boolean d;
    public int e;
    public otd f;
    public String g = "";

    static {
        otg otg = new otg();
        h = otg;
        aucj.a(otg.class, (aucj) otg);
    }

    private otg() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 1) {
            return null;
        }
        if (i3 == 2) {
            return aucj.a((audx) h, "\u0001\u0006\u0000\u0001\u0003\b\u0006\u0000\u0001\u0000\u0003\u001b\u0004\f\u0002\u0005\u0007\u0003\u0006\u0004\u0004\u0007\t\u0005\b\b\u0006", new Object[]{"a", "b", otc.class, "c", ote.a, "d", "e", "f", "g"});
        } else if (i3 == 3) {
            return new otg();
        } else {
            if (i3 == 4) {
                return new aucd((short[][]) null, (char[][]) null);
            }
            if (i3 == 5) {
                return h;
            }
            auef auef = i;
            if (auef == null) {
                synchronized (otg.class) {
                    auef = i;
                    if (auef == null) {
                        auef = new auce(h);
                        i = auef;
                    }
                }
            }
            return auef;
        }
    }
}
