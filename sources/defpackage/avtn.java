package defpackage;

/* renamed from: avtn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avtn extends aucj implements audy {
    public static final avtn o;
    private static volatile auef r;
    public int a;
    public String b = "";
    public int c;
    public int d;
    public String e = "";
    public String f = "";
    public boolean g;
    public String h = "";
    public String i = "";
    public boolean j;
    public int k;
    public avrb l;
    public long m;
    public int n;
    private int p;
    private byte q = 2;

    static {
        avtn avtn = new avtn();
        o = avtn;
        aucj.a(avtn.class, (aucj) avtn);
    }

    private avtn() {
    }

    public static /* synthetic */ void a(avtn avtn) {
        avtn.a |= 1;
        avtn.p = 1;
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.q);
        }
        byte b2 = 0;
        if (i3 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.q = b2;
            return null;
        } else if (i3 == 2) {
            return aucj.a((audx) o, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0000\u0001\u0001\u0004\u0000\u0002\b\u0001\u0003\u0004\u0002\u0004\u0004\u0003\u0005\b\u0004\u0006\b\u0005\u0007\u0007\u0006\b\b\u0007\t\b\b\n\u0007\t\u000b\u0004\n\fЉ\u000b\r\u0002\f\u000e\u000b\r", new Object[]{"a", "p", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n"});
        } else if (i3 == 3) {
            return new avtn();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) o);
            }
            if (i3 == 5) {
                return o;
            }
            auef auef = r;
            if (auef == null) {
                synchronized (avtn.class) {
                    auef = r;
                    if (auef == null) {
                        auef = new auce(o);
                        r = auef;
                    }
                }
            }
            return auef;
        }
    }
}
