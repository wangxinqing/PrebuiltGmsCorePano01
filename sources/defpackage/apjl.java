package defpackage;

/* renamed from: apjl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apjl extends aucj implements audy {
    public static final auct h = new apjj();
    public static final apjl i;
    private static volatile auef j;
    public int a;
    public apgw b;
    public aucx c = auei.b;
    public apjk d;
    public apgz e;
    public boolean f;
    public aucs g = aucl.b;

    static {
        apjl apjl = new apjl();
        i = apjl;
        aucj.a(apjl.class, (aucj) apjl);
    }

    private apjl() {
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
            return aucj.a((audx) i, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001\t\u0000\u0002\u001b\u0003\t\u0001\u0005\t\u0003\u0006\u0007\u0004\u0007\u001e", new Object[]{"a", "b", "c", apkp.class, "d", "e", "f", "g", apix.b()});
        } else if (i3 == 3) {
            return new apjl();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) i);
            }
            if (i3 == 5) {
                return i;
            }
            auef auef = j;
            if (auef == null) {
                synchronized (apjl.class) {
                    auef = j;
                    if (auef == null) {
                        auef = new auce(i);
                        j = auef;
                    }
                }
            }
            return auef;
        }
    }
}
