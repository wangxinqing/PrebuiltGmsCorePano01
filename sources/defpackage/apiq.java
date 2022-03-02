package defpackage;

/* renamed from: apiq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apiq extends aucj implements audy {
    public static final auct f = new apip();
    public static final apiq i;
    private static volatile auef j;
    public int a;
    public apgz b;
    public apkf c;
    public apiy d;
    public aucs e = aucl.b;
    public aucx g = auei.b;
    public apjw h;

    static {
        apiq apiq = new apiq();
        i = apiq;
        aucj.a(apiq.class, (aucj) apiq);
    }

    private apiq() {
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
            return aucj.a((audx) i, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001\t\u0000\u0002\t\u0001\u0003\t\u0002\u0004\u001e\u0005\u001b\u0006\t\u0003", new Object[]{"a", "b", "c", "d", "e", apix.b(), "g", apkp.class, "h"});
        } else if (i3 == 3) {
            return new apiq();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) i);
            }
            if (i3 == 5) {
                return i;
            }
            auef auef = j;
            if (auef == null) {
                synchronized (apiq.class) {
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
