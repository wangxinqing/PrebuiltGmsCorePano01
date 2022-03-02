package defpackage;

/* renamed from: auhn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class auhn extends aucj implements audy {
    public static final auhn q;
    private static volatile auef s;
    public int a;
    public long b;
    public String c = "";
    public String d = "";
    public String e = "";
    public augv f;
    public auhh g;
    public auhi h;
    public auho i;
    public auhp j;
    public augp k;
    public auhk l;
    public auhq m;
    public augt n;
    public augq o;
    public augs p;
    private byte r = 2;

    static {
        auhn auhn = new auhn();
        q = auhn;
        aucj.a(auhn.class, (aucj) auhn);
    }

    private auhn() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.r);
        }
        byte b2 = 0;
        if (i3 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.r = b2;
            return null;
        } else if (i3 == 2) {
            return aucj.a((audx) q, "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0001\u0001\u0002\u0000\u0002\t\u0004\u0003Љ\u0005\u0004\t\u0006\u0005\t\u0007\u0006\t\b\u0007\b\u0001\b\b\u0002\t\t\t\n\t\n\u000b\t\u000b\f\t\f\r\t\r\u000e\t\u000e\u000f\b\u0003", new Object[]{"a", "b", "f", "g", "h", "i", "j", "c", "d", "k", "l", "m", "n", "o", "p", "e"});
        } else if (i3 == 3) {
            return new auhn();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) q);
            }
            if (i3 == 5) {
                return q;
            }
            auef auef = s;
            if (auef == null) {
                synchronized (auhn.class) {
                    auef = s;
                    if (auef == null) {
                        auef = new auce(q);
                        s = auef;
                    }
                }
            }
            return auef;
        }
    }
}
