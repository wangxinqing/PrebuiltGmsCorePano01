package defpackage;

/* renamed from: auoz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class auoz extends aucj implements audy {
    public static final auoz p;
    private static volatile auef r;
    public int a;
    public aupi b;
    public aupa c;
    public auos d;
    public auou e;
    public auoq f;
    public auor g;
    public aupg h;
    public aupk i;
    public boolean j;
    public boolean k = true;
    public String l = "";
    public boolean m;
    public aucx n = auei.b;
    public aupd o;
    private byte q = 2;

    static {
        auoz auoz = new auoz();
        p = auoz;
        aucj.a(auoz.class, (aucj) auoz);
    }

    private auoz() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.q);
        }
        byte b2 = 0;
        if (i3 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.q = b2;
            return null;
        } else if (i3 == 2) {
            return aucj.a((audx) p, "\u0001\u000e\u0000\u0001\u0001\u0013\u000e\u0000\u0001\b\u0001ԉ\u0000\u0002ԉ\u0001\u0003ԉ\u0002\u0004Љ\u0003\u0005Љ\u0004\u0006Љ\u0005\u0007Љ\u0006\tЉ\u0007\f\u0007\n\r\u0007\u000b\u000e\b\f\u000f\u0007\r\u0010\u001b\u0013\t\u000e", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", auph.class, "o"});
        } else if (i3 == 3) {
            return new auoz();
        } else {
            if (i3 == 4) {
                return new aucd((boolean[][]) null, (float[]) null);
            }
            if (i3 == 5) {
                return p;
            }
            auef auef = r;
            if (auef == null) {
                synchronized (auoz.class) {
                    auef = r;
                    if (auef == null) {
                        auef = new auce(p);
                        r = auef;
                    }
                }
            }
            return auef;
        }
    }
}
