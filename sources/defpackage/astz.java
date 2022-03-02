package defpackage;

/* renamed from: astz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class astz extends aucj implements audy {
    public static final astz o;
    private static volatile auef q;
    public int a;
    public asth b;
    public boolean c;
    public int d;
    public int e;
    public String f = "";
    public int g;
    public aucx h = auei.b;
    public aucx i = auei.b;
    public aucx j;
    public int k;
    public asth l;
    public aucr m;
    public astw n;
    private byte p = 2;

    static {
        astz astz = new astz();
        o = astz;
        aucj.a(astz.class, (aucj) astz);
    }

    private astz() {
        audl audl = audl.b;
        this.j = auei.b;
        this.m = aubz.b;
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
            return aucj.a((audx) o, "\u0001\r\u0000\u0001\u0001\u001b\r\u0000\u0004\u0004\u0001Љ\u0000\u0002\r\u0002\u0003\r\u0003\u0005\b\u0005\n\u001b\u000b\u0007\u0001\f\u001b\u0012Л\u0015\u000f\u000e\u0017Љ\u0010\u0018$\u001a\f\b\u001bЉ\u0012", new Object[]{"a", "b", "d", "e", "f", "h", asty.class, "c", "i", asuc.class, "j", astb.class, "k", "l", "m", "g", astf.a, "n"});
        } else if (i3 == 3) {
            return new astz();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) o);
            }
            if (i3 == 5) {
                return o;
            }
            auef auef = q;
            if (auef == null) {
                synchronized (astz.class) {
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
