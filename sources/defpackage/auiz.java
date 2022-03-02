package defpackage;

/* renamed from: auiz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class auiz extends aucj implements audy {
    public static final auiz w;
    private static volatile auef x;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public double i;
    public auiq j;
    public String k = "";
    public aucx l = auei.b;
    public int m;
    public int n;
    public int o;
    public float p;
    public float q;
    public int r;
    public float s;
    public int t;
    public float u;
    public int v;

    static {
        auiz auiz = new auiz();
        w = auiz;
        aucj.a(auiz.class, (aucj) auiz);
    }

    private auiz() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 1) {
            return null;
        }
        if (i3 == 2) {
            return aucj.a((audx) w, "\u0001\u0015\u0000\u0001\u0002\u0016\u0015\u0000\u0001\u0000\u0002\u0004\u0000\u0003\u0004\u0001\u0004\u0004\u0003\u0005\u0004\u0005\u0006\u0004\u0006\u0007\u0000\u0007\b\t\b\t\b\t\n\u0001\u0012\u000b\u001b\f\u0004\u0002\r\u0004\u0004\u000e\f\n\u000f\f\u000b\u0010\f\f\u0011\u0001\r\u0012\u0001\u000e\u0013\f\u000f\u0014\u0001\u0010\u0015\f\u0011\u0016\u0004\u0013", new Object[]{"a", "b", "c", "e", "g", "h", "i", "j", "k", "u", "l", auio.class, "d", "f", "m", auix.a, "n", auiv.a, "o", auiw.a, "p", "q", "r", auiu.a, "s", "t", auiy.a, "v"});
        } else if (i3 == 3) {
            return new auiz();
        } else {
            if (i3 == 4) {
                return new auit();
            }
            if (i3 == 5) {
                return w;
            }
            auef auef = x;
            if (auef == null) {
                synchronized (auiz.class) {
                    auef = x;
                    if (auef == null) {
                        auef = new auce(w);
                        x = auef;
                    }
                }
            }
            return auef;
        }
    }
}
