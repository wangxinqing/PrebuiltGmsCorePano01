package defpackage;

/* renamed from: aoip  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aoip extends aucj implements audy {
    public static final aoip h;
    private static volatile auef i;
    public int a;
    public boolean b;
    public boolean c;
    public aoin d;
    public boolean e;
    public aoik f;
    public aucx g = auei.b;

    static {
        aoip aoip = new aoip();
        h = aoip;
        aucj.a(aoip.class, (aucj) aoip);
    }

    private aoip() {
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
            return aucj.a((audx) h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u0007\u0000\u0002\u0007\u0001\u0003\t\u0002\u0004\u0007\u0003\u0005\t\u0004\u0006\u001b", new Object[]{"a", "b", "c", "d", "e", "f", "g", aoio.class});
        } else if (i3 == 3) {
            return new aoip();
        } else {
            if (i3 == 4) {
                return new aucd((short[][][]) null, (int[]) null);
            }
            if (i3 == 5) {
                return h;
            }
            auef auef = i;
            if (auef == null) {
                synchronized (aoip.class) {
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
