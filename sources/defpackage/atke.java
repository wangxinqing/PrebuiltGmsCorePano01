package defpackage;

/* renamed from: atke  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atke extends aucj implements audy {
    public static final atke i;
    private static volatile auef j;
    public int a;
    public long b;
    public int c;
    public atkh d;
    public atkm e;
    public atkp f;
    public atkc g;
    public atkd h;

    static {
        atke atke = new atke();
        i = atke;
        aucj.a(atke.class, (aucj) atke);
    }

    private atke() {
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
            return aucj.a((audx) i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0002\u0000\u0002\f\u0001\u0003\t\u0002\u0004\t\u0003\u0005\t\u0004\u0006\t\u0005\u0007\t\u0006", new Object[]{"a", "b", "c", atjv.b(), "d", "e", "f", "g", "h"});
        } else if (i3 == 3) {
            return new atke();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) i);
            }
            if (i3 == 5) {
                return i;
            }
            auef auef = j;
            if (auef == null) {
                synchronized (atke.class) {
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
