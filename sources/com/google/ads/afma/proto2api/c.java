package com.google.ads.afma.proto2api;

import com.android.volley.toolbox.ImageRequest;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class c extends aucj implements audy {
    public static final c Q;
    private static volatile auef R;
    public int A = ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS;
    public long B = -1;
    public long C = -1;
    public long D;
    public long E;
    public long F;
    public long G;
    public long H;
    public long I;
    public int J;
    public int K;
    public String L;
    public int M;
    public boolean N;
    public long O;
    public g P;
    public int a;
    public int b;
    public int c;
    public String d = "";
    public String e = "";
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;
    public long m;
    public long n;
    public String o = "";
    public String p = "";
    public long q;
    public long r;
    public long s;
    public String t = "";
    public long u;
    public long v = -1;
    public String w = "D";
    public String x = "D";
    public long y = -1;
    public int z = ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS;

    static {
        c cVar = new c();
        Q = cVar;
        aucj.a(c.class, (aucj) cVar);
    }

    private c() {
        auei auei = auei.b;
        this.D = -1;
        this.E = -1;
        this.F = -1;
        this.G = -1;
        this.H = -1;
        this.I = -1;
        this.J = ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS;
        this.K = ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS;
        this.L = "";
        this.M = 2;
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
            return aucj.a((audx) Q, "\u0001'\u0000\u0003\u0001É'\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001\u0003\u0002\u0002\u0005\u0002\u0004\u0006\u0002\u0005\u000b\u0002\n\f\u0002\u000b\u0011\u0002\u0010\u0014\u0002\u0013\u0016\u0002\u0014\u0017\u0002\u0015\u0018\bG\u0019\u0002K\u001a\fH\u001b\b\u0016\u001c\u0007I\u001d\b\u0018\u001f\u0002\u0019 \u0002\u001a!\u0002\u001b\"\b\u001c#\u0002\u001d,\u0002%.\b'/\b(0\f*1\f+3\u0002,4\u0002-:\u00024;\u00025<\u00026=\u00027@\u0002=G\u00028I\fCJ\u0002)L\fDÉ\tL", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "L", "O", "M", a.a, "o", "N", "p", "q", "r", "s", "t", "u", "v", "w", "x", "z", f.a, "A", f.a, "B", "C", "D", "E", "F", "G", "I", "H", "J", f.a, "y", "K", f.a, "P"});
        } else if (i3 == 3) {
            return new c();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) Q);
            }
            if (i3 == 5) {
                return Q;
            }
            auef auef = R;
            if (auef == null) {
                synchronized (c.class) {
                    auef = R;
                    if (auef == null) {
                        auef = new auce(Q);
                        R = auef;
                    }
                }
            }
            return auef;
        }
    }
}
