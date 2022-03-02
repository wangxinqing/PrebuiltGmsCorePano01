package defpackage;

import com.android.volley.toolbox.ImageRequest;

/* renamed from: arsy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arsy {
    public final int a = -93;
    public final int b = -35;
    public final int c = ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS;
    public final int d = ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS;
    public final arsw e;
    public final arsw f;

    public arsy() {
        new artg();
        this.e = new arsw(artg.class);
        this.f = new arsw(artg.class);
    }

    public static final long a(arsw arsw, int i) {
        return ((artg[]) arsw.a)[i].c;
    }

    public static final float b(arsw arsw, int i) {
        return ((artg[]) arsw.a)[i].f;
    }

    public static final float c(arsw arsw, int i) {
        return ((artg[]) arsw.a)[i].g;
    }

    public static final int d(arsw arsw, int i) {
        return ((artg[]) arsw.a)[i].e;
    }

    public static final int e(arsw arsw, int i) {
        return ((artg[]) arsw.a)[i].d;
    }

    public final int a() {
        return this.e.b;
    }

    public static final void a(arsw arsw, long j, int i, int i2, float f2, float f3) {
        artg artg = ((artg[]) arsw.a)[arsw.b()];
        artg.c = j;
        artg.d = i;
        artg.e = i2;
        artg.f = f2;
        artg.g = f3;
    }

    public final int b(int i) {
        this.e.a(i, "getSignalStrengthDbm");
        return e(this.e, i);
    }

    public final int c(int i) {
        this.e.a(i, "getRttSuccessCount");
        return d(this.e, i);
    }

    public final float d(int i) {
        this.e.a(i, "getRttDistanceM");
        return b(this.e, i);
    }

    public final float e(int i) {
        this.e.a(i, "getRttDistanceStdevM");
        return c(this.e, i);
    }

    public final long a(int i) {
        this.e.a(i, "getMacAddress");
        return a(this.e, i);
    }

    public arsy(byte[] bArr) {
        new artg();
        this.e = new arsw(artg.class);
        this.f = new arsw(artg.class);
        this.a = -100;
    }

    public final void a(long[] jArr) {
        this.e.a();
        this.e.b(r0);
        for (long a2 : jArr) {
            a(this.e, a2, 0, 0, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
        }
        this.e.a(artg.b);
    }
}
