package defpackage;

/* renamed from: atve  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atve extends aucj implements audy {
    public static final atve k;
    public static final auci l;
    private static volatile auef m;
    public int a;
    public String b = "";
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;

    static {
        atve atve = new atve();
        k = atve;
        aucj.a(atve.class, (aucj) atve);
        atjm atjm = atjm.a;
        atve atve2 = k;
        l = aucj.a((audx) atjm, (Object) atve2, (audx) atve2, 157164189, aufw.MESSAGE);
    }

    private atve() {
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
            return aucj.a((audx) k, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0000\u0000\u0001\b\u0000\u0002\u0007\u0001\u0003\u0007\u0002\u0004\u0007\u0003\u0006\u0007\u0005\u0007\u0007\u0006\b\u0007\u0007\t\u0007\b\n\u0007\t", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"});
        } else if (i3 == 3) {
            return new atve();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) k);
            }
            if (i3 == 5) {
                return k;
            }
            auef auef = m;
            if (auef == null) {
                synchronized (atve.class) {
                    auef = m;
                    if (auef == null) {
                        auef = new auce(k);
                        m = auef;
                    }
                }
            }
            return auef;
        }
    }
}
