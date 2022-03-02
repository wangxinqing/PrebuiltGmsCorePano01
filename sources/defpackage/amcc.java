package defpackage;

/* renamed from: amcc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amcc extends aucj implements audy {
    public static final amcc a;
    private static volatile auef n;
    private int b;
    private ambw c;
    private ambu d;
    private ambz e;
    private ambv f;
    private amcb g;
    private ambt h;
    private ambs i;
    private amca j;
    private amby k;
    private ambx l;
    private byte m = 2;

    static {
        amcc amcc = new amcc();
        a = amcc;
        aucj.a(amcc.class, (aucj) amcc);
    }

    private amcc() {
        auei auei = auei.b;
        aucl aucl = aucl.b;
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.m);
        }
        byte b2 = 0;
        if (i3 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.m = b2;
            return null;
        } else if (i3 == 2) {
            return aucj.a((audx) a, "\u0001\n\u0000\u0001\u0005\u0012\n\u0000\u0000\n\u0005Љ\u0003\u0006Љ\u0004\u0007Љ\u0005\bЉ\u0006\tЉ\u0007\nЉ\b\u000bЉ\t\fЉ\n\u0010Љ\f\u0012Љ\u0010", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l"});
        } else if (i3 == 3) {
            return new amcc();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) a);
            }
            if (i3 == 5) {
                return a;
            }
            auef auef = n;
            if (auef == null) {
                synchronized (amcc.class) {
                    auef = n;
                    if (auef == null) {
                        auef = new auce(a);
                        n = auef;
                    }
                }
            }
            return auef;
        }
    }
}
