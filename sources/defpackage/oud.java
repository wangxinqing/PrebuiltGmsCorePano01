package defpackage;

/* renamed from: oud  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oud extends aucj implements audy {
    public static final oud i;
    private static volatile auef j;
    public int a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public boolean f;
    public int g;
    public boolean h;

    static {
        oud oud = new oud();
        i = oud;
        aucj.a(oud.class, (aucj) oud);
    }

    private oud() {
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
            return aucj.a((audx) i, "\u0001\u0007\u0000\u0001\u0001\u001a\u0007\u0000\u0000\u0000\u0001\u0004\u0000\t\u0004\u0001\n\u0007\u0002\u0011\u0007\u0003\u0018\u0007\u0005\u0019\u000b\u0006\u001a\u0007\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
        } else if (i3 == 3) {
            return new oud();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) i);
            }
            if (i3 == 5) {
                return i;
            }
            auef auef = j;
            if (auef == null) {
                synchronized (oud.class) {
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
