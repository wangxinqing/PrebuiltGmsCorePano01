package defpackage;

/* renamed from: avwb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avwb extends aucj implements audy {
    public static final avwb i;
    private static volatile auef j;
    public int a;
    public String b = "";
    public int c;
    public String d = "";
    public long e;
    public String f = "";
    public long g;
    public long h;

    static {
        avwb avwb = new avwb();
        i = avwb;
        aucj.a(avwb.class, (aucj) avwb);
    }

    private avwb() {
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
            return aucj.a((audx) i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\b\u0000\u0002\u0004\u0001\u0003\b\u0002\u0004\u0002\u0003\u0005\b\u0004\u0006\u0002\u0005\u0007\u0002\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
        } else if (i3 == 3) {
            return new avwb();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) i);
            }
            if (i3 == 5) {
                return i;
            }
            auef auef = j;
            if (auef == null) {
                synchronized (avwb.class) {
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
