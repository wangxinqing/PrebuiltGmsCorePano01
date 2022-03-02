package defpackage;

/* renamed from: almq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class almq extends aucj implements audy {
    public static final almq i;
    private static volatile auef m;
    public String a = "";
    public String b = "";
    public String c;
    public aucx d;
    public String e;
    public String f;
    public long g;
    public String h;
    private int j;
    private String k = "";
    private byte l = 2;

    static {
        almq almq = new almq();
        i = almq;
        aucj.a(almq.class, (aucj) almq);
    }

    private almq() {
        auei auei = auei.b;
        this.c = "";
        this.d = auei.b;
        this.e = "";
        this.f = "";
        this.h = "";
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.l);
        }
        byte b2 = 0;
        if (i3 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.l = b2;
            return null;
        } else if (i3 == 2) {
            return aucj.a((audx) i, "\u0001\t\u0000\u0001\u0001\f\t\u0000\u0001\u0001\u0001Ԉ\u0000\u0003\b\u0002\u0004\b\u0003\u0006\b\u0004\u0007\u001b\t\b\u0006\n\b\u0007\u000b\u0002\b\f\b\t", new Object[]{"j", "k", "a", "b", "c", "d", alni.class, "e", "f", "g", "h"});
        } else if (i3 == 3) {
            return new almq();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) i);
            }
            if (i3 == 5) {
                return i;
            }
            auef auef = m;
            if (auef == null) {
                synchronized (almq.class) {
                    auef = m;
                    if (auef == null) {
                        auef = new auce(i);
                        m = auef;
                    }
                }
            }
            return auef;
        }
    }
}
