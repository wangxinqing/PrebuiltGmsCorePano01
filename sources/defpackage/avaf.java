package defpackage;

/* renamed from: avaf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avaf extends aucg implements audy {
    public static final avaf i;
    private static volatile auef k;
    public int a;
    public String b = "";
    public long c;
    public auzu d;
    public avaj e;
    public auzl f;
    public auzs g;
    public int h;
    private byte j = 2;

    static {
        avaf avaf = new avaf();
        i = avaf;
        aucj.a(avaf.class, (aucj) avaf);
    }

    private avaf() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.j);
        }
        byte b2 = 0;
        if (i3 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.j = b2;
            return null;
        } else if (i3 == 2) {
            return aucj.a((audx) i, "\u0001\u0007\u0000\u0001\u0001\u0010\u0007\u0000\u0000\u0001\u0001\b\u0000\u0003\u0002\u0001\u0004\t\u0002\u0007\t\u0004\n\t\u0007\rЉ\t\u0010\f\u000b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", avce.a});
        } else if (i3 == 3) {
            return new avaf();
        } else {
            if (i3 == 4) {
                return new aucf(i);
            }
            if (i3 == 5) {
                return i;
            }
            auef auef = k;
            if (auef == null) {
                synchronized (avaf.class) {
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
