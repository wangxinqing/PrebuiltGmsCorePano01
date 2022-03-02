package defpackage;

/* renamed from: aela  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aela extends aucj implements audy {
    public static final aela a;
    private static volatile auef d;
    private int b;
    private int c;

    static {
        aela aela = new aela();
        a = aela;
        aucj.a(aela.class, (aucj) aela);
    }

    private aela() {
    }

    public static /* synthetic */ void a(aela aela) {
        aela.b |= 1;
        aela.c = 703;
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
            return aucj.a((audx) a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004\u0000", new Object[]{"b", "c"});
        } else if (i2 == 3) {
            return new aela();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) a);
            }
            if (i2 == 5) {
                return a;
            }
            auef auef = d;
            if (auef == null) {
                synchronized (aela.class) {
                    auef = d;
                    if (auef == null) {
                        auef = new auce(a);
                        d = auef;
                    }
                }
            }
            return auef;
        }
    }
}
