package defpackage;

/* renamed from: aiss  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aiss extends aucj implements audy {
    public static final aiss f;
    private static volatile auef h;
    public int a;
    public long b;
    public aucx c = auei.b;
    public auze d;
    public boolean e;
    private byte g = 2;

    static {
        aiss aiss = new aiss();
        f = aiss;
        aucj.a(aiss.class, (aucj) aiss);
    }

    private aiss() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        byte b2 = 0;
        if (i2 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.g = b2;
            return null;
        } else if (i2 == 2) {
            return aucj.a((audx) f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0002\u0001\u0002\u0000\u0002Л\u0003Љ\u0001\u0004\u0007\u0002", new Object[]{"a", "b", "c", avae.class, "d", "e"});
        } else if (i2 == 3) {
            return new aiss();
        } else {
            if (i2 == 4) {
                return new aucd((int[][]) null, (float[][][]) null);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (aiss.class) {
                    auef = h;
                    if (auef == null) {
                        auef = new auce(f);
                        h = auef;
                    }
                }
            }
            return auef;
        }
    }
}
