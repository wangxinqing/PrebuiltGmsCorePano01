package defpackage;

/* renamed from: avuk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avuk extends aucj implements audy {
    public static final avuk j;
    private static volatile auef k;
    public int a;
    public avub b;
    public String c = "";
    public aucs d = aucl.b;
    public avue e;
    public avtx f;
    public avty g;
    public boolean h;
    public String i = "";

    static {
        avuk avuk = new avuk();
        j = avuk;
        aucj.a(avuk.class, (aucj) avuk);
    }

    private avuk() {
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
            return aucj.a((audx) j, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0001\u0000\u0001\t\u0000\u0002\b\u0001\u0003\u001e\u0005\t\u0003\u0006\t\u0004\u0007\t\u0005\b\u0007\u0006\n\b\b", new Object[]{"a", "b", "c", "d", avuj.b(), "e", "f", "g", "h", "i"});
        } else if (i3 == 3) {
            return new avuk();
        } else {
            if (i3 == 4) {
                return new aucd((float[][]) null, (boolean[]) null);
            }
            if (i3 == 5) {
                return j;
            }
            auef auef = k;
            if (auef == null) {
                synchronized (avuk.class) {
                    auef = k;
                    if (auef == null) {
                        auef = new auce(j);
                        k = auef;
                    }
                }
            }
            return auef;
        }
    }
}
