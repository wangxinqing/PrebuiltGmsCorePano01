package defpackage;

/* renamed from: baqm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class baqm extends aucj implements audy {
    public static final baqm k;
    private static volatile auef m;
    public int a;
    public int b;
    public long c;
    public String d = "";
    public String e = "";
    public barb f;
    public int g;
    public long h;
    public baqx i;
    public long j;
    private byte l = 2;

    static {
        baqm baqm = new baqm();
        k = baqm;
        aucj.a(baqm.class, (aucj) baqm);
    }

    private baqm() {
        auei auei = auei.b;
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
            return aucj.a((audx) k, "\u0001\t\u0000\u0001\u0001\u000b\t\u0000\u0000\u0001\u0001\f\u0000\u0002\f\u0005\u0003\u0002\u0006\u0006\t\u0007\u0007\u0002\b\b\u0005\u0001\t\b\u0002\n\b\u0003\u000bЉ\u0004", new Object[]{"a", "b", baql.b(), "g", baql.b(), "h", "i", "j", "c", "d", "e", "f"});
        } else if (i3 == 3) {
            return new baqm();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) k);
            }
            if (i3 == 5) {
                return k;
            }
            auef auef = m;
            if (auef == null) {
                synchronized (baqm.class) {
                    auef = m;
                    if (auef == null) {
                        auef = new auce(k);
                        m = auef;
                    }
                }
            }
            return auef;
        }
    }
}
