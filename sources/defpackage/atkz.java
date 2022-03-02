package defpackage;

/* renamed from: atkz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atkz extends aucj implements audy {
    public static final auct e = new atkv();
    public static final auct g = new atkw();
    public static final atkz h;
    private static volatile auef i;
    public int a;
    public int b;
    public long c;
    public aucs d = aucl.b;
    public aucs f = aucl.b;

    static {
        atkz atkz = new atkz();
        h = atkz;
        aucj.a(atkz.class, (aucj) atkz);
    }

    private atkz() {
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
            return aucj.a((audx) h, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001\f\u0000\u0002\u0002\u0001\u0003\u001e\u0004\u001e", new Object[]{"a", "b", atkx.a, "c", "d", atte.b(), "f", attg.b()});
        } else if (i3 == 3) {
            return new atkz();
        } else {
            if (i3 == 4) {
                return new aucd((byte[]) null, (int[]) null, (byte[]) null);
            }
            if (i3 == 5) {
                return h;
            }
            auef auef = i;
            if (auef == null) {
                synchronized (atkz.class) {
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
