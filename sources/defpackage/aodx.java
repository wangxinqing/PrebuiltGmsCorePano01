package defpackage;

/* renamed from: aodx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aodx extends aucj implements audy {
    public static final aodx h;
    private static volatile auef j;
    public int a;
    public String b = "";
    public anze c;
    public String d = "";
    public aucx e = auei.b;
    public String f = "";
    public String g = "";
    private byte i = 2;

    static {
        aodx aodx = new aodx();
        h = aodx;
        aucj.a(aodx.class, (aucj) aodx);
    }

    private aodx() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.i);
        }
        byte b2 = 0;
        if (i3 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.i = b2;
            return null;
        } else if (i3 == 2) {
            return aucj.a((audx) h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001\b\u0000\u0002Љ\u0001\u0003\b\u0002\u0004\u001a\u0005\b\u0003\u0006\b\u0004", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        } else if (i3 == 3) {
            return new aodx();
        } else {
            if (i3 == 4) {
                return new aucd((short[]) null, (short[][][]) null);
            }
            if (i3 == 5) {
                return h;
            }
            auef auef = j;
            if (auef == null) {
                synchronized (aodx.class) {
                    auef = j;
                    if (auef == null) {
                        auef = new auce(h);
                        j = auef;
                    }
                }
            }
            return auef;
        }
    }
}
