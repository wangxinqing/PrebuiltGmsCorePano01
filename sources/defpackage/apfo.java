package defpackage;

/* renamed from: apfo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apfo extends aucj implements audy {
    public static final apfo h;
    private static volatile auef j;
    public int a;
    public apfd b;
    public aucx c = auei.b;
    public auay d = auay.b;
    public int e;
    public String f = "";
    public int g;
    private byte i = 2;

    static {
        apfo apfo = new apfo();
        h = apfo;
        aucj.a(apfo.class, (aucj) apfo);
    }

    private apfo() {
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
            return aucj.a((audx) h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0001\u0001Љ\u0000\u0002\u001b\u0003\n\u0001\u0004\f\u0002\u0005\u0004\u0004\u0007\b\u0003", new Object[]{"a", "b", "c", apfb.class, "d", "e", apfm.a, "g", "f"});
        } else if (i3 == 3) {
            return new apfo();
        } else {
            if (i3 == 4) {
                return new aucd((byte[]) null, (char[]) null);
            }
            if (i3 == 5) {
                return h;
            }
            auef auef = j;
            if (auef == null) {
                synchronized (apfo.class) {
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
