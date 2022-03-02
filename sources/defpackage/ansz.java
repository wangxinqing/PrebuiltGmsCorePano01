package defpackage;

/* renamed from: ansz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ansz extends aucj implements audy {
    public static final ansz k;
    private static volatile auef l;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public long i;
    public aucx j = auei.b;

    static {
        ansz ansz = new ansz();
        k = ansz;
        aucj.a(ansz.class, (aucj) ansz);
    }

    private ansz() {
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
            return aucj.a((audx) k, "\u0000\n\u0000\u0000\u0001\r\n\u0000\u0001\u0000\u0001\f\u0002\u0004\u0003\u0004\u0004\u0004\u0005\u0004\u0006\u0004\u0007\u0004\b\f\t\u0002\r\u001b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", answ.class});
        } else if (i3 == 3) {
            return new ansz();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) k);
            }
            if (i3 == 5) {
                return k;
            }
            auef auef = l;
            if (auef == null) {
                synchronized (ansz.class) {
                    auef = l;
                    if (auef == null) {
                        auef = new auce(k);
                        l = auef;
                    }
                }
            }
            return auef;
        }
    }
}
