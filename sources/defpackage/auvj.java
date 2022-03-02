package defpackage;

/* renamed from: auvj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class auvj extends aucj implements audy {
    public static final auvj j;
    private static volatile auef l;
    public int a;
    public auyt b;
    public auyt c;
    public auyt d;
    public auyt e;
    public auyt f;
    public auvk g;
    public auvk h;
    public auvk i;
    private byte k = 2;

    static {
        auvj auvj = new auvj();
        j = auvj;
        aucj.a(auvj.class, (aucj) auvj);
    }

    private auvj() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.k);
        }
        byte b2 = 0;
        if (i3 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.k = b2;
            return null;
        } else if (i3 == 2) {
            return aucj.a((audx) j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0005\u0001Љ\u0000\u0002Љ\u0001\u0003Љ\u0002\u0004Љ\u0003\u0005Љ\u0004\u0006\t\u0005\u0007\t\u0006\b\t\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i"});
        } else if (i3 == 3) {
            return new auvj();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) j);
            }
            if (i3 == 5) {
                return j;
            }
            auef auef = l;
            if (auef == null) {
                synchronized (auvj.class) {
                    auef = l;
                    if (auef == null) {
                        auef = new auce(j);
                        l = auef;
                    }
                }
            }
            return auef;
        }
    }
}
