package defpackage;

/* renamed from: aata  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aata extends aucj implements audy {
    public static final aata j;
    private static volatile auef m;
    public int a;
    public boolean b;
    public boolean c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    private boolean k;
    private boolean l;

    static {
        aata aata = new aata();
        j = aata;
        aucj.a(aata.class, (aucj) aata);
    }

    private aata() {
    }

    public static /* synthetic */ void a(aata aata) {
        aata.a |= 32;
        aata.k = false;
    }

    public static /* synthetic */ void b(aata aata) {
        aata.a |= 64;
        aata.l = false;
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
            return aucj.a((audx) j, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001\u0007\u0000\u0002\u0007\u0001\u0003\f\u0002\u0004\u0004\u0003\u0005\f\u0004\u0006\u0007\u0005\u0007\u0007\u0006\b\u0004\u0007\t\f\b\n\u0007\t", new Object[]{"a", "b", "c", "d", aasz.a, "e", "f", aasy.a, "k", "l", "g", "h", aasx.a, "i"});
        } else if (i3 == 3) {
            return new aata();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) j);
            }
            if (i3 == 5) {
                return j;
            }
            auef auef = m;
            if (auef == null) {
                synchronized (aata.class) {
                    auef = m;
                    if (auef == null) {
                        auef = new auce(j);
                        m = auef;
                    }
                }
            }
            return auef;
        }
    }
}
