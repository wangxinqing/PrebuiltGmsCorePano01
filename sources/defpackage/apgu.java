package defpackage;

/* renamed from: apgu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apgu extends aucj implements audy {
    public static final apgu l;
    private static volatile auef m;
    public int a;
    public int b = 0;
    public Object c;
    public String d = "";
    public int e;
    public aucx f = auei.b;
    public aucs g = aucl.b;
    public auay h = auay.b;
    public boolean i;
    public int j;
    public int k;

    static {
        apgu apgu = new apgu();
        l = apgu;
        aucj.a(apgu.class, (aucj) apgu);
    }

    private apgu() {
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
            return aucj.a((audx) l, "\u0001\n\u0001\u0001\u0001\n\n\u0000\u0002\u0000\u0001\b\u0000\u0002\u0004\u0001\u0003\u001a\u0004'\u0005\n\u0002\u0006\u0007\u0003\u0007;\u0000\b\f\u0006\t\f\u0007\n;\u0000", new Object[]{"c", "b", "a", "d", "e", "f", "g", "h", "i", "j", apgs.a, "k", apgr.a});
        } else if (i3 == 3) {
            return new apgu();
        } else {
            if (i3 == 4) {
                return new apgq();
            }
            if (i3 == 5) {
                return l;
            }
            auef auef = m;
            if (auef == null) {
                synchronized (apgu.class) {
                    auef = m;
                    if (auef == null) {
                        auef = new auce(l);
                        m = auef;
                    }
                }
            }
            return auef;
        }
    }

    public final void a() {
        if (!this.g.a()) {
            this.g = aucj.a(this.g);
        }
    }
}
