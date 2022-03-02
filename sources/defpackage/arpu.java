package defpackage;

/* renamed from: arpu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arpu {
    public final long a;
    public final long b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final int g;
    public final float h;
    public final float i;
    public final double j;
    public final double k;
    public final arqq l;

    public arpu(long j2, long j3, double d2, double d3, float f2, double d4, int i2, float f3, float f4) {
        this(j2, j3, d2, d3, f2, d4, i2, f3, f4, (arqq) null);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof arpu) {
            arpu arpu = (arpu) obj;
            if (this.b == arpu.b && this.c == arpu.c && this.d == arpu.d && this.e == arpu.e && atiu.a(this.l, arpu.l)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.b;
        int floatToIntBits = ((((((((int) (j2 ^ (j2 >>> 32))) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d)) * 31) + Float.floatToIntBits(this.e)) * 31;
        arqq arqq = this.l;
        return floatToIntBits + (arqq != null ? arqq.hashCode() : 0);
    }

    public final String toString() {
        long j2 = this.a;
        long j3 = this.b;
        float f2 = this.c;
        float f3 = this.d;
        float f4 = this.f;
        float f5 = this.e;
        int i2 = this.g;
        float f6 = this.h;
        float f7 = this.i;
        String valueOf = String.valueOf(this.l);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 308);
        sb.append("macAddress: ");
        sb.append(j2);
        sb.append(", s2CellId: ");
        sb.append(j3);
        sb.append(", powerOutputDbm: ");
        sb.append(f2);
        sb.append(", pathLossExponent: ");
        sb.append(f3);
        sb.append(", measurementDbm: ");
        sb.append(f4);
        sb.append(", modelUserElevationM: ");
        sb.append(f5);
        sb.append(", rttSuccessCount: ");
        sb.append(i2);
        sb.append(", rttDistanceM: ");
        sb.append(f6);
        sb.append(", rttDistanceStdev: ");
        sb.append(f7);
        sb.append(", floor: ");
        sb.append(valueOf);
        return sb.toString();
    }

    public arpu(long j2, long j3, double d2, double d3, float f2, double d4, int i2, float f3, float f4, arqq arqq) {
        this.b = j3;
        this.c = (float) d2;
        this.d = (float) d3;
        this.a = j2;
        this.e = f2;
        this.f = (float) d4;
        this.g = i2;
        this.h = i2 == 0 ? Float.NEGATIVE_INFINITY : f3;
        this.i = i2 == 0 ? Float.NEGATIVE_INFINITY : f4;
        this.l = arqq;
        double[] dArr = new double[2];
        aema.b(j3, dArr);
        this.j = dArr[0];
        this.k = dArr[1];
    }
}
