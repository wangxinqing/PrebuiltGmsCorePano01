package defpackage;

/* renamed from: anui  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anui extends aucj implements audy {
    public static final anui p;
    private static volatile auef r;
    public int a;
    public int b = 1;
    public aoei c;
    public anyu d;
    public aoga e;
    public aocf f;
    public aoaa g;
    public anzc h;
    public anys i;
    public anyi j;
    public anyz k;
    public aoar l;
    public aoay m;
    public anyd n;
    public anzg o;
    private byte q = 2;

    static {
        anui anui = new anui();
        p = anui;
        aucj.a(anui.class, (aucj) anui);
    }

    private anui() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.q);
        }
        byte b2 = 0;
        if (i3 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.q = b2;
            return null;
        } else if (i3 == 2) {
            return aucj.a((audx) p, "\u0001\u000e\u0000\u0001\u0001\u0010\u000e\u0000\u0000\u0002\u0001\f\u0000\u0002Љ\u0001\u0003Љ\u0002\u0004\t\u0003\u0005\t\u0004\u0006\t\u0005\u0007\t\u0006\b\t\u0007\t\t\b\n\t\t\u000b\t\n\r\t\f\u000f\t\u000e\u0010\t\u000f", new Object[]{"a", "b", anug.a, "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o"});
        } else if (i3 == 3) {
            return new anui();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) p);
            }
            if (i3 == 5) {
                return p;
            }
            auef auef = r;
            if (auef == null) {
                synchronized (anui.class) {
                    auef = r;
                    if (auef == null) {
                        auef = new auce(p);
                        r = auef;
                    }
                }
            }
            return auef;
        }
    }
}
