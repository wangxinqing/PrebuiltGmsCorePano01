package defpackage;

/* renamed from: auve  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class auve extends aucj implements audy {
    public static final auve i;
    private static volatile auef k;
    public int a;
    public int b;
    public auvl c;
    public auvo d;
    public auvt e;
    public auvr f;
    public auvw g;
    public auvy h;
    private byte j = 2;

    static {
        auve auve = new auve();
        i = auve;
        aucj.a(auve.class, (aucj) auve);
    }

    private auve() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.j);
        }
        byte b2 = 0;
        if (i3 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.j = b2;
            return null;
        } else if (i3 == 2) {
            return aucj.a((audx) i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0002\u0001\f\u0000\u0002\t\u0001\u0003\t\u0002\u0004\t\u0003\u0005Љ\u0004\u0006\t\u0005\u0007Љ\u0006", new Object[]{"a", "b", auvd.b(), "c", "d", "e", "f", "g", "h"});
        } else if (i3 == 3) {
            return new auve();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) i);
            }
            if (i3 == 5) {
                return i;
            }
            auef auef = k;
            if (auef == null) {
                synchronized (auve.class) {
                    auef = k;
                    if (auef == null) {
                        auef = new auce(i);
                        k = auef;
                    }
                }
            }
            return auef;
        }
    }
}
