package defpackage;

/* renamed from: anon  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anon extends aucj implements audy {
    public static final anon v;
    private static volatile auef w;
    public int a;
    public int b;
    public int c;
    public anpd d;
    public anpk e;
    public anoq f;
    public anpa g;
    public anov h;
    public anox i;
    public anps j;
    public anoi k;
    public anou l;
    public anpp m;
    public anph n;
    public anoh o;
    public anop p;
    public anok q;
    public anpm r;
    public anof s;
    public anot t;
    public anpx u;

    static {
        anon anon = new anon();
        v = anon;
        aucj.a(anon.class, (aucj) anon);
    }

    private anon() {
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
            return aucj.a((audx) v, "\u0001\u0013\u0000\u0002\u00010\u0013\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0001\u0003\t\u0002\u0006\t\u0005\u0007\t\u0006\n\t\b\u000b\t\t\u000f\t\r\u0010\t\u000e\u0011\t\u000f\u0012\t\u0010\u0014\t\u0012\u0015\t\u0013\u0016\t\u0014\u0017\t\u0015\u001d\t\u001b+\t)/\t-0\t.", new Object[]{"a", "b", "c", anom.a, "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u"});
        } else if (i3 == 3) {
            return new anon();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) v);
            }
            if (i3 == 5) {
                return v;
            }
            auef auef = w;
            if (auef == null) {
                synchronized (anon.class) {
                    auef = w;
                    if (auef == null) {
                        auef = new auce(v);
                        w = auef;
                    }
                }
            }
            return auef;
        }
    }
}
