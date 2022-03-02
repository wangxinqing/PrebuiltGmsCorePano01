package defpackage;

/* renamed from: nwq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nwq extends aucj implements audy {
    public static final nwq i;
    private static volatile auef j;
    public int a;
    public aucx b = auei.b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;

    static {
        nwq nwq = new nwq();
        i = nwq;
        aucj.a(nwq.class, (aucj) nwq);
    }

    private nwq() {
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
            return aucj.a((audx) i, "\u0001\u0007\u0000\u0001\u0004\n\u0007\u0000\u0001\u0000\u0004\u001a\u0005\f\u0003\u0006\f\u0004\u0007\f\u0005\b\f\u0006\t\f\u0007\n\f\b", new Object[]{"a", "b", "c", nwo.a, "d", nwk.a, "e", nwo.a, "f", nwk.a, "g", nwm.a, "h", nwm.a});
        } else if (i3 == 3) {
            return new nwq();
        } else {
            if (i3 == 4) {
                return new aucd((short[][]) null, (boolean[][][]) null);
            }
            if (i3 == 5) {
                return i;
            }
            auef auef = j;
            if (auef == null) {
                synchronized (nwq.class) {
                    auef = j;
                    if (auef == null) {
                        auef = new auce(i);
                        j = auef;
                    }
                }
            }
            return auef;
        }
    }
}
