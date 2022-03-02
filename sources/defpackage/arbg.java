package defpackage;

/* renamed from: arbg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arbg extends aucj implements audy {
    public static final arbg h;
    private static volatile auef i;
    public String a = "";
    public String b = "";
    public long c;
    public auay d = auay.b;
    public boolean e;
    public aucx f = auei.b;
    public aucs g = aucl.b;

    static {
        arbg arbg = new arbg();
        h = arbg;
        aucj.a(arbg.class, (aucj) arbg);
    }

    private arbg() {
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
            return aucj.a((audx) h, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0002\u0000\u0001Ȉ\u0002Ȉ\u0003\u0002\u0004Ț\u0005\n\u0006\u0007\u0007'", new Object[]{"a", "b", "c", "f", "d", "e", "g"});
        } else if (i3 == 3) {
            return new arbg();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) h);
            }
            if (i3 == 5) {
                return h;
            }
            auef auef = i;
            if (auef == null) {
                synchronized (arbg.class) {
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
