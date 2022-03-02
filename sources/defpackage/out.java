package defpackage;

/* renamed from: out  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class out extends aucj implements audy {
    public static final out n;
    private static volatile auef o;
    public int a;
    public String b = "";
    public boolean c;
    public otl d;
    public int e;
    public String f = "";
    public boolean g;
    public long h;
    public int i;
    public int j;
    public String k = "";
    public boolean l;
    public long m;

    static {
        out out = new out();
        n = out;
        aucj.a(out.class, (aucj) out);
    }

    private out() {
    }

    public static /* synthetic */ void a(out out) {
        out.a |= 2;
        out.c = true;
    }

    public static /* synthetic */ void b(out out) {
        out.a |= 32;
        out.g = true;
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
            return aucj.a((audx) n, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001\b\u0000\u0002\u0007\u0001\u0003\t\u0002\u0004\u0004\u0003\u0005\b\u0004\u0006\u0007\u0005\u0007\u0002\u0006\b\f\u0007\t\u0004\b\n\b\t\u000b\u0007\n\f\u0002\u000b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", otn.b(), "j", "k", "l", "m"});
        } else if (i3 == 3) {
            return new out();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) n);
            }
            if (i3 == 5) {
                return n;
            }
            auef auef = o;
            if (auef == null) {
                synchronized (out.class) {
                    auef = o;
                    if (auef == null) {
                        auef = new auce(n);
                        o = auef;
                    }
                }
            }
            return auef;
        }
    }
}
