package defpackage;

/* renamed from: afjh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afjh extends aucj implements audy {
    public static final afjh h;
    private static volatile auef i;
    public int a;
    public String b = "";
    public String c = "";
    public String d = "";
    public int e;
    public int f;
    public aucx g = auei.b;

    static {
        afjh afjh = new afjh();
        h = afjh;
        aucj.a(afjh.class, (aucj) afjh);
    }

    private afjh() {
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
            return aucj.a((audx) h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\b\u0000\u0002\u001b\u0003\b\u0001\u0004\u0004\u0003\u0005\f\u0004\u0006\b\u0002", new Object[]{"a", "b", "g", afjf.class, "c", "e", "f", afjg.a, "d"});
        } else if (i3 == 3) {
            return new afjh();
        } else {
            if (i3 == 4) {
                return new aucd((float[][][]) null, (byte[][]) null);
            }
            if (i3 == 5) {
                return h;
            }
            auef auef = i;
            if (auef == null) {
                synchronized (afjh.class) {
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

    public final void a() {
        if (!this.g.a()) {
            this.g = aucj.a(this.g);
        }
    }
}
