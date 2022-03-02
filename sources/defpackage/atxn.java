package defpackage;

/* renamed from: atxn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atxn extends aucj implements audy {
    public static final atxn a;
    private static volatile auef c;
    private byte b = 2;

    static {
        atxn atxn = new atxn();
        a = atxn;
        aucj.a(atxn.class, (aucj) atxn);
    }

    private atxn() {
        auei auei = auei.b;
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.b);
        }
        byte b2 = 1;
        if (i2 == 1) {
            if (obj == null) {
                b2 = 0;
            }
            this.b = b2;
            return null;
        } else if (i2 == 2) {
            return aucj.a((audx) a, "\u0001\u0000", (Object[]) null);
        } else {
            if (i2 == 3) {
                return new atxn();
            }
            if (i2 == 4) {
                return new aucd((aucj) a);
            }
            if (i2 == 5) {
                return a;
            }
            auef auef = c;
            if (auef == null) {
                synchronized (atxn.class) {
                    auef = c;
                    if (auef == null) {
                        auef = new auce(a);
                        c = auef;
                    }
                }
            }
            return auef;
        }
    }
}
