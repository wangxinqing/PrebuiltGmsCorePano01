package defpackage;

/* renamed from: sem  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class sem extends aucj implements audy {
    public static final auct e = new sel();
    public static final sem f;
    private static volatile auef g;
    public int a;
    public long b;
    public long c;
    public aucs d = aucl.b;

    static {
        sem sem = new sem();
        f = sem;
        aucj.a(sem.class, (aucj) sem);
    }

    private sem() {
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
            return aucj.a((audx) f, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0002\u0000\u0002\u0002\u0001\u0003\u001e", new Object[]{"a", "b", "c", "d", set.b()});
        } else if (i2 == 3) {
            return new sem();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) f);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (sem.class) {
                    auef = g;
                    if (auef == null) {
                        auef = new auce(f);
                        g = auef;
                    }
                }
            }
            return auef;
        }
    }
}
