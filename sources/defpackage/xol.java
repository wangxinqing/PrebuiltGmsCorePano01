package defpackage;

/* renamed from: xol  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xol extends aucj implements audy {
    public static final xol w;
    private static volatile auef x;
    public int a;
    public xok b;
    public xmw c;
    public xny d;
    public boolean e;
    public int f;
    public xlc g;
    public xoh h;
    public xmq i;
    public aucx j = auei.b;
    public aucx k = auei.b;
    public xme l;
    public xmh m;
    public xmj n;
    public xmo o;
    public xod p;
    public xmt q;
    public xlg r;
    public xld s;
    public xle t;
    public xlf u;
    public xlj v;

    static {
        xol xol = new xol();
        w = xol;
        aucj.a(xol.class, (aucj) xol);
    }

    private xol() {
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
            return aucj.a((audx) w, "\u0001\u0015\u0000\u0001\u0001!\u0015\u0000\u0002\u0000\u0001\t\u0000\u0002\t\u0001\u0003\t\u0002\u0004\u0007\u0003\u0006\f\u0005\u0007\t\u0006\b\t\u0007\t\t\b\n\u001b\u000b\u001b\u0017\t\t\u0018\t\n\u0019\t\u000b\u001a\t\f\u001b\t\r\u001c\t\u000e\u001d\t\u000f\u001e\t\u0010\u001f\t\u0011 \t\u0012!\t\u0013", new Object[]{"a", "b", "c", "d", "e", "f", xob.a, "g", "h", "i", "j", xmk.class, "k", xli.class, "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v"});
        } else if (i3 == 3) {
            return new xol();
        } else {
            if (i3 == 4) {
                return new aucd((short[][][]) null, (float[]) null);
            }
            if (i3 == 5) {
                return w;
            }
            auef auef = x;
            if (auef == null) {
                synchronized (xol.class) {
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
