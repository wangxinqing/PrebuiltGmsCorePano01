package defpackage;

/* renamed from: anua  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anua extends aucj implements audy {
    public static final anua h;
    private static volatile auef i;
    public int a;
    public String b = "";
    public String c = "";
    public long d;
    public int e;
    public aucx f = auei.b;
    public anuf g;

    static {
        anua anua = new anua();
        h = anua;
        aucj.a(anua.class, (aucj) anua);
    }

    private anua() {
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
            return aucj.a((audx) h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\b\u0000\u0002\b\u0001\u0003\u0002\u0002\u0004\u0004\u0003\u0005\u001b\u0006\t\u0005", new Object[]{"a", "b", "c", "d", "e", "f", anud.class, "g"});
        } else if (i3 == 3) {
            return new anua();
        } else {
            if (i3 == 4) {
                return new aucd((byte[][]) null, (byte[][]) null);
            }
            if (i3 == 5) {
                return h;
            }
            auef auef = i;
            if (auef == null) {
                synchronized (anua.class) {
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
