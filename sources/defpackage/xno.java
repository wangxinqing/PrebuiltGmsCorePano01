package defpackage;

/* renamed from: xno  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xno extends aucj implements audy {
    public static final xno o;
    private static volatile auef p;
    public int a;
    public aucx b = auei.b;
    public boolean c;
    public boolean d;
    public int e;
    public aucx f = auei.b;
    public aucx g = auei.b;
    public int h;
    public boolean i;
    public xnh j;
    public xnb k;
    public xna l;
    public aucx m = auei.b;
    public int n;

    static {
        xno xno = new xno();
        o = xno;
        aucj.a(xno.class, (aucj) xno);
    }

    private xno() {
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
            return aucj.a((audx) o, "\u0001\r\u0000\u0001\u0001\u000e\r\u0000\u0004\u0000\u0001\u001b\u0002\u0007\u0000\u0003\u0007\u0001\u0005\u0004\u0002\u0006\u001b\u0007\f\u0003\b\u0007\u0004\t\t\u0005\n\t\u0006\u000b\t\u0007\f\u001b\r\f\b\u000e\u001b", new Object[]{"a", "b", xng.class, "c", "d", "e", "f", xnm.class, "h", xkv.a, "i", "j", "k", "l", "m", xnj.class, "n", xkc.b(), "g", xnn.class});
        } else if (i3 == 3) {
            return new xno();
        } else {
            if (i3 == 4) {
                return new aucd((byte[][][]) null, (char[][][]) null);
            }
            if (i3 == 5) {
                return o;
            }
            auef auef = p;
            if (auef == null) {
                synchronized (xno.class) {
                    auef = p;
                    if (auef == null) {
                        auef = new auce(o);
                        p = auef;
                    }
                }
            }
            return auef;
        }
    }

    public final void a() {
        if (!this.m.a()) {
            this.m = aucj.a(this.m);
        }
    }
}
