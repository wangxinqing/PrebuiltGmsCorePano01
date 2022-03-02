package defpackage;

/* renamed from: aoji  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aoji extends aucj implements audy {
    public static final aoji R;
    private static volatile auef W;
    public antj A;
    public aojx B;
    public aoju C;
    public aokl D;
    public aojh E;
    public aolc F;
    public aokf G;
    public aojt H;
    public aokc I;
    public aojw J;
    public aoka K;
    public aoiu L;
    public aokx M;
    public aokz N;
    public aojy O;
    public aojv P;
    public aokb Q;
    public int a;
    public int b;
    public aojj c;
    public aojl d;
    public aojk e;
    public aojm f;
    public aoky g;
    public aojo h;
    public aojd i;
    public aojg j;
    public aolb k;
    public aoix l;
    public aojr m;
    public aoja n;
    public aoiw o;
    public aokt p;
    public aoke q;
    public aokd r;
    public long s;
    public aokp t;
    public aokq u;
    public aokh v;
    public aoiz w;
    public aojb x;
    public aolh y;
    public aojs z;

    static {
        aoji aoji = new aoji();
        R = aoji;
        aucj.a(aoji.class, (aucj) aoji);
    }

    private aoji() {
        auei auei = auei.b;
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
            return aucj.a((audx) R, "\u0001)\u0000\u0002\u0001@)\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001\u0003\t\u0002\u0004\t\u0003\u0006\t\u0004\u0007\t\u0005\b\t\u0006\n\t\b\u000b\t\t\f\t\n\u000e\t\f\u000f\t\r\u0010\t\u000e\u0012\t\u0010\u0013\t\u0011\u0014\t\u0012\u0015\u0002\u0013\u0016\t\u0014\u0017\t\u0015\u001a\t\u0018\u001b\t\u0019\u001c\t\u001a\u001d\t\u001b\u001e\t\u001c\u001f\t\u001d \t\u001e!\t\u001f#\t!(\t&*\t(+\t)-\t+.\t,0\t.1\t/3\t14\t25\t36\t4?\t=@\t>", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q"});
        } else if (i3 == 3) {
            return new aoji();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) R);
            }
            if (i3 == 5) {
                return R;
            }
            auef auef = W;
            if (auef == null) {
                synchronized (aoji.class) {
                    auef = W;
                    if (auef == null) {
                        auef = new auce(R);
                        W = auef;
                    }
                }
            }
            return auef;
        }
    }
}
