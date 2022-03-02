package defpackage;

/* renamed from: ashb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ashb extends aucj implements audy {
    public static final ashb h;
    private static volatile auef j;
    public int a;
    public int b;
    public asfk c;
    public asgl d;
    public aseq e;
    public asgh f;
    public asem g;
    private byte i = 2;

    static {
        ashb ashb = new ashb();
        h = ashb;
        aucj.a(ashb.class, (aucj) ashb);
    }

    private ashb() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.i);
        }
        byte b2 = 0;
        if (i3 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.i = b2;
            return null;
        } else if (i3 == 2) {
            return aucj.a((audx) h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0002\u0001\f\u0000\u0002Љ\u0001\u0003\t\u0002\u0004\t\u0003\u0005Љ\u0004\u0006\t\u0005", new Object[]{"a", "b", ashc.a, "c", "d", "e", "f", "g"});
        } else if (i3 == 3) {
            return new ashb();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) h);
            }
            if (i3 == 5) {
                return h;
            }
            auef auef = j;
            if (auef == null) {
                synchronized (ashb.class) {
                    auef = j;
                    if (auef == null) {
                        auef = new auce(h);
                        j = auef;
                    }
                }
            }
            return auef;
        }
    }
}
