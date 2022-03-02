package defpackage;

/* renamed from: olv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class olv extends aucj implements audy {
    public static final olv h;
    private static volatile auef i;
    public int a;
    public olw b;
    public olx c;
    public oma d;
    public String e = "";
    public oly f;
    public int g;

    static {
        olv olv = new olv();
        h = olv;
        aucj.a(olv.class, (aucj) olv);
    }

    private olv() {
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
            return aucj.a((audx) h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001\u0003\t\u0002\u0004\b\u0003\u0005\t\u0004\u0006\f\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g", avmr.a});
        } else if (i3 == 3) {
            return new olv();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) h);
            }
            if (i3 == 5) {
                return h;
            }
            auef auef = i;
            if (auef == null) {
                synchronized (olv.class) {
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
