package defpackage;

/* renamed from: aoks  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aoks extends aucj implements audy {
    public static final aoks i;
    private static volatile auef j;
    public int a;
    public int b;
    public long c;
    public int d;
    public long e;
    public String f = "";
    public String g = "";
    public boolean h;

    static {
        aoks aoks = new aoks();
        i = aoks;
        aucj.a(aoks.class, (aucj) aoks);
    }

    private aoks() {
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
            return aucj.a((audx) i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0003\u0001\u0003\u0004\u0002\u0004\u0003\u0003\u0005\b\u0004\u0006\b\u0005\u0007\u0007\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
        } else if (i3 == 3) {
            return new aoks();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) i);
            }
            if (i3 == 5) {
                return i;
            }
            auef auef = j;
            if (auef == null) {
                synchronized (aoks.class) {
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