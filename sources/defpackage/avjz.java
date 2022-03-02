package defpackage;

/* renamed from: avjz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avjz extends aucj implements audy {
    public static final avjz i;
    private static volatile auef k;
    public String a = "";
    public String b = "";
    public String c = "";
    public long d;
    public avop e;
    public long f;
    public avop g;
    public boolean h;
    private int j;

    static {
        avjz avjz = new avjz();
        i = avjz;
        aucj.a(avjz.class, (aucj) avjz);
    }

    private avjz() {
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
            return aucj.a((audx) i, "\u0001\b\u0000\u0001\u0002\f\b\u0000\u0000\u0000\u0002\b\u0001\u0003\b\u0002\u0004\b\u0003\b\u0002\u0007\t\u0002\t\n\u0007\u000b\u000b\t\b\f\t\n", new Object[]{"j", "a", "b", "c", "d", "f", "h", "e", "g"});
        } else if (i3 == 3) {
            return new avjz();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) i);
            }
            if (i3 == 5) {
                return i;
            }
            auef auef = k;
            if (auef == null) {
                synchronized (avjz.class) {
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
