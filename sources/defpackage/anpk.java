package defpackage;

/* renamed from: anpk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anpk extends aucj implements audy {
    public static final anpk k;
    private static volatile auef l;
    public int a;
    public int b;
    public long c;
    public long d;
    public boolean e;
    public boolean f;
    public boolean g;
    public anpy h;
    public long i;
    public int j;

    static {
        anpk anpk = new anpk();
        k = anpk;
        aucj.a(anpk.class, (aucj) anpk);
    }

    private anpk() {
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
            return aucj.a((audx) k, "\u0001\t\u0000\u0001\u0001\u000b\t\u0000\u0000\u0000\u0001\f\u0000\u0002\u0002\u0001\u0003\u0002\u0002\u0004\u0007\u0003\u0005\u0007\u0004\u0006\u0007\u0005\u0007\t\u0006\b\u0002\u0007\u000b\f\n", new Object[]{"a", "b", anpj.a, "c", "d", "e", "f", "g", "h", "i", "j", anpq.a});
        } else if (i3 == 3) {
            return new anpk();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) k);
            }
            if (i3 == 5) {
                return k;
            }
            auef auef = l;
            if (auef == null) {
                synchronized (anpk.class) {
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
