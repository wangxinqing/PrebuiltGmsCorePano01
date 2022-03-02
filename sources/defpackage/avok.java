package defpackage;

/* renamed from: avok  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avok extends aucj implements audy {
    public static final avok i;
    private static volatile auef j;
    public int a;
    public String b = "";
    public String c = "";
    public String d = "";
    public int e;
    public avlz f;
    public avoj g;
    public avoi h;

    static {
        avok avok = new avok();
        i = avok;
        aucj.a(avok.class, (aucj) avok);
    }

    private avok() {
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
            return aucj.a((audx) i, "\u0001\u0007\u0000\u0001\u0002\t\u0007\u0000\u0000\u0000\u0002\b\u0002\u0003\b\u0003\u0004\b\u0004\u0005\f\u0005\u0006\t\u0007\b\t\t\t\t\n", new Object[]{"a", "b", "c", "d", "e", avmu.a, "f", "g", "h"});
        } else if (i3 == 3) {
            return new avok();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) i);
            }
            if (i3 == 5) {
                return i;
            }
            auef auef = j;
            if (auef == null) {
                synchronized (avok.class) {
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
