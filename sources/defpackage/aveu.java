package defpackage;

/* renamed from: aveu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aveu extends aucj implements audy {
    public static final aveu p;
    private static volatile auef q;
    public int a;
    public avek b;
    public aves c;
    public avev d;
    public avet e;
    public aveh f;
    public aveg g;
    public aver h;
    public avee i;
    public aved j;
    public avei k;
    public aveq l;
    public avem m;
    public avep n;
    public avej o;

    static {
        aveu aveu = new aveu();
        p = aveu;
        aucj.a(aveu.class, (aucj) aveu);
    }

    private aveu() {
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
            return aucj.a((audx) p, "\u0000\u000f\u0000\u0000\u0001\u0010\u000f\u0000\u0000\u0000\u0001\u0004\u0002\t\u0003\t\u0004\t\u0005\t\u0006\t\u0007\t\t\t\n\t\u000b\t\f\t\r\t\u000e\t\u000f\t\u0010\t", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o"});
        } else if (i3 == 3) {
            return new aveu();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) p);
            }
            if (i3 == 5) {
                return p;
            }
            auef auef = q;
            if (auef == null) {
                synchronized (aveu.class) {
                    auef = q;
                    if (auef == null) {
                        auef = new auce(p);
                        q = auef;
                    }
                }
            }
            return auef;
        }
    }
}
