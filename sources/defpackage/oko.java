package defpackage;

/* renamed from: oko  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oko extends aucj implements audy {
    public static final oko i;
    private static volatile auef j;
    public int a;
    public int b = 0;
    public Object c;
    public long d;
    public aufd e;
    public aufd f;
    public String g = "";
    public String h = "";

    static {
        oko oko = new oko();
        i = oko;
        aucj.a(oko.class, (aucj) oko);
    }

    private oko() {
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
            return aucj.a((audx) i, "\u0001\n\u0001\u0001\u0001\n\n\u0000\u0000\u0000\u0001\u0003\u0000\u0002\t\u0001\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b\t\u0007\t\b\b\n\b\t", new Object[]{"c", "b", "a", "d", "e", oky.class, oks.class, okv.class, okp.class, okl.class, "f", "g", "h"});
        } else if (i3 == 3) {
            return new oko();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) i);
            }
            if (i3 == 5) {
                return i;
            }
            auef auef = j;
            if (auef == null) {
                synchronized (oko.class) {
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
