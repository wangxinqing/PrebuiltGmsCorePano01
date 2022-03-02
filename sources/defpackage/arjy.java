package defpackage;

/* renamed from: arjy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arjy extends aucj implements audy {
    public static final arjy i;
    private static volatile auef j;
    public int a;
    public boolean b;
    public long c = 30000000000L;
    public long d = 20000000000L;
    public boolean e;
    public long f = 43200;
    public int g;
    public int h = 24;

    static {
        arjy arjy = new arjy();
        i = arjy;
        aucj.a(arjy.class, (aucj) arjy);
    }

    private arjy() {
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
            return aucj.a((audx) i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0000\u0001\u0007\u0000\u0002\u0003\u0001\u0004\u0003\u0003\u0005\u0007\u0004\u0006\u0003\u0005\u0007\u000b\u0006\b\u000b\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
        } else if (i3 == 3) {
            return new arjy();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) i);
            }
            if (i3 == 5) {
                return i;
            }
            auef auef = j;
            if (auef == null) {
                synchronized (arjy.class) {
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
