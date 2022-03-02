package defpackage;

/* renamed from: avmq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avmq extends aucj implements audy {
    public static final avmq h;
    private static volatile auef i;
    public int a;
    public int b = 0;
    public Object c;
    public String d = "";
    public aufc e;
    public int f;
    public avmn g;

    static {
        avmq avmq = new avmq();
        h = avmq;
        aucj.a(avmq.class, (aucj) avmq);
    }

    private avmq() {
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
            return aucj.a((audx) h, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\b\u0000\u0002\t\u0001\u0003;\u0000\u0004<\u0000\u0005\f\u0004\u0006\t\u0005", new Object[]{"c", "b", "a", "d", "e", avmm.class, "f", avmp.a, "g"});
        } else if (i3 == 3) {
            return new avmq();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) h);
            }
            if (i3 == 5) {
                return h;
            }
            auef auef = i;
            if (auef == null) {
                synchronized (avmq.class) {
                    auef = i;
                    if (auef == null) {
                        auef = new auce(h);
                        i = auef;
                    }
                }
            }
            return auef;
        }
    }
}
