package defpackage;

/* renamed from: ajjx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajjx extends aucj implements audy {
    public static final ajjx u;
    private static volatile auef w;
    public int a;
    public ajka b;
    public int c;
    public long d;
    public float e;
    public float f;
    public double g;
    public float h;
    public int i;
    public boolean j;
    public boolean k;
    public String l = "";
    public int m;
    public aucx n = auei.b;
    public ajjp o;
    public int p = -1;
    public int q = -1;
    public long r;
    public boolean s;
    public float t;
    private byte v = 2;

    static {
        ajjx ajjx = new ajjx();
        u = ajjx;
        aucj.a(ajjx.class, (aucj) ajjx);
    }

    private ajjx() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.v);
        }
        byte b2 = 0;
        if (i3 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.v = b2;
            return null;
        } else if (i3 == 2) {
            return aucj.a((audx) u, "\u0001\u0013\u0000\u0001\u0001\u0014\u0013\u0000\u0001\u0001\u0001Љ\u0000\u0002\f\u0001\u0003\u0002\u0002\u0004\u0001\u0003\u0005\u0001\u0004\u0006\u0000\u0005\u0007\u0001\u0006\b\u0004\u0007\n\u0007\t\u000b\u0007\n\f\b\u000b\r\u0004\f\u000e\u001b\u000f\t\r\u0010\u0004\u000e\u0011\u0004\u000f\u0012\u0002\u0010\u0013\u0007\u0011\u0014\u0001\u0012", new Object[]{"a", "b", "c", ajjw.b(), "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", ajkf.class, "o", "p", "q", "r", "s", "t"});
        } else if (i3 == 3) {
            return new ajjx();
        } else {
            if (i3 == 4) {
                return new aucd((short[][]) null, (int[]) null);
            }
            if (i3 == 5) {
                return u;
            }
            auef auef = w;
            if (auef == null) {
                synchronized (ajjx.class) {
                    auef = w;
                    if (auef == null) {
                        auef = new auce(u);
                        w = auef;
                    }
                }
            }
            return auef;
        }
    }
}
