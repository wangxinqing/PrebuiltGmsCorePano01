package defpackage;

/* renamed from: arml  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arml extends aucj implements audy {
    public static final arml i;
    private static volatile auef j;
    public int a;
    public float b;
    public float c;
    public int d;
    public float e;
    public long f;
    public float g;
    public int h;

    static {
        arml arml = new arml();
        i = arml;
        aucj.a(arml.class, (aucj) arml);
    }

    private arml() {
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
            return aucj.a((audx) i, "\u0001\u0007\u0000\u0001\u0001\n\u0007\u0000\u0000\u0000\u0001\u0001\u0000\u0002\u0001\u0001\u0006\u0004\u0005\u0007\u0001\u0006\b\u0003\u0007\t\u0001\b\n\u0004\t", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
        } else if (i3 == 3) {
            return new arml();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) i);
            }
            if (i3 == 5) {
                return i;
            }
            auef auef = j;
            if (auef == null) {
                synchronized (arml.class) {
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
