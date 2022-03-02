package defpackage;

/* renamed from: atad  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atad extends aucj implements audy {
    public static final atad q;
    private static volatile auef r;
    public int a;
    public String b = "";
    public aucx c = auei.b;
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public aucx h = auei.b;
    public atae i;
    public String j = "";
    public boolean k;
    public float l;
    public int m;
    public String n = "";
    public atal o;
    public String p = "";

    static {
        atad atad = new atad();
        q = atad;
        aucj.a(atad.class, (aucj) atad);
    }

    private atad() {
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
            return aucj.a((audx) q, "\u0001\u000f\u0000\u0001\u0001\u0011\u000f\u0000\u0002\u0000\u0001\b\u0000\u0002\u001a\u0003\b\u0001\u0004\b\u0002\u0005\b\u0003\u0007\b\u0004\b\u001a\t\t\u0005\n\b\u0006\u000b\u0007\u0007\f\u0001\b\r\u0004\t\u000f\b\u000b\u0010\t\f\u0011\b\r", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p"});
        } else if (i3 == 3) {
            return new atad();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) q);
            }
            if (i3 == 5) {
                return q;
            }
            auef auef = r;
            if (auef == null) {
                synchronized (atad.class) {
                    auef = r;
                    if (auef == null) {
                        auef = new auce(q);
                        r = auef;
                    }
                }
            }
            return auef;
        }
    }
}
