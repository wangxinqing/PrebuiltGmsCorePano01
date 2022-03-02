package defpackage;

/* renamed from: atje  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atje extends aucj implements audy {
    public static final atje i;
    private static volatile auef k;
    public int a;
    public long b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    private int j;

    static {
        atje atje = new atje();
        i = atje;
        aucj.a(atje.class, (aucj) atje);
    }

    private atje() {
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
            return aucj.a((audx) i, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\f\u0000\u0002\u0002\u0001\u0003\f\u0002\u0004\f\u0003\u0005\f\u0004\u0006\f\u0005\u0007\f\u0006\b\f\u0007", new Object[]{"j", "a", atjc.a, "b", "c", atms.a, "d", atmo.a, "e", atmq.a, "f", atmu.a, "g", atmw.a, "h", atmy.a});
        } else if (i3 == 3) {
            return new atje();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) i);
            }
            if (i3 == 5) {
                return i;
            }
            auef auef = k;
            if (auef == null) {
                synchronized (atje.class) {
                    auef = k;
                    if (auef == null) {
                        auef = new auce(i);
                        k = auef;
                    }
                }
            }
            return auef;
        }
    }
}
