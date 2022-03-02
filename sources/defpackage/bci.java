package defpackage;

/* renamed from: bci  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bci extends aucj implements audy {
    public static final bci u;
    private static volatile auef w;
    public int a;
    public long b;
    public int c;
    public aucx d = auei.b;
    public aucx e = auei.b;
    public aucx f = auei.b;
    public aucx g = auei.b;
    public aucx h = auei.b;
    public aucx i = auei.b;
    public aucx j = auei.b;
    public aucx k = auei.b;
    public aucx l = auei.b;
    public aucx m = auei.b;
    public aucx n = auei.b;
    public aucv o = audl.b;
    public aucx p = auei.b;
    public aucx q = auei.b;
    public boolean r;
    public aucx s = auei.b;
    public aucx t = auei.b;
    private boolean v = true;

    static {
        bci bci = new bci();
        u = bci;
        aucj.a(bci.class, (aucj) bci);
    }

    private bci() {
    }

    public static /* synthetic */ void a(bci bci) {
        bci.a |= 8;
        bci.v = false;
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
            return aucj.a((audx) u, "\u0001\u0014\u0000\u0001\u0001Ϩ\u0014\u0000\u0010\u0000\u0001\u0002\u0000\u0002\u001b\u0003\u001b\u0004\u001b\u0005\u001b\u0006\u001b\u0007\u001b\b\u001b\t\u001b\n\u001b\u000b\u001b\f\u001a\r\u0014\u000e\u001b\u0010\u0007\u0003\u0011\u001b\u0014\u0007\u0006\u0016\u001a\u0017\u001bϨ\u0004\u0001", new Object[]{"a", "b", "d", bbv.class, "e", bbs.class, "f", bcm.class, "g", bby.class, "h", bbt.class, "i", bbp.class, "j", bcc.class, "k", bbn.class, "l", bbm.class, "m", bcl.class, "n", "o", "p", bch.class, "v", "q", bbz.class, "r", "s", "t", bcd.class, "c"});
        } else if (i3 == 3) {
            return new bci();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) u);
            }
            if (i3 == 5) {
                return u;
            }
            auef auef = w;
            if (auef == null) {
                synchronized (bci.class) {
                    auef = w;
                    if (auef == null) {
                        auef = new auce(u);
                        w = auef;
                    }
                }
            }
            return auef;
        }
    }
}
