package defpackage;

/* renamed from: aoei  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aoei extends aucj implements audy {
    public static final aoei w;
    private static volatile auef y;
    public int a;
    public int b;
    public int c = 1;
    public anyc d;
    public anze e;
    public int f;
    public float g;
    public aucx h = auei.b;
    public aofe i;
    public aodp j;
    public aodu k;
    public aoez l;
    public aoeq m;
    public aoew n;
    public aoet o;
    public aofb p;
    public aoed q;
    public aoej r;
    public aodw s;
    public aode t;
    public aofu u;
    public aodn v;
    private byte x = 2;

    static {
        aoei aoei = new aoei();
        w = aoei;
        aucj.a(aoei.class, (aucj) aoei);
    }

    private aoei() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.x);
        }
        byte b2 = 0;
        if (i3 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.x = b2;
            return null;
        } else if (i3 == 2) {
            return aucj.a((audx) w, "\u0001\u0015\u0000\u0001\u0001\u001a\u0015\u0000\u0001\u0003\u0001\f\u0001\u0002\t\u0002\u0003Љ\u0003\u0004\u001b\u0005Љ\u0006\u0007\t\u0007\bЉ\b\t\f\u0004\n\u0001\u0005\f\t\t\u000e\t\n\u000f\t\u000b\u0010\t\f\u0011\t\r\u0012\t\u000e\u0013\t\u000f\u0016\t\u0012\u0017\t\u0013\u0018\t\u0017\u0019\u0004\u0000\u001a\t\u0014", new Object[]{"a", "c", aoeg.a, "d", "e", "h", aofx.class, "i", "j", "k", "f", aoef.a, "g", "l", "m", "n", "o", "p", "q", "r", "s", "t", "v", "b", "u"});
        } else if (i3 == 3) {
            return new aoei();
        } else {
            if (i3 == 4) {
                return new aucd((int[]) null, (boolean[][]) null);
            }
            if (i3 == 5) {
                return w;
            }
            auef auef = y;
            if (auef == null) {
                synchronized (aoei.class) {
                    auef = y;
                    if (auef == null) {
                        auef = new auce(w);
                        y = auef;
                    }
                }
            }
            return auef;
        }
    }
}
