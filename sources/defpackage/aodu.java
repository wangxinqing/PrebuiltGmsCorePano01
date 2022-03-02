package defpackage;

/* renamed from: aodu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aodu extends aucj implements audy {
    public static final aodu f;
    private static volatile auef i;
    public int a;
    public String b = "";
    public int c;
    public int d;
    public int e;
    private anzf g;
    private byte h = 2;

    static {
        aodu aodu = new aodu();
        f = aodu;
        aucj.a(aodu.class, (aucj) aodu);
    }

    private aodu() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.h);
        }
        byte b2 = 0;
        if (i3 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.h = b2;
            return null;
        } else if (i3 == 2) {
            return aucj.a((audx) f, "\u0001\u0005\u0000\u0001\u0002\n\u0005\u0000\u0000\u0001\u0002\b\u0001\u0004Љ\u0003\u0007\f\u0006\b\u0004\u0007\n\f\t", new Object[]{"a", "b", "g", "c", aodt.a, "d", "e", aods.a});
        } else if (i3 == 3) {
            return new aodu();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) f);
            }
            if (i3 == 5) {
                return f;
            }
            auef auef = i;
            if (auef == null) {
                synchronized (aodu.class) {
                    auef = i;
                    if (auef == null) {
                        auef = new auce(f);
                        i = auef;
                    }
                }
            }
            return auef;
        }
    }
}
