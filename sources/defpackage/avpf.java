package defpackage;

/* renamed from: avpf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avpf extends aucj implements audy {
    public static final avpf g;
    private static volatile auef h;
    public int a;
    public String b = "";
    public long c;
    public long d;
    public avpl e;
    public String f = "";

    static {
        avpf avpf = new avpf();
        g = avpf;
        aucj.a(avpf.class, (aucj) avpf);
    }

    private avpf() {
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
            return aucj.a((audx) g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001\b\u0000\u0002\u0002\u0001\u0003\u0002\u0002\u0004\t\u0003\u0006\b\u0005", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new avpf();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) g);
            }
            if (i2 == 5) {
                return g;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (avpf.class) {
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
}