package defpackage;

/* renamed from: atxb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atxb extends aucj implements audy {
    public static final atxb d;
    private static volatile auef f;
    public int a;
    public atwr b;
    public aucx c = auei.b;
    private byte e = 2;

    static {
        atxb atxb = new atxb();
        d = atxb;
        aucj.a(atxb.class, (aucj) atxb);
    }

    private atxb() {
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
            return aucj.a((audx) d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001Љ\u0000\u0002\u001b", new Object[]{"a", "b", "c", atxa.class});
        } else if (i2 == 3) {
            return new atxb();
        } else {
            if (i2 == 4) {
                return new aucd((int[][]) null, (float[]) null);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (atxb.class) {
                    auef = f;
                    if (auef == null) {
                        auef = new auce(d);
                        f = auef;
                    }
                }
            }
            return auef;
        }
    }
}
