package defpackage;

/* renamed from: aoit  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aoit extends aucj implements audy {
    public static final aoit d;
    private static volatile auef f;
    public int a;
    public aois b;
    public aucx c = auei.b;
    private byte e = 2;

    static {
        aoit aoit = new aoit();
        d = aoit;
        aucj.a(aoit.class, (aucj) aoit);
    }

    private aoit() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        byte b2 = 0;
        if (i2 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.e = b2;
            return null;
        } else if (i2 == 2) {
            return aucj.a((audx) d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0002\u0001ԉ\u0000\u0002Л", new Object[]{"a", "b", "c", aois.class});
        } else if (i2 == 3) {
            return new aoit();
        } else {
            if (i2 == 4) {
                return new aucd((int[][]) null, (short[]) null);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (aoit.class) {
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
