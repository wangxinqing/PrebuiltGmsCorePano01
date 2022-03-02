package defpackage;

/* renamed from: aten  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aten extends aucj implements audy {
    public static final aten j;
    private static volatile auef k;
    public int a;
    public long b;
    public int c;
    public int d;
    public boolean e;
    public int f;
    public ateo g;
    public String h = "";
    public int i;

    static {
        aten aten = new aten();
        j = aten;
        aucj.a(aten.class, (aucj) aten);
    }

    private aten() {
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
            return aucj.a((audx) j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\u0002\u0000\u0002\u000f\u0001\u0003\f\u0002\u0004\u0007\u0003\u0005\u0004\u0004\u0006\t\u0005\u0007\b\u0006\b\f\u0007", new Object[]{"a", "b", "c", "d", atel.a, "e", "f", "g", "h", "i", atek.a});
        } else if (i3 == 3) {
            return new aten();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) j);
            }
            if (i3 == 5) {
                return j;
            }
            auef auef = k;
            if (auef == null) {
                synchronized (aten.class) {
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
