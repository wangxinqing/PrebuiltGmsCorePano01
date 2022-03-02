package defpackage;

/* renamed from: avng  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avng extends aucj implements audy {
    public static final avng f;
    private static volatile auef j;
    public aucx a;
    public String b;
    public String c;
    public String d;
    public String e;
    private int g;
    private String h = "";
    private byte i = 2;

    static {
        avng avng = new avng();
        f = avng;
        aucj.a(avng.class, (aucj) avng);
    }

    private avng() {
        auei auei = auei.b;
        this.a = auei.b;
        this.b = "";
        this.c = "lang.form_submitted";
        this.d = "";
        this.e = "";
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
            return aucj.a((audx) f, "\u0001\u0006\u0000\u0001\u0001\u000b\u0006\u0000\u0001\u0001\u0001Ԉ\u0000\u0003\u001b\u0004\b\u0001\u0006\b\u0003\n\b\u0005\u000b\b\u0006", new Object[]{"g", "h", "a", avnj.class, "b", "c", "d", "e"});
        } else if (i3 == 3) {
            return new avng();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) f);
            }
            if (i3 == 5) {
                return f;
            }
            auef auef = j;
            if (auef == null) {
                synchronized (avng.class) {
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
