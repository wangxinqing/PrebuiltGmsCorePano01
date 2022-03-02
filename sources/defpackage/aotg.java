package defpackage;

/* renamed from: aotg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aotg extends aucj implements audy {
    public static final aotg i;
    private static volatile auef j;
    public int a;
    public int b;
    public int c;
    public int d;
    public long e;
    public long f;
    public long g;
    public long h;

    static {
        aotg aotg = new aotg();
        i = aotg;
        aucj.a(aotg.class, (aucj) aotg);
    }

    private aotg() {
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
            return aucj.a((audx) i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001\u0003\u0004\u0002\u0004\u0002\u0003\u0005\u0002\u0004\u0006\u0002\u0005\u0007\u0002\u0006", new Object[]{"a", "b", aote.a, "c", aotf.a, "d", "e", "f", "g", "h"});
        } else if (i3 == 3) {
            return new aotg();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) i);
            }
            if (i3 == 5) {
                return i;
            }
            auef auef = j;
            if (auef == null) {
                synchronized (aotg.class) {
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
