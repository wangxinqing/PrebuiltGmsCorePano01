package defpackage;

/* renamed from: aqxk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqxk extends aucj implements audy {
    public static final aqxk h;
    private static volatile auef j;
    public String a = "";
    public amgi b;
    public aubw c;
    public int d;
    public boolean e;
    public aucx f;
    public aqvp g;
    private byte i = 2;

    static {
        aqxk aqxk = new aqxk();
        h = aqxk;
        aucj.a(aqxk.class, (aucj) aqxk);
    }

    private aqxk() {
        aucl aucl = aucl.b;
        this.f = auei.b;
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
            return aucj.a((audx) h, "\u0000\u0007\u0000\u0000\u0001\r\u0007\u0000\u0001\u0001\u0001Ȉ\u0002Љ\u0003\t\u0004\f\b\u0007\u000bȚ\r\t", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        } else if (i3 == 3) {
            return new aqxk();
        } else {
            if (i3 == 4) {
                return new aucd((int[]) null, (byte[]) null, (byte[]) null);
            }
            if (i3 == 5) {
                return h;
            }
            auef auef = j;
            if (auef == null) {
                synchronized (aqxk.class) {
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
