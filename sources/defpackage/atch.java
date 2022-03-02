package defpackage;

/* renamed from: atch  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atch extends aucj implements audy {
    public static final atch h;
    private static volatile auef i;
    public int a;
    public auay b = auay.b;
    public aucx c = auei.b;
    public aucx d = auei.b;
    public aucx e = auei.b;
    public aucx f = auei.b;
    public aucx g = auei.b;

    static {
        atch atch = new atch();
        h = atch;
        aucj.a(atch.class, (aucj) atch);
    }

    private atch() {
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
            return aucj.a((audx) h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0005\u0000\u0001\n\u0000\u0002\u001c\u0003\u001c\u0004\u001c\u0005\u001c\u0006\u001c", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        } else if (i3 == 3) {
            return new atch();
        } else {
            if (i3 == 4) {
                return new aucd((byte[]) null, (short[][]) null);
            }
            if (i3 == 5) {
                return h;
            }
            auef auef = i;
            if (auef == null) {
                synchronized (atch.class) {
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
