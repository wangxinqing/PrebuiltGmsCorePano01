package defpackage;

/* renamed from: aump  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aump extends aucj implements audy {
    public static final aump h;
    private static volatile auef i;
    public int a;
    public int b;
    public aucx c = auei.b;
    public aucx d = auei.b;
    public int e = -1;
    public boolean f;
    public boolean g;

    static {
        aump aump = new aump();
        h = aump;
        aucj.a(aump.class, (aucj) aump);
    }

    private aump() {
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
            return aucj.a((audx) h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001\f\u0000\u0002\u001b\u0003\u001b\u0004\u0004\u0001\u0005\u0007\u0002\u0006\u0007\u0003", new Object[]{"a", "b", aumn.a, "c", aumm.class, "d", aumm.class, "e", "f", "g"});
        } else if (i3 == 3) {
            return new aump();
        } else {
            if (i3 == 4) {
                return new aumk();
            }
            if (i3 == 5) {
                return h;
            }
            auef auef = i;
            if (auef == null) {
                synchronized (aump.class) {
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
