package defpackage;

/* renamed from: aazm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aazm extends aucj implements audy {
    public static final aazm f;
    private static volatile auef h;
    public int a;
    public int b;
    public aazo c;
    public aazq d;
    public int e;
    private byte g = 2;

    static {
        aazm aazm = new aazm();
        f = aazm;
        aucj.a(aazm.class, (aucj) aazm);
    }

    private aazm() {
        auay auay = auay.b;
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        byte b2 = 0;
        if (i2 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.g = b2;
            return null;
        } else if (i2 == 2) {
            return aucj.a((audx) f, "\u0001\u0004\u0000\u0001\u0001G\u0004\u0000\u0000\u0002\u0001\f\u0000\u0002Љ\u0001\u0005Љ\u0004G\f\u0005", new Object[]{"a", "b", aazl.a, "c", "d", "e", aazr.a});
        } else if (i2 == 3) {
            return new aazm();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) f);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (aazm.class) {
                    auef = h;
                    if (auef == null) {
                        auef = new auce(f);
                        h = auef;
                    }
                }
            }
            return auef;
        }
    }
}
