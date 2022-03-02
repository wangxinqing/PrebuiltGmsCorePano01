package defpackage;

/* renamed from: avcy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avcy extends aucg implements audy {
    public static final avcy k;
    private static volatile auef n;
    public int a;
    public auzh b;
    public auzh c;
    public long d;
    public String e = "";
    public auzi f;
    public String g;
    public String h;
    public auzh i;
    public String j;
    private byte l = 2;

    static {
        avcy avcy = new avcy();
        k = avcy;
        aucj.a(avcy.class, (aucj) avcy);
    }

    private avcy() {
        auei auei = auei.b;
        this.g = "";
        this.h = "";
        this.j = "";
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.l);
        }
        byte b2 = 0;
        if (i3 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.l = b2;
            return null;
        } else if (i3 == 2) {
            return aucj.a((audx) k, "\u0001\t\u0000\u0001\u0004\u0010\t\u0000\u0000\u0004\u0004Љ\u0000\u0005Љ\u0001\u0006\u0002\u0002\u0007\b\u0003\nЉ\u0004\u000b\b\u0005\f\b\u0006\u000fЉ\t\u0010\b\n", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"});
        } else if (i3 == 3) {
            return new avcy();
        } else {
            if (i3 == 4) {
                return new aucf(k);
            }
            if (i3 == 5) {
                return k;
            }
            auef auef = n;
            if (auef == null) {
                synchronized (avcy.class) {
                    auef = n;
                    if (auef == null) {
                        auef = new auce(k);
                        n = auef;
                    }
                }
            }
            return auef;
        }
    }
}
