package defpackage;

/* renamed from: gkt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gkt extends aucj implements audy {
    public static final gkt h;
    private static volatile auef k;
    public int a;
    public String b = "";
    public boolean c;
    public avov d;
    public avow e;
    public avoz f;
    public aucx g = auei.b;
    private int i;
    private byte j = 2;

    static {
        gkt gkt = new gkt();
        h = gkt;
        aucj.a(gkt.class, (aucj) gkt);
    }

    private gkt() {
    }

    public static /* synthetic */ void a(gkt gkt) {
        gkt.a |= 1;
        gkt.i = 1;
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
            return aucj.a((audx) h, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0002\u0001Ԅ\u0000\u0002\b\u0001\u0003\u0007\u0002\u0004\t\u0003\u0005\t\u0004\u0006Љ\u0005\u0007\u001a", new Object[]{"a", "i", "b", "c", "d", "e", "f", "g"});
        } else if (i3 == 3) {
            return new gkt();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) h);
            }
            if (i3 == 5) {
                return h;
            }
            auef auef = k;
            if (auef == null) {
                synchronized (gkt.class) {
                    auef = k;
                    if (auef == null) {
                        auef = new auce(h);
                        k = auef;
                    }
                }
            }
            return auef;
        }
    }
}
