package defpackage;

/* renamed from: artq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class artq extends aucj implements audy {
    public static final artq i;
    private static volatile auef k;
    public int a;
    public int b;
    public arti c;
    public arti d;
    public artj e;
    public artk f;
    public int g;
    public int h;
    private byte j = 2;

    static {
        artq artq = new artq();
        i = artq;
        aucj.a(artq.class, (aucj) artq);
    }

    private artq() {
        auei auei = auei.b;
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.j);
        }
        byte b2 = 0;
        if (i3 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.j = b2;
            return null;
        } else if (i3 == 2) {
            return aucj.a((audx) i, "\u0001\u0007\u0000\u0001\u0002\u000f\u0007\u0000\u0000\u0001\u0002Ԅ\u0000\u0003\t\u0001\u000b\t\b\f\t\t\r\t\n\u000e\u0004\u000b\u000f\u0004\f", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
        } else if (i3 == 3) {
            return new artq();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) i);
            }
            if (i3 == 5) {
                return i;
            }
            auef auef = k;
            if (auef == null) {
                synchronized (artq.class) {
                    auef = k;
                    if (auef == null) {
                        auef = new auce(i);
                        k = auef;
                    }
                }
            }
            return auef;
        }
    }
}
