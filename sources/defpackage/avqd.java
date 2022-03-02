package defpackage;

/* renamed from: avqd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avqd extends aucj implements audy {
    public static final avqd al;
    private static volatile auef am;
    public long A;
    public long B;
    public long C;
    public String D = "";
    public String E = "";
    public String F = "";
    public int G;
    public String H = "";
    public String I = "";
    public String J = "";
    public int K;
    public int L;
    public int M;
    public int N;
    public String O = "";
    public int P;
    public int Q;
    public int R;
    public String W = "";
    public String X = "";
    public int Y;
    public int Z;
    public int a;
    public int aa;
    public int ab;
    public int ac;
    public int ad;
    public int ae;
    public int af;
    public int ag;
    public String ah = "";
    public String ai = "";
    public String aj = "";
    public String ak = "";
    public int b;
    public int c;
    public int d;
    public long e;
    public String f = "";
    public int g;
    public long h;
    public long i;
    public long j;
    public int k;
    public String l = "";
    public String m = "";
    public anuv n;
    public int o;
    public long p;
    public String q = "";
    public int r;
    public int s;
    public int t;
    public float u;
    public String v = "";
    public String w = "";
    public int x;
    public long y;
    public long z;

    static {
        avqd avqd = new avqd();
        al = avqd;
        aucj.a(avqd.class, (aucj) avqd);
    }

    private avqd() {
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
            return aucj.a((audx) al, "\u00019\u0000\u0002\u0001=9\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001\u0003\u0002\u0002\u0005\b\u0004\u0006\u0004\u0005\u0007\u0002\u0006\b\u0002\u0007\t\u0002\b\n\u0004\t\u000b\b\n\f\b\u000b\r\t\f\u000e\u0004\r\u000f\u0002\u000e\u0010\b\u000f\u0011\u0004\u0010\u0012\u0004\u0011\u0013\f\u0012\u0014\u0001\u0013\u0015\b\u0014\u0016\b\u0015\u0017\u0004\u0016\u0018\u0002\u0017\u0019\u0002\u0018\u001a\u0002\u0019\u001b\u0002\u001a\u001c\u0002\u001b\u001d\b\u001c\u001e\b\u001d\u001f\b\u001e \u0004\u001f!\b \"\b!#\b\"$\u0004#%\u0004$&\u0004%'\u0004&(\b')\u0004(*\u0004)+\u0004*,\b+-\b,.\u0004-/\u0004.0\u0004/1\u000402\u000413\u000424\u000435\u000446\u00045:\b9;\b:<\b;=\b<", new Object[]{"a", "b", "c", bbi.a, "d", bbl.b(), "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", bbl.b(), "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "W", "X", "Y", "Z", "aa", "ab", "ac", "ad", "ae", "af", "ag", "ah", "ai", "aj", "ak"});
        } else if (i3 == 3) {
            return new avqd();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) al);
            }
            if (i3 == 5) {
                return al;
            }
            auef auef = am;
            if (auef == null) {
                synchronized (avqd.class) {
                    auef = am;
                    if (auef == null) {
                        auef = new auce(al);
                        am = auef;
                    }
                }
            }
            return auef;
        }
    }
}
