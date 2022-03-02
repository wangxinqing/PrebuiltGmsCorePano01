package defpackage;

/* renamed from: aqnd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqnd extends aucj implements audy {
    public static final aqnd f;
    private static volatile auef h;
    public int a;
    public aqnj b;
    public aqnj c;
    public aqnj d;
    public aqnj e;
    private boolean g;

    static {
        aqnd aqnd = new aqnd();
        f = aqnd;
        aucj.a(aqnd.class, (aucj) aqnd);
    }

    private aqnd() {
    }

    public static /* synthetic */ void a(aqnd aqnd) {
        aqnd.a |= 1;
        aqnd.g = true;
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 1) {
            return null;
        }
        if (i2 == 2) {
            return aucj.a((audx) f, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0007\u0000\u0002\t\u0001\u0003\t\u0002\u0004\t\u0003\u0005\t\u0004", new Object[]{"a", "g", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new aqnd();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) f);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (aqnd.class) {
                    auef = h;
                    if (auef == null) {
                        auef = new auce(f);
                        h = auef;
                    }
                }
            }
            return auef;
        }
    }
}
