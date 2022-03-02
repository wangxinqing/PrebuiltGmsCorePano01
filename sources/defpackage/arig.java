package defpackage;

/* renamed from: arig  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arig extends aucj implements audy {
    public static final arig h;
    private static volatile auef i;
    public int a;
    public aucs b = aucl.b;
    public boolean c;
    public int d = 1;
    public arja e;
    public long f;
    public int g = 10;

    static {
        arig arig = new arig();
        h = arig;
        aucj.a(arig.class, (aucj) arig);
    }

    private arig() {
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
            return aucj.a((audx) h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u001e\u0002\u0007\u0000\u0003\f\u0001\u0004\t\u0002\u0005\u0003\u0003\u0006\u000b\u0004", new Object[]{"a", "b", arjg.b(), "c", "d", arif.a, "e", "f", "g"});
        } else if (i3 == 3) {
            return new arig();
        } else {
            if (i3 == 4) {
                return new aucd((short[][][]) null, (short[]) null, (byte[]) null);
            }
            if (i3 == 5) {
                return h;
            }
            auef auef = i;
            if (auef == null) {
                synchronized (arig.class) {
                    auef = i;
                    if (auef == null) {
                        auef = new auce(h);
                        i = auef;
                    }
                }
            }
            return auef;
        }
    }
}
