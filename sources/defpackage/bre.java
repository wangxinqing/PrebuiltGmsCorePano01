package defpackage;

/* renamed from: bre  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bre extends aucj implements audy {
    public static final bre i;
    private static volatile auef j;
    public int a;
    public String b = "";
    public int c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public int h;

    static {
        bre bre = new bre();
        i = bre;
        aucj.a(bre.class, (aucj) bre);
    }

    private bre() {
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
            return aucj.a((audx) i, "\u0001\u0007\u0000\u0001\u0001\u001e\u0007\u0000\u0000\u0000\u0001\b\u0000\u0002\u0004\u0001\u0003\u0007\u0002\u0004\u0007\u0003\u0005\u0007\u0004\u0006\u0007\u0005\u001e\u0004\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
        } else if (i3 == 3) {
            return new bre();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) i);
            }
            if (i3 == 5) {
                return i;
            }
            auef auef = j;
            if (auef == null) {
                synchronized (bre.class) {
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