package defpackage;

/* renamed from: otp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class otp extends aucj implements audy {
    public static final otp i;
    private static volatile auef j;
    public int a;
    public aucx b = auei.b;
    public boolean c;
    public int d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;

    static {
        otp otp = new otp();
        i = otp;
        aucj.a(otp.class, (aucj) otp);
    }

    private otp() {
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
            return aucj.a((audx) i, "\u0001\u0007\u0000\u0001\u0003\n\u0007\u0000\u0001\u0000\u0003\u001a\u0005\u0007\u0000\u0006\u0004\u0001\u0007\u0007\u0002\b\u0007\u0003\t\u0007\u0004\n\u0007\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
        } else if (i3 == 3) {
            return new otp();
        } else {
            if (i3 == 4) {
                return new aucd((char[][]) null, (int[][][]) null);
            }
            if (i3 == 5) {
                return i;
            }
            auef auef = j;
            if (auef == null) {
                synchronized (otp.class) {
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
