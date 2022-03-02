package defpackage;

/* renamed from: arar  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arar extends aucj implements audy {
    public static final arar j;
    private static volatile auef k;
    public auay a = auay.b;
    public arbd b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public int g;
    public boolean h;
    public aucs i = aucl.b;

    static {
        arar arar = new arar();
        j = arar;
        aucj.a(arar.class, (aucj) arar);
    }

    private arar() {
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
            return aucj.a((audx) j, "\u0000\t\u0000\u0000\u0003\f\t\u0000\u0001\u0000\u0003\t\u0005\u0007\u0006\u0007\u0007\u0007\b\u0007\t\f\n\n\u000b\u0007\f'", new Object[]{"b", "c", "d", "e", "f", "g", "a", "h", "i"});
        } else if (i3 == 3) {
            return new arar();
        } else {
            if (i3 == 4) {
                return new aucd((boolean[][][]) null, (int[]) null);
            }
            if (i3 == 5) {
                return j;
            }
            auef auef = k;
            if (auef == null) {
                synchronized (arar.class) {
                    auef = k;
                    if (auef == null) {
                        auef = new auce(j);
                        k = auef;
                    }
                }
            }
            return auef;
        }
    }
}
