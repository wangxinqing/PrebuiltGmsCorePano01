package defpackage;

/* renamed from: amnk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amnk extends aucj implements audy {
    public static final amnk f;
    private static volatile auef h;
    public int a;
    public String b = "";
    public boolean c;
    public int d;
    public boolean e;
    private byte g = 2;

    static {
        amnk amnk = new amnk();
        f = amnk;
        aucj.a(amnk.class, (aucj) amnk);
    }

    private amnk() {
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
            return aucj.a((audx) f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0003\u0001Ԉ\u0000\u0002ԇ\u0001\u0003Ԅ\u0002\u0004\u0007\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new amnk();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) f);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (amnk.class) {
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
