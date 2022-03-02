package defpackage;

/* renamed from: anuk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anuk extends aucj implements audy {
    public static final anuk j;
    private static volatile auef k;
    public int a;
    public String b = "";
    public int c = -1;
    public boolean d;
    public boolean e;
    public int f;
    public String g = "";
    public int h;
    public anuj i;

    static {
        anuk anuk = new anuk();
        j = anuk;
        aucj.a(anuk.class, (aucj) anuk);
    }

    private anuk() {
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
            return aucj.a((audx) j, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\u0000\u0001\b\u0000\u0002\f\u0001\u0003\u0007\u0002\u0004\u0007\u0003\u0005\f\u0004\u0006\b\u0005\u0007\f\u0006\t\t\b", new Object[]{"a", "b", "c", avrp.b(), "d", "e", "f", avsd.b(), "g", "h", avtt.a, "i"});
        } else if (i3 == 3) {
            return new anuk();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) j);
            }
            if (i3 == 5) {
                return j;
            }
            auef auef = k;
            if (auef == null) {
                synchronized (anuk.class) {
                    auef = k;
                    if (auef == null) {
                        auef = new auce(j);
                        k = auef;
                    }
                }
            }
            return auef;
        }
    }
}
