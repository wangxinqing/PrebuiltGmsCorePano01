package defpackage;

/* renamed from: anzt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anzt extends aucj implements audy {
    public static final anzt h;
    private static volatile auef i;
    public int a;
    public long b;
    public int c;
    public float d;
    public int e;
    public float f;
    public float g;

    static {
        anzt anzt = new anzt();
        h = anzt;
        aucj.a(anzt.class, (aucj) anzt);
    }

    private anzt() {
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
            return aucj.a((audx) h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0005\u0000\u0002\u0004\u0001\u0003\u0001\u0002\u0004\u0004\u0003\u0005\u0001\u0004\u0006\u0001\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        } else if (i3 == 3) {
            return new anzt();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) h);
            }
            if (i3 == 5) {
                return h;
            }
            auef auef = i;
            if (auef == null) {
                synchronized (anzt.class) {
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
