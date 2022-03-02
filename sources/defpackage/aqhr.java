package defpackage;

/* renamed from: aqhr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aqhr extends aqie {
    private final double a;
    private final double b;
    private final double c;
    private final double d;
    private final double e;
    private final double f;
    private final boolean g;
    private final double h;

    public aqhr(double d2, double d3, double d4, double d5, double d6, double d7, boolean z, double d8) {
        this.a = d2;
        this.b = d3;
        this.c = d4;
        this.d = d5;
        this.e = d6;
        this.f = d7;
        this.g = z;
        this.h = d8;
    }

    public final double a() {
        return this.a;
    }

    public final double b() {
        return this.b;
    }

    public final double c() {
        return this.c;
    }

    public final double d() {
        return this.d;
    }

    public final double e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aqie) {
            aqie aqie = (aqie) obj;
            return Double.doubleToLongBits(this.a) == Double.doubleToLongBits(aqie.a()) && Double.doubleToLongBits(this.b) == Double.doubleToLongBits(aqie.b()) && Double.doubleToLongBits(this.c) == Double.doubleToLongBits(aqie.c()) && Double.doubleToLongBits(this.d) == Double.doubleToLongBits(aqie.d()) && Double.doubleToLongBits(this.e) == Double.doubleToLongBits(aqie.e()) && Double.doubleToLongBits(this.f) == Double.doubleToLongBits(aqie.f()) && this.g == aqie.g() && Double.doubleToLongBits(this.h) == Double.doubleToLongBits(aqie.h());
        }
    }

    public final double f() {
        return this.f;
    }

    public final boolean g() {
        return this.g;
    }

    public final double h() {
        return this.h;
    }

    public final int hashCode() {
        int i;
        int doubleToLongBits = (((((((((((((int) ((Double.doubleToLongBits(this.a) >>> 32) ^ Double.doubleToLongBits(this.a))) ^ 1000003) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.b) >>> 32) ^ Double.doubleToLongBits(this.b)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.c) >>> 32) ^ Double.doubleToLongBits(this.c)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.d) >>> 32) ^ Double.doubleToLongBits(this.d)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.e) >>> 32) ^ Double.doubleToLongBits(this.e)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.f) >>> 32) ^ Double.doubleToLongBits(this.f)))) * 1000003;
        if (!this.g) {
            i = 1237;
        } else {
            i = 1231;
        }
        return ((int) ((Double.doubleToLongBits(this.h) >>> 32) ^ Double.doubleToLongBits(this.h))) ^ ((doubleToLongBits ^ i) * 1000003);
    }

    public final String toString() {
        double d2 = this.a;
        double d3 = this.b;
        double d4 = this.c;
        double d5 = this.d;
        double d6 = this.e;
        double d7 = this.f;
        boolean z = this.g;
        StringBuilder sb = new StringBuilder(458);
        sb.append("LinearLatLngKalmanFilterConfiguration{processNoiseUnknownPositionM=");
        sb.append(d2);
        sb.append(", processNoiseUnknownVelocityMps=");
        sb.append(d3);
        sb.append(", processNoiseFeetPositionM=");
        sb.append(d4);
        sb.append(", processNoiseFeetVelocityMps=");
        sb.append(d5);
        sb.append(", processNoiseWheelsPositionM=");
        sb.append(d6);
        sb.append(", processNoiseWheelsVelocityMps=");
        sb.append(d7);
        sb.append(", enableMeasurementErrorReset=");
        sb.append(z);
        sb.append(", measurementErrorResetThresholdM=");
        sb.append(this.h);
        sb.append("}");
        return sb.toString();
    }
}
