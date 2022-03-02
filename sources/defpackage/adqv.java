package defpackage;

/* renamed from: adqv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adqv extends aucj implements audy {
    public static final adqv g;
    private static volatile auef h;
    public aucx a = auei.b;
    public aucx b = auei.b;
    public aucx c = auei.b;
    public aucx d = auei.b;
    public aucv e = audl.b;
    public String f = "";

    static {
        adqv adqv = new adqv();
        g = adqv;
        aucj.a(adqv.class, (aucj) adqv);
    }

    private adqv() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 1) {
            return null;
        }
        if (i2 == 2) {
            return aucj.a((audx) g, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0005\u0000\u0001Ț\u0002Ț\u0003Ț\u0004Ț\u0005%\u0006Ȉ", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new adqv();
        } else {
            if (i2 == 4) {
                return new aucd((char[]) null, (int[]) null);
            }
            if (i2 == 5) {
                return g;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (adqv.class) {
                    auef = h;
                    if (auef == null) {
                        auef = new auce(g);
                        h = auef;
                    }
                }
            }
            return auef;
        }
    }

    public final void a() {
        if (!this.b.a()) {
            this.b = aucj.a(this.b);
        }
    }
}
