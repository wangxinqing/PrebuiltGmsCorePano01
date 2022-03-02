package defpackage;

/* renamed from: alms  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alms extends aucj implements audy {
    public static final alms f;
    private static volatile auef j;
    public String a = "";
    public String b = "";
    public String c = "";
    public String d = "";
    public long e;
    private int g;
    private String h = "";
    private byte i = 2;

    static {
        alms alms = new alms();
        f = alms;
        aucj.a(alms.class, (aucj) alms);
    }

    private alms() {
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
            return aucj.a((audx) f, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0001\u0001Ԉ\u0000\u0002\b\u0001\u0004\b\u0002\u0005\b\u0003\u0006\b\u0004\u0007\u0002\u0005", new Object[]{"g", "h", "a", "b", "c", "d", "e"});
        } else if (i3 == 3) {
            return new alms();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) f);
            }
            if (i3 == 5) {
                return f;
            }
            auef auef = j;
            if (auef == null) {
                synchronized (alms.class) {
                    auef = j;
                    if (auef == null) {
                        auef = new auce(f);
                        j = auef;
                    }
                }
            }
            return auef;
        }
    }
}
