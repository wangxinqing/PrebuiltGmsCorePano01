package defpackage;

/* renamed from: atna  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atna extends aucj implements audy {
    public static final atna h;
    public static final auci i;
    private static volatile auef j;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;

    static {
        atna atna = new atna();
        h = atna;
        aucj.a(atna.class, (aucj) atna);
        atjm atjm = atjm.a;
        atna atna2 = h;
        i = aucj.a((audx) atjm, (Object) atna2, (audx) atna2, 91925232, aufw.MESSAGE);
    }

    private atna() {
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
            return aucj.a((audx) h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001\u0003\f\u0002\u0004\f\u0003\u0005\f\u0004\u0006\f\u0005", new Object[]{"a", "b", atms.a, "c", atmo.a, "d", atmq.a, "e", atmu.a, "f", atmw.a, "g", atmy.a});
        } else if (i3 == 3) {
            return new atna();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) h);
            }
            if (i3 == 5) {
                return h;
            }
            auef auef = j;
            if (auef == null) {
                synchronized (atna.class) {
                    auef = j;
                    if (auef == null) {
                        auef = new auce(h);
                        j = auef;
                    }
                }
            }
            return auef;
        }
    }
}
