package defpackage;

/* renamed from: aqhq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aqhq extends aqic {
    private final double a;
    private final double b;
    private final double c;
    private final double d;
    private final double e;
    private final double f;
    private final double g;
    private final double h;

    public aqhq(double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        this.a = d2;
        this.b = d3;
        this.c = d4;
        this.d = d5;
        this.e = d6;
        this.f = d7;
        this.g = d8;
        this.h = d9;
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
        if (obj instanceof aqic) {
            aqic aqic = (aqic) obj;
            return Double.doubleToLongBits(this.a) == Double.doubleToLongBits(aqic.a()) && Double.doubleToLongBits(this.b) == Double.doubleToLongBits(aqic.b()) && Double.doubleToLongBits(this.c) == Double.doubleToLongBits(aqic.c()) && Double.doubleToLongBits(this.d) == Double.doubleToLongBits(aqic.d()) && Double.doubleToLongBits(this.e) == Double.doubleToLongBits(aqic.e()) && Double.doubleToLongBits(this.f) == Double.doubleToLongBits(aqic.f()) && Double.doubleToLongBits(this.g) == Double.doubleToLongBits(aqic.g()) && Double.doubleToLongBits(this.h) == Double.doubleToLongBits(aqic.h());
        }
    }

    public final double f() {
        return this.f;
    }

    public final double g() {
        return this.g;
    }

    public final double h() {
        return this.h;
    }

    public final int hashCode() {
        return ((int) ((Double.doubleToLongBits(this.h) >>> 32) ^ Double.doubleToLongBits(this.h))) ^ ((((((((((((((((int) ((Double.doubleToLongBits(this.a) >>> 32) ^ Double.doubleToLongBits(this.a))) ^ 1000003) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.b) >>> 32) ^ Double.doubleToLongBits(this.b)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.c) >>> 32) ^ Double.doubleToLongBits(this.c)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.d) >>> 32) ^ Double.doubleToLongBits(this.d)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.e) >>> 32) ^ Double.doubleToLongBits(this.e)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.f) >>> 32) ^ Double.doubleToLongBits(this.f)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.g) >>> 32) ^ Double.doubleToLongBits(this.g)))) * 1000003);
    }

    public final String toString() {
        double d2 = this.a;
        double d3 = this.b;
        double d4 = this.c;
        double d5 = this.d;
        double d6 = this.e;
        double d7 = this.f;
        double d8 = this.g;
        double d9 = this.h;
        StringBuilder sb = new StringBuilder(444);
        sb.append("FilterStatusConfiguration{reInitAccuracyThresholdMultiplierGnss=");
        sb.append(d2);
        sb.append(", reInitAccuracyThresholdMultiplierWifi=");
        sb.append(d3);
        sb.append(", initializationWindowLengthS=");
        sb.append(d4);
        sb.append(", maxGnssEvidenceAgeS=");
        sb.append(d5);
        sb.append(", maxWifiEvidenceAgeS=");
        sb.append(d6);
        sb.append(", maxStepEvidenceAgeS=");
        sb.append(d7);
        sb.append(", maxBearingGapS=");
        sb.append(d8);
        sb.append(", maxGnssWifiDistanceForGnssOnlyM=");
        sb.append(d9);
        sb.append("}");
        return sb.toString();
    }
}
