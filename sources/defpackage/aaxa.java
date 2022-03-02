package defpackage;

import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: aaxa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aaxa extends aucj implements audy {
    public static final aaxa k;
    private static volatile auef m;
    public int a;
    public String b = "";
    public auay c = auay.b;
    public int d;
    public String e = "";
    public String f = "";
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    private boolean l;

    static {
        aaxa aaxa = new aaxa();
        k = aaxa;
        aucj.a(aaxa.class, (aucj) aaxa);
    }

    private aaxa() {
    }

    public static /* synthetic */ void a(aaxa aaxa) {
        aaxa.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        aaxa.l = true;
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
            return aucj.a((audx) k, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001\b\u0000\u0002\n\u0001\u0003\f\u0002\u0004\b\u0003\u0005\b\u0004\u0006\u0007\u0005\u0007\u0007\u0006\b\u0007\u0007\t\u0007\b\n\u0007\t", new Object[]{"a", "b", "c", "d", aawz.a, "e", "f", "g", "h", "i", "l", "j"});
        } else if (i3 == 3) {
            return new aaxa();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) k);
            }
            if (i3 == 5) {
                return k;
            }
            auef auef = m;
            if (auef == null) {
                synchronized (aaxa.class) {
                    auef = m;
                    if (auef == null) {
                        auef = new auce(k);
                        m = auef;
                    }
                }
            }
            return auef;
        }
    }
}
