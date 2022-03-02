package defpackage;

/* renamed from: avhr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avhr extends aucj implements audy {
    public static final avhr o;
    private static volatile auef q;
    public int a;
    public avjs b;
    public avjk c;
    public avjo d;
    public avih e;
    public avhl f;
    public avio g;
    public avjx h;
    public avka i;
    public avis j;
    public aviq k;
    public avhz l;
    public avie m;
    public avjv n;
    private byte p = 2;

    static {
        avhr avhr = new avhr();
        o = avhr;
        aucj.a(avhr.class, (aucj) avhr);
    }

    private avhr() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.p);
        }
        byte b2 = 0;
        if (i3 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.p = b2;
            return null;
        } else if (i3 == 2) {
            return aucj.a((audx) o, "\u0001\r\u0000\u0001\u0002\u0014\r\u0000\u0000\u0001\u0002\t\u0000\u0003\t\u0001\u0004\t\u0002\u0005\t\u0003\u0006\t\u0004\tЉ\u0007\n\t\b\f\t\n\u0010\t\u000e\u0011\t\u000f\u0012\t\u0010\u0013\t\u0011\u0014\t\u0012", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n"});
        } else if (i3 == 3) {
            return new avhr();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) o);
            }
            if (i3 == 5) {
                return o;
            }
            auef auef = q;
            if (auef == null) {
                synchronized (avhr.class) {
                    auef = q;
                    if (auef == null) {
                        auef = new auce(o);
                        q = auef;
                    }
                }
            }
            return auef;
        }
    }
}
