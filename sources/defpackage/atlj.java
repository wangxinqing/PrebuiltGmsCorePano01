package defpackage;

/* renamed from: atlj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atlj extends aucj implements audy {
    public static final atlj h;
    private static volatile auef j;
    public int a;
    public long b;
    public aucs c = aucl.b;
    public aucx d = auei.b;
    public long e;
    public aucx f = auei.b;
    public String g = "";
    private int i;

    static {
        atlj atlj = new atlj();
        h = atlj;
        aucj.a(atlj.class, (aucj) atlj);
    }

    private atlj() {
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
            return aucj.a((audx) h, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0003\u0000\u0001\f\u0000\u0002\u0002\u0001\u0003\u0016\u0004\u001a\u0005\u0002\u0002\u0006\u001a\u0007\b\u0003", new Object[]{"i", "a", atlh.a, "b", "c", "d", "e", "f", "g"});
        } else if (i3 == 3) {
            return new atlj();
        } else {
            if (i3 == 4) {
                return new atlg();
            }
            if (i3 == 5) {
                return h;
            }
            auef auef = j;
            if (auef == null) {
                synchronized (atlj.class) {
                    auef = j;
                    if (auef == null) {
                        auef = new auce(h);
                        j = auef;
                    }
                }
            }
            return auef;
        }
    }
}
