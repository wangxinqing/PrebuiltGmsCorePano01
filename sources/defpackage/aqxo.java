package defpackage;

/* renamed from: aqxo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqxo extends aucj implements audy {
    public static final aqxo g;
    private static volatile auef h;
    public String a = "";
    public long b;
    public aucx c = auei.b;
    public String d = "";
    public long e;
    public aqxr f;

    static {
        aqxo aqxo = new aqxo();
        g = aqxo;
        aucj.a(aqxo.class, (aucj) aqxo);
    }

    private aqxo() {
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
            return aucj.a((audx) g, "\u0000\u0006\u0000\u0000\u0001\u0007\u0006\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0003Ȉ\u0004\u0002\u0006\u0002\u0007\t", new Object[]{"a", "c", aqyf.class, "d", "e", "b", "f"});
        } else if (i2 == 3) {
            return new aqxo();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) g);
            }
            if (i2 == 5) {
                return g;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (aqxo.class) {
                    auef = h;
                    if (auef == null) {
                        auef = new auce(g);
                        h = auef;
                    }
                }
            }
            return auef;
        }
    }
}
