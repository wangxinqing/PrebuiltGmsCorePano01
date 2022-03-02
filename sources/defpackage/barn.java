package defpackage;

/* renamed from: barn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class barn extends aucj implements audy {
    public static final barn w;
    private static volatile auef y;
    public int a;
    public String b = "";
    public String c = "";
    public String d = "";
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public basc k;
    public int l;
    public bark m;
    public long n;
    public int o;
    public int p;
    public int q;
    public int r;
    public String s;
    public aucv t;
    public String u;
    public barh v;
    private byte x = 2;

    static {
        barn barn = new barn();
        w = barn;
        aucj.a(barn.class, (aucj) barn);
    }

    private barn() {
        auei auei = auei.b;
        this.s = "";
        this.t = audl.b;
        this.u = "";
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.x);
        }
        byte b2 = 0;
        if (i3 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.x = b2;
            return null;
        } else if (i3 == 2) {
            return aucj.a((audx) w, "\u0001\u0015\u0000\u0001\u0001\u001a\u0015\u0000\u0001\u0000\u0001\b\u0000\u0002\b\u0001\u0003\u0004\u0003\u0004\u0004\u0004\u0005\u0004\u0005\u0006\u000b\u0006\u0007\u000b\u0007\b\f\b\n\t\t\u000b\t\u000b\r\u0002\r\u000e\f\u000e\u000f\f\u000f\u0010\u0004\u0011\u0011\b\u0012\u0013\u0004\u0010\u0014\b\u0014\u0015(\u0018\f\n\u0019\b\u0002\u001a\t\u0016", new Object[]{"a", "b", "c", "e", "f", "g", "h", "i", "j", barr.a, "k", "m", "n", "o", bars.a, "p", barp.a, "r", "s", "q", "u", "t", "l", barm.b(), "d", "v"});
        } else if (i3 == 3) {
            return new barn();
        } else {
            if (i3 == 4) {
                return new aucd((boolean[][]) null, (short[][]) null);
            }
            if (i3 == 5) {
                return w;
            }
            auef auef = y;
            if (auef == null) {
                synchronized (barn.class) {
                    auef = y;
                    if (auef == null) {
                        auef = new auce(w);
                        y = auef;
                    }
                }
            }
            return auef;
        }
    }
}
