package defpackage;

/* renamed from: avvp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avvp extends aucj implements audy {
    public static final auct i = new avvm();
    public static final avvp l;
    private static volatile auef n;
    public boolean a;
    public String b = "";
    public aucx c = auei.b;
    public int d;
    public String e = "";
    public boolean f;
    public int g = 2;
    public aucs h = aucl.b;
    public boolean j;
    public long k;
    private int m;

    static {
        avvp avvp = new avvp();
        l = avvp;
        aucj.a(avvp.class, (aucj) avvp);
    }

    private avvp() {
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
            return aucj.a((audx) l, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0002\u0000\u0001\u0007\u0000\u0002\b\u0001\u0003\u001a\u0004\u0004\u0002\u0005\b\u0003\u0006\u0007\u0004\u0007\u001e\b\f\u0005\t\u0007\u0006\n\u0002\u0007", new Object[]{"m", "a", "b", "c", "d", "e", "f", "h", avvo.b(), "g", avsd.b(), "j", "k"});
        } else if (i3 == 3) {
            return new avvp();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) l);
            }
            if (i3 == 5) {
                return l;
            }
            auef auef = n;
            if (auef == null) {
                synchronized (avvp.class) {
                    auef = n;
                    if (auef == null) {
                        auef = new auce(l);
                        n = auef;
                    }
                }
            }
            return auef;
        }
    }
}
