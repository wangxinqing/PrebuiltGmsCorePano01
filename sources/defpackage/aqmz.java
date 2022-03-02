package defpackage;

/* renamed from: aqmz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqmz extends aucg implements audy {
    public static final aqmz l;
    private static volatile auef o;
    public int a;
    public int b;
    public int c;
    public String d = "";
    public int e;
    public boolean f;
    public aqmh g;
    public aqlq h;
    public aqmg i;
    public aqms j;
    public aqlr k;
    private byte n = 2;

    static {
        aqmz aqmz = new aqmz();
        l = aqmz;
        aucj.a(aqmz.class, (aucj) aqmz);
    }

    private aqmz() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.n);
        }
        byte b2 = 0;
        if (i3 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.n = b2;
            return null;
        } else if (i3 == 2) {
            return aucj.a((audx) l, "\u0001\n\u0000\u0001\u0001\f\n\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001\u0003\b\u0002\u0004\u0004\u0003\u0005\u0007\u0004\u0006\t\u0005\u0007\t\u0006\t\t\b\u000b\t\n\f\t\u000b", new Object[]{"a", "b", aqla.a, "c", aqky.a, "d", "e", "f", "g", "h", "i", "j", "k"});
        } else if (i3 == 3) {
            return new aqmz();
        } else {
            if (i3 == 4) {
                return new aucf(l);
            }
            if (i3 == 5) {
                return l;
            }
            auef auef = o;
            if (auef == null) {
                synchronized (aqmz.class) {
                    auef = o;
                    if (auef == null) {
                        auef = new auce(l);
                        o = auef;
                    }
                }
            }
            return auef;
        }
    }
}
