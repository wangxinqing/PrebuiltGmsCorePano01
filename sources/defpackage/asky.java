package defpackage;

/* renamed from: asky  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class asky extends aucj implements audy {
    public static final asky h;
    private static volatile auef j;
    public int a;
    public String b = "";
    public int c;
    public int d;
    public askq e;
    public askx f;
    public asmc g;
    private byte i = 2;

    static {
        asky asky = new asky();
        h = asky;
        aucj.a(asky.class, (aucj) asky);
    }

    private asky() {
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
            return aucj.a((audx) h, "\u0001\u0006\u0000\u0001\u0001\u000e\u0006\u0000\u0000\u0001\u0001\b\u0000\t\f\u0001\n\f\u0002\u000b\t\u0003\f\t\u0004\u000eЉ\u0006", new Object[]{"a", "b", "c", asoz.a, "d", asoy.a, "e", "f", "g"});
        } else if (i3 == 3) {
            return new asky();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) h);
            }
            if (i3 == 5) {
                return h;
            }
            auef auef = j;
            if (auef == null) {
                synchronized (asky.class) {
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
