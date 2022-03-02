package defpackage;

/* renamed from: anwh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anwh extends aucj implements audy {
    public static final anwh j;
    private static volatile auef k;
    public int a;
    public long b;
    public anxb c;
    public anwk d;
    public anxk e;
    public String f = "";
    public int g;
    public anwf h;
    public anxg i;

    static {
        anwh anwh = new anwh();
        j = anwh;
        aucj.a(anwh.class, (aucj) anwh);
    }

    private anwh() {
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
            return aucj.a((audx) j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\u0002\u0000\u0002\t\u0001\u0003\t\u0002\u0004\t\u0003\u0005\b\u0004\u0006\u0004\u0005\u0007\t\u0006\b\t\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i"});
        } else if (i3 == 3) {
            return new anwh();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) j);
            }
            if (i3 == 5) {
                return j;
            }
            auef auef = k;
            if (auef == null) {
                synchronized (anwh.class) {
                    auef = k;
                    if (auef == null) {
                        auef = new auce(j);
                        k = auef;
                    }
                }
            }
            return auef;
        }
    }
}
