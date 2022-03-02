package defpackage;

/* renamed from: avcx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avcx extends aucg implements audy {
    public static final avcx h;
    private static volatile auef j;
    public int a;
    public avcz b;
    public avcr c;
    public avct d;
    public avdb e;
    public avcv f;
    public avcp g;
    private byte i = 2;

    static {
        avcx avcx = new avcx();
        h = avcx;
        aucj.a(avcx.class, (aucj) avcx);
    }

    private avcx() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.i);
        }
        byte b2 = 0;
        if (i3 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.i = b2;
            return null;
        } else if (i3 == 2) {
            return aucj.a((audx) h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0006\u0001Љ\u0000\u0002Љ\u0001\u0003Љ\u0002\u0004Љ\u0003\u0006Љ\u0004\u0007Љ\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        } else if (i3 == 3) {
            return new avcx();
        } else {
            if (i3 == 4) {
                return new aucf(h);
            }
            if (i3 == 5) {
                return h;
            }
            auef auef = j;
            if (auef == null) {
                synchronized (avcx.class) {
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
