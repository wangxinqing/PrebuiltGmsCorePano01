package defpackage;

/* renamed from: alzm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alzm extends aucj implements audy {
    public static final alzm g;
    private static volatile auef i;
    public int a;
    public int b = 1004;
    public long c;
    public ambm d;
    public long e;
    public alzl f;
    private byte h = 2;

    static {
        alzm alzm = new alzm();
        g = alzm;
        aucj.a(alzm.class, (aucj) alzm);
    }

    private alzm() {
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
            return aucj.a((audx) g, "\u0001\u0005\u0000\u0001\u0002\b\u0005\u0000\u0000\u0001\u0002\f\u0001\u0003\u0002\u0004\u0005Љ\b\u0006\u0002\t\b\t\u000b", new Object[]{"a", "b", alzo.a, "c", "d", "e", "f"});
        } else if (i3 == 3) {
            return new alzm();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) g);
            }
            if (i3 == 5) {
                return g;
            }
            auef auef = i;
            if (auef == null) {
                synchronized (alzm.class) {
                    auef = i;
                    if (auef == null) {
                        auef = new auce(g);
                        i = auef;
                    }
                }
            }
            return auef;
        }
    }
}
