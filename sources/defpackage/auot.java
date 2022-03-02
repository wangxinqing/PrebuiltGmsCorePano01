package defpackage;

/* renamed from: auot  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class auot extends aucj implements audy {
    public static final auot h;
    private static volatile auef j;
    public int a;
    public String b = "";
    public String c = "";
    public String d = "";
    public aucx e = auei.b;
    public aucx f = auei.b;
    public String g = "";
    private byte i = 2;

    static {
        auot auot = new auot();
        h = auot;
        aucj.a(auot.class, (aucj) auot);
    }

    private auot() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.i);
        }
        byte b2 = 0;
        if (i3 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.i = b2;
            return null;
        } else if (i3 == 2) {
            return aucj.a((audx) h, "\u0001\u0006\u0000\u0001\u0002\u0014\u0006\u0000\u0002\u0002\u0002\b\u0000\u0003\b\u0002\u0006\b\u0001\tЛ\u000bЛ\u0014\b\u0004", new Object[]{"a", "b", "d", "c", "e", aupe.class, "f", aupf.class, "g"});
        } else if (i3 == 3) {
            return new auot();
        } else {
            if (i3 == 4) {
                return new aucd((float[][][]) null, (short[]) null);
            }
            if (i3 == 5) {
                return h;
            }
            auef auef = j;
            if (auef == null) {
                synchronized (auot.class) {
                    auef = j;
                    if (auef == null) {
                        auef = new auce(h);
                        j = auef;
                    }
                }
            }
            return auef;
        }
    }
}
