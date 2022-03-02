package defpackage;

/* renamed from: askp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class askp extends aucj implements audy {
    public static final auct e = new askn();
    public static final askp k;
    private static volatile auef l;
    public int a;
    public long b;
    public int c;
    public aucs d = aucl.b;
    public aucx f = auei.b;
    public aucx g = auei.b;
    public aucx h = auei.b;
    public aucx i = auei.b;
    public aucx j = auei.b;

    static {
        askp askp = new askp();
        k = askp;
        aucj.a(askp.class, (aucj) askp);
    }

    private askp() {
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
            return aucj.a((audx) k, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0006\u0000\u0001\u0002\u0000\u0002\f\u0001\u0003\u001e\u0004\u001b\u0005\u001b\u0006\u001b\u0007\u001b\t\u001b", new Object[]{"a", "b", "c", asnz.a, "d", asoj.b(), "f", askk.class, "g", aske.class, "h", askh.class, "i", askl.class, "j", askf.class});
        } else if (i3 == 3) {
            return new askp();
        } else {
            if (i3 == 4) {
                return new asko();
            }
            if (i3 == 5) {
                return k;
            }
            auef auef = l;
            if (auef == null) {
                synchronized (askp.class) {
                    auef = l;
                    if (auef == null) {
                        auef = new auce(k);
                        l = auef;
                    }
                }
            }
            return auef;
        }
    }
}
