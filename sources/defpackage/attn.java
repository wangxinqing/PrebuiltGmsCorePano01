package defpackage;

/* renamed from: attn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class attn extends aucj implements audy {
    public static final attn c;
    public static final auci d;
    private static volatile auef e;
    public int a;
    public int b;

    static {
        attn attn = new attn();
        c = attn;
        aucj.a(attn.class, (aucj) attn);
        atjm atjm = atjm.a;
        attn attn2 = c;
        d = aucj.a((audx) atjm, (Object) attn2, (audx) attn2, 91835270, aufw.MESSAGE);
    }

    private attn() {
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
            return aucj.a((audx) c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f\u0000", new Object[]{"a", "b", attl.a});
        } else if (i2 == 3) {
            return new attn();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) c);
            }
            if (i2 == 5) {
                return c;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (attn.class) {
                    auef = e;
                    if (auef == null) {
                        auef = new auce(c);
                        e = auef;
                    }
                }
            }
            return auef;
        }
    }
}
