package defpackage;

/* renamed from: avda  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avda extends aucg implements audy {
    public static final avda h;
    private static volatile auef j;
    public int a;
    public aucx b = auei.b;
    public auzq c;
    public String d = "";
    public aucx e = auei.b;
    public aucx f = auei.b;
    public String g = "";
    private byte i = 2;

    static {
        avda avda = new avda();
        h = avda;
        aucj.a(avda.class, (aucj) avda);
    }

    private avda() {
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
            return aucj.a((audx) h, "\u0001\u0006\u0000\u0001\u0001\n\u0006\u0000\u0003\u0001\u0001\u001b\u0002\t\u0000\u0006\b\u0003\bЛ\t\b\u0004\n\u001b", new Object[]{"a", "b", aval.class, "c", "d", "e", auzg.class, "g", "f", avao.class});
        } else if (i3 == 3) {
            return new avda();
        } else {
            if (i3 == 4) {
                return new aucf(h);
            }
            if (i3 == 5) {
                return h;
            }
            auef auef = j;
            if (auef == null) {
                synchronized (avda.class) {
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
