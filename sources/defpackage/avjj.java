package defpackage;

/* renamed from: avjj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avjj extends aucj implements audy {
    public static final avjj j;
    private static volatile auef k;
    public int a;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public long g;
    public avhq h;
    public avig i;

    static {
        avjj avjj = new avjj();
        j = avjj;
        aucj.a(avjj.class, (aucj) avjj);
    }

    private avjj() {
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
            return aucj.a((audx) j, "\u0001\b\u0000\u0001\u0001\f\b\u0000\u0000\u0000\u0001\f\u0000\u0005\b\u0004\u0006\b\u0005\u0007\b\u0007\b\b\b\t\u0002\t\u000b\t\u000b\f\t\f", new Object[]{"a", "b", avjh.a, "c", "d", "e", "f", "g", "h", "i"});
        } else if (i3 == 3) {
            return new avjj();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) j);
            }
            if (i3 == 5) {
                return j;
            }
            auef auef = k;
            if (auef == null) {
                synchronized (avjj.class) {
                    auef = k;
                    if (auef == null) {
                        auef = new auce(j);
                        k = auef;
                    }
                }
            }
            return auef;
        }
    }
}
