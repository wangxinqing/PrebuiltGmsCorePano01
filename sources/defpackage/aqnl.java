package defpackage;

/* renamed from: aqnl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqnl extends aucj implements audy {
    public static final aqnl g;
    private static volatile auef h;
    public int a;
    public aucx b = auei.b;
    public aqnr c;
    public aqnr d;
    public aqnu e;
    public aqob f;

    static {
        aqnl aqnl = new aqnl();
        g = aqnl;
        aucj.a(aqnl.class, (aucj) aqnl);
    }

    private aqnl() {
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
            return aucj.a((audx) g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002\t\u0002\u0003\t\u0003\u0004\t\u0000\u0005\t\u0001", new Object[]{"a", "b", aqnt.class, "e", "f", "c", "d"});
        } else if (i2 == 3) {
            return new aqnl();
        } else {
            if (i2 == 4) {
                return new aqnk();
            }
            if (i2 == 5) {
                return g;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (aqnl.class) {
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

    public final void a() {
        if (!this.b.a()) {
            this.b = aucj.a(this.b);
        }
    }
}
