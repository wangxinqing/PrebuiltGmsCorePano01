package defpackage;

/* renamed from: tzi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tzi extends aucj implements audy {
    public static final auct m = new tzh();
    public static final tzi p;
    private static volatile auef q;
    public int a;
    public String b = "";
    public auay c = auay.b;
    public boolean d;
    public int e;
    public String f = "";
    public String g = "";
    public long h;
    public long i;
    public boolean j;
    public String k = "";
    public aucs l = aucl.b;
    public uaj n;
    public boolean o;

    static {
        tzi tzi = new tzi();
        p = tzi;
        aucj.a(tzi.class, (aucj) tzi);
    }

    private tzi() {
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
            return aucj.a((audx) p, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001\b\u0000\u0002\n\u0001\u0003\u0007\u0002\u0004\u0004\u0003\u0005\b\u0004\u0006\b\u0005\u0007\u0002\u0006\b\u0002\u0007\t\u0007\b\n\b\t\u000b\u001e\f\t\n\r\u0007\u000b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", avbl.b(), "n", "o"});
        } else if (i3 == 3) {
            return new tzi();
        } else {
            if (i3 == 4) {
                return new aucd((byte[][]) null, (boolean[][][]) null);
            }
            if (i3 == 5) {
                return p;
            }
            auef auef = q;
            if (auef == null) {
                synchronized (tzi.class) {
                    auef = q;
                    if (auef == null) {
                        auef = new auce(p);
                        q = auef;
                    }
                }
            }
            return auef;
        }
    }
}
