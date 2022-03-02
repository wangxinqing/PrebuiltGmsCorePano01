package defpackage;

/* renamed from: ovn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ovn extends aucj implements audy {
    public static final ovn h;
    private static volatile auef i;
    public int a;
    public String b = "";
    public int c;
    public String d = "plain";
    public int e = 1;
    public aucx f = auei.b;
    public plh g;

    static {
        ovn ovn = new ovn();
        h = ovn;
        aucj.a(ovn.class, (aucj) ovn);
    }

    private ovn() {
    }

    public static aucd a() {
        return h.o();
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
            return aucj.a((audx) h, "\u0001\u0006\u0000\u0001\u0001\f\u0006\u0000\u0001\u0000\u0001\b\u0000\u0004\b\u0002\u0005\u0004\u0003\u0007\u001a\b\t\u0004\f\f\u0001", new Object[]{"a", "b", "d", "e", "f", "g", "c", ovl.a});
        } else if (i3 == 3) {
            return new ovn();
        } else {
            if (i3 == 4) {
                return new aucd((short[]) null);
            }
            if (i3 == 5) {
                return h;
            }
            auef auef = i;
            if (auef == null) {
                synchronized (ovn.class) {
                    auef = i;
                    if (auef == null) {
                        auef = new auce(h);
                        i = auef;
                    }
                }
            }
            return auef;
        }
    }
}
