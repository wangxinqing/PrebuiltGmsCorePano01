package defpackage;

/* renamed from: auyq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class auyq extends aucg implements audy {
    public static final auyq g;
    private static volatile auef i;
    public int a;
    public auzb b;
    public auzb c;
    public auzb d;
    public auzb e;
    public auzb f;
    private byte h = 2;

    static {
        auyq auyq = new auyq();
        g = auyq;
        aucj.a(auyq.class, (aucj) auyq);
    }

    private auyq() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.h);
        }
        byte b2 = 0;
        if (i3 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.h = b2;
            return null;
        } else if (i3 == 2) {
            return aucj.a((audx) g, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001\u0003\t\u0002\u0005\t\u0004\u0007\t\u0006", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i3 == 3) {
            return new auyq();
        } else {
            if (i3 == 4) {
                return new aucf(g);
            }
            if (i3 == 5) {
                return g;
            }
            auef auef = i;
            if (auef == null) {
                synchronized (auyq.class) {
                    auef = i;
                    if (auef == null) {
                        auef = new auce(g);
                        i = auef;
                    }
                }
            }
            return auef;
        }
    }
}
