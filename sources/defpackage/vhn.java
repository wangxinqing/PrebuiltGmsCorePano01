package defpackage;

/* renamed from: vhn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vhn extends aucj implements audy {
    public static final vhn i;
    private static volatile auef j;
    public int a;
    public auay b = auay.b;
    public auay c = auay.b;
    public auay d = auay.b;
    public long e;
    public long f;
    public auay g = auay.b;
    public auay h = auay.b;

    static {
        vhn vhn = new vhn();
        i = vhn;
        aucj.a(vhn.class, (aucj) vhn);
    }

    private vhn() {
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
            return aucj.a((audx) i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\n\u0000\u0002\n\u0001\u0003\n\u0002\u0004\u0002\u0003\u0005\u0002\u0004\u0006\n\u0005\u0007\n\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
        } else if (i3 == 3) {
            return new vhn();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) i);
            }
            if (i3 == 5) {
                return i;
            }
            auef auef = j;
            if (auef == null) {
                synchronized (vhn.class) {
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
