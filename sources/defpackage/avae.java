package defpackage;

/* renamed from: avae  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avae extends aucg implements audy {
    public static final avae h;
    private static volatile auef j;
    public int a;
    public aucx b = auei.b;
    public auzr c;
    public aucx d = auei.b;
    public aucx e = auei.b;
    public String f = "";
    public avah g;
    private byte i = 2;

    static {
        avae avae = new avae();
        h = avae;
        aucj.a(avae.class, (aucj) avae);
    }

    private avae() {
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
            return aucj.a((audx) h, "\u0001\u0006\u0000\u0001\u0001\t\u0006\u0000\u0003\u0001\u0001\u001a\u0002\t\u0000\u0006Л\u0007\b\u0002\b\u001a\t\t\u0003", new Object[]{"a", "b", "c", "d", auzf.class, "f", "e", "g"});
        } else if (i3 == 3) {
            return new avae();
        } else {
            if (i3 == 4) {
                return new aucf(h);
            }
            if (i3 == 5) {
                return h;
            }
            auef auef = j;
            if (auef == null) {
                synchronized (avae.class) {
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

    public final void e() {
        if (!this.b.a()) {
            this.b = aucj.a(this.b);
        }
    }
}
