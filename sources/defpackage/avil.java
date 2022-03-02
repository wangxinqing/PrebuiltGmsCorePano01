package defpackage;

/* renamed from: avil  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avil extends aucj implements audy {
    public static final avil b;
    public static final auci c;
    private static volatile auef e;
    public aucx a = auei.b;
    private byte d = 2;

    static {
        avil avil = new avil();
        b = avil;
        aucj.a(avil.class, (aucj) avil);
        amdw amdw = amdw.b;
        avil avil2 = b;
        c = aucj.a((audx) amdw, (Object) avil2, (audx) avil2, 64399324, aufw.MESSAGE);
    }

    private avil() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        byte b2 = 0;
        if (i2 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.d = b2;
            return null;
        } else if (i2 == 2) {
            return aucj.a((audx) b, "\u0001\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0001\u0001\u0003Л", new Object[]{"a", avhr.class});
        } else if (i2 == 3) {
            return new avil();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) b);
            }
            if (i2 == 5) {
                return b;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (avil.class) {
                    auef = e;
                    if (auef == null) {
                        auef = new auce(b);
                        e = auef;
                    }
                }
            }
            return auef;
        }
    }
}
