package defpackage;

/* renamed from: amap  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amap extends aucj implements audy {
    public static final amap l;
    private static volatile auef m;
    public int a;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public aucs f = aucl.b;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;

    static {
        amap amap = new amap();
        l = amap;
        aucj.a(amap.class, (aucj) amap);
    }

    private amap() {
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
            return aucj.a((audx) l, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0001\u0000\u0001\f\u0000\u0002\u0007\u0001\u0003\u0007\u0002\u0004\u0007\u0003\u0005\u001e\u0006\u000b\u0004\u0007\u000b\u0005\b\u000b\u0006\t\u000b\u0007\n\u000b\b", new Object[]{"a", "b", amag.a, "c", "d", "e", "f", amcz.b(), "g", "h", "i", "j", "k"});
        } else if (i3 == 3) {
            return new amap();
        } else {
            if (i3 == 4) {
                return new aucd((float[]) null, (float[][]) null);
            }
            if (i3 == 5) {
                return l;
            }
            auef auef = m;
            if (auef == null) {
                synchronized (amap.class) {
                    auef = m;
                    if (auef == null) {
                        auef = new auce(l);
                        m = auef;
                    }
                }
            }
            return auef;
        }
    }
}
