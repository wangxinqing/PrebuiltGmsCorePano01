package defpackage;

/* renamed from: avdb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avdb extends aucg implements audy {
    public static final avdb f;
    private static volatile auef i;
    public int a;
    public aucx b = auei.b;
    public aucx c = auei.b;
    public String d = "";
    public aucx e;
    private int g;
    private byte h = 2;

    static {
        avdb avdb = new avdb();
        f = avdb;
        aucj.a(avdb.class, (aucj) avdb);
    }

    private avdb() {
        auay auay = auay.b;
        this.e = auei.b;
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.h);
        }
        byte b2 = 0;
        if (i3 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.h = b2;
            return null;
        } else if (i3 == 2) {
            return aucj.a((audx) f, "\u0001\u0005\u0000\u0001\u0001\b\u0005\u0000\u0003\u0003\u0001\f\u0000\u0002Л\u0003Л\u0006\b\u0001\bЛ", new Object[]{"g", "a", atio.b(), "b", avai.class, "c", avae.class, "d", "e", auze.class});
        } else if (i3 == 3) {
            return new avdb();
        } else {
            if (i3 == 4) {
                return new aucf(f);
            }
            if (i3 == 5) {
                return f;
            }
            auef auef = i;
            if (auef == null) {
                synchronized (avdb.class) {
                    auef = i;
                    if (auef == null) {
                        auef = new auce(f);
                        i = auef;
                    }
                }
            }
            return auef;
        }
    }
}
