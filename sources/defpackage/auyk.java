package defpackage;

/* renamed from: auyk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class auyk extends aucj implements audy {
    public static final auyk k;
    private static volatile auef l;
    public int a;
    public boolean b = true;
    public boolean c;
    public double d = 44100.0d;
    public int e = 16;
    public int f = 2;
    public int g = 125;
    public auyg h;
    public double i = 1.0d;
    public auyh j;

    static {
        auyk auyk = new auyk();
        k = auyk;
        aucj.a(auyk.class, (aucj) auyk);
    }

    private auyk() {
    }

    public static /* synthetic */ void a(auyk auyk) {
        auyk.a |= 1;
        auyk.b = true;
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
            return aucj.a((audx) k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001\u0007\u0000\u0002\u0007\u0001\u0003\u0000\u0002\u0004\u0004\u0003\u0005\u0004\u0004\u0006\u0004\u0005\u0007\t\u0006\b\u0000\u0007\t\t\b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"});
        } else if (i3 == 3) {
            return new auyk();
        } else {
            if (i3 == 4) {
                return new aucd((float[]) null, (boolean[][][]) null);
            }
            if (i3 == 5) {
                return k;
            }
            auef auef = l;
            if (auef == null) {
                synchronized (auyk.class) {
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
