package defpackage;

/* renamed from: anry  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anry extends aucj implements audy {
    public static final anry h;
    private static volatile auef i;
    public int a;
    public String b = "";
    public String c = "";
    public int d;
    public String e = "";
    public aucx f = auei.b;
    public aucx g = auei.b;

    static {
        anry anry = new anry();
        h = anry;
        aucj.a(anry.class, (aucj) anry);
    }

    private anry() {
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
            return aucj.a((audx) h, "\u0001\u0006\u0000\u0001\u0003\b\u0006\u0000\u0002\u0000\u0003\b\u0002\u0004\b\u0003\u0005\u000b\u0004\u0006\b\u0005\u0007\u001b\b\u001b", new Object[]{"a", "b", "c", "d", "e", "f", anrg.class, "g", anrg.class});
        } else if (i3 == 3) {
            return new anry();
        } else {
            if (i3 == 4) {
                return new aucd((short[][]) null, (short[]) null, (byte[]) null);
            }
            if (i3 == 5) {
                return h;
            }
            auef auef = i;
            if (auef == null) {
                synchronized (anry.class) {
                    auef = i;
                    if (auef == null) {
                        auef = new auce(h);
                        i = auef;
                    }
                }
            }
            return auef;
        }
    }
}
