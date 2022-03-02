package defpackage;

/* renamed from: aquh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aquh extends aucj implements audy {
    public static final aquh h;
    private static volatile auef i;
    public int a;
    public String b = "";
    public avoq c;
    public avoq d;
    public String e;
    public int f;
    public String g;

    static {
        aquh aquh = new aquh();
        h = aquh;
        aucj.a(aquh.class, (aucj) aquh);
    }

    private aquh() {
        auei auei = auei.b;
        this.e = "";
        this.g = "";
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
            return aucj.a((audx) h, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0000\u0001\b\u0000\u0003\t\u0001\u0004\t\u0002\u0005\b\u0003\u0007\u000b\u0005\b\b\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        } else if (i3 == 3) {
            return new aquh();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) h);
            }
            if (i3 == 5) {
                return h;
            }
            auef auef = i;
            if (auef == null) {
                synchronized (aquh.class) {
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
