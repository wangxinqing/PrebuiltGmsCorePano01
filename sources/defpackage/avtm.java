package defpackage;

/* renamed from: avtm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avtm extends aucj implements audy {
    public static final avtm i;
    private static volatile auef j;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;

    static {
        avtm avtm = new avtm();
        i = avtm;
        aucj.a(avtm.class, (aucj) avtm);
    }

    private avtm() {
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
            return aucj.a((audx) i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0004\u0005\u0002\u0004\u0006\u0003\u0004\u0007\u0004\u0004\u0000\u0005\u0004\u0001\u0006\u0004\u0002\u0007\u0004\u0003", new Object[]{"a", "f", "g", "h", "b", "c", "d", "e"});
        } else if (i3 == 3) {
            return new avtm();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) i);
            }
            if (i3 == 5) {
                return i;
            }
            auef auef = j;
            if (auef == null) {
                synchronized (avtm.class) {
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
