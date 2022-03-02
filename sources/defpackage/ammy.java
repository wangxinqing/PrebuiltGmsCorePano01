package defpackage;

/* renamed from: ammy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ammy extends aucj implements audy {
    public static final ammy k;
    private static volatile auef l;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public long f;
    public long g;
    public int h;
    public long i;
    public int j;

    static {
        ammy ammy = new ammy();
        k = ammy;
        aucj.a(ammy.class, (aucj) ammy);
    }

    private ammy() {
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
            return aucj.a((audx) k, "\u0001\t\u0000\u0001\u0001Ɛ\t\u0000\u0000\u0000\u0001\f\u0000d\u000b\u0001È\u0004\u0002É\u0004\u0003Ê\u0003\u0004Ë\u0003\u0005Ì\u0004\u0006Ĭ\u0003\u0007Ɛ\f\b", new Object[]{"a", "b", ammx.a, "c", "d", "e", "f", "g", "h", "i", "j", ammw.a});
        } else if (i3 == 3) {
            return new ammy();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) k);
            }
            if (i3 == 5) {
                return k;
            }
            auef auef = l;
            if (auef == null) {
                synchronized (ammy.class) {
                    auef = l;
                    if (auef == null) {
                        auef = new auce(k);
                        l = auef;
                    }
                }
            }
            return auef;
        }
    }
}
