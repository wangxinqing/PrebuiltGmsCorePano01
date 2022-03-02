package defpackage;

/* renamed from: atlu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atlu extends aucj implements audy {
    public static final atlu e;
    private static volatile auef f;
    public int a;
    public int b;
    public long c;
    public int d;

    static {
        atlu atlu = new atlu();
        e = atlu;
        aucj.a(atlu.class, (aucj) atlu);
    }

    private atlu() {
    }

    public static /* synthetic */ void a(atlu atlu) {
        atlu.a |= 2;
        atlu.c = 0;
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\u0002\u0001\u0003\f\u0002", new Object[]{"a", "b", atls.a, "c", "d", atud.a});
        } else if (i2 == 3) {
            return new atlu();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (atlu.class) {
                    auef = f;
                    if (auef == null) {
                        auef = new auce(e);
                        f = auef;
                    }
                }
            }
            return auef;
        }
    }
}
