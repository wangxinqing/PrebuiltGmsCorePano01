package defpackage;

/* renamed from: auhb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class auhb extends aucj implements audy {
    public static final auhb aM;
    private static volatile auef aO;
    public auhg A;
    public auha B;
    public auha C;
    public auhe D;
    public auhe E;
    public auhe F;
    public auhe G;
    public auha H;
    public auha I;
    public auhg J;
    public auhg K;
    public auhe L;
    public auhe M;
    public auhg N;
    public auhe O;
    public auhg P;
    public auhg Q;
    public auha R;
    public auhe W;
    public auhg X;
    public auha Y;
    public auhe Z;
    public int a;
    public auhe aA;
    public auha aB;
    public auhe aC;
    public auhe aD;
    public auhg aE;
    public auhe aF;
    public auhg aG;
    public auha aH;
    public auhe aI;
    public auhg aJ;
    public auhg aK;
    public auhg aL;
    private byte aN = 2;
    public auha aa;
    public auha ab;
    public auhe ac;
    public auha ad;
    public auhe ae;
    public auha af;
    public auhe ag;
    public auhe ah;
    public auhe ai;
    public auhe aj;
    public auhe ak;
    public auhe al;
    public auha am;
    public auhe an;
    public auha ao;
    public auha ap;
    public auhe aq;
    public auhe ar;
    public auhg as;
    public auhg at;
    public auhe au;
    public auhe av;
    public auhg aw;
    public auhg ax;
    public auhg ay;
    public auhg az;
    public int b;
    public int c;
    public auhe d;
    public auha e;
    public auhg f;
    public auhe g;
    public auha h;
    public auhe i;
    public auhe j;
    public auhe k;
    public auhe l;
    public auhg m;
    public auha n;
    public auha o;
    public auhe p;
    public auha q;
    public auha r;
    public auha s;
    public auhe t;
    public auha u;
    public auhg v;
    public auhg w;
    public auhe x;
    public auha y;
    public auha z;

    static {
        auhb auhb = new auhb();
        aM = auhb;
        aucj.a(auhb.class, (aucj) auhb);
    }

    private auhb() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.aN);
        }
        byte b2 = 0;
        if (i3 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.aN = b2;
            return null;
        } else if (i3 == 2) {
            return aucj.a((audx) aM, "\u0001S\u0000\u0003\u0001S\u0000\u0000$\u0001Љ\u0000\u0003Љ\u0003\u0005Љ\u0005\u0006Љ\u0006\u0007Љ\u0007\bЉ\b\fЉ\f\u0010Љ\u0010\u0013Љ\u0014\u0018Љ\u001a\u0019Љ\u001b\u001aЉ\u001c\u001bЉ\u001d!Љ\"\"Љ##Љ%'Љ))Љ,,Љ/.Љ10Љ31Љ42Љ53Љ64Љ75Љ88Љ:>Љ=?Љ>BЉACЉBGЉGIЉIJЉJMЉLPЉOU\t\u0001V\t\u0004W\t\tX\t\nY\t\u000bZ\t\r[\t\u000e\\\t\u000f]\t\u0011^\t\u0013_\t\u0015`\t\u0016a\t\u0017b\t\u0018c\t\u0019d\t\u001ee\t\u001ff\t!g\t$h\t&i\t'j\t(k\t*l\t+m\t-n\t.o\t0p\t2q\t9r\t;s\t<t\t?u\t@v\tCw\tDx\tEy\tFz\tH{\tK|\tM}\tN~\tP\tQ\tR\t\u0012\t\u0002\t ", new Object[]{"a", "b", "c", "d", "g", "i", "j", "k", "l", "p", "t", "x", "D", "E", "F", "G", "L", "M", "O", "W", "Z", "ac", "ae", "ag", "ah", "ai", "aj", "ak", "al", "an", "aq", "ar", "au", "av", "aA", "aC", "aD", "aF", "aI", "e", "h", "m", "n", "o", "q", "r", "s", "u", "w", "y", "z", "A", "B", "C", "H", "I", "K", "N", "P", "Q", "R", "X", "Y", "aa", "ab", "ad", "af", "am", "ao", "ap", "as", "at", "aw", "ax", "ay", "az", "aB", "aE", "aG", "aH", "aJ", "aK", "aL", "v", "f", "J"});
        } else if (i3 == 3) {
            return new auhb();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) aM);
            }
            if (i3 == 5) {
                return aM;
            }
            auef auef = aO;
            if (auef == null) {
                synchronized (auhb.class) {
                    auef = aO;
                    if (auef == null) {
                        auef = new auce(aM);
                        aO = auef;
                    }
                }
            }
            return auef;
        }
    }
}
