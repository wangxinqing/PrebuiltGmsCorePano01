package defpackage;

/* renamed from: aszy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aszy extends aucj implements audy {
    public static final aszy b;
    private static volatile auef c;
    public aucx a = auei.b;

    static {
        aszy aszy = new aszy();
        b = aszy;
        aucj.a(aszy.class, (aucj) aszy);
    }

    private aszy() {
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
            return aucj.a((audx) b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001a", new Object[]{"a"});
        } else if (i2 == 3) {
            return new aszy();
        } else {
            if (i2 == 4) {
                return new aucd((float[][]) null, (char[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return b;
            }
            auef auef = c;
            if (auef == null) {
                synchronized (aszy.class) {
                    auef = c;
                    if (auef == null) {
                        auef = new auce(b);
                        c = auef;
                    }
                }
            }
            return auef;
        }
    }
}
