package defpackage;

/* renamed from: auyu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class auyu extends aucg implements audy {
    public static final auyu c;
    private static volatile auef f;
    public int a;
    public String b = "";
    private boolean d;
    private byte e = 2;

    static {
        auyu auyu = new auyu();
        c = auyu;
        aucj.a(auyu.class, (aucj) auyu);
    }

    private auyu() {
    }

    public static /* synthetic */ void a(auyu auyu) {
        auyu.a |= 1;
        auyu.d = false;
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        byte b2 = 0;
        if (i2 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.e = b2;
            return null;
        } else if (i2 == 2) {
            return aucj.a((audx) c, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u0007\u0000\u0003\b\u0001", new Object[]{"a", "d", "b"});
        } else if (i2 == 3) {
            return new auyu();
        } else {
            if (i2 == 4) {
                return new aucf(c);
            }
            if (i2 == 5) {
                return c;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (auyu.class) {
                    auef = f;
                    if (auef == null) {
                        auef = new auce(c);
                        f = auef;
                    }
                }
            }
            return auef;
        }
    }
}
