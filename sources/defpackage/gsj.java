package defpackage;

/* renamed from: gsj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gsj extends aucj implements audy {
    public static final gsj g;
    private static volatile auef j;
    public int a;
    public long b;
    public long c;
    public String d = "";
    public long e;
    public int f;
    private long h;
    private byte i = 2;

    static {
        gsj gsj = new gsj();
        g = gsj;
        aucj.a(gsj.class, (aucj) gsj);
    }

    private gsj() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.i);
        }
        byte b2 = 0;
        if (i3 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.i = b2;
            return null;
        } else if (i3 == 2) {
            return aucj.a((audx) g, "\u0001\u0006\u0000\u0001\b!\u0006\u0000\u0000\u0003\bԂ\u0000\tԃ\u0001\nԃ\u0002\r\b\u0003\u000f\u0003\u0005!\f\n", new Object[]{"a", "b", "c", "h", "d", "e", "f", gsh.a});
        } else if (i3 == 3) {
            return new gsj();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) g);
            }
            if (i3 == 5) {
                return g;
            }
            auef auef = j;
            if (auef == null) {
                synchronized (gsj.class) {
                    auef = j;
                    if (auef == null) {
                        auef = new auce(g);
                        j = auef;
                    }
                }
            }
            return auef;
        }
    }
}
